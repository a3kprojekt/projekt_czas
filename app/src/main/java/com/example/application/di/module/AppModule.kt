package com.example.application.di.module

import com.example.application.app.App
import com.example.application.database.SharedPrefLocalStorage
import dagger.Module
import dagger.Provides

@Module
class AppModule(val app: App) {

    @Provides
    fun provideLocalStorage(): SharedPrefLocalStorage {
        return SharedPrefLocalStorage(app.applicationContext)
    }
}