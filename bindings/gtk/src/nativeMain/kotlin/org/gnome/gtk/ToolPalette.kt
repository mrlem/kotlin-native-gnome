@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkToolPalette
import interop.gtk_tool_palette_add_drag_dest
import interop.gtk_tool_palette_get_drag_item
import interop.gtk_tool_palette_get_drop_group
import interop.gtk_tool_palette_get_drop_item
import interop.gtk_tool_palette_get_exclusive
import interop.gtk_tool_palette_get_expand
import interop.gtk_tool_palette_get_group_position
import interop.gtk_tool_palette_get_icon_size
import interop.gtk_tool_palette_get_style
import interop.gtk_tool_palette_new
import interop.gtk_tool_palette_set_drag_source
import interop.gtk_tool_palette_set_exclusive
import interop.gtk_tool_palette_set_expand
import interop.gtk_tool_palette_set_group_position
import interop.gtk_tool_palette_set_icon_size
import interop.gtk_tool_palette_set_style
import interop.gtk_tool_palette_unset_icon_size
import interop.gtk_tool_palette_unset_style
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gdk.DragAction
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.mrlem.gnome.toBoolean
import org.mrlem.gnome.toInt

public typealias ToolPalette = CPointer<GtkToolPalette>

public val ToolPalette.asObject: Object
  get() = reinterpret()

public val ToolPalette.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val ToolPalette.asWidget: Widget
  get() = reinterpret()

public val ToolPalette.asContainer: Container
  get() = reinterpret()

public object ToolPaletteFactory {
  public fun new(): ToolPalette = gtk_tool_palette_new()!!.reinterpret()
}

public val ToolPalette.parentInstance: Container
  get() = pointed.parent_instance.ptr

public var ToolPalette.iconSize: IconSize
  get() = gtk_tool_palette_get_icon_size(this)
  set(`value`) {
    gtk_tool_palette_set_icon_size(this@iconSize, `value`)
  }

public var ToolPalette.style: ToolbarStyle
  get() = gtk_tool_palette_get_style(this)
  set(`value`) {
    gtk_tool_palette_set_style(this@style, `value`)
  }

public fun ToolPalette.addDragDest(
  widget: Widget?,
  flags: DestDefaults,
  targets: ToolPaletteDragTargets,
  actions: DragAction
): Unit {
  gtk_tool_palette_add_drag_dest(this@addDragDest, widget?.reinterpret(), flags, targets, actions)
}

public fun ToolPalette.getDragItem(selection: SelectionData?): Widget? =
    gtk_tool_palette_get_drag_item(this@getDragItem, selection?.reinterpret())?.reinterpret()

public fun ToolPalette.getDropGroup(x: Int, y: Int): ToolItemGroup? =
    gtk_tool_palette_get_drop_group(this@getDropGroup, x, y)?.reinterpret()

public fun ToolPalette.getDropItem(x: Int, y: Int): ToolItem? =
    gtk_tool_palette_get_drop_item(this@getDropItem, x, y)?.reinterpret()

public fun ToolPalette.getExclusive(group: ToolItemGroup?): Boolean =
    gtk_tool_palette_get_exclusive(this@getExclusive, group?.reinterpret()).toBoolean()

public fun ToolPalette.getExpand(group: ToolItemGroup?): Boolean =
    gtk_tool_palette_get_expand(this@getExpand, group?.reinterpret()).toBoolean()

public fun ToolPalette.getGroupPosition(group: ToolItemGroup?): Int =
    gtk_tool_palette_get_group_position(this@getGroupPosition, group?.reinterpret())

public fun ToolPalette.setDragSource(targets: ToolPaletteDragTargets): Unit {
  gtk_tool_palette_set_drag_source(this@setDragSource, targets)
}

public fun ToolPalette.setExclusive(group: ToolItemGroup?, exclusive: Boolean): Unit {
  gtk_tool_palette_set_exclusive(this@setExclusive, group?.reinterpret(), exclusive.toInt())
}

public fun ToolPalette.setExpand(group: ToolItemGroup?, expand: Boolean): Unit {
  gtk_tool_palette_set_expand(this@setExpand, group?.reinterpret(), expand.toInt())
}

public fun ToolPalette.setGroupPosition(group: ToolItemGroup?, position: Int): Unit {
  gtk_tool_palette_set_group_position(this@setGroupPosition, group?.reinterpret(), position)
}

public fun ToolPalette.unsetIconSize(): Unit {
  gtk_tool_palette_unset_icon_size(this@unsetIconSize)
}

public fun ToolPalette.unsetStyle(): Unit {
  gtk_tool_palette_unset_style(this@unsetStyle)
}
