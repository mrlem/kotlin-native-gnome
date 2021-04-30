@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkShortcutsWindow
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.mrlem.gnome.gobject.connect

public typealias ShortcutsWindow = CPointer<GtkShortcutsWindow>

public val ShortcutsWindow.asObject: Object
  get() = reinterpret()

public val ShortcutsWindow.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val ShortcutsWindow.asWidget: Widget
  get() = reinterpret()

public val ShortcutsWindow.asContainer: Container
  get() = reinterpret()

public val ShortcutsWindow.asBin: Bin
  get() = reinterpret()

public val ShortcutsWindow.asWindow: Window
  get() = reinterpret()

public val ShortcutsWindow.window: Window
  get() = pointed.window.ptr

public fun ShortcutsWindow.onClose(callback: (ShortcutsWindow) -> Unit): ShortcutsWindow {
  // TODO - handle callback data

  asObject.connect("close") { callback(this) }
  return this
}

public fun ShortcutsWindow.onSearch(callback: (ShortcutsWindow) -> Unit): ShortcutsWindow {
  // TODO - handle callback data

  asObject.connect("search") { callback(this) }
  return this
}
