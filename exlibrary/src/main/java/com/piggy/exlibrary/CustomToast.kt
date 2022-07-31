package com.piggy.exlibrary

import android.content.Context
import android.widget.Toast

class CustomToast {

    fun showCustomToast(context: Context, msg: String) {
        Toast.makeText(context, msg, Toast.LENGTH_LONG).show()
    }

}