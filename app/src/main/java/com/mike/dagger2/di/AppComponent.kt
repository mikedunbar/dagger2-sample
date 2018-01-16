package com.mike.dagger2.di

import com.mike.dagger2.di.feature1.FeatureOneComponent
import com.mike.dagger2.di.feature1.FeatureOneModule
import com.mike.dagger2.di.feature1.FeatureTwoComponent
import com.mike.dagger2.di.feature2.FeatureTwoModule
import dagger.Component
import javax.inject.Singleton

/**
 *
 */
@Component(modules = [(AppModule::class), (UtilsModule::class)])
@Singleton
interface AppComponent {
    fun plusFeatureOneComponent(featureOneModule: FeatureOneModule) : FeatureOneComponent
    fun plusFeatureTwoComponent(featureTwoModule: FeatureTwoModule) : FeatureTwoComponent
}