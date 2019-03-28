package com.company.base.di.module

import android.app.Application
import android.content.Context
import com.google.gson.FieldNamingPolicy
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(
    includes = [
        ViewModelModule::class,
        DatabaseModule::class,
        NetworkModule::class]
)
class AppModule {
    @Provides
    @Singleton
    fun providesContext(application: Application): Context = application.applicationContext

    @Provides
    @Singleton
    fun providesGson(): Gson =
        GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create()
}