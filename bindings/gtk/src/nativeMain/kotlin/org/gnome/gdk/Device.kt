// TODO - method: get_key (param type)
// TODO - method: get_position (param type)
// TODO - method: get_position_double (param type)
// TODO - method: get_window_at_position (param type)
// TODO - method: get_window_at_position_double (param type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gdk

import interop.GdkDevice
import interop.gdk_device_get_associated_device
import interop.gdk_device_get_axes
import interop.gdk_device_get_axis_use
import interop.gdk_device_get_device_type
import interop.gdk_device_get_display
import interop.gdk_device_get_has_cursor
import interop.gdk_device_get_last_event_window
import interop.gdk_device_get_mode
import interop.gdk_device_get_n_axes
import interop.gdk_device_get_n_keys
import interop.gdk_device_get_name
import interop.gdk_device_get_product_id
import interop.gdk_device_get_seat
import interop.gdk_device_get_source
import interop.gdk_device_get_vendor_id
import interop.gdk_device_list_axes
import interop.gdk_device_list_slave_devices
import interop.gdk_device_set_axis_use
import interop.gdk_device_set_key
import interop.gdk_device_set_mode
import interop.gdk_device_warp
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.UInt
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.List
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toKString
import org.mrlem.gnome.gobject.connect

public typealias Device = CPointer<GdkDevice>

public val Device.asObject: Object
  get() = reinterpret()

public val Device.associatedDevice: Device?
  get() = gdk_device_get_associated_device(this)?.reinterpret()

public val Device.axes: AxisFlags
  get() = gdk_device_get_axes(this)

public val Device.deviceType: DeviceType
  get() = gdk_device_get_device_type(this)

public val Device.display: Display?
  get() = gdk_device_get_display(this)?.reinterpret()

public val Device.hasCursor: Boolean
  get() = gdk_device_get_has_cursor(this).toBoolean()

public val Device.lastEventWindow: Window?
  get() = gdk_device_get_last_event_window(this)?.reinterpret()

public var Device.mode: InputMode
  get() = gdk_device_get_mode(this)
  set(`value`) {
    gdk_device_set_mode(this@mode, `value`)
  }

public val Device.nAxes: Int
  get() = gdk_device_get_n_axes(this)

public val Device.nKeys: Int
  get() = gdk_device_get_n_keys(this)

public val Device.name: String?
  get() = gdk_device_get_name(this).toKString()

public val Device.productId: String?
  get() = gdk_device_get_product_id(this).toKString()

public val Device.seat: Seat?
  get() = gdk_device_get_seat(this)?.reinterpret()

public val Device.source: InputSource
  get() = gdk_device_get_source(this)

public val Device.vendorId: String?
  get() = gdk_device_get_vendor_id(this).toKString()

public fun Device.getAxisUse(index: UInt): AxisUse = gdk_device_get_axis_use(this@getAxisUse, index)

public fun Device.listAxes(): List? = gdk_device_list_axes(this@listAxes)?.reinterpret()

public fun Device.listSlaveDevices(): List? =
    gdk_device_list_slave_devices(this@listSlaveDevices)?.reinterpret()

public fun Device.setAxisUse(index: UInt, use: AxisUse): Unit {
  gdk_device_set_axis_use(this@setAxisUse, index, use)
}

public fun Device.setKey(
  index: UInt,
  keyval: UInt,
  modifiers: ModifierType
): Unit {
  gdk_device_set_key(this@setKey, index, keyval, modifiers)
}

public fun Device.warp(
  screen: Screen?,
  x: Int,
  y: Int
): Unit {
  gdk_device_warp(this@warp, screen?.reinterpret(), x, y)
}

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
