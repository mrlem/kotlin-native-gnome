// TODO - method: get_associated_device
// TODO - method: get_axes
// TODO - method: get_axis_use
// TODO - method: get_device_type
// TODO - method: get_display
// TODO - method: get_key
// TODO - method: get_last_event_window
// TODO - method: get_mode
// TODO - method: get_position
// TODO - method: get_position_double
// TODO - method: get_seat
// TODO - method: get_source
// TODO - method: get_window_at_position
// TODO - method: get_window_at_position_double
// TODO - method: grab
// TODO - method: list_axes
// TODO - method: list_slave_devices
// TODO - method: set_axis_use
// TODO - method: set_key
// TODO - method: set_mode
// TODO - method: ungrab
// TODO - method: warp
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gdk

import interop.GdkDevice
import interop.gdk_device_get_has_cursor
import interop.gdk_device_get_n_axes
import interop.gdk_device_get_n_keys
import interop.gdk_device_get_name
import interop.gdk_device_get_product_id
import interop.gdk_device_get_vendor_id
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toKString
import org.mrlem.gnome.gobject.connect

public typealias Device = CPointer<GdkDevice>

public val Device.asObject: Object
  get() = reinterpret()

public val Device.hasCursor: Boolean
  get() = gdk_device_get_has_cursor(this).toBoolean()

public val Device.nAxes: Int
  get() = gdk_device_get_n_axes(this)

public val Device.nKeys: Int
  get() = gdk_device_get_n_keys(this)

public val Device.name: String?
  get() = gdk_device_get_name(this).toKString()

public val Device.productId: String?
  get() = gdk_device_get_product_id(this).toKString()

public val Device.vendorId: String?
  get() = gdk_device_get_vendor_id(this).toKString()

public fun Device.onChanged(callback: (Device) -> Unit): Device {
  // TODO - handle callback data

  asObject.connect("changed") { callback(this) }
  return this
}

public fun Device.onToolChanged(callback: (Device) -> Unit): Device {
  // TODO - handle callback data

  asObject.connect("tool-changed") { callback(this) }
  return this
}
