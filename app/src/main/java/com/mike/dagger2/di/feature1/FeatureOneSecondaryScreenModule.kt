package com.mike.dagger2.di.feature1

import android.content.Context
import com.mike.dagger2.utils.FeatureOneSecondaryScreenUtils
import dagger.Module
import dagger.Provides

/**
 *
 */
@Module
class FeatureOneSecondaryScreenModule(val idString: String){

    @Provides
    fun provideFeatureOneSecondaryScreenUtils(context: Context) = FeatureOneSecondaryScreenUtils(context, idString)
}