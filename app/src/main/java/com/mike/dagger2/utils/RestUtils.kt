package com.mike.dagger2.utils

import android.content.Context
import com.mike.dagger2.net.NetworkInterface

/**
 * Simulation of REST Utils
 */
class RestUtils (val context: Context, val networkInterface: NetworkInterface, val idString: String) {
   fun getDebugString() = "$idString, ${hashCode()}"
}
