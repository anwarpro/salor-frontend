package com.musafira2z.store.repository.cart

import com.copperleaf.ballast.repository.cache.Cached
import com.musafira2z.store.AvailableShippingMethodsQuery
import com.musafira2z.store.fragment.CheckoutDetailsFragment
import kotlinx.coroutines.flow.Flow

interface CartRepository {
    fun clearAllCaches()
    fun getCarts(refreshCache: Boolean = false): Flow<Cached<CheckoutDetailsFragment>>
    fun getShippingMethods(refreshCache: Boolean = false): Flow<Cached<List<AvailableShippingMethodsQuery.AvailableShippingMethod>>>

    fun postInput(input: CartRepositoryContract.Inputs)
}
