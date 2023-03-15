package com.ninja.processlifecycleowner

import android.app.Application
import androidx.lifecycle.ProcessLifecycleOwner

class BackgroundForegroundApp : Application() {
    override fun onCreate() {
        super.onCreate()
        ProcessLifecycleOwner.get().lifecycle.addObserver(BackgroundForegroundListener())
    }
}