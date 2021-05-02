@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkMenuBar
import interop.gtk_menu_bar_get_child_pack_direction
import interop.gtk_menu_bar_get_pack_direction
import interop.gtk_menu_bar_new
import interop.gtk_menu_bar_new_from_model
import interop.gtk_menu_bar_set_child_pack_direction
import interop.gtk_menu_bar_set_pack_direction
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gio.MenuModel
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

public object MenuBarFactory {
  public fun new(): MenuBar = gtk_menu_bar_new()!!.reinterpret()

  public fun newFromModel(model: MenuModel?): MenuBar =
      gtk_menu_bar_new_from_model(model?.reinterpret())!!.reinterpret()
}

public val MenuBar.menuShell: MenuShell
  get() = pointed.menu_shell.ptr

public var MenuBar.childPackDirection: PackDirection
  get() = gtk_menu_bar_get_child_pack_direction(this)
  set(`value`) {
    gtk_menu_bar_set_child_pack_direction(this, `value`)
  }

public var MenuBar.packDirection: PackDirection
  get() = gtk_menu_bar_get_pack_direction(this)
  set(`value`) {
    gtk_menu_bar_set_pack_direction(this, `value`)
  }
