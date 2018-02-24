package com.mike.dagger2.di

import com.google.common.util.concurrent.ListenableFuture
import com.mike.dagger2.utils.AsyncInitUtil
import dagger.producers.ProductionComponent

/**
 *
 */
@ProductionComponent(modules = [(AppAsyncInjectProducerModule::class), (ExecutorModule::class)])
interface AppAsyncProductionComponent {
    fun getAsynchInitUtil(): ListenableFuture<AsyncInitUtil>
}