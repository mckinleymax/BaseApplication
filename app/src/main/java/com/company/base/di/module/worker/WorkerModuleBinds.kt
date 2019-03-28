package com.company.base.di.module.worker


import com.company.base.di.AppInitializer
import com.company.base.di.ChildWorkerFactory
import com.company.base.di.keys.WorkerKey
import com.company.base.workers.SomeWorker
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import dagger.multibindings.IntoSet

@Module
abstract class WorkerModuleBinds {
    @Binds
    @IntoMap
    @WorkerKey(SomeWorker::class)
    abstract fun bindsSomeWorker(factory: SomeWorker.Factory): ChildWorkerFactory

    @Binds
    @IntoSet
    abstract fun providesWorkerInitializer(bind: WorkerInitializer): AppInitializer
}
