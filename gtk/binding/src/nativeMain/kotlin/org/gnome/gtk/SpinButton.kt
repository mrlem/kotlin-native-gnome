// TODO - method: get_increments
// TODO - method: get_range
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkSpinButton
import interop.gtk_spin_button_configure
import interop.gtk_spin_button_get_adjustment
import interop.gtk_spin_button_get_digits
import interop.gtk_spin_button_get_numeric
import interop.gtk_spin_button_get_snap_to_ticks
import interop.gtk_spin_button_get_update_policy
import interop.gtk_spin_button_get_value
import interop.gtk_spin_button_get_value_as_int
import interop.gtk_spin_button_get_wrap
import interop.gtk_spin_button_new
import interop.gtk_spin_button_new_with_range
import interop.gtk_spin_button_set_adjustment
import interop.gtk_spin_button_set_digits
import interop.gtk_spin_button_set_increments
import interop.gtk_spin_button_set_numeric
import interop.gtk_spin_button_set_range
import interop.gtk_spin_button_set_snap_to_ticks
import interop.gtk_spin_button_set_update_policy
import interop.gtk_spin_button_set_value
import interop.gtk_spin_button_set_wrap
import interop.gtk_spin_button_spin
import interop.gtk_spin_button_update
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.UInt
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.gobject.connect
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

public object SpinButtonFactory {
  public fun new(
    adjustment: Adjustment?,
    climbRate: Double,
    digits: UInt
  ): SpinButton = gtk_spin_button_new(adjustment?.reinterpret(), climbRate, digits)!!.reinterpret()

  public fun newWithRange(
    min: Double,
    max: Double,
    step: Double
  ): SpinButton = gtk_spin_button_new_with_range(min, max, step)!!.reinterpret()
}

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

public var SpinButton.updatePolicy: SpinButtonUpdatePolicy
  get() = gtk_spin_button_get_update_policy(this)
  set(`value`) {
    gtk_spin_button_set_update_policy(this, value)
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
  adjustment: Adjustment?,
  climbRate: Double,
  digits: UInt
): Unit {
  gtk_spin_button_configure(this, adjustment?.reinterpret(), climbRate, digits)
}

public fun SpinButton.setIncrements(step: Double, page: Double): Unit {
  gtk_spin_button_set_increments(this, step, page)
}

public fun SpinButton.setRange(min: Double, max: Double): Unit {
  gtk_spin_button_set_range(this, min, max)
}

public fun SpinButton.spin(direction: SpinType, increment: Double): Unit {
  gtk_spin_button_spin(this, direction, increment)
}

public fun SpinButton.update(): Unit {
  gtk_spin_button_update(this)
}

public fun SpinButton.onChangeValue(callback: (SpinButton) -> Unit): SpinButton {
  // TODO - handle callback data

  asObject.connect("change-value") { callback(this) }
  return this
}

public fun SpinButton.onInput(callback: (SpinButton) -> Unit): SpinButton {
  // TODO - handle callback data

  asObject.connect("input") { callback(this) }
  return this
}

public fun SpinButton.onOutput(callback: (SpinButton) -> Unit): SpinButton {
  // TODO - handle callback data

  asObject.connect("output") { callback(this) }
  return this
}

public fun SpinButton.onValueChanged(callback: (SpinButton) -> Unit): SpinButton {
  // TODO - handle callback data

  asObject.connect("value-changed") { callback(this) }
  return this
}

public fun SpinButton.onWrapped(callback: (SpinButton) -> Unit): SpinButton {
  // TODO - handle callback data

  asObject.connect("wrapped") { callback(this) }
  return this
}
