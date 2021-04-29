// TODO - constructor: new_from_stock
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkMenuToolButton
import interop.gtk_menu_tool_button_get_menu
import interop.gtk_menu_tool_button_new
import interop.gtk_menu_tool_button_set_arrow_tooltip_markup
import interop.gtk_menu_tool_button_set_arrow_tooltip_text
import interop.gtk_menu_tool_button_set_menu
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.mrlem.gnome.gobject.connect

public typealias MenuToolButton = CPointer<GtkMenuToolButton>

public val MenuToolButton.asObject: Object
  get() = reinterpret()

public val MenuToolButton.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val MenuToolButton.asWidget: Widget
  get() = reinterpret()

public val MenuToolButton.asContainer: Container
  get() = reinterpret()

public val MenuToolButton.asBin: Bin
  get() = reinterpret()

public val MenuToolButton.asToolItem: ToolItem
  get() = reinterpret()

public val MenuToolButton.asToolButton: ToolButton
  get() = reinterpret()

public object MenuToolButtonFactory {
  public fun new(iconWidget: Widget?, label: String): MenuToolButton =
      gtk_menu_tool_button_new(iconWidget?.reinterpret(), label)!!.reinterpret()
}

public var MenuToolButton.menu: Widget?
  get() = gtk_menu_tool_button_get_menu(this)?.reinterpret()
  set(`value`) {
    gtk_menu_tool_button_set_menu(this, value)
  }

public fun MenuToolButton.setArrowTooltipMarkup(markup: String): Unit {
  gtk_menu_tool_button_set_arrow_tooltip_markup(this, markup)
}

public fun MenuToolButton.setArrowTooltipText(text: String): Unit {
  gtk_menu_tool_button_set_arrow_tooltip_text(this, text)
}

public fun MenuToolButton.onShowMenu(callback: (MenuToolButton) -> Unit): MenuToolButton {
  // TODO - handle callback data

  asObject.connect("show-menu") { callback(this) }
  return this
}
