package com.company.base.di.module.worker

import android.app.Application
import androidx.work.Configuration
import androidx.work.WorkManager
import com.company.base.di.AppInitializer
import javax.inject.Inject

class WorkerInitializer @Inject constructor(private val workerFactory: WorkerFactory) : AppInitializer {
    override fun init(application: Application) {
        val wmConfig = Configuration.Builder().setWorkerFactory(workerFactory).build()
        WorkManager.initialize(application, wmConfig)
    }
}