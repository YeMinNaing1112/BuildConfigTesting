package com.yeminnaing.shared.data.models

import com.yeminnaing.shared.network.BASE_URL_FOOD_PANDA
import com.yeminnaing.shared.network.RestaurantApi
import hu.akarnokd.rxjava3.retrofit.RxJava3CallAdapterFactory
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

abstract class BaseModel {
      lateinit var mRestaurantApi: RestaurantApi

   fun initRetrofitWithBaseUrl(baseUrl: String) {
        val mOkHttpClient = OkHttpClient.Builder()
            .connectTimeout(15, TimeUnit.SECONDS)
            .readTimeout(15, TimeUnit.SECONDS)
            .writeTimeout(15, TimeUnit.SECONDS)
            .build()

        val retrofit = Retrofit.Builder()
            .baseUrl(baseUrl)
            .client(mOkHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
            .build()


        mRestaurantApi = retrofit.create(RestaurantApi::class.java)
    }
}