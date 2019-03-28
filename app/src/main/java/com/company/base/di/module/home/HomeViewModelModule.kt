package com.company.base.di.module.home

import androidx.lifecycle.ViewModel
import com.company.base.di.ViewModelKey
import com.company.base.ui.home.HomeViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class HomeViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(HomeViewModel::class)
    abstract fun bindsHomeViewModel(viewModel: HomeViewModel): ViewModel
}