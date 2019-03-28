package com.company.base.workers

import android.content.Context
import androidx.work.Worker
import androidx.work.WorkerParameters
import com.company.base.di.ChildWorkerFactory
import com.squareup.inject.assisted.Assisted
import com.squareup.inject.assisted.AssistedInject

class SomeWorker @AssistedInject constructor(
    @Assisted context: Context,
    @Assisted params: WorkerParameters) : Worker(context, params) {
    override fun doWork(): Result {
        return Result.success()
    }

    @AssistedInject.Factory
    interface Factory : ChildWorkerFactory
}