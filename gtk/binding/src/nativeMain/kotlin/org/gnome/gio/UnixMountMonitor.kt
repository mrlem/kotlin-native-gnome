// TODO - constructor: new
// TODO - method: set_rate_limit
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GUnixMountMonitor
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.mrlem.gnome.gobject.connect

public typealias UnixMountMonitor = CPointer<GUnixMountMonitor>

public val UnixMountMonitor.asObject: Object
  get() = reinterpret()

public object UnixMountMonitorFactory

public fun UnixMountMonitor.onMountpointsChanged(callback: (UnixMountMonitor) -> Unit):
    UnixMountMonitor {
  // TODO - handle callback data

  asObject.connect("mountpoints-changed") { callback(this) }
  return this
}

public fun UnixMountMonitor.onMountsChanged(callback: (UnixMountMonitor) -> Unit):
    UnixMountMonitor {
  // TODO - handle callback data

  asObject.connect("mounts-changed") { callback(this) }
  return this
}
