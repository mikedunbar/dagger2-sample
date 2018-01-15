package com.mike.dagger2.di.feature1

import com.mike.dagger2.ui.feature1.FeatureOneMainScreen
import com.mike.dagger2.utils.FeatureOneMainScreenUtils
import com.mike.dagger2.utils.FeatureOneUtils
import dagger.Component
import java.net.ConnectException

/**
 *
 */
@Component(dependencies = [(FeatureOneComponent::class)], modules = [(FeatureOneMainScreenModule::class)])
@FeatureOneMainScreenScope
interface FeatureOneMainScreenComponent {
    fun inject(activity: FeatureOneMainScreen)
}