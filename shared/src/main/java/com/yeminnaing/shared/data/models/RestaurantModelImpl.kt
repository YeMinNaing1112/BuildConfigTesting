package com.yeminnaing.shared.data.models

import com.yeminnaing.shared.data.vos.RestaurantVo
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.schedulers.Schedulers

object RestaurantModelImpl:RestaurantModel,BaseModel() {
    override fun getRestaurant(
        onSuccess: (List<RestaurantVo>) -> Unit,
        onFailure: (String) -> Unit
    ) {
        mRestaurantApi.getRestaurants()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                onSuccess(it.data?: listOf())
            },{
                onFailure(it.localizedMessage?:"No Internet Connection")
            })
    }
}