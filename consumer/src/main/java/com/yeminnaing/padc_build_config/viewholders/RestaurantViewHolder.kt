package com.yeminnaing.padc_build_config.viewholders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.yeminnaing.shared.data.vos.RestaurantVo
import kotlinx.android.synthetic.main.view_holder_restaurant.view.*

class RestaurantViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bindData(data: RestaurantVo) {
        Glide.with(itemView.context)
            .load(data.imageUrl)
            .into(itemView.ivRestaurantImage)

        itemView.tvRestaurantName.text = data.name
        itemView.tvCategory.text = data.category
        itemView.tvDeliveryPrice.text = "${data.deliveryPrice.toString()} MMK"
        itemView.tvRating.text = data.rating.toString()
    }
}