// TODO - method: emit_event
// TODO - method: set_rate_limit
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GFileMonitor
import interop.g_file_monitor_cancel
import interop.g_file_monitor_is_cancelled
import kotlin.Boolean
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.mrlem.gnome.gobject.connect

public typealias FileMonitor = CPointer<GFileMonitor>

public val FileMonitor.asObject: Object
  get() = reinterpret()

public fun FileMonitor.cancel(): Boolean = g_file_monitor_cancel(this).toBoolean

public fun FileMonitor.isCancelled(): Boolean = g_file_monitor_is_cancelled(this).toBoolean

public fun FileMonitor.onChanged(callback: (FileMonitor) -> Unit): FileMonitor {
  // TODO - handle callback data

  asObject.connect("changed") { callback(this) }
  return this
}
