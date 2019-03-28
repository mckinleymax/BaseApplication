package com.company.base.utils

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders


fun <T : ViewModel> FragmentActivity.getViewModel(modelClass: Class<T>, viewModelFactory: ViewModelProvider.Factory? = null): T {
    return viewModelFactory?.let { ViewModelProviders.of(this, it).get(modelClass) }
        ?: ViewModelProviders.of(this).get(modelClass)
}

fun <T : ViewModel> Fragment.getViewModel(modelClass: Class<T>, viewModelFactory: ViewModelProvider.Factory) = ViewModelProviders.of(this, viewModelFactory).get(modelClass)