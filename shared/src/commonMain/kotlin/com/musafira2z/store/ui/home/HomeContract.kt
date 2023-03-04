package com.musafira2z.store.ui.home

import com.copperleaf.ballast.repository.cache.Cached
import com.musafira2z.store.HomeMenuQuery
import com.musafira2z.store.ProductCollectionQuery

object HomeContract {
    data class State(
        val loading: Boolean = false,
        val blocks: Cached<HomeMenuQuery.Data> = Cached.NotLoaded(),
        val products: Cached<ProductCollectionQuery.Data> = Cached.NotLoaded()
    )

    sealed class Inputs {
        object Initialize : Inputs()
        object GoBack : Inputs()

        data class FetchHomeProducts(val forceRefresh: Boolean) : Inputs()
        data class UpdateHomeProducts(val products: Cached<ProductCollectionQuery.Data>) : Inputs()

        data class FetchHomeBlocks(val forceRefresh: Boolean) : Inputs()
        data class UpdateHomeBlocks(val blocks: Cached<HomeMenuQuery.Data>) : Inputs()
    }

    sealed class Events {
        object NavigateUp : Events()
    }
}
