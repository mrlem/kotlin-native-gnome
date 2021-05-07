@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gdk

import interop.GdkDisplayManager
import interop.gdk_display_manager_get_default_display
import interop.gdk_display_manager_list_displays
import interop.gdk_display_manager_open_display
import interop.gdk_display_manager_set_default_display
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.SList
import org.gnome.gobject.Object
import org.mrlem.gnome.gobject.connect

public typealias DisplayManager = CPointer<GdkDisplayManager>

public val DisplayManager.asObject: Object
  get() = reinterpret()

public var DisplayManager.defaultDisplay: Display?
  get() = gdk_display_manager_get_default_display(this)?.reinterpret()
  set(`value`) {
    gdk_display_manager_set_default_display(this@defaultDisplay, `value`)
  }

public fun DisplayManager.listDisplays(): SList? =
    gdk_display_manager_list_displays(this@listDisplays)?.reinterpret()

public fun DisplayManager.openDisplay(name: String?): Display? =
    gdk_display_manager_open_display(this@openDisplay, name)?.reinterpret()

public fun DisplayManager.onDisplayOpened(callback: (DisplayManager) -> Unit): DisplayManager {
  // TODO - handle callback data

  asObject.connect("display-opened") { callback(this) }
  return this
}
