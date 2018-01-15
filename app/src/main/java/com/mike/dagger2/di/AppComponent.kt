package com.mike.dagger2.di

import android.content.Context
import com.mike.dagger2.ui.feature1.FeatureOneMainScreen
import com.mike.dagger2.ui.feature1.FeatureOneSecondaryScreen
import com.mike.dagger2.ui.feature2.FeatureTwoMainScreen
import com.mike.dagger2.ui.feature2.FeatureTwoSecondaryScreen
import com.mike.dagger2.utils.RestUtils
import com.mike.dagger2.utils.StringUtils
import dagger.Component
import javax.inject.Singleton

/**
 *
 */
@Component(modules = [(AppModule::class), (UtilsModule::class)])
@Singleton
interface AppComponent {
    fun getContext() : Context
    fun getRestUtils(): RestUtils
    fun getStringUtils(): StringUtils
}