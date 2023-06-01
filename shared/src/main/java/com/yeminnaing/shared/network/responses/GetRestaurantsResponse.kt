package com.yeminnaing.shared.network.responses

import com.google.gson.annotations.SerializedName
import com.yeminnaing.shared.data.vos.RestaurantVo

data class GetRestaurantsResponse(
    @SerializedName("code")
    val code:Int?,
    @SerializedName("message")
    val message:String?,
    @SerializedName("data")
    val data:List<RestaurantVo>?
)
