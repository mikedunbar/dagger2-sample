package com.mike.dagger2.di.feature2

import android.content.Context
import com.mike.dagger2.di.feature1.FeatureTwoScope
import com.mike.dagger2.utils.FeatureTwoUtils
import dagger.Module
import dagger.Provides

/**
 *
 */
@Module
class FeatureTwoModule(val idString: String){

    @Provides
    @FeatureTwoScope
    fun provideFeatureTwoUtils(context: Context) = FeatureTwoUtils(context, idString)
}