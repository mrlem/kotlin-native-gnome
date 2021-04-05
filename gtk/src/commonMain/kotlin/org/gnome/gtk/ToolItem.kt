// TODO - implement:
//   get_ellipsize_mode
//   get_expand
//   get_homogeneous
//   get_icon_size
//   get_is_important
//   get_orientation
//   get_proxy_menu_item
//   get_relief_style
//   get_text_alignment
//   get_text_orientation
//   get_text_size_group
//   get_toolbar_style
//   get_use_drag_window
//   get_visible_horizontal
//   get_visible_vertical
//   rebuild_menu
//   retrieve_proxy_menu_item
//   set_expand
//   set_homogeneous
//   set_is_important
//   set_proxy_menu_item
//   set_tooltip_markup
//   set_tooltip_text
//   set_use_drag_window
//   set_visible_horizontal
//   set_visible_vertical
//   toolbar_reconfigured
package org.gnome.gtk

import gtk3.GtkToolItem
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias ToolItem = CPointer<GtkToolItem>

public val ToolItem.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val ToolItem.asWidget: Widget
  get() = reinterpret()

public val ToolItem.asContainer: Container
  get() = reinterpret()

public val ToolItem.asBin: Bin
  get() = reinterpret()
