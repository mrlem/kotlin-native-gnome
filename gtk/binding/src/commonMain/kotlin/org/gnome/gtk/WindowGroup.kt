// TODO - get_current_device_grab
// TODO - list_windows
//
package org.gnome.gtk

import gtk3.GtkWindowGroup
import gtk3.gtk_window_group_add_window
import gtk3.gtk_window_group_get_current_grab
import gtk3.gtk_window_group_remove_window
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias WindowGroup = CPointer<GtkWindowGroup>

public val WindowGroup.asObject: Object
  get() = reinterpret()

public val WindowGroup.currentGrab: Widget?
  get() = gtk_window_group_get_current_grab(this)?.reinterpret()

public fun WindowGroup.addWindow(window: Window): Unit {
  gtk_window_group_add_window(this, window.reinterpret())
}

public fun WindowGroup.removeWindow(window: Window): Unit {
  gtk_window_group_remove_window(this, window.reinterpret())
}
