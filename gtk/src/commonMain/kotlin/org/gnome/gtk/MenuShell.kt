// TODO - implement:
//   activate_item
//   append
//   bind_model
//   cancel
//   deactivate
//   deselect
//   get_parent_shell
//   get_selected_item
//   get_take_focus
//   insert
//   prepend
//   select_first
//   select_item
//   set_take_focus
package org.gnome.gtk

import gtk3.GtkMenuShell
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias MenuShell = CPointer<GtkMenuShell>

public val MenuShell.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val MenuShell.asWidget: Widget
  get() = reinterpret()

public val MenuShell.asContainer: Container
  get() = reinterpret()
