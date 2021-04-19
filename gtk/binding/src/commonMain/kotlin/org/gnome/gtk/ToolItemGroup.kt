// TODO - get_ellipsize
// TODO - get_header_relief
// TODO - get_ellipsize
// TODO - get_header_relief
// TODO - set_ellipsize
// TODO - set_header_relief
//
package org.gnome.gtk

import gtk3.GtkToolItemGroup
import gtk3.gtk_tool_item_group_get_collapsed
import gtk3.gtk_tool_item_group_get_drop_item
import gtk3.gtk_tool_item_group_get_item_position
import gtk3.gtk_tool_item_group_get_label
import gtk3.gtk_tool_item_group_get_label_widget
import gtk3.gtk_tool_item_group_get_n_items
import gtk3.gtk_tool_item_group_get_nth_item
import gtk3.gtk_tool_item_group_insert
import gtk3.gtk_tool_item_group_set_collapsed
import gtk3.gtk_tool_item_group_set_item_position
import gtk3.gtk_tool_item_group_set_label
import gtk3.gtk_tool_item_group_set_label_widget
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.UInt
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt
import org.gnome.toKString

public typealias ToolItemGroup = CPointer<GtkToolItemGroup>

public val ToolItemGroup.asObject: Object
  get() = reinterpret()

public val ToolItemGroup.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val ToolItemGroup.asWidget: Widget
  get() = reinterpret()

public val ToolItemGroup.asContainer: Container
  get() = reinterpret()

public var ToolItemGroup.collapsed: Boolean
  get() = gtk_tool_item_group_get_collapsed(this).toBoolean
  set(`value`) {
    gtk_tool_item_group_set_collapsed(this, value.toInt)
  }

public var ToolItemGroup.label: String
  get() = gtk_tool_item_group_get_label(this).toKString
  set(`value`) {
    gtk_tool_item_group_set_label(this, value)
  }

public var ToolItemGroup.labelWidget: Widget?
  get() = gtk_tool_item_group_get_label_widget(this)?.reinterpret()
  set(`value`) {
    gtk_tool_item_group_set_label_widget(this, value)
  }

public val ToolItemGroup.nItems: UInt
  get() = gtk_tool_item_group_get_n_items(this)

public fun ToolItemGroup.getDropItem(x: Int, y: Int): ToolItem? =
    gtk_tool_item_group_get_drop_item(this, x, y)?.reinterpret()

public fun ToolItemGroup.getItemPosition(item: ToolItem): Int =
    gtk_tool_item_group_get_item_position(this, item.reinterpret())

public fun ToolItemGroup.getNthItem(index: UInt): ToolItem? = gtk_tool_item_group_get_nth_item(this,
    index)?.reinterpret()

public fun ToolItemGroup.insert(item: ToolItem, position: Int): Unit {
  gtk_tool_item_group_insert(this, item.reinterpret(), position)
}

public fun ToolItemGroup.setItemPosition(item: ToolItem, position: Int): Unit {
  gtk_tool_item_group_set_item_position(this, item.reinterpret(), position)
}
