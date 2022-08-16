package com.gomes.appportifoliogitwill

import android.app.Application
import com.gomes.appportifoliogitwill.data.di.DataModule
import com.gomes.appportifoliogitwill.domain.di.DomainModule
import com.gomes.appportifoliogitwill.presentation.di.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

            DataModule.load()
      DomainModule.load()
       PresentationModule.load()
    }
}