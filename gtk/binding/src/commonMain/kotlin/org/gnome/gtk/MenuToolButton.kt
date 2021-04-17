// TODO - implement:
//   set_menu
//   set_arrow_tooltip_markup
//   set_arrow_tooltip_text
package org.gnome.gtk

import gtk3.GtkMenuToolButton
import gtk3.gtk_menu_tool_button_get_menu
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned
import org.gnome.glib.gobject.Object

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

public fun MenuToolButton.getMenu(): Unit {
  gtk_menu_tool_button_get_menu(this)
}
