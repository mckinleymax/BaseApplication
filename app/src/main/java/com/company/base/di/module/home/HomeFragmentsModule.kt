package com.company.base.di.module.home

import com.company.base.ui.home.HomeFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class HomeFragmentsModule {
    @ContributesAndroidInjector
    abstract fun contributesHomeFragment(): HomeFragment
}