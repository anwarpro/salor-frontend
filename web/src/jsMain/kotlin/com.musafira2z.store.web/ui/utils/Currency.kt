/*
 * Copyright 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.musafira2z.store.web.ui.utils

import com.musafira2z.store.fragment.PriceFragment
import com.musafira2z.store.fragment.ProductCardFragment

fun ProductCardFragment?.toFormatPrice(): String {
    if (this == null) {
        return ""
    }
    val start = this.pricing?.priceRange?.start?.gross?.priceFragment?.amount
    val stop = this.pricing?.priceRange?.stop?.gross?.priceFragment?.amount

    val currency = this.pricing?.priceRange?.start?.gross?.priceFragment?.currency
    if (start == null || currency == null) {
        return ""
    }

    if (stop != null && start == stop) {
        return start.toString()
    }

    return "from $start"
}

fun PriceFragment?.toFormatPrice(): String {
    if (this == null) {
        return ""
    }

    val currency = this.currency
    val price = this.amount

    return price.toString()
}

fun PriceFragment?.toUnDiscountFormatPrice(
    newPrice: Double?
): String? {
    if (this == null || newPrice == null) {
        return null
    }

    val currency = this.currency
    val price = this.amount

    if (newPrice == price) {
        return null
    }

    return price.toString()
}
