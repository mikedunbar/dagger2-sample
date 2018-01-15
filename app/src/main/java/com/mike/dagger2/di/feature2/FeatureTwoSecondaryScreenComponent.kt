package com.mike.dagger2.di.feature1

import com.mike.dagger2.di.feature2.FeatureTwoSecondaryScreenModule
import com.mike.dagger2.ui.feature1.FeatureOneSecondaryScreen
import com.mike.dagger2.ui.feature2.FeatureTwoSecondaryScreen
import com.mike.dagger2.utils.FeatureOneUtils
import dagger.Component
import java.net.ConnectException

/**
 *
 */
@Component(dependencies = [(FeatureTwoComponent::class)],modules = [(FeatureTwoSecondaryScreenModule::class)])
@FeatureTwoSecondaryScreenScope
interface FeatureTwoSecondaryScreenComponent {
    fun inject(activity: FeatureTwoSecondaryScreen)
}