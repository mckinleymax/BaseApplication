package com.company.base.di.module

import com.company.base.ui.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {
    @ContributesAndroidInjector(modules = [])
    abstract fun contributesMainActivity(): MainActivity
}