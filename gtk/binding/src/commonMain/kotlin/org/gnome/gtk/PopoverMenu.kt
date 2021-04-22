@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import gtk3.GtkPopoverMenu
import gtk3.gtk_popover_menu_new
import gtk3.gtk_popover_menu_open_submenu
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object

public typealias PopoverMenu = CPointer<GtkPopoverMenu>

public val PopoverMenu.asObject: Object
  get() = reinterpret()

public val PopoverMenu.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val PopoverMenu.asWidget: Widget
  get() = reinterpret()

public val PopoverMenu.asContainer: Container
  get() = reinterpret()

public val PopoverMenu.asBin: Bin
  get() = reinterpret()

public val PopoverMenu.asPopover: Popover
  get() = reinterpret()

public object PopoverMenuFactory {
  public fun new(): PopoverMenu = gtk_popover_menu_new()!!.reinterpret()
}

public fun PopoverMenu.openSubmenu(name: String): Unit {
  gtk_popover_menu_open_submenu(this, name)
}
