package com.mike.dagger2.di

import android.content.Context
import com.mike.dagger2.net.NetworkInterface
import com.mike.dagger2.utils.RestUtils
import com.mike.dagger2.utils.StringUtils
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Module providing utility dependencies
 */
@Module
class UtilsModule (val idString: String){

    @Provides
    @Singleton
    fun provideStringUtils(context: Context) = StringUtils(context, idString)

    @Provides
    @Singleton
    fun provideRestUtils(context: Context, networkInterface: NetworkInterface) = RestUtils(context, networkInterface, idString)

}