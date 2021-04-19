// TODO - get_direction
// TODO - get_menu_model
// TODO - get_direction
// TODO - get_menu_model
// TODO - set_direction
// TODO - set_menu_model
//
package org.gnome.gtk

import gtk3.GtkMenuButton
import gtk3.gtk_menu_button_get_align_widget
import gtk3.gtk_menu_button_get_popover
import gtk3.gtk_menu_button_get_popup
import gtk3.gtk_menu_button_get_use_popover
import gtk3.gtk_menu_button_set_align_widget
import gtk3.gtk_menu_button_set_popover
import gtk3.gtk_menu_button_set_popup
import gtk3.gtk_menu_button_set_use_popover
import kotlin.Boolean
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt

public typealias MenuButton = CPointer<GtkMenuButton>

public val MenuButton.asObject: Object
  get() = reinterpret()

public val MenuButton.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val MenuButton.asWidget: Widget
  get() = reinterpret()

public val MenuButton.asContainer: Container
  get() = reinterpret()

public val MenuButton.asBin: Bin
  get() = reinterpret()

public val MenuButton.asButton: Button
  get() = reinterpret()

public val MenuButton.asToggleButton: ToggleButton
  get() = reinterpret()

public var MenuButton.alignWidget: Widget?
  get() = gtk_menu_button_get_align_widget(this)?.reinterpret()
  set(`value`) {
    gtk_menu_button_set_align_widget(this, value)
  }

public val MenuButton.popover: Popover?
  get() = gtk_menu_button_get_popover(this)?.reinterpret()

public val MenuButton.popup: Menu?
  get() = gtk_menu_button_get_popup(this)?.reinterpret()

public var MenuButton.usePopover: Boolean
  get() = gtk_menu_button_get_use_popover(this).toBoolean
  set(`value`) {
    gtk_menu_button_set_use_popover(this, value.toInt)
  }

public fun MenuButton.setPopover(popover: Widget): Unit {
  gtk_menu_button_set_popover(this, popover.reinterpret())
}

public fun MenuButton.setPopup(menu: Widget): Unit {
  gtk_menu_button_set_popup(this, menu.reinterpret())
}
