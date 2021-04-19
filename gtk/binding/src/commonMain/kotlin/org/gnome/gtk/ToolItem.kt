// TODO - get_ellipsize_mode
// TODO - get_icon_size
// TODO - get_orientation
// TODO - get_relief_style
// TODO - get_text_orientation
// TODO - get_toolbar_style
//
package org.gnome.gtk

import gtk3.GtkToolItem
import gtk3.gtk_tool_item_get_expand
import gtk3.gtk_tool_item_get_homogeneous
import gtk3.gtk_tool_item_get_is_important
import gtk3.gtk_tool_item_get_proxy_menu_item
import gtk3.gtk_tool_item_get_text_alignment
import gtk3.gtk_tool_item_get_text_size_group
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

public fun ToolItem.getExpand(): Boolean = gtk_tool_item_get_expand(this).toBoolean

public fun ToolItem.getHomogeneous(): Boolean = gtk_tool_item_get_homogeneous(this).toBoolean

public fun ToolItem.getIsImportant(): Boolean = gtk_tool_item_get_is_important(this).toBoolean

public fun ToolItem.getProxyMenuItem(menuItemId: String?): Widget? =
    gtk_tool_item_get_proxy_menu_item(this, menuItemId)?.reinterpret()

public fun ToolItem.getTextAlignment(): Float = gtk_tool_item_get_text_alignment(this)

public fun ToolItem.getTextSizeGroup(): SizeGroup? =
    gtk_tool_item_get_text_size_group(this)?.reinterpret()

public fun ToolItem.getUseDragWindow(): Boolean = gtk_tool_item_get_use_drag_window(this).toBoolean

public fun ToolItem.getVisibleHorizontal(): Boolean =
    gtk_tool_item_get_visible_horizontal(this).toBoolean

public fun ToolItem.getVisibleVertical(): Boolean =
    gtk_tool_item_get_visible_vertical(this).toBoolean

public fun ToolItem.rebuildMenu(): Unit {
  gtk_tool_item_rebuild_menu(this)
}

public fun ToolItem.retrieveProxyMenuItem(): Widget? =
    gtk_tool_item_retrieve_proxy_menu_item(this)?.reinterpret()

public fun ToolItem.setExpand(expand: Boolean): Unit {
  gtk_tool_item_set_expand(this, expand.toInt)
}

public fun ToolItem.setHomogeneous(homogeneous: Boolean): Unit {
  gtk_tool_item_set_homogeneous(this, homogeneous.toInt)
}

public fun ToolItem.setIsImportant(isImportant: Boolean): Unit {
  gtk_tool_item_set_is_important(this, isImportant.toInt)
}

public fun ToolItem.setProxyMenuItem(menuItemId: String?, menuItem: Widget): Unit {
  gtk_tool_item_set_proxy_menu_item(this, menuItemId, menuItem.reinterpret())
}

public fun ToolItem.setTooltipMarkup(markup: String?): Unit {
  gtk_tool_item_set_tooltip_markup(this, markup)
}

public fun ToolItem.setTooltipText(text: String?): Unit {
  gtk_tool_item_set_tooltip_text(this, text)
}

public fun ToolItem.setUseDragWindow(useDragWindow: Boolean): Unit {
  gtk_tool_item_set_use_drag_window(this, useDragWindow.toInt)
}

public fun ToolItem.setVisibleHorizontal(visibleHorizontal: Boolean): Unit {
  gtk_tool_item_set_visible_horizontal(this, visibleHorizontal.toInt)
}

public fun ToolItem.setVisibleVertical(visibleVertical: Boolean): Unit {
  gtk_tool_item_set_visible_vertical(this, visibleVertical.toInt)
}

public fun ToolItem.toolbarReconfigured(): Unit {
  gtk_tool_item_toolbar_reconfigured(this)
}
