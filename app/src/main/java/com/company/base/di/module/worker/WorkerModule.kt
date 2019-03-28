package com.company.base.di.module.worker

import androidx.work.WorkManager
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(includes = [WorkerModuleBinds::class, WorkerAssistedModule::class])
class WorkerModule {
    @Provides
    @Singleton
    fun providesWorkManager(): WorkManager = WorkManager.getInstance()
}