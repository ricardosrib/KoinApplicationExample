package com.example.koinapplication

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

// declare it in the manifest
class MyApp : Application() {
    override fun onCreate() {
        super.onCreate()

        // koin needs to know about the context and which are the dependencies
        startKoin {
            androidContext(this@MyApp)
            modules(listOf(appModule))
        }
    }
}