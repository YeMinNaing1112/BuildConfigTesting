package com.yeminnaing.shared.mvp.presenters

import androidx.lifecycle.ViewModel
import com.yeminnaing.shared.data.models.RestaurantModel
import com.yeminnaing.shared.data.models.RestaurantModelImpl
import com.yeminnaing.shared.mvp.views.MainView

class MainPresenterImpl : MainPresenter, ViewModel() {
    var mView: MainView? = null

    //    Model
    private val mRestaurantModel: RestaurantModel = RestaurantModelImpl
    override fun initPresenter(view: MainView) {
        mView = view
    }

    override fun onUiReady() {
        mRestaurantModel.getRestaurant(
            onSuccess = { mView?.showRestaurant(it) },
            onFailure = { mView?.showError(it) }
        )
    }
}