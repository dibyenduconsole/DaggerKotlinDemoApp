package com.app.physcoroapp

import android.app.Application
import com.app.physcoroapp.di.ApplicationComponent
import com.app.physcoroapp.di.DaggerApplicationComponent


class MyApplication : Application() {
    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        applicationComponent = DaggerApplicationComponent.builder().build()
    }
}