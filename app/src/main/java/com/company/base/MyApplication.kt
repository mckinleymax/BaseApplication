package com.company.base

import android.app.Activity
import android.app.Application
import android.app.Service
import com.company.base.di.AppInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import dagger.android.HasServiceInjector
import javax.inject.Inject

class MyApplication: Application(), HasActivityInjector, HasServiceInjector  {
    @Inject lateinit var activityInjector: DispatchingAndroidInjector<Activity>
    @Inject lateinit var serviceInjector: DispatchingAndroidInjector<Service>


    override fun onCreate() {
        super.onCreate()

        AppInjector.init(this)
    }

    override fun activityInjector() = activityInjector
    override fun serviceInjector() = serviceInjector
}