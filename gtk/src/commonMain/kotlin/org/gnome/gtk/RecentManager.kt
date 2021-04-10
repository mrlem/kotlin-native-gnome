// TODO - implement:
//   add_full
//   add_item
//   has_item
//   lookup_item
//   move_item
//   purge_items
//   remove_item
package org.gnome.gtk

import gtk3.GtkRecentManager
import gtk3.gtk_recent_manager_get_items
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object

public typealias RecentManager = CPointer<GtkRecentManager>

public val RecentManager.asObject: Object
  get() = reinterpret()

public fun RecentManager.getItems(): Unit {
  gtk_recent_manager_get_items(this)
}
