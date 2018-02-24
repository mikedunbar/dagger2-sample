package com.mike.dagger2.utils

import android.util.Log
import java.util.concurrent.TimeUnit

class AsyncInitUtil {
    companion object {
        private const val TAG = "AsyncInitUil"
    }

    private var initCompleted = false

    fun init() {
        Log.d(TAG, "sleeping")
        Thread.sleep(TimeUnit.SECONDS.toMillis(3))
        Log.d(TAG, "done sleeping")
        initCompleted = true
    }

    fun doThing() : String {
        if (!initCompleted) {
            throw RuntimeException("Init not done")
        }
        return "doing thing"
    }

}