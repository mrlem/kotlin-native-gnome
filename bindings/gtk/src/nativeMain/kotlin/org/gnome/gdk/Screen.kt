// TODO - method: get_font_options (return type)
// TODO - method: set_font_options (param type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gdk

import interop.GdkScreen
import interop.gdk_screen_get_display
import interop.gdk_screen_get_resolution
import interop.gdk_screen_get_rgba_visual
import interop.gdk_screen_get_root_window
import interop.gdk_screen_get_setting
import interop.gdk_screen_get_system_visual
import interop.gdk_screen_get_toplevel_windows
import interop.gdk_screen_get_window_stack
import interop.gdk_screen_is_composited
import interop.gdk_screen_list_visuals
import interop.gdk_screen_set_resolution
import kotlin.Boolean
import kotlin.Double
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.List
import org.gnome.gobject.Object
import org.gnome.gobject.Value
import org.gnome.toBoolean
import org.mrlem.gnome.gobject.connect

public typealias Screen = CPointer<GdkScreen>

public val Screen.asObject: Object
  get() = reinterpret()

public val Screen.display: Display?
  get() = gdk_screen_get_display(this)?.reinterpret()

public var Screen.resolution: Double
  get() = gdk_screen_get_resolution(this)
  set(`value`) {
    gdk_screen_set_resolution(this@resolution, `value`)
  }

public val Screen.rgbaVisual: Visual?
  get() = gdk_screen_get_rgba_visual(this)?.reinterpret()

public val Screen.rootWindow: Window?
  get() = gdk_screen_get_root_window(this)?.reinterpret()

public val Screen.systemVisual: Visual?
  get() = gdk_screen_get_system_visual(this)?.reinterpret()

public val Screen.toplevelWindows: List?
  get() = gdk_screen_get_toplevel_windows(this)?.reinterpret()

public val Screen.windowStack: List?
  get() = gdk_screen_get_window_stack(this)?.reinterpret()

public fun Screen.getSetting(name: String?, `value`: Value?): Boolean =
    gdk_screen_get_setting(this@getSetting, name, `value`?.reinterpret()).toBoolean()

public fun Screen.isComposited(): Boolean = gdk_screen_is_composited(this@isComposited).toBoolean()

public fun Screen.listVisuals(): List? = gdk_screen_list_visuals(this@listVisuals)?.reinterpret()

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
