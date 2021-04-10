// TODO - implement:
//   get_drop_item
//   get_item_position
//   get_nth_item
//   insert
//   set_ellipsize
//   set_header_relief
//   set_item_position
//   set_label_widget
package org.gnome.gtk

import gtk3.GtkToolItemGroup
import gtk3.gtk_tool_item_group_get_collapsed
import gtk3.gtk_tool_item_group_get_ellipsize
import gtk3.gtk_tool_item_group_get_header_relief
import gtk3.gtk_tool_item_group_get_label
import gtk3.gtk_tool_item_group_get_label_widget
import gtk3.gtk_tool_item_group_get_n_items
import gtk3.gtk_tool_item_group_set_collapsed
import gtk3.gtk_tool_item_group_set_label
import kotlin.Boolean
import kotlin.String
import kotlin.UInt
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned
import org.gnome.glib.toBoolean
import org.gnome.glib.toInt
import org.gnome.glib.toKString

public typealias ToolItemGroup = CPointer<GtkToolItemGroup>

public val ToolItemGroup.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val ToolItemGroup.asWidget: Widget
  get() = reinterpret()

public val ToolItemGroup.asContainer: Container
  get() = reinterpret()

public fun ToolItemGroup.getEllipsize(): Unit {
  gtk_tool_item_group_get_ellipsize(this)
}

public fun ToolItemGroup.getHeaderRelief(): Unit {
  gtk_tool_item_group_get_header_relief(this)
}

public fun ToolItemGroup.getLabelWidget(): Unit {
  gtk_tool_item_group_get_label_widget(this)
}

public var ToolItemGroup.collapsed: Boolean
  get() = gtk_tool_item_group_get_collapsed(this).toBoolean
  set(`value`) {
    gtk_tool_item_group_set_collapsed(this, value.toInt)
  }

public var ToolItemGroup.label: String?
  get() = gtk_tool_item_group_get_label(this).toKString
  set(`value`) {
    gtk_tool_item_group_set_label(this, value)
  }

public val ToolItemGroup.nItems: UInt
  get() = gtk_tool_item_group_get_n_items(this)
