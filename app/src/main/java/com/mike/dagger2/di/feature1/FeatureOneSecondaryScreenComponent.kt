package com.mike.dagger2.di.feature1

import com.mike.dagger2.ui.feature1.FeatureOneSecondaryScreen
import com.mike.dagger2.utils.FeatureOneUtils
import dagger.Component
import dagger.Subcomponent
import java.net.ConnectException

/**
 *
 */
@Subcomponent(modules = [(FeatureOneSecondaryScreenModule::class)])
@FeatureOneSecondaryScreenScope
interface FeatureOneSecondaryScreenComponent {
    fun inject(activity: FeatureOneSecondaryScreen)
}