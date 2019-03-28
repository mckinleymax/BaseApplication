package com.company.base.api.exceptions

import java.io.IOException

class NoConnectivityException: IOException() {
    override val message: String?
        get() = "Please check network connection and try again."
}