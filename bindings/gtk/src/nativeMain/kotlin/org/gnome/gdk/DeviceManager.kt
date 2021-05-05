@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gdk

import interop.GdkDeviceManager
import interop.gdk_device_manager_get_display
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.mrlem.gnome.gobject.connect

public typealias DeviceManager = CPointer<GdkDeviceManager>

public val DeviceManager.asObject: Object
  get() = reinterpret()

public val DeviceManager.display: Display?
  get() = gdk_device_manager_get_display(this)?.reinterpret()

public fun DeviceManager.onDeviceAdded(callback: (DeviceManager) -> Unit): DeviceManager {
  // TODO - handle callback data

  asObject.connect("device-added") { callback(this) }
  return this
}

public fun DeviceManager.onDeviceChanged(callback: (DeviceManager) -> Unit): DeviceManager {
  // TODO - handle callback data

  asObject.connect("device-changed") { callback(this) }
  return this
}

public fun DeviceManager.onDeviceRemoved(callback: (DeviceManager) -> Unit): DeviceManager {
  // TODO - handle callback data

  asObject.connect("device-removed") { callback(this) }
  return this
}
