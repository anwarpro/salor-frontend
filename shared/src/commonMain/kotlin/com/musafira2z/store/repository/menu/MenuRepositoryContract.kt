package com.musafira2z.store.repository.menu

import com.copperleaf.ballast.repository.cache.Cached
import com.musafira2z.store.HomeBannerMenuQuery
import com.musafira2z.store.HomeMenuQuery
import com.musafira2z.store.MainMenuQuery

object MenuRepositoryContract {
    data class State(
        val initialized: Boolean = false,

        val dataListInitialized: Boolean = false,
        val dataList: Cached<HomeMenuQuery.Data> = Cached.NotLoaded(),
        val homeBanner: Cached<HomeBannerMenuQuery.Data> = Cached.NotLoaded(),
        val categories: Cached<MainMenuQuery.Data> = Cached.NotLoaded()
    )

    sealed class Inputs {
        object ClearCaches : Inputs()
        object Initialize : Inputs()
        object RefreshAllCaches : Inputs()

        data class RefreshDataList(val forceRefresh: Boolean) : Inputs()
        data class DataListUpdated(val dataList: Cached<HomeMenuQuery.Data>) : Inputs()

        data class GetHomeBanner(val forceRefresh: Boolean) : Inputs()
        data class UpdateHomeBanner(val homeBanner: Cached<HomeBannerMenuQuery.Data>): Inputs()
        data class GetCategories(val forceRefresh: Boolean) : Inputs()
        data class UpdateCategories(val categories: Cached<MainMenuQuery.Data>): Inputs()
    }
}
