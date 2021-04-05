// TODO - implement:
//   get_child_pack_direction
//   get_pack_direction
//   set_child_pack_direction
//   set_pack_direction
package org.gnome.gtk

import gtk3.GtkMenuBar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias MenuBar = CPointer<GtkMenuBar>

public val MenuBar.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val MenuBar.asWidget: Widget
  get() = reinterpret()

public val MenuBar.asContainer: Container
  get() = reinterpret()

public val MenuBar.asMenuShell: MenuShell
  get() = reinterpret()
