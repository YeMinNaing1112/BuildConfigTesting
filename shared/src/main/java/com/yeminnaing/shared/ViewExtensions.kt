package com.yeminnaing.shared

import android.app.Activity
import com.google.android.material.snackbar.Snackbar


fun Activity.showSnackBar(message: String) {
    Snackbar.make(this.window.decorView, message, Snackbar.LENGTH_SHORT).show()

}