package com.yeminnaing.shared.mvp.views

import com.yeminnaing.shared.data.vos.RestaurantVo

interface MainView {
    fun showRestaurant(restaurants: List<RestaurantVo>)
    fun showError(errorMessage: String)
}