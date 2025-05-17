package com.example.learnjc

import android.app.Application
import com.example.learnjc.di.databaseModule
import com.example.learnjc.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class LearnJCApp : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(
                this@LearnJCApp
            )
            modules(databaseModule, viewModelModule)
        }
    }
}