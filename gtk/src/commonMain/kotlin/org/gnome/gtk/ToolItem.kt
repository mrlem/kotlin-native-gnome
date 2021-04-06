// TODO - implement:
//   get_ellipsize_mode
//   get_icon_size
//   get_orientation
//   get_proxy_menu_item
//   get_relief_style
//   get_text_orientation
//   get_text_size_group
//   get_toolbar_style
//   rebuild_menu
//   retrieve_proxy_menu_item
//   set_proxy_menu_item
//   toolbar_reconfigured
//   set_tooltip_markup
//   set_tooltip_text
package org.gnome.gtk

import gtk3.GtkToolItem
import gtk3.gtk_tool_item_get_expand
import gtk3.gtk_tool_item_get_homogeneous
import gtk3.gtk_tool_item_get_icon_size
import gtk3.gtk_tool_item_get_is_important
import gtk3.gtk_tool_item_get_text_alignment
import gtk3.gtk_tool_item_get_use_drag_window
import gtk3.gtk_tool_item_get_visible_horizontal
import gtk3.gtk_tool_item_get_visible_vertical
import gtk3.gtk_tool_item_set_expand
import gtk3.gtk_tool_item_set_homogeneous
import gtk3.gtk_tool_item_set_is_important
import gtk3.gtk_tool_item_set_use_drag_window
import gtk3.gtk_tool_item_set_visible_horizontal
import gtk3.gtk_tool_item_set_visible_vertical
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned
import org.gnome.glib.toBoolean
import org.gnome.glib.toInt

public typealias ToolItem = CPointer<GtkToolItem>

public val ToolItem.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val ToolItem.asWidget: Widget
  get() = reinterpret()

public val ToolItem.asContainer: Container
  get() = reinterpret()

public val ToolItem.asBin: Bin
  get() = reinterpret()

public var ToolItem.expand: Boolean
  get() = gtk_tool_item_get_expand(this).toBoolean
  set(`value`) {
    gtk_tool_item_set_expand(this, value.toInt)
  }

public var ToolItem.homogeneous: Boolean
  get() = gtk_tool_item_get_homogeneous(this).toBoolean
  set(`value`) {
    gtk_tool_item_set_homogeneous(this, value.toInt)
  }

public var ToolItem.isImportant: Boolean
  get() = gtk_tool_item_get_is_important(this).toBoolean
  set(`value`) {
    gtk_tool_item_set_is_important(this, value.toInt)
  }

public var ToolItem.useDragWindow: Boolean
  get() = gtk_tool_item_get_use_drag_window(this).toBoolean
  set(`value`) {
    gtk_tool_item_set_use_drag_window(this, value.toInt)
  }

public var ToolItem.visibleHorizontal: Boolean
  get() = gtk_tool_item_get_visible_horizontal(this).toBoolean
  set(`value`) {
    gtk_tool_item_set_visible_horizontal(this, value.toInt)
  }

public var ToolItem.visibleVertical: Boolean
  get() = gtk_tool_item_get_visible_vertical(this).toBoolean
  set(`value`) {
    gtk_tool_item_set_visible_vertical(this, value.toInt)
  }

public val ToolItem.textAlignment: Float
  get() = gtk_tool_item_get_text_alignment(this)
