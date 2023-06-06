package com.yeminnaing.rider.activities

import android.app.PendingIntent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.messaging.FirebaseMessaging
import com.yeminnaing.rider.R
import com.yeminnaing.rider.sendNotification
import com.yeminnaing.shared.showSnackBar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showSnackBar("This is rider app")

        FirebaseMessaging.getInstance().token.addOnCompleteListener {
             Log.d("firebase_token", it.result)
        }

    }
}