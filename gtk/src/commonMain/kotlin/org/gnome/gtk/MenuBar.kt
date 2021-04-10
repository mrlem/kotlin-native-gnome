// TODO - implement:
//   set_child_pack_direction
//   set_pack_direction
package org.gnome.gtk

import gtk3.GtkMenuBar
import gtk3.gtk_menu_bar_get_child_pack_direction
import gtk3.gtk_menu_bar_get_pack_direction
import kotlin.Unit
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

public fun MenuBar.getChildPackDirection(): Unit {
  gtk_menu_bar_get_child_pack_direction(this)
}

public fun MenuBar.getPackDirection(): Unit {
  gtk_menu_bar_get_pack_direction(this)
}
