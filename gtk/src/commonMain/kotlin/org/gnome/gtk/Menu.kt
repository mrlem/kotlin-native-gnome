// TODO - implement:
//   attach
//   attach_to_widget
//   detach
//   get_accel_group
//   get_accel_path
//   get_active
//   get_attach_widget
//   get_monitor
//   get_reserve_toggle_size
//   get_tearoff_state
//   get_title
//   place_on_monitor
//   popdown
//   popup
//   popup_at_pointer
//   popup_at_rect
//   popup_at_widget
//   popup_for_device
//   reorder_child
//   reposition
//   set_accel_group
//   set_accel_path
//   set_active
//   set_monitor
//   set_reserve_toggle_size
//   set_screen
//   set_tearoff_state
//   set_title
package org.gnome.gtk

import gtk3.GtkMenu
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias Menu = CPointer<GtkMenu>

public val Menu.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Menu.asWidget: Widget
  get() = reinterpret()

public val Menu.asContainer: Container
  get() = reinterpret()

public val Menu.asMenuShell: MenuShell
  get() = reinterpret()
