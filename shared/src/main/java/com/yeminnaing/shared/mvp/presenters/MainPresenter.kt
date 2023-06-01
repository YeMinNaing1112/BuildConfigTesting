package com.yeminnaing.shared.mvp.presenters

import com.yeminnaing.shared.mvp.views.MainView

interface MainPresenter {
    fun initPresenter(view: MainView)
    fun onUiReady()
}