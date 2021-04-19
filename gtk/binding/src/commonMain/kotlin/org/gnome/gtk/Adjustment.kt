package org.gnome.gtk

import gtk3.GtkAdjustment
import gtk3.gtk_adjustment_clamp_page
import gtk3.gtk_adjustment_configure
import gtk3.gtk_adjustment_get_lower
import gtk3.gtk_adjustment_get_minimum_increment
import gtk3.gtk_adjustment_get_page_increment
import gtk3.gtk_adjustment_get_page_size
import gtk3.gtk_adjustment_get_step_increment
import gtk3.gtk_adjustment_get_upper
import gtk3.gtk_adjustment_get_value
import gtk3.gtk_adjustment_set_lower
import gtk3.gtk_adjustment_set_page_increment
import gtk3.gtk_adjustment_set_page_size
import gtk3.gtk_adjustment_set_step_increment
import gtk3.gtk_adjustment_set_upper
import gtk3.gtk_adjustment_set_value
import kotlin.Double
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object

public typealias Adjustment = CPointer<GtkAdjustment>

public val Adjustment.asObject: Object
  get() = reinterpret()

public val Adjustment.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public fun Adjustment.clampPage(lower: Double, upper: Double): Unit {
  gtk_adjustment_clamp_page(this, lower, upper)
}

public fun Adjustment.configure(
  `value`: Double,
  lower: Double,
  upper: Double,
  stepIncrement: Double,
  pageIncrement: Double,
  pageSize: Double
): Unit {
  gtk_adjustment_configure(this, value, lower, upper, stepIncrement, pageIncrement, pageSize)
}

public fun Adjustment.getLower(): Double = gtk_adjustment_get_lower(this)

public fun Adjustment.getMinimumIncrement(): Double = gtk_adjustment_get_minimum_increment(this)

public fun Adjustment.getPageIncrement(): Double = gtk_adjustment_get_page_increment(this)

public fun Adjustment.getPageSize(): Double = gtk_adjustment_get_page_size(this)

public fun Adjustment.getStepIncrement(): Double = gtk_adjustment_get_step_increment(this)

public fun Adjustment.getUpper(): Double = gtk_adjustment_get_upper(this)

public fun Adjustment.getValue(): Double = gtk_adjustment_get_value(this)

public fun Adjustment.setLower(lower: Double): Unit {
  gtk_adjustment_set_lower(this, lower)
}

public fun Adjustment.setPageIncrement(pageIncrement: Double): Unit {
  gtk_adjustment_set_page_increment(this, pageIncrement)
}

public fun Adjustment.setPageSize(pageSize: Double): Unit {
  gtk_adjustment_set_page_size(this, pageSize)
}

public fun Adjustment.setStepIncrement(stepIncrement: Double): Unit {
  gtk_adjustment_set_step_increment(this, stepIncrement)
}

public fun Adjustment.setUpper(upper: Double): Unit {
  gtk_adjustment_set_upper(this, upper)
}

public fun Adjustment.setValue(`value`: Double): Unit {
  gtk_adjustment_set_value(this, value)
}
