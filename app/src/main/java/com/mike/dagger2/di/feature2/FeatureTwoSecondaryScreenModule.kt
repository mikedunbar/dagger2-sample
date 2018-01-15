package com.mike.dagger2.di.feature2

import android.content.Context
import com.mike.dagger2.di.feature1.FeatureTwoSecondaryScreenScope
import com.mike.dagger2.utils.FeatureTwoMainScreenUtils
import com.mike.dagger2.utils.FeatureTwoSecondaryScreenUtils
import dagger.Module
import dagger.Provides

/**
 *
 */
@Module
class FeatureTwoSecondaryScreenModule(val idString: String){

    @Provides
    @FeatureTwoSecondaryScreenScope
    fun provideFeatureTwoSecondaryScreenUtils(context: Context) = FeatureTwoSecondaryScreenUtils(context, idString)
}