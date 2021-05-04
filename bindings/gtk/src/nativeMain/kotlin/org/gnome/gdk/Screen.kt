// TODO - method: get_display (return type)
// TODO - method: get_font_options (return type)
// TODO - method: get_rgba_visual (return type)
// TODO - method: get_root_window (return type)
// TODO - method: get_system_visual (return type)
// TODO - method: get_toplevel_windows (return type)
// TODO - method: get_window_stack (return type)
// TODO - method: list_visuals (return type)
// TODO - method: set_font_options (param type)
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
