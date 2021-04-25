package com.dimiaug.simpleapiconsumer

import android.app.Application
import android.content.Context
import com.dimiaug.simpleapiconsumer.container.AppContainer

const val TAG = "SimpleApiConsumer"

class App : Application() {

    private var context: Context? = null
    val appContainer = AppContainer();

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }

}