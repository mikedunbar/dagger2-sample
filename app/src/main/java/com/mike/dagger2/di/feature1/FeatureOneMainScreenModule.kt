package com.mike.dagger2.di.feature1

import android.content.Context
import com.mike.dagger2.utils.FeatureOneMainScreenUtils
import dagger.Module
import dagger.Provides

/**
 *
 */
@Module
class FeatureOneMainScreenModule(val idString: String){

    @Provides
    @FeatureOneMainScreenScope
    fun provideFeatureOneMainScreenUtils(context: Context) = FeatureOneMainScreenUtils(context, idString)
}