@file:JvmName("ExtensionsUtils")
package com.shakeup.keddit.commons

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by Jayson on 8/30/2017.
 */

/**
 * Extension to inflate a layout straight from a ViewGroup
 */
fun ViewGroup.inflate(layoutId: Int, attachToRoot: Boolean = false): View {
    return LayoutInflater.from(context).inflate(layoutId, this, attachToRoot)
}