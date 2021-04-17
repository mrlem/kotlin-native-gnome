// TODO - implement:
//   set_align_widget
//   set_direction
//   set_menu_model
//   set_popover
//   set_popup
package org.gnome.gtk

import gtk3.GtkMenuButton
import gtk3.gtk_menu_button_get_align_widget
import gtk3.gtk_menu_button_get_direction
import gtk3.gtk_menu_button_get_menu_model
import gtk3.gtk_menu_button_get_popover
import gtk3.gtk_menu_button_get_popup
import gtk3.gtk_menu_button_get_use_popover
import gtk3.gtk_menu_button_set_use_popover
import kotlin.Boolean
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned
import org.gnome.glib.gobject.Object
import org.gnome.glib.toBoolean
import org.gnome.glib.toInt

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

public fun MenuButton.getAlignWidget(): Unit {
  gtk_menu_button_get_align_widget(this)
}

public fun MenuButton.getDirection(): Unit {
  gtk_menu_button_get_direction(this)
}

public fun MenuButton.getMenuModel(): Unit {
  gtk_menu_button_get_menu_model(this)
}

public fun MenuButton.getPopover(): Unit {
  gtk_menu_button_get_popover(this)
}

public fun MenuButton.getPopup(): Unit {
  gtk_menu_button_get_popup(this)
}

public var MenuButton.usePopover: Boolean
  get() = gtk_menu_button_get_use_popover(this).toBoolean
  set(`value`) {
    gtk_menu_button_set_use_popover(this, value.toInt)
  }
