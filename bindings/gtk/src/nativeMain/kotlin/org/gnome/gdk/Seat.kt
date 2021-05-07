// TODO - method: grab (param type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gdk

import interop.GdkSeat
import interop.gdk_seat_get_capabilities
import interop.gdk_seat_get_display
import interop.gdk_seat_get_keyboard
import interop.gdk_seat_get_pointer
import interop.gdk_seat_get_slaves
import interop.gdk_seat_ungrab
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.glib.List
import org.gnome.gobject.Object
import org.mrlem.gnome.gobject.connect

public typealias Seat = CPointer<GdkSeat>

public val Seat.asObject: Object
  get() = reinterpret()

public val Seat.parentInstance: Object
  get() = pointed.parent_instance.ptr

public val Seat.capabilities: SeatCapabilities
  get() = gdk_seat_get_capabilities(this)

public val Seat.display: Display?
  get() = gdk_seat_get_display(this)?.reinterpret()

public val Seat.keyboard: Device?
  get() = gdk_seat_get_keyboard(this)?.reinterpret()

public val Seat.pointer: Device?
  get() = gdk_seat_get_pointer(this)?.reinterpret()

public fun Seat.getSlaves(capabilities: SeatCapabilities): List? =
    gdk_seat_get_slaves(this@getSlaves, capabilities)?.reinterpret()

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
