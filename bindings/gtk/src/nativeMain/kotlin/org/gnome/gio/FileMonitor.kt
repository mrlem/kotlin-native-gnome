@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GFileMonitor
import interop.g_file_monitor_cancel
import interop.g_file_monitor_emit_event
import interop.g_file_monitor_is_cancelled
import interop.g_file_monitor_set_rate_limit
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.mrlem.gnome.gobject.connect
import org.mrlem.gnome.toBoolean

public typealias FileMonitor = CPointer<GFileMonitor>

public val FileMonitor.asObject: Object
  get() = reinterpret()

public val FileMonitor.parentInstance: Object
  get() = pointed.parent_instance.ptr

public fun FileMonitor.cancel(): Boolean = g_file_monitor_cancel(this@cancel).toBoolean()

public fun FileMonitor.emitEvent(
  child: File?,
  otherFile: File?,
  eventType: FileMonitorEvent
): Unit {
  g_file_monitor_emit_event(this@emitEvent, child?.reinterpret(), otherFile?.reinterpret(),
      eventType)
}

public fun FileMonitor.isCancelled(): Boolean =
    g_file_monitor_is_cancelled(this@isCancelled).toBoolean()

public fun FileMonitor.setRateLimit(limitMsecs: Int): Unit {
  g_file_monitor_set_rate_limit(this@setRateLimit, limitMsecs)
}

public fun FileMonitor.onChanged(callback: (FileMonitor) -> Unit): FileMonitor {
  // TODO - handle callback data

  asObject.connect("changed") { callback(this) }
  return this
}
