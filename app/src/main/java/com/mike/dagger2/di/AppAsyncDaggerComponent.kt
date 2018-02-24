package com.mike.dagger2.di

import com.mike.dagger2.ui.HomeScreenActivity
import dagger.Component
import javax.inject.Singleton

/**
 *
 */
@Component(modules = [(AppAsyncDaggerModule::class)])
@Singleton
interface AppAsyncDaggerComponent {
    fun inject(activity: HomeScreenActivity)
}