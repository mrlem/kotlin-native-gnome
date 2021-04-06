// TODO - implement:
//   get_align_widget
//   get_direction
//   get_menu_model
//   get_popover
//   get_popup
//   set_align_widget
//   set_direction
//   set_menu_model
//   set_popover
//   set_popup
package org.gnome.gtk

import gtk3.GtkMenuButton
import gtk3.gtk_menu_button_get_use_popover
import gtk3.gtk_menu_button_set_use_popover
import kotlin.Boolean
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned
import org.gnome.glib.toBoolean
import org.gnome.glib.toInt

public typealias MenuButton = CPointer<GtkMenuButton>

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

public var MenuButton.usePopover: Boolean
  get() = gtk_menu_button_get_use_popover(this).toBoolean
  set(`value`) {
    gtk_menu_button_set_use_popover(this, value.toInt)
  }
