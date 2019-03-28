package com.company.base.di

import android.app.Application

interface AppInitializer {
    fun init(application: Application)
}