// TODO - get_child_pack_direction
// TODO - get_pack_direction
// TODO - set_child_pack_direction
// TODO - set_pack_direction
//
package org.gnome.gtk

import gtk3.GtkMenuBar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object

public typealias MenuBar = CPointer<GtkMenuBar>

public val MenuBar.asObject: Object
  get() = reinterpret()

public val MenuBar.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val MenuBar.asWidget: Widget
  get() = reinterpret()

public val MenuBar.asContainer: Container
  get() = reinterpret()

public val MenuBar.asMenuShell: MenuShell
  get() = reinterpret()
