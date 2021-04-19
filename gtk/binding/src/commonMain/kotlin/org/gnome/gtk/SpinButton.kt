// TODO - get_increments
// TODO - get_range
// TODO - get_update_policy
// TODO - set_update_policy
// TODO - spin
//
package org.gnome.gtk

import gtk3.GtkSpinButton
import gtk3.gtk_spin_button_configure
import gtk3.gtk_spin_button_get_adjustment
import gtk3.gtk_spin_button_get_digits
import gtk3.gtk_spin_button_get_numeric
import gtk3.gtk_spin_button_get_snap_to_ticks
import gtk3.gtk_spin_button_get_value
import gtk3.gtk_spin_button_get_value_as_int
import gtk3.gtk_spin_button_get_wrap
import gtk3.gtk_spin_button_set_adjustment
import gtk3.gtk_spin_button_set_digits
import gtk3.gtk_spin_button_set_increments
import gtk3.gtk_spin_button_set_numeric
import gtk3.gtk_spin_button_set_range
import gtk3.gtk_spin_button_set_snap_to_ticks
import gtk3.gtk_spin_button_set_value
import gtk3.gtk_spin_button_set_wrap
import gtk3.gtk_spin_button_update
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.UInt
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt

public typealias SpinButton = CPointer<GtkSpinButton>

public val SpinButton.asObject: Object
  get() = reinterpret()

public val SpinButton.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val SpinButton.asWidget: Widget
  get() = reinterpret()

public val SpinButton.asEntry: Entry
  get() = reinterpret()

public fun SpinButton.configure(
  adjustment: Adjustment,
  climbRate: Double,
  digits: UInt
): Unit {
  gtk_spin_button_configure(this, adjustment.reinterpret(), climbRate, digits)
}

public fun SpinButton.getAdjustment(): Adjustment? =
    gtk_spin_button_get_adjustment(this)?.reinterpret()

public fun SpinButton.getDigits(): UInt = gtk_spin_button_get_digits(this)

public fun SpinButton.getNumeric(): Boolean = gtk_spin_button_get_numeric(this).toBoolean

public fun SpinButton.getSnapToTicks(): Boolean = gtk_spin_button_get_snap_to_ticks(this).toBoolean

public fun SpinButton.getValue(): Double = gtk_spin_button_get_value(this)

public fun SpinButton.getValueAsInt(): Int = gtk_spin_button_get_value_as_int(this)

public fun SpinButton.getWrap(): Boolean = gtk_spin_button_get_wrap(this).toBoolean

public fun SpinButton.setAdjustment(adjustment: Adjustment): Unit {
  gtk_spin_button_set_adjustment(this, adjustment.reinterpret())
}

public fun SpinButton.setDigits(digits: UInt): Unit {
  gtk_spin_button_set_digits(this, digits)
}

public fun SpinButton.setIncrements(step: Double, page: Double): Unit {
  gtk_spin_button_set_increments(this, step, page)
}

public fun SpinButton.setNumeric(numeric: Boolean): Unit {
  gtk_spin_button_set_numeric(this, numeric.toInt)
}

public fun SpinButton.setRange(min: Double, max: Double): Unit {
  gtk_spin_button_set_range(this, min, max)
}

public fun SpinButton.setSnapToTicks(snapToTicks: Boolean): Unit {
  gtk_spin_button_set_snap_to_ticks(this, snapToTicks.toInt)
}

public fun SpinButton.setValue(`value`: Double): Unit {
  gtk_spin_button_set_value(this, value)
}

public fun SpinButton.setWrap(wrap: Boolean): Unit {
  gtk_spin_button_set_wrap(this, wrap.toInt)
}

public fun SpinButton.update(): Unit {
  gtk_spin_button_update(this)
}
