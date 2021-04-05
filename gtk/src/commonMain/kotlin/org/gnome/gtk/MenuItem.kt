// TODO - implement:
//   activate
//   deselect
//   get_accel_path
//   get_label
//   get_reserve_indicator
//   get_right_justified
//   get_submenu
//   get_use_underline
//   select
//   set_accel_path
//   set_label
//   set_reserve_indicator
//   set_right_justified
//   set_submenu
//   set_use_underline
//   toggle_size_allocate
//   toggle_size_request
package org.gnome.gtk

import gtk3.GtkMenuItem
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias MenuItem = CPointer<GtkMenuItem>

public val MenuItem.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val MenuItem.asWidget: Widget
  get() = reinterpret()

public val MenuItem.asContainer: Container
  get() = reinterpret()

public val MenuItem.asBin: Bin
  get() = reinterpret()
