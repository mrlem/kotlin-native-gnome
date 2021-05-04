// TODO - method: get_active_window
// TODO - method: get_display
// TODO - method: get_font_options
// TODO - method: get_height
// TODO - method: get_height_mm
// TODO - method: get_monitor_at_point
// TODO - method: get_monitor_at_window
// TODO - method: get_monitor_geometry
// TODO - method: get_monitor_height_mm
// TODO - method: get_monitor_plug_name
// TODO - method: get_monitor_scale_factor
// TODO - method: get_monitor_width_mm
// TODO - method: get_monitor_workarea
// TODO - method: get_n_monitors
// TODO - method: get_number
// TODO - method: get_primary_monitor
// TODO - method: get_rgba_visual
// TODO - method: get_root_window
// TODO - method: get_system_visual
// TODO - method: get_toplevel_windows
// TODO - method: get_width
// TODO - method: get_width_mm
// TODO - method: get_window_stack
// TODO - method: list_visuals
// TODO - method: make_display_name
// TODO - method: set_font_options
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gdk

import interop.GdkScreen
import interop.gdk_screen_get_resolution
import interop.gdk_screen_get_setting
import interop.gdk_screen_is_composited
import interop.gdk_screen_set_resolution
import kotlin.Boolean
import kotlin.Double
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.gobject.Value
import org.gnome.toBoolean
import org.mrlem.gnome.gobject.connect

public typealias Screen = CPointer<GdkScreen>

public val Screen.asObject: Object
  get() = reinterpret()

public var Screen.resolution: Double
  get() = gdk_screen_get_resolution(this)
  set(`value`) {
    gdk_screen_set_resolution(this@resolution, `value`)
  }

public fun Screen.getSetting(name: String?, `value`: Value?): Boolean =
    gdk_screen_get_setting(this@getSetting, name, `value`?.reinterpret()).toBoolean()

public fun Screen.isComposited(): Boolean = gdk_screen_is_composited(this@isComposited).toBoolean()

public fun Screen.onCompositedChanged(callback: (Screen) -> Unit): Screen {
  // TODO - handle callback data

  asObject.connect("composited-changed") { callback(this) }
  return this
}

public fun Screen.onMonitorsChanged(callback: (Screen) -> Unit): Screen {
  // TODO - handle callback data

  asObject.connect("monitors-changed") { callback(this) }
  return this
}

public fun Screen.onSizeChanged(callback: (Screen) -> Unit): Screen {
  // TODO - handle callback data

  asObject.connect("size-changed") { callback(this) }
  return this
}
