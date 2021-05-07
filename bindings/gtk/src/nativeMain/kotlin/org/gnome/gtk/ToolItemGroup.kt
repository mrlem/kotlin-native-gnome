@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkToolItemGroup
import interop.gtk_tool_item_group_get_collapsed
import interop.gtk_tool_item_group_get_drop_item
import interop.gtk_tool_item_group_get_ellipsize
import interop.gtk_tool_item_group_get_header_relief
import interop.gtk_tool_item_group_get_item_position
import interop.gtk_tool_item_group_get_label
import interop.gtk_tool_item_group_get_label_widget
import interop.gtk_tool_item_group_get_n_items
import interop.gtk_tool_item_group_get_nth_item
import interop.gtk_tool_item_group_insert
import interop.gtk_tool_item_group_new
import interop.gtk_tool_item_group_set_collapsed
import interop.gtk_tool_item_group_set_ellipsize
import interop.gtk_tool_item_group_set_header_relief
import interop.gtk_tool_item_group_set_item_position
import interop.gtk_tool_item_group_set_label
import interop.gtk_tool_item_group_set_label_widget
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.UInt
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.pango.EllipsizeMode
import org.mrlem.gnome.toBoolean
import org.mrlem.gnome.toInt
import org.mrlem.gnome.toKString

public typealias ToolItemGroup = CPointer<GtkToolItemGroup>

public val ToolItemGroup.asObject: Object
  get() = reinterpret()

public val ToolItemGroup.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val ToolItemGroup.asWidget: Widget
  get() = reinterpret()

public val ToolItemGroup.asContainer: Container
  get() = reinterpret()

public object ToolItemGroupFactory {
  public fun new(label: String?): ToolItemGroup = gtk_tool_item_group_new(label)!!.reinterpret()
}

public val ToolItemGroup.parentInstance: Container
  get() = pointed.parent_instance.ptr

public var ToolItemGroup.collapsed: Boolean
  get() = gtk_tool_item_group_get_collapsed(this).toBoolean()
  set(`value`) {
    gtk_tool_item_group_set_collapsed(this@collapsed, `value`.toInt())
  }

public var ToolItemGroup.ellipsize: EllipsizeMode
  get() = gtk_tool_item_group_get_ellipsize(this)
  set(`value`) {
    gtk_tool_item_group_set_ellipsize(this@ellipsize, `value`)
  }

public var ToolItemGroup.headerRelief: ReliefStyle
  get() = gtk_tool_item_group_get_header_relief(this)
  set(`value`) {
    gtk_tool_item_group_set_header_relief(this@headerRelief, `value`)
  }

public var ToolItemGroup.label: String?
  get() = gtk_tool_item_group_get_label(this).toKString()
  set(`value`) {
    gtk_tool_item_group_set_label(this@label, `value`)
  }

public var ToolItemGroup.labelWidget: Widget?
  get() = gtk_tool_item_group_get_label_widget(this)?.reinterpret()
  set(`value`) {
    gtk_tool_item_group_set_label_widget(this@labelWidget, `value`)
  }

public val ToolItemGroup.nItems: UInt
  get() = gtk_tool_item_group_get_n_items(this)

public fun ToolItemGroup.getDropItem(x: Int, y: Int): ToolItem? =
    gtk_tool_item_group_get_drop_item(this@getDropItem, x, y)?.reinterpret()

public fun ToolItemGroup.getItemPosition(item: ToolItem?): Int =
    gtk_tool_item_group_get_item_position(this@getItemPosition, item?.reinterpret())

public fun ToolItemGroup.getNthItem(index: UInt): ToolItem? =
    gtk_tool_item_group_get_nth_item(this@getNthItem, index)?.reinterpret()

public fun ToolItemGroup.insert(item: ToolItem?, position: Int): Unit {
  gtk_tool_item_group_insert(this@insert, item?.reinterpret(), position)
}

public fun ToolItemGroup.setItemPosition(item: ToolItem?, position: Int): Unit {
  gtk_tool_item_group_set_item_position(this@setItemPosition, item?.reinterpret(), position)
}
