@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkSeparatorToolItem
import interop.gtk_separator_tool_item_get_draw
import interop.gtk_separator_tool_item_new
import interop.gtk_separator_tool_item_set_draw
import kotlin.Boolean
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.mrlem.gnome.toBoolean
import org.mrlem.gnome.toInt

public typealias SeparatorToolItem = CPointer<GtkSeparatorToolItem>

public val SeparatorToolItem.asObject: Object
  get() = reinterpret()

public val SeparatorToolItem.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val SeparatorToolItem.asWidget: Widget
  get() = reinterpret()

public val SeparatorToolItem.asContainer: Container
  get() = reinterpret()

public val SeparatorToolItem.asBin: Bin
  get() = reinterpret()

public val SeparatorToolItem.asToolItem: ToolItem
  get() = reinterpret()

public object SeparatorToolItemFactory {
  public fun new(): SeparatorToolItem = gtk_separator_tool_item_new()!!.reinterpret()
}

public val SeparatorToolItem.parent: ToolItem
  get() = pointed.parent.ptr

public var SeparatorToolItem.draw: Boolean
  get() = gtk_separator_tool_item_get_draw(this).toBoolean()
  set(`value`) {
    gtk_separator_tool_item_set_draw(this@draw, `value`.toInt())
  }
