// TODO - get_ellipsize_mode
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import gtk3.GtkToolItem
import gtk3.gtk_tool_item_get_expand
import gtk3.gtk_tool_item_get_homogeneous
import gtk3.gtk_tool_item_get_icon_size
import gtk3.gtk_tool_item_get_is_important
import gtk3.gtk_tool_item_get_orientation
import gtk3.gtk_tool_item_get_proxy_menu_item
import gtk3.gtk_tool_item_get_relief_style
import gtk3.gtk_tool_item_get_text_alignment
import gtk3.gtk_tool_item_get_text_orientation
import gtk3.gtk_tool_item_get_text_size_group
import gtk3.gtk_tool_item_get_toolbar_style
import gtk3.gtk_tool_item_get_use_drag_window
import gtk3.gtk_tool_item_get_visible_horizontal
import gtk3.gtk_tool_item_get_visible_vertical
import gtk3.gtk_tool_item_rebuild_menu
import gtk3.gtk_tool_item_retrieve_proxy_menu_item
import gtk3.gtk_tool_item_set_expand
import gtk3.gtk_tool_item_set_homogeneous
import gtk3.gtk_tool_item_set_is_important
import gtk3.gtk_tool_item_set_proxy_menu_item
import gtk3.gtk_tool_item_set_tooltip_markup
import gtk3.gtk_tool_item_set_tooltip_text
import gtk3.gtk_tool_item_set_use_drag_window
import gtk3.gtk_tool_item_set_visible_horizontal
import gtk3.gtk_tool_item_set_visible_vertical
import gtk3.gtk_tool_item_toolbar_reconfigured
import kotlin.Boolean
import kotlin.Float
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt

public typealias ToolItem = CPointer<GtkToolItem>

public val ToolItem.asObject: Object
  get() = reinterpret()

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

public val ToolItem.iconSize: IconSize
  get() = gtk_tool_item_get_icon_size(this)

public var ToolItem.isImportant: Boolean
  get() = gtk_tool_item_get_is_important(this).toBoolean
  set(`value`) {
    gtk_tool_item_set_is_important(this, value.toInt)
  }

public val ToolItem.orientation: Orientation
  get() = gtk_tool_item_get_orientation(this)

public val ToolItem.reliefStyle: ReliefStyle
  get() = gtk_tool_item_get_relief_style(this)

public val ToolItem.textAlignment: Float
  get() = gtk_tool_item_get_text_alignment(this)

public val ToolItem.textOrientation: Orientation
  get() = gtk_tool_item_get_text_orientation(this)

public val ToolItem.textSizeGroup: SizeGroup?
  get() = gtk_tool_item_get_text_size_group(this)?.reinterpret()

public val ToolItem.toolbarStyle: ToolbarStyle
  get() = gtk_tool_item_get_toolbar_style(this)

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

public fun ToolItem.getProxyMenuItem(menuItemId: String): Widget? =
    gtk_tool_item_get_proxy_menu_item(this, menuItemId)?.reinterpret()

public fun ToolItem.rebuildMenu(): Unit {
  gtk_tool_item_rebuild_menu(this)
}

public fun ToolItem.retrieveProxyMenuItem(): Widget? =
    gtk_tool_item_retrieve_proxy_menu_item(this)?.reinterpret()

public fun ToolItem.setProxyMenuItem(menuItemId: String, menuItem: Widget?): Unit {
  gtk_tool_item_set_proxy_menu_item(this, menuItemId, menuItem?.reinterpret())
}

public fun ToolItem.setTooltipMarkup(markup: String): Unit {
  gtk_tool_item_set_tooltip_markup(this, markup)
}

public fun ToolItem.setTooltipText(text: String): Unit {
  gtk_tool_item_set_tooltip_text(this, text)
}

public fun ToolItem.toolbarReconfigured(): Unit {
  gtk_tool_item_toolbar_reconfigured(this)
}
