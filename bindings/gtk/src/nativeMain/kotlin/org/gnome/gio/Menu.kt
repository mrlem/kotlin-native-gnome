@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GMenu
import interop.g_menu_append
import interop.g_menu_append_item
import interop.g_menu_append_section
import interop.g_menu_append_submenu
import interop.g_menu_freeze
import interop.g_menu_insert
import interop.g_menu_insert_item
import interop.g_menu_insert_section
import interop.g_menu_insert_submenu
import interop.g_menu_new
import interop.g_menu_prepend
import interop.g_menu_prepend_item
import interop.g_menu_prepend_section
import interop.g_menu_prepend_submenu
import interop.g_menu_remove
import interop.g_menu_remove_all
import kotlin.Int
import kotlin.String
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

public fun Menu.append(label: String?, detailedAction: String?): Unit {
  g_menu_append(this@append, label, detailedAction)
}

public fun Menu.appendItem(item: MenuItem?): Unit {
  g_menu_append_item(this@appendItem, item?.reinterpret())
}

public fun Menu.appendSection(label: String?, section: MenuModel?): Unit {
  g_menu_append_section(this@appendSection, label, section?.reinterpret())
}

public fun Menu.appendSubmenu(label: String?, submenu: MenuModel?): Unit {
  g_menu_append_submenu(this@appendSubmenu, label, submenu?.reinterpret())
}

public fun Menu.freeze(): Unit {
  g_menu_freeze(this@freeze)
}

public fun Menu.insert(
  position: Int,
  label: String?,
  detailedAction: String?
): Unit {
  g_menu_insert(this@insert, position, label, detailedAction)
}

public fun Menu.insertItem(position: Int, item: MenuItem?): Unit {
  g_menu_insert_item(this@insertItem, position, item?.reinterpret())
}

public fun Menu.insertSection(
  position: Int,
  label: String?,
  section: MenuModel?
): Unit {
  g_menu_insert_section(this@insertSection, position, label, section?.reinterpret())
}

public fun Menu.insertSubmenu(
  position: Int,
  label: String?,
  submenu: MenuModel?
): Unit {
  g_menu_insert_submenu(this@insertSubmenu, position, label, submenu?.reinterpret())
}

public fun Menu.prepend(label: String?, detailedAction: String?): Unit {
  g_menu_prepend(this@prepend, label, detailedAction)
}

public fun Menu.prependItem(item: MenuItem?): Unit {
  g_menu_prepend_item(this@prependItem, item?.reinterpret())
}

public fun Menu.prependSection(label: String?, section: MenuModel?): Unit {
  g_menu_prepend_section(this@prependSection, label, section?.reinterpret())
}

public fun Menu.prependSubmenu(label: String?, submenu: MenuModel?): Unit {
  g_menu_prepend_submenu(this@prependSubmenu, label, submenu?.reinterpret())
}

public fun Menu.remove(position: Int): Unit {
  g_menu_remove(this@remove, position)
}

public fun Menu.removeAll(): Unit {
  g_menu_remove_all(this@removeAll)
}
