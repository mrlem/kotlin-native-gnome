// TODO - implement:
//   get_align_widget
//   get_direction
//   get_menu_model
//   get_popover
//   get_popup
//   get_use_popover
//   set_align_widget
//   set_direction
//   set_menu_model
//   set_popover
//   set_popup
//   set_use_popover
package org.gnome.gtk

import gtk3.GtkMenuButton
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

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
