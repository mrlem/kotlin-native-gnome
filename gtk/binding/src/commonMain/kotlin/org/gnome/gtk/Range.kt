// TODO - get_lower_stepper_sensitivity
// TODO - get_min_slider_size
// TODO - get_range_rect
// TODO - get_slider_range
// TODO - get_upper_stepper_sensitivity
// TODO - set_lower_stepper_sensitivity
// TODO - set_min_slider_size
// TODO - set_upper_stepper_sensitivity
//
package org.gnome.gtk

import gtk3.GtkRange
import gtk3.gtk_range_get_adjustment
import gtk3.gtk_range_get_fill_level
import gtk3.gtk_range_get_flippable
import gtk3.gtk_range_get_inverted
import gtk3.gtk_range_get_restrict_to_fill_level
import gtk3.gtk_range_get_round_digits
import gtk3.gtk_range_get_show_fill_level
import gtk3.gtk_range_get_slider_size_fixed
import gtk3.gtk_range_get_value
import gtk3.gtk_range_set_adjustment
import gtk3.gtk_range_set_fill_level
import gtk3.gtk_range_set_flippable
import gtk3.gtk_range_set_increments
import gtk3.gtk_range_set_inverted
import gtk3.gtk_range_set_range
import gtk3.gtk_range_set_restrict_to_fill_level
import gtk3.gtk_range_set_round_digits
import gtk3.gtk_range_set_show_fill_level
import gtk3.gtk_range_set_slider_size_fixed
import gtk3.gtk_range_set_value
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt

public typealias Range = CPointer<GtkRange>

public val Range.asObject: Object
  get() = reinterpret()

public val Range.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Range.asWidget: Widget
  get() = reinterpret()

public var Range.adjustment: Adjustment?
  get() = gtk_range_get_adjustment(this)?.reinterpret()
  set(`value`) {
    gtk_range_set_adjustment(this, value)
  }

public var Range.fillLevel: Double
  get() = gtk_range_get_fill_level(this)
  set(`value`) {
    gtk_range_set_fill_level(this, value)
  }

public var Range.flippable: Boolean
  get() = gtk_range_get_flippable(this).toBoolean
  set(`value`) {
    gtk_range_set_flippable(this, value.toInt)
  }

public var Range.inverted: Boolean
  get() = gtk_range_get_inverted(this).toBoolean
  set(`value`) {
    gtk_range_set_inverted(this, value.toInt)
  }

public var Range.restrictToFillLevel: Boolean
  get() = gtk_range_get_restrict_to_fill_level(this).toBoolean
  set(`value`) {
    gtk_range_set_restrict_to_fill_level(this, value.toInt)
  }

public var Range.roundDigits: Int
  get() = gtk_range_get_round_digits(this)
  set(`value`) {
    gtk_range_set_round_digits(this, value)
  }

public var Range.showFillLevel: Boolean
  get() = gtk_range_get_show_fill_level(this).toBoolean
  set(`value`) {
    gtk_range_set_show_fill_level(this, value.toInt)
  }

public var Range.sliderSizeFixed: Boolean
  get() = gtk_range_get_slider_size_fixed(this).toBoolean
  set(`value`) {
    gtk_range_set_slider_size_fixed(this, value.toInt)
  }

public var Range.`value`: Double
  get() = gtk_range_get_value(this)
  set(`value`) {
    gtk_range_set_value(this, value)
  }

public fun Range.setIncrements(step: Double, page: Double): Unit {
  gtk_range_set_increments(this, step, page)
}

public fun Range.setRange(min: Double, max: Double): Unit {
  gtk_range_set_range(this, min, max)
}
