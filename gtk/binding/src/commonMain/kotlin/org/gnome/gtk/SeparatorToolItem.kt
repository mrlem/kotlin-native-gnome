package org.gnome.gtk

import gtk3.GtkSeparatorToolItem
import gtk3.gtk_separator_tool_item_get_draw
import gtk3.gtk_separator_tool_item_set_draw
import kotlin.Boolean
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt

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

public var SeparatorToolItem.draw: Boolean
  get() = gtk_separator_tool_item_get_draw(this).toBoolean
  set(`value`) {
    gtk_separator_tool_item_set_draw(this, value.toInt)
  }
