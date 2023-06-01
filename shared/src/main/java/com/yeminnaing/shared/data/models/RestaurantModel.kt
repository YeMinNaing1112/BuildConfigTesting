package com.yeminnaing.shared.data.models

import com.yeminnaing.shared.data.vos.RestaurantVo

interface RestaurantModel {
    fun getRestaurant(
        onSuccess: (List<RestaurantVo>)->Unit,
        onFailure: (String)->Unit,
    )
}