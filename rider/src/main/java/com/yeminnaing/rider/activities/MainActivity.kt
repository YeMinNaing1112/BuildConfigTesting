package com.yeminnaing.rider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yeminnaing.shared.showSnackBar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showSnackBar("This is rider app")

        sendNotification(this,"The Eminence in Shadow is a Japanese light novel series written by Daisuke Aizawa and illustrated by Tōzai. It began serialization online in May 2018 on the user-generated novel publishing website Shōsetsuka ni Narō. It was later acquired by Enterbrain, who have published the series since November 2018. ", "Hello")
    }
}