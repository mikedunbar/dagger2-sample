package com.mike.dagger2.di

import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Module providing application dependencies
 */
@Module
class AppModule (val context: Context) {

    @Provides
    @Singleton
    fun provideContext() = context

}