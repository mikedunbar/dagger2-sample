package com.mike.dagger2.utils

import android.content.Context

/**
 * Simulation of Feature 2 utilities class
 */
class FeatureTwoUtils(val appContext: Context, val idString: String) {

    fun getDebugString() = "$idString, ${hashCode()}"

}