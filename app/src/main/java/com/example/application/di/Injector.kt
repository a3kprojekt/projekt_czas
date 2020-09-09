package com.example.application.di

import com.example.application.app.App
import com.example.application.di.module.AppModule
import com.example.application.di.module.DbModule

object Injector {

    lateinit var component: AppComponent

    fun init(app: App) {
        component = DaggerAppComponent.builder()
            .dbModule(DbModule(app))
            .appModule(AppModule(app))
            .build()
    }
}