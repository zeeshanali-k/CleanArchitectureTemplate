package com.devname.cleanarchitecturetemplate.utils

import android.util.Log

infix fun Exception.logAll(TAG: String) {
    Log.d(TAG, "message: $message")
    Log.d(TAG, "localizedMessage: $localizedMessage")
    Log.d(TAG, "exception: $this")
    Log.d(TAG, "cause: $cause")
}