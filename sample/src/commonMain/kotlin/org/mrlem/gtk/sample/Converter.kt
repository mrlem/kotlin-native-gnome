package org.mrlem.gtk.sample

import kotlin.math.roundToInt

object Converter {

    fun eurosToDollars(euros: Float): Float = (euros * 1.19f * 100).roundToInt() / 100f

}
