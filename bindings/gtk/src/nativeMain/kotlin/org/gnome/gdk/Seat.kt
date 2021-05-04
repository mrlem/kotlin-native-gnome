// TODO - method: get_capabilities
// TODO - method: get_display
// TODO - method: get_keyboard
// TODO - method: get_pointer
// TODO - method: get_slaves
// TODO - method: grab
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gdk

import interop.GdkSeat
import interop.gdk_seat_ungrab
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.mrlem.gnome.gobject.connect

public typealias Seat = CPointer<GdkSeat>

public val Seat.asObject: Object
  get() = reinterpret()

public val Seat.parentInstance: Object
  get() = pointed.parent_instance.ptr

public fun Seat.ungrab(): Unit {
  gdk_seat_ungrab(this@ungrab)
}

public fun Seat.onDeviceAdded(callback: (Seat) -> Unit): Seat {
  // TODO - handle callback data

  asObject.connect("device-added") { callback(this) }
  return this
}

public fun Seat.onDeviceRemoved(callback: (Seat) -> Unit): Seat {
  // TODO - handle callback data

  asObject.connect("device-removed") { callback(this) }
  return this
}

public fun Seat.onToolAdded(callback: (Seat) -> Unit): Seat {
  // TODO - handle callback data

  asObject.connect("tool-added") { callback(this) }
  return this
}

public fun Seat.onToolRemoved(callback: (Seat) -> Unit): Seat {
  // TODO - handle callback data

  asObject.connect("tool-removed") { callback(this) }
  return this
}
