package com.company.base.di

import android.content.Context
import androidx.work.ListenableWorker
import androidx.work.WorkerParameters

interface ChildWorkerFactory {
    fun create(context: Context, params: WorkerParameters): ListenableWorker
}