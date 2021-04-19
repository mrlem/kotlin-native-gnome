package org.gnome.gtk

import gtk3.GtkMenuToolButton
import gtk3.gtk_menu_tool_button_get_menu
import gtk3.gtk_menu_tool_button_set_arrow_tooltip_markup
import gtk3.gtk_menu_tool_button_set_arrow_tooltip_text
import gtk3.gtk_menu_tool_button_set_menu
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object

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

public fun MenuToolButton.getMenu(): Widget? = gtk_menu_tool_button_get_menu(this)?.reinterpret()

public fun MenuToolButton.setArrowTooltipMarkup(markup: String?): Unit {
  gtk_menu_tool_button_set_arrow_tooltip_markup(this, markup)
}

public fun MenuToolButton.setArrowTooltipText(text: String?): Unit {
  gtk_menu_tool_button_set_arrow_tooltip_text(this, text)
}

public fun MenuToolButton.setMenu(menu: Widget): Unit {
  gtk_menu_tool_button_set_menu(this, menu.reinterpret())
}
