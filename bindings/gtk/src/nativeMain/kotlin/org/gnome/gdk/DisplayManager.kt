// TODO - method: get_default_display (return type)
// TODO - method: list_displays (return type)
// TODO - method: open_display (return type)
// TODO - method: set_default_display (param type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gdk

import interop.GdkDisplayManager
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.mrlem.gnome.gobject.connect

public typealias DisplayManager = CPointer<GdkDisplayManager>

public val DisplayManager.asObject: Object
  get() = reinterpret()

public fun DisplayManager.onDisplayOpened(callback: (DisplayManager) -> Unit): DisplayManager {
  // TODO - handle callback data

  asObject.connect("display-opened") { callback(this) }
  return this
}
