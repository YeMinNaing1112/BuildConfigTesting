package com.yeminnaing.rider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yeminnaing.shared.showSnackBar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showSnackBar("This is rider app")
    }
}