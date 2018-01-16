package com.mike.dagger2.di.feature1

import com.mike.dagger2.ui.feature1.FeatureOneMainScreen
import dagger.Subcomponent

/**
 *
 */
@Subcomponent(modules = [(FeatureOneMainScreenModule::class)])
@FeatureOneMainScreenScope
interface FeatureOneMainScreenComponent {
    fun inject(activity: FeatureOneMainScreen)
}