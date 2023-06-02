package com.yeminnaing.padc_build_config

import android.app.Application
import com.yeminnaing.shared.data.models.RestaurantModelImpl

class RestaurantDeliveryApp : Application() {
    override fun onCreate() {
        super.onCreate()
        RestaurantModelImpl.initRetrofitWithBaseUrl(BuildConfig.ENDPOINT)
    }
}