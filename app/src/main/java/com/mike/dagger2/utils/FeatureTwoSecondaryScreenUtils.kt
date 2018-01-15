package com.mike.dagger2.utils

import android.content.Context

/**
 * Simulation of Feature 1 utilities class
 */
class FeatureTwoSecondaryScreenUtils(val appContext: Context, val idString: String) {

    fun getDebugString() = "$idString, ${hashCode()}"

}