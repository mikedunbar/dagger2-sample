package com.mike.dagger2.di.feature1

import dagger.Subcomponent

/**
 *
 */
@Subcomponent(modules = [(FeatureOneModule::class)])
@FeatureOneScope
interface FeatureOneComponent {
    fun plusFeatureOneMainScreenComponent(featureOneMainScreenModule: FeatureOneMainScreenModule) : FeatureOneMainScreenComponent
    fun plusFeatureOneSecondaryScreenComponent(featureOneSecondaryScreenModule: FeatureOneSecondaryScreenModule) : FeatureOneSecondaryScreenComponent
}