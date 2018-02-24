package com.mike.dagger2.di

import android.util.Log
import com.mike.dagger2.utils.AsyncInitUtil
import dagger.producers.ProducerModule
import dagger.producers.Produces


/**
 *
 */
@ProducerModule
class AppAsyncInjectProducerModule {
    companion object {
        private const val TAG = "AppAsyncInjectProducer"
    }
    @Produces
    fun produceAysncInitUtil() : AsyncInitUtil {
        Log.d(TAG, "produceAysncInitUtil called")
        val util = AsyncInitUtil()
        util.init()
        return util
    }
}