// TODO - implement:
//   add_full
//   add_item
//   get_items
//   has_item
//   lookup_item
//   move_item
//   purge_items
//   remove_item
package org.gnome.gtk

import gtk3.GtkRecentManager
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object

public typealias RecentManager = CPointer<GtkRecentManager>

public val RecentManager.asObject: Object
  get() = reinterpret()
