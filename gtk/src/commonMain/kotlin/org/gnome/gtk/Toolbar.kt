// TODO - implement:
//   get_drop_index
//   get_icon_size
//   get_item_index
//   get_n_items
//   get_nth_item
//   get_relief_style
//   get_show_arrow
//   get_style
//   insert
//   set_drop_highlight_item
//   set_icon_size
//   set_show_arrow
//   set_style
//   unset_icon_size
//   unset_style
package org.gnome.gtk

import gtk3.GtkToolbar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias Toolbar = CPointer<GtkToolbar>

public val Toolbar.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Toolbar.asWidget: Widget
  get() = reinterpret()

public val Toolbar.asContainer: Container
  get() = reinterpret()
