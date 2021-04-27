@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkMenuButton
import interop.gtk_menu_button_get_align_widget
import interop.gtk_menu_button_get_direction
import interop.gtk_menu_button_get_menu_model
import interop.gtk_menu_button_get_popover
import interop.gtk_menu_button_get_popup
import interop.gtk_menu_button_get_use_popover
import interop.gtk_menu_button_new
import interop.gtk_menu_button_set_align_widget
import interop.gtk_menu_button_set_direction
import interop.gtk_menu_button_set_menu_model
import interop.gtk_menu_button_set_popover
import interop.gtk_menu_button_set_popup
import interop.gtk_menu_button_set_use_popover
import kotlin.Boolean
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gio.MenuModel
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

public object MenuButtonFactory {
  public fun new(): MenuButton = gtk_menu_button_new()!!.reinterpret()
}

public var MenuButton.alignWidget: Widget?
  get() = gtk_menu_button_get_align_widget(this)?.reinterpret()
  set(`value`) {
    gtk_menu_button_set_align_widget(this, value)
  }

public var MenuButton.direction: ArrowType
  get() = gtk_menu_button_get_direction(this)
  set(`value`) {
    gtk_menu_button_set_direction(this, value)
  }

public var MenuButton.menuModel: MenuModel?
  get() = gtk_menu_button_get_menu_model(this)?.reinterpret()
  set(`value`) {
    gtk_menu_button_set_menu_model(this, value)
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

public fun MenuButton.setPopover(popover: Widget?): Unit {
  gtk_menu_button_set_popover(this, popover?.reinterpret())
}

public fun MenuButton.setPopup(menu: Widget?): Unit {
  gtk_menu_button_set_popup(this, menu?.reinterpret())
}
