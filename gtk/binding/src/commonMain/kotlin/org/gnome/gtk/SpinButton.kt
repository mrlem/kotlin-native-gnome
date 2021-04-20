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

public var SpinButton.adjustment: Adjustment?
  get() = gtk_spin_button_get_adjustment(this)?.reinterpret()
  set(`value`) {
    gtk_spin_button_set_adjustment(this, value)
  }

public var SpinButton.digits: UInt
  get() = gtk_spin_button_get_digits(this)
  set(`value`) {
    gtk_spin_button_set_digits(this, value)
  }

public var SpinButton.numeric: Boolean
  get() = gtk_spin_button_get_numeric(this).toBoolean
  set(`value`) {
    gtk_spin_button_set_numeric(this, value.toInt)
  }

public var SpinButton.snapToTicks: Boolean
  get() = gtk_spin_button_get_snap_to_ticks(this).toBoolean
  set(`value`) {
    gtk_spin_button_set_snap_to_ticks(this, value.toInt)
  }

public var SpinButton.`value`: Double
  get() = gtk_spin_button_get_value(this)
  set(`value`) {
    gtk_spin_button_set_value(this, value)
  }

public val SpinButton.valueAsInt: Int
  get() = gtk_spin_button_get_value_as_int(this)

public var SpinButton.wrap: Boolean
  get() = gtk_spin_button_get_wrap(this).toBoolean
  set(`value`) {
    gtk_spin_button_set_wrap(this, value.toInt)
  }

public fun SpinButton.configure(
  adjustment: Adjustment,
  climbRate: Double,
  digits: UInt
): Unit {
  gtk_spin_button_configure(this, adjustment.reinterpret(), climbRate, digits)
}

public fun SpinButton.setIncrements(step: Double, page: Double): Unit {
  gtk_spin_button_set_increments(this, step, page)
}

public fun SpinButton.setRange(min: Double, max: Double): Unit {
  gtk_spin_button_set_range(this, min, max)
}

public fun SpinButton.update(): Unit {
  gtk_spin_button_update(this)
}
