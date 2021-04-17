// TODO - implement:
//   add_window
//   get_current_device_grab
//   remove_window
package org.gnome.gtk

import gtk3.GtkWindowGroup
import gtk3.gtk_window_group_get_current_grab
import gtk3.gtk_window_group_list_windows
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object

public typealias WindowGroup = CPointer<GtkWindowGroup>

public val WindowGroup.asObject: Object
  get() = reinterpret()

public fun WindowGroup.getCurrentGrab(): Unit {
  gtk_window_group_get_current_grab(this)
}

public fun WindowGroup.listWindows(): Unit {
  gtk_window_group_list_windows(this)
}
