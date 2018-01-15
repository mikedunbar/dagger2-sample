package com.mike.dagger2.di.feature1

import android.content.Context
import com.mike.dagger2.utils.FeatureOneUtils
import dagger.Module
import dagger.Provides

/**
 *
 */
@Module
class FeatureOneModule (val idString: String){

    @Provides
    @FeatureOneScope
    fun provideFeatureOneUtils(context: Context) = FeatureOneUtils(context, idString)
}