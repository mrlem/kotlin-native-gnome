// TODO - implement:
//   add_drag_dest
//   get_drag_item
//   get_drop_group
//   get_drop_item
//   get_exclusive
//   get_expand
//   get_group_position
//   get_icon_size
//   set_drag_source
//   set_exclusive
//   set_expand
//   set_group_position
//   set_icon_size
//   set_style
package org.gnome.gtk

import gtk3.GtkToolPalette
import gtk3.gtk_tool_palette_get_style
import gtk3.gtk_tool_palette_unset_icon_size
import gtk3.gtk_tool_palette_unset_style
import kotlin.Unit
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

public fun ToolPalette.getStyle(): Unit {
  gtk_tool_palette_get_style(this)
}

public fun ToolPalette.unsetIconSize(): Unit {
  gtk_tool_palette_unset_icon_size(this)
}

public fun ToolPalette.unsetStyle(): Unit {
  gtk_tool_palette_unset_style(this)
}
