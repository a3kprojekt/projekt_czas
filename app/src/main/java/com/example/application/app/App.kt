package com.example.application.app

import android.app.Application
import com.example.application.di.Injector

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        Injector.init(this)
    }
}