package com.mike.dagger2.di.feature1

import android.content.Context
import com.mike.dagger2.di.AppComponent
import com.mike.dagger2.di.feature2.FeatureTwoModule
import com.mike.dagger2.utils.FeatureTwoUtils
import com.mike.dagger2.utils.RestUtils
import com.mike.dagger2.utils.StringUtils
import dagger.Component

/**
 *
 */
@Component(dependencies = [(AppComponent::class)],modules = [(FeatureTwoModule::class)])
@FeatureTwoScope
interface FeatureTwoComponent {
    fun getAppContext() : Context
    fun getRestUtils(): RestUtils
    fun getStringUtils(): StringUtils

    fun getFeatureTwoUtils() : FeatureTwoUtils
}