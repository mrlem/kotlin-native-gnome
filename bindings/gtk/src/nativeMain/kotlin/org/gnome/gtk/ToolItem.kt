// TODO - method: get_ellipsize_mode
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkToolItem
import interop.gtk_tool_item_get_expand
import interop.gtk_tool_item_get_homogeneous
import interop.gtk_tool_item_get_icon_size
import interop.gtk_tool_item_get_is_important
import interop.gtk_tool_item_get_orientation
import interop.gtk_tool_item_get_proxy_menu_item
import interop.gtk_tool_item_get_relief_style
import interop.gtk_tool_item_get_text_alignment
import interop.gtk_tool_item_get_text_orientation
import interop.gtk_tool_item_get_text_size_group
import interop.gtk_tool_item_get_toolbar_style
import interop.gtk_tool_item_get_use_drag_window
import interop.gtk_tool_item_get_visible_horizontal
import interop.gtk_tool_item_get_visible_vertical
import interop.gtk_tool_item_new
import interop.gtk_tool_item_rebuild_menu
import interop.gtk_tool_item_retrieve_proxy_menu_item
import interop.gtk_tool_item_set_expand
import interop.gtk_tool_item_set_homogeneous
import interop.gtk_tool_item_set_is_important
import interop.gtk_tool_item_set_proxy_menu_item
import interop.gtk_tool_item_set_tooltip_markup
import interop.gtk_tool_item_set_tooltip_text
import interop.gtk_tool_item_set_use_drag_window
import interop.gtk_tool_item_set_visible_horizontal
import interop.gtk_tool_item_set_visible_vertical
import interop.gtk_tool_item_toolbar_reconfigured
import kotlin.Boolean
import kotlin.Float
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt
import org.mrlem.gnome.gobject.connect

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

public object ToolItemFactory {
  public fun new(): ToolItem = gtk_tool_item_new()!!.reinterpret()
}

public val ToolItem.parent: Bin
  get() = pointed.parent.ptr

public var ToolItem.expand: Boolean
  get() = gtk_tool_item_get_expand(this).toBoolean()
  set(`value`) {
    gtk_tool_item_set_expand(this@expand, `value`.toInt())
  }

public var ToolItem.homogeneous: Boolean
  get() = gtk_tool_item_get_homogeneous(this).toBoolean()
  set(`value`) {
    gtk_tool_item_set_homogeneous(this@homogeneous, `value`.toInt())
  }

public val ToolItem.iconSize: IconSize
  get() = gtk_tool_item_get_icon_size(this)

public var ToolItem.isImportant: Boolean
  get() = gtk_tool_item_get_is_important(this).toBoolean()
  set(`value`) {
    gtk_tool_item_set_is_important(this@isImportant, `value`.toInt())
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
  get() = gtk_tool_item_get_use_drag_window(this).toBoolean()
  set(`value`) {
    gtk_tool_item_set_use_drag_window(this@useDragWindow, `value`.toInt())
  }

public var ToolItem.visibleHorizontal: Boolean
  get() = gtk_tool_item_get_visible_horizontal(this).toBoolean()
  set(`value`) {
    gtk_tool_item_set_visible_horizontal(this@visibleHorizontal, `value`.toInt())
  }

public var ToolItem.visibleVertical: Boolean
  get() = gtk_tool_item_get_visible_vertical(this).toBoolean()
  set(`value`) {
    gtk_tool_item_set_visible_vertical(this@visibleVertical, `value`.toInt())
  }

public fun ToolItem.getProxyMenuItem(menuItemId: String?): Widget? =
    gtk_tool_item_get_proxy_menu_item(this@getProxyMenuItem, menuItemId)?.reinterpret()

public fun ToolItem.rebuildMenu(): Unit {
  gtk_tool_item_rebuild_menu(this@rebuildMenu)
}

public fun ToolItem.retrieveProxyMenuItem(): Widget? =
    gtk_tool_item_retrieve_proxy_menu_item(this@retrieveProxyMenuItem)?.reinterpret()

public fun ToolItem.setProxyMenuItem(menuItemId: String?, menuItem: Widget?): Unit {
  gtk_tool_item_set_proxy_menu_item(this@setProxyMenuItem, menuItemId, menuItem?.reinterpret())
}

public fun ToolItem.setTooltipMarkup(markup: String?): Unit {
  gtk_tool_item_set_tooltip_markup(this@setTooltipMarkup, markup)
}

public fun ToolItem.setTooltipText(text: String?): Unit {
  gtk_tool_item_set_tooltip_text(this@setTooltipText, text)
}

public fun ToolItem.toolbarReconfigured(): Unit {
  gtk_tool_item_toolbar_reconfigured(this@toolbarReconfigured)
}

public fun ToolItem.onCreateMenuProxy(callback: (ToolItem) -> Unit): ToolItem {
  // TODO - handle callback data

  asObject.connect("create-menu-proxy") { callback(this) }
  return this
}

public fun ToolItem.onToolbarReconfigured(callback: (ToolItem) -> Unit): ToolItem {
  // TODO - handle callback data

  asObject.connect("toolbar-reconfigured") { callback(this) }
  return this
}
