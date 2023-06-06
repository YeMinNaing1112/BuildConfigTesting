package com.yeminnaing.rider.notifications

import android.app.PendingIntent
import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage
import com.yeminnaing.rider.activities.RestaurantsDetailsActivity
import com.yeminnaing.rider.sendNotification

class FCMService : FirebaseMessagingService() {
    override fun onNewToken(token: String) {
        super.onNewToken(token)
        Log.d("firebase_token", token)
    }

    override fun onMessageReceived(message: RemoteMessage) {
        super.onMessageReceived(message)
        sendNotification(
            context = this,
            title = message.data["title"] ?: "",
            body = message.data["body"] ?: "",
            pendingIntent = PendingIntent.getActivity(
                this, 0, RestaurantsDetailsActivity.newIntent(this), PendingIntent.FLAG_IMMUTABLE
            )
        )
    }
}