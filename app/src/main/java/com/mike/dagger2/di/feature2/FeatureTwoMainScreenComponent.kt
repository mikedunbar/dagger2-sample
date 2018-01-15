package com.mike.dagger2.di.feature1

import com.mike.dagger2.di.feature2.FeatureTwoMainScreenModule
import com.mike.dagger2.ui.feature1.FeatureOneMainScreen
import com.mike.dagger2.ui.feature2.FeatureTwoMainScreen
import com.mike.dagger2.utils.FeatureOneUtils
import dagger.Component
import java.net.ConnectException

/**
 *
 */
@Component(dependencies = [(FeatureTwoComponent::class)],modules = [(FeatureTwoMainScreenModule::class)])
@FeatureTwoMainScreenScope
interface FeatureTwoMainScreenComponent {
    fun inject(activity: FeatureTwoMainScreen)
}