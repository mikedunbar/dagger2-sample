package com.mike.dagger2.di.feature2

import android.content.Context
import com.mike.dagger2.di.feature1.FeatureTwoMainScreenScope
import com.mike.dagger2.utils.FeatureTwoMainScreenUtils
import dagger.Module
import dagger.Provides

/**
 *
 */
@Module
class FeatureTwoMainScreenModule(val idString: String){

    @Provides
    @FeatureTwoMainScreenScope
    fun provideFeatureTwoMainScreenUtils(context: Context) = FeatureTwoMainScreenUtils(context, idString)
}