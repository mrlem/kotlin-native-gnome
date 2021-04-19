// TODO - get_lower_stepper_sensitivity
// TODO - get_range_rect
// TODO - get_slider_range
// TODO - get_upper_stepper_sensitivity
// TODO - set_lower_stepper_sensitivity
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

public fun Range.getAdjustment(): Adjustment? = gtk_range_get_adjustment(this)?.reinterpret()

public fun Range.getFillLevel(): Double = gtk_range_get_fill_level(this)

public fun Range.getFlippable(): Boolean = gtk_range_get_flippable(this).toBoolean

public fun Range.getInverted(): Boolean = gtk_range_get_inverted(this).toBoolean

public fun Range.getRestrictToFillLevel(): Boolean =
    gtk_range_get_restrict_to_fill_level(this).toBoolean

public fun Range.getRoundDigits(): Int = gtk_range_get_round_digits(this)

public fun Range.getShowFillLevel(): Boolean = gtk_range_get_show_fill_level(this).toBoolean

public fun Range.getSliderSizeFixed(): Boolean = gtk_range_get_slider_size_fixed(this).toBoolean

public fun Range.getValue(): Double = gtk_range_get_value(this)

public fun Range.setAdjustment(adjustment: Adjustment): Unit {
  gtk_range_set_adjustment(this, adjustment.reinterpret())
}

public fun Range.setFillLevel(fillLevel: Double): Unit {
  gtk_range_set_fill_level(this, fillLevel)
}

public fun Range.setFlippable(flippable: Boolean): Unit {
  gtk_range_set_flippable(this, flippable.toInt)
}

public fun Range.setIncrements(step: Double, page: Double): Unit {
  gtk_range_set_increments(this, step, page)
}

public fun Range.setInverted(setting: Boolean): Unit {
  gtk_range_set_inverted(this, setting.toInt)
}

public fun Range.setRange(min: Double, max: Double): Unit {
  gtk_range_set_range(this, min, max)
}

public fun Range.setRestrictToFillLevel(restrictToFillLevel: Boolean): Unit {
  gtk_range_set_restrict_to_fill_level(this, restrictToFillLevel.toInt)
}

public fun Range.setRoundDigits(roundDigits: Int): Unit {
  gtk_range_set_round_digits(this, roundDigits)
}

public fun Range.setShowFillLevel(showFillLevel: Boolean): Unit {
  gtk_range_set_show_fill_level(this, showFillLevel.toInt)
}

public fun Range.setSliderSizeFixed(sizeFixed: Boolean): Unit {
  gtk_range_set_slider_size_fixed(this, sizeFixed.toInt)
}

public fun Range.setValue(`value`: Double): Unit {
  gtk_range_set_value(this, value)
}
