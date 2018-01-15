package com.mike.dagger2.di.feature1

import android.content.Context
import com.mike.dagger2.di.AppComponent
import com.mike.dagger2.utils.FeatureOneUtils
import com.mike.dagger2.utils.RestUtils
import com.mike.dagger2.utils.StringUtils
import dagger.Component

/**
 *
 */
@Component(dependencies = [(AppComponent::class)],modules = [(FeatureOneModule::class)])
@FeatureOneScope
interface FeatureOneComponent {
    fun getAppContext() : Context
    fun getRestUtils(): RestUtils
    fun getStringUtils(): StringUtils

    fun getFeatureOneUtils() : FeatureOneUtils
}