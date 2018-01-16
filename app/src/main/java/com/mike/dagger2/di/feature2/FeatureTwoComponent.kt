package com.mike.dagger2.di.feature1

import com.mike.dagger2.di.feature2.FeatureTwoMainScreenModule
import com.mike.dagger2.di.feature2.FeatureTwoModule
import com.mike.dagger2.di.feature2.FeatureTwoSecondaryScreenModule
import dagger.Subcomponent

/**
 *
 */
@Subcomponent(modules = [(FeatureTwoModule::class)])
@FeatureTwoScope
interface FeatureTwoComponent {
    fun plusFeatureTwoMainScreenComponent(featureTwoMainScreenModule: FeatureTwoMainScreenModule) : FeatureTwoMainScreenComponent
    fun plusFeatureTwoSecondaryScreenComponent(featureTwoSecondaryScreenModule: FeatureTwoSecondaryScreenModule) : FeatureTwoSecondaryScreenComponent
}