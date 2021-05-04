// TODO - method: get_display (return type)
// TODO - method: get_geometry (param type)
// TODO - method: get_subpixel_layout (return type)
// TODO - method: get_workarea (param type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gdk

import interop.GdkMonitor
import interop.gdk_monitor_get_height_mm
import interop.gdk_monitor_get_manufacturer
import interop.gdk_monitor_get_model
import interop.gdk_monitor_get_refresh_rate
import interop.gdk_monitor_get_scale_factor
import interop.gdk_monitor_get_width_mm
import interop.gdk_monitor_is_primary
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

public typealias Monitor = CPointer<GdkMonitor>

public val Monitor.asObject: Object
  get() = reinterpret()

public val Monitor.heightMm: Int
  get() = gdk_monitor_get_height_mm(this)

public val Monitor.manufacturer: String?
  get() = gdk_monitor_get_manufacturer(this).toKString()

public val Monitor.model: String?
  get() = gdk_monitor_get_model(this).toKString()

public val Monitor.refreshRate: Int
  get() = gdk_monitor_get_refresh_rate(this)

public val Monitor.scaleFactor: Int
  get() = gdk_monitor_get_scale_factor(this)

public val Monitor.widthMm: Int
  get() = gdk_monitor_get_width_mm(this)

public fun Monitor.isPrimary(): Boolean = gdk_monitor_is_primary(this@isPrimary).toBoolean()

public fun Monitor.onInvalidate(callback: (Monitor) -> Unit): Monitor {
  // TODO - handle callback data

  asObject.connect("invalidate") { callback(this) }
  return this
}
