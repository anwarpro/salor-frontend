package com.musafira2z.store.repository.menu

import com.copperleaf.ballast.repository.cache.Cached
import com.musafira2z.store.HomeBannerMenuQuery
import com.musafira2z.store.HomeMenuQuery
import com.musafira2z.store.MainMenuQuery
import kotlinx.coroutines.flow.Flow

interface MenuRepository {
    fun clearAllCaches()
    fun getHomeBlock(refreshCache: Boolean = false): Flow<Cached<HomeMenuQuery.Data>>
    fun getHomeBanner(refreshCache: Boolean): Flow<Cached<HomeBannerMenuQuery.Data>>
    fun getAllCategories(refreshCache: Boolean): Flow<Cached<MainMenuQuery.Data>>
}
