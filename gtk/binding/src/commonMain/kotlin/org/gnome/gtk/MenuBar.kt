package org.gnome.gtk

import gtk3.GtkMenuBar
import gtk3.gtk_menu_bar_get_child_pack_direction
import gtk3.gtk_menu_bar_get_pack_direction
import gtk3.gtk_menu_bar_set_child_pack_direction
import gtk3.gtk_menu_bar_set_pack_direction
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

public var MenuBar.childPackDirection: PackDirection
  get() = gtk_menu_bar_get_child_pack_direction(this)
  set(`value`) {
    gtk_menu_bar_set_child_pack_direction(this, value)
  }

public var MenuBar.packDirection: PackDirection
  get() = gtk_menu_bar_get_pack_direction(this)
  set(`value`) {
    gtk_menu_bar_set_pack_direction(this, value)
  }
