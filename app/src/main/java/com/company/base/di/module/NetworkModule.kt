package com.company.base.di.module

import android.content.Context
import com.company.base.api.interceptors.NetworkConnectionInterceptor
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import javax.inject.Singleton

@Module
class NetworkModule {
    @Provides
    @Singleton
    fun providesNetworkInterceptor(context: Context) = NetworkConnectionInterceptor(context)

    @Provides
    @Singleton
    fun providesOkHttpClient(networkInterceptor: NetworkConnectionInterceptor): OkHttpClient {
        return OkHttpClient.Builder()
            .addNetworkInterceptor(networkInterceptor)
            .build()
    }
}