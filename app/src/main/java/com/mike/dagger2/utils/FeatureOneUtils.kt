package com.mike.dagger2.utils

import android.content.Context

/**
 * Simulation of Feature 1 utilities class
 */
class FeatureOneUtils(val appContext: Context, val idString: String) {

    fun getDebugString() = "$idString, ${hashCode()}"

}