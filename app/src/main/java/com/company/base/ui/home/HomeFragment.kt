package com.company.base.ui.home

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.company.base.R
import com.company.base.di.Injectable
import com.company.base.utils.getViewModel
import javax.inject.Inject

class HomeFragment: Fragment(), Injectable {
    @Inject lateinit var viewModelFactory: ViewModelProvider.Factory
    private lateinit var viewModel: HomeViewModel

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        viewModel = getViewModel(HomeViewModel::class.java, viewModelFactory)
        observeViewModel()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    private fun observeViewModel() {
        observeSomething()
    }

    private fun observeSomething() {
        viewModel.data.observe(viewLifecycleOwner, Observer {
            // Update the UI
        })
    }
}