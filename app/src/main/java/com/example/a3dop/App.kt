package com.example.a3dop

import android.app.Application
import com.example.a3dop.utils.PreferenceHelper

class App: Application() {

    override fun onCreate() {
        super.onCreate()
        initPref()
    }

    private fun initPref() {
        PreferenceHelper.unit(this)
    }
}
