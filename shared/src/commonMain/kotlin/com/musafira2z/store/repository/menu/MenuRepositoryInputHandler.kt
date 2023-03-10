package com.musafira2z.store.repository.menu

import com.apollographql.apollo3.ApolloClient
import com.copperleaf.ballast.InputHandler
import com.copperleaf.ballast.InputHandlerScope
import com.copperleaf.ballast.observeFlows
import com.copperleaf.ballast.postInput
import com.copperleaf.ballast.repository.bus.EventBus
import com.copperleaf.ballast.repository.bus.observeInputsFromBus
import com.copperleaf.ballast.repository.cache.fetchWithCache
import com.musafira2z.store.HomeBannerMenuQuery
import com.musafira2z.store.HomeMenuQuery
import com.musafira2z.store.MainMenuQuery
import com.musafira2z.store.normalChannel
import com.musafira2z.store.repository.settings.SettingsRepository
import com.musafira2z.store.type.LanguageCodeEnum

class MenuRepositoryInputHandler(
    private val eventBus: EventBus,
    private val apolloClient: ApolloClient,
    private val settingsRepository: SettingsRepository
) : InputHandler<
        MenuRepositoryContract.Inputs,
        Any,
        MenuRepositoryContract.State> {
    override suspend fun InputHandlerScope<
            MenuRepositoryContract.Inputs,
            Any,
            MenuRepositoryContract.State>.handleInput(
        input: MenuRepositoryContract.Inputs
    ) = when (input) {
        is MenuRepositoryContract.Inputs.ClearCaches -> {
            updateState { MenuRepositoryContract.State() }
        }
        is MenuRepositoryContract.Inputs.Initialize -> {
            val previousState = getCurrentState()

            if (!previousState.initialized) {
                updateState { it.copy(initialized = true) }
                // start observing flows here
                logger.debug("initializing")
                observeFlows(
                    key = "Observe account changes",
                    eventBus
                        .observeInputsFromBus<MenuRepositoryContract.Inputs>(),
                )
            } else {
                logger.debug("already initialized")
                noOp()
            }
        }
        is MenuRepositoryContract.Inputs.RefreshAllCaches -> {
            // then refresh all the caches in this repository
            val currentState = getCurrentState()
            if (currentState.dataListInitialized) {
                postInput(MenuRepositoryContract.Inputs.RefreshDataList(true))
            }

            Unit
        }

        is MenuRepositoryContract.Inputs.DataListUpdated -> {
            updateState { it.copy(dataList = input.dataList) }
        }
        is MenuRepositoryContract.Inputs.RefreshDataList -> {
            updateState { it.copy(dataListInitialized = true) }
            fetchWithCache(
                input = input,
                forceRefresh = input.forceRefresh,
                getValue = { it.dataList },
                updateState = { MenuRepositoryContract.Inputs.DataListUpdated(it) },
                doFetch = {
                    apolloClient.query(
                        HomeMenuQuery(
                            locale = LanguageCodeEnum.EN_US,
                            channel = settingsRepository.channel ?: normalChannel
                        )
                    ).execute().data!!
                },
            )
        }
        is MenuRepositoryContract.Inputs.GetHomeBanner -> {
            fetchWithCache(
                input = input,
                forceRefresh = input.forceRefresh,
                getValue = { it.homeBanner },
                updateState = { MenuRepositoryContract.Inputs.UpdateHomeBanner(it) },
                doFetch = {
                    apolloClient.query(
                        HomeBannerMenuQuery(
                            locale = LanguageCodeEnum.EN_US,
                            channel = settingsRepository.channel ?: normalChannel
                        )
                    ).execute().data!!
                },
            )
        }
        is MenuRepositoryContract.Inputs.UpdateHomeBanner -> {
            updateState { it.copy(homeBanner = input.homeBanner) }
        }
        is MenuRepositoryContract.Inputs.GetCategories -> {
            fetchWithCache(
                input = input,
                forceRefresh = input.forceRefresh,
                getValue = { it.categories },
                updateState = { MenuRepositoryContract.Inputs.UpdateCategories(it) },
                doFetch = {
                    apolloClient.query(
                        MainMenuQuery(
                            locale = LanguageCodeEnum.EN_US,
                            channel = settingsRepository.channel ?: normalChannel
                        )
                    ).execute().data!!
                },
            )
        }
        is MenuRepositoryContract.Inputs.UpdateCategories -> {
            updateState { it.copy(categories = input.categories) }
        }
    }
}
