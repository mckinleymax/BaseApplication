package com.company.base.ui.home

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.company.base.repositories.SomeRepository
import javax.inject.Inject

class HomeViewModel @Inject constructor(repository: SomeRepository): ViewModel() {
    val data = MutableLiveData<Any>()

    init {
        data.value = repository.fetch()
    }
}