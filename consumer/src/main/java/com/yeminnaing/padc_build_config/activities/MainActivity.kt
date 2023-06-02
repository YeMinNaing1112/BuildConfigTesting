package com.yeminnaing.padc_build_config.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.yeminnaing.padc_build_config.R
import com.yeminnaing.padc_build_config.adapters.RestaurantListAdapter
import com.yeminnaing.shared.data.vos.RestaurantVo
import com.yeminnaing.shared.mvp.presenters.MainPresenter
import com.yeminnaing.shared.mvp.presenters.MainPresenterImpl
import com.yeminnaing.shared.mvp.views.MainView
import com.yeminnaing.shared.showSnackBar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainView {
    private val mAdapter: RestaurantListAdapter = RestaurantListAdapter()

    private lateinit var mPresenter: MainPresenter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        showSnackBar("This is consumer app")
        setUpToolBar()
        setUpPresenter()
        setUpRecyclerView()
        mPresenter.onUiReady()

    }

    private fun setUpToolBar() {
        setSupportActionBar(toolBar)
        supportActionBar?.title = "Welcome to ${getString(R.string.app_name)}"
    }

    private fun setUpPresenter() {
        mPresenter = ViewModelProvider(this)[MainPresenterImpl::class.java]
        mPresenter.initPresenter(this)

    }

    private fun setUpRecyclerView() {
        with(rvRestaurants) {
            this.adapter = mAdapter
            this.layoutManager = LinearLayoutManager(context)
        }
    }

    override fun showRestaurant(restaurants: List<RestaurantVo>) {
        mAdapter.setNewData(restaurants)
    }

    override fun showError(errorMessage: String) {
        showSnackBar(errorMessage)
    }
}