package com.musafira2z.store.ui.category

import com.copperleaf.ballast.repository.cache.Cached
import com.musafira2z.store.CollectionBySlugQuery
import com.musafira2z.store.MainMenuQuery
import com.musafira2z.store.ProductCollectionQuery
import com.musafira2z.store.fragment.MenuItemWithChildrenFragment

object CategoryContract {
    data class State(
        val loading: Boolean = false,
        val slug: String = "",
        val categories: Cached<MainMenuQuery.Data> = Cached.NotLoaded(),
        val category: MenuItemWithChildrenFragment? = null,
        val products: Cached<ProductCollectionQuery.Data> = Cached.NotLoaded()
    )

    sealed class Inputs {
        data class Initialize(val slug: String) : Inputs()
        object GoBack : Inputs()
        object FetchCategories : Inputs()
        data class UpdateCategories(val categories: Cached<MainMenuQuery.Data>) : Inputs()
        data class UpdateCategory(val category: MenuItemWithChildrenFragment?) : Inputs()
        data class GetProductByCategory(val slug: String, val forceRefresh: Boolean) : Inputs()
        data class UpdateProductByCategory(
            val products: Cached<ProductCollectionQuery.Data>
        ) : Inputs()

        data class GoCategoryPage(val slug: String) : Inputs()
    }

    sealed class Events {
        object NavigateUp : Events()
        data class GoCategoryPage(val slug: String) : Events()
    }
}
