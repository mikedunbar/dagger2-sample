package com.mike.dagger2.utils

import android.content.Context

/**
 * Simulation of string utilities class
 */
class StringUtils(val appContext: Context, val idString: String) {

    fun getDebugString() = "$idString, ${hashCode()}"

}