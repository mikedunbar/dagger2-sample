package com.mike.dagger2.di

import dagger.Module
import dagger.producers.Production
import dagger.Provides
import java.util.concurrent.Executor
import java.util.concurrent.Executors

@Module
class ExecutorModule {
    @Provides
    @Production
    fun executor(): Executor {
        return Executors.newCachedThreadPool()
    }
}