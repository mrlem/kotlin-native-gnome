@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkSeparatorMenuItem
import interop.gtk_separator_menu_item_new
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object

public typealias SeparatorMenuItem = CPointer<GtkSeparatorMenuItem>

public val SeparatorMenuItem.asObject: Object
  get() = reinterpret()

public val SeparatorMenuItem.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val SeparatorMenuItem.asWidget: Widget
  get() = reinterpret()

public val SeparatorMenuItem.asContainer: Container
  get() = reinterpret()

public val SeparatorMenuItem.asBin: Bin
  get() = reinterpret()

public val SeparatorMenuItem.asMenuItem: MenuItem
  get() = reinterpret()

public object SeparatorMenuItemFactory {
  public fun new(): SeparatorMenuItem = gtk_separator_menu_item_new()!!.reinterpret()
}

public val SeparatorMenuItem.menuItem: MenuItem
  get() = pointed.menu_item.ptr
