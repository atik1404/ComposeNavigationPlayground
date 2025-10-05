package com.playground.navigation

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate
import com.squareup.leakcanary.core.BuildConfig
import timber.log.Timber

class BaseApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        if (BuildConfig.DEBUG)
            Timber.plant(Timber.DebugTree())
    }
}