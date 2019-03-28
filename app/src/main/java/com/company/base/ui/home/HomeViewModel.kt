package com.company.base.ui.home

import androidx.lifecycle.ViewModel
import com.company.base.repositories.SomeRepository
import javax.inject.Inject

class HomeViewModel @Inject constructor(repository: SomeRepository): ViewModel() {
    val data = repository.fetch()
}