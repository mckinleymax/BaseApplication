package com.company.base.di.module

import android.content.Context
import com.company.base.db.AppDatabase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DatabaseModule {
    @Provides
    @Singleton
    fun providesDb(context: Context) = AppDatabase.getInstance(context)

    @Provides
    @Singleton
    fun providesSomeDao(db: AppDatabase) = db.someDao()
}