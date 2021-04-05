// TODO - implement:
//   add_drag_dest
//   get_drag_item
//   get_drop_group
//   get_drop_item
//   get_exclusive
//   get_expand
//   get_group_position
//   get_hadjustment
//   get_icon_size
//   get_style
//   get_vadjustment
//   set_drag_source
//   set_exclusive
//   set_expand
//   set_group_position
//   set_icon_size
//   set_style
//   unset_icon_size
//   unset_style
package org.gnome.gtk

import gtk3.GtkToolPalette
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias ToolPalette = CPointer<GtkToolPalette>

public val ToolPalette.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val ToolPalette.asWidget: Widget
  get() = reinterpret()

public val ToolPalette.asContainer: Container
  get() = reinterpret()
