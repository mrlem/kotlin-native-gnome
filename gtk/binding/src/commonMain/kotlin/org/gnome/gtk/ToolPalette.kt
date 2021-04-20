// TODO - add_drag_dest
// TODO - get_hadjustment
// TODO - get_icon_size
// TODO - get_style
// TODO - get_vadjustment
// TODO - set_icon_size
// TODO - set_style
//
package org.gnome.gtk

import gtk3.GtkToolPalette
import gtk3.gtk_tool_palette_get_drag_item
import gtk3.gtk_tool_palette_get_drop_group
import gtk3.gtk_tool_palette_get_drop_item
import gtk3.gtk_tool_palette_get_exclusive
import gtk3.gtk_tool_palette_get_expand
import gtk3.gtk_tool_palette_get_group_position
import gtk3.gtk_tool_palette_set_drag_source
import gtk3.gtk_tool_palette_set_exclusive
import gtk3.gtk_tool_palette_set_expand
import gtk3.gtk_tool_palette_set_group_position
import gtk3.gtk_tool_palette_unset_icon_size
import gtk3.gtk_tool_palette_unset_style
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt

public typealias ToolPalette = CPointer<GtkToolPalette>

public val ToolPalette.asObject: Object
  get() = reinterpret()

public val ToolPalette.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val ToolPalette.asWidget: Widget
  get() = reinterpret()

public val ToolPalette.asContainer: Container
  get() = reinterpret()

public fun ToolPalette.getDragItem(selection: SelectionData): Widget? =
    gtk_tool_palette_get_drag_item(this, selection.reinterpret())?.reinterpret()

public fun ToolPalette.getDropGroup(x: Int, y: Int): ToolItemGroup? =
    gtk_tool_palette_get_drop_group(this, x, y)?.reinterpret()

public fun ToolPalette.getDropItem(x: Int, y: Int): ToolItem? = gtk_tool_palette_get_drop_item(this,
    x, y)?.reinterpret()

public fun ToolPalette.getExclusive(group: ToolItemGroup): Boolean =
    gtk_tool_palette_get_exclusive(this, group.reinterpret()).toBoolean

public fun ToolPalette.getExpand(group: ToolItemGroup): Boolean = gtk_tool_palette_get_expand(this,
    group.reinterpret()).toBoolean

public fun ToolPalette.getGroupPosition(group: ToolItemGroup): Int =
    gtk_tool_palette_get_group_position(this, group.reinterpret())

public fun ToolPalette.setDragSource(targets: ToolPaletteDragTargets): Unit {
  gtk_tool_palette_set_drag_source(this, targets)
}

public fun ToolPalette.setExclusive(group: ToolItemGroup, exclusive: Boolean): Unit {
  gtk_tool_palette_set_exclusive(this, group.reinterpret(), exclusive.toInt)
}

public fun ToolPalette.setExpand(group: ToolItemGroup, expand: Boolean): Unit {
  gtk_tool_palette_set_expand(this, group.reinterpret(), expand.toInt)
}

public fun ToolPalette.setGroupPosition(group: ToolItemGroup, position: Int): Unit {
  gtk_tool_palette_set_group_position(this, group.reinterpret(), position)
}

public fun ToolPalette.unsetIconSize(): Unit {
  gtk_tool_palette_unset_icon_size(this)
}

public fun ToolPalette.unsetStyle(): Unit {
  gtk_tool_palette_unset_style(this)
}
