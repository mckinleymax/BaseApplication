package com.company.base.api.interceptors

import android.content.Context
import android.net.ConnectivityManager
import com.company.base.api.exceptions.NoConnectivityException
import okhttp3.Interceptor
import okhttp3.Response

class NetworkConnectionInterceptor constructor(val context: Context): Interceptor {
    private fun isOnline(): Boolean {
        val manager = context.getSystemService(Context.CONNECTIVITY_SERVICE) as? ConnectivityManager
        val info = manager?.activeNetworkInfo
        return info != null && info.isConnected
    }

    override fun intercept(chain: Interceptor.Chain): Response {
        if (!isOnline()) {
            throw NoConnectivityException()
        }

        return chain.proceed(chain.request())
    }
}