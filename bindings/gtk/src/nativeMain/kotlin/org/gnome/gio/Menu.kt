// TODO - method: append
// TODO - method: append_item
// TODO - method: append_section
// TODO - method: append_submenu
// TODO - method: insert
// TODO - method: insert_item
// TODO - method: insert_section
// TODO - method: insert_submenu
// TODO - method: prepend
// TODO - method: prepend_item
// TODO - method: prepend_section
// TODO - method: prepend_submenu
// TODO - method: remove
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GMenu
import interop.g_menu_freeze
import interop.g_menu_new
import interop.g_menu_remove_all
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias Menu = CPointer<GMenu>

public val Menu.asObject: Object
  get() = reinterpret()

public val Menu.asMenuModel: MenuModel
  get() = reinterpret()

public object MenuFactory {
  public fun new(): Menu = g_menu_new()!!.reinterpret()
}

public fun Menu.freeze(): Unit {
  g_menu_freeze(this)
}

public fun Menu.removeAll(): Unit {
  g_menu_remove_all(this)
}
