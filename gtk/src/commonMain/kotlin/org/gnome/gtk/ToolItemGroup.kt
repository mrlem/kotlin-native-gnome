// TODO - implement:
//   get_collapsed
//   get_drop_item
//   get_ellipsize
//   get_header_relief
//   get_item_position
//   get_label
//   get_label_widget
//   get_n_items
//   get_nth_item
//   insert
//   set_collapsed
//   set_ellipsize
//   set_header_relief
//   set_item_position
//   set_label
//   set_label_widget
package org.gnome.gtk

import gtk3.GtkToolItemGroup
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias ToolItemGroup = CPointer<GtkToolItemGroup>

public val ToolItemGroup.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val ToolItemGroup.asWidget: Widget
  get() = reinterpret()

public val ToolItemGroup.asContainer: Container
  get() = reinterpret()
