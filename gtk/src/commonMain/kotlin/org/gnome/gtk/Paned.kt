// TODO - implement:
//   add1
//   add2
//   get_child1
//   get_child2
//   get_handle_window
//   get_position
//   get_wide_handle
//   pack1
//   pack2
//   set_position
//   set_wide_handle
package org.gnome.gtk

import gtk3.GtkPaned
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias Paned = CPointer<GtkPaned>

public val Paned.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Paned.asWidget: Widget
  get() = reinterpret()

public val Paned.asContainer: Container
  get() = reinterpret()
