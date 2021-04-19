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

public var Adjustment.lower: Double
  get() = gtk_adjustment_get_lower(this)
  set(`value`) {
    gtk_adjustment_set_lower(this, value)
  }

public val Adjustment.minimumIncrement: Double
  get() = gtk_adjustment_get_minimum_increment(this)

public var Adjustment.pageIncrement: Double
  get() = gtk_adjustment_get_page_increment(this)
  set(`value`) {
    gtk_adjustment_set_page_increment(this, value)
  }

public var Adjustment.pageSize: Double
  get() = gtk_adjustment_get_page_size(this)
  set(`value`) {
    gtk_adjustment_set_page_size(this, value)
  }

public var Adjustment.stepIncrement: Double
  get() = gtk_adjustment_get_step_increment(this)
  set(`value`) {
    gtk_adjustment_set_step_increment(this, value)
  }

public var Adjustment.upper: Double
  get() = gtk_adjustment_get_upper(this)
  set(`value`) {
    gtk_adjustment_set_upper(this, value)
  }

public var Adjustment.`value`: Double
  get() = gtk_adjustment_get_value(this)
  set(`value`) {
    gtk_adjustment_set_value(this, value)
  }

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
