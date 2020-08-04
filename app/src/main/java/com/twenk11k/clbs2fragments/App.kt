package com.twenk11k.clbs2fragments

import android.app.Application
import com.twenk11k.clbs2fragments.di.appComponent
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App: Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin()
    }

    private fun initKoin() {
        startKoin {
            androidContext(this@App)
            modules(appComponent)
        }
    }

}