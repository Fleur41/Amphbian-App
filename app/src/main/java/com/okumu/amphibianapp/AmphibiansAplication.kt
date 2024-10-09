package com.okumu.amphibianapp

import android.app.Application
import com.okumu.amphibianapp.data.AppContainer
import com.example.amphibians.data.DefaultAppContainer


class AmphibiansAplication: Application() {
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = DefaultAppConatiner()
    }
}