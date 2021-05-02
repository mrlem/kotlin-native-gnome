// TODO - method: get_right_justified
// TODO - method: set_right_justified
// TODO - method: toggle_size_request
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkMenuItem
import interop.gtk_menu_item_activate
import interop.gtk_menu_item_deselect
import interop.gtk_menu_item_get_accel_path
import interop.gtk_menu_item_get_label
import interop.gtk_menu_item_get_reserve_indicator
import interop.gtk_menu_item_get_submenu
import interop.gtk_menu_item_get_use_underline
import interop.gtk_menu_item_new
import interop.gtk_menu_item_new_with_label
import interop.gtk_menu_item_new_with_mnemonic
import interop.gtk_menu_item_select
import interop.gtk_menu_item_set_accel_path
import interop.gtk_menu_item_set_label
import interop.gtk_menu_item_set_reserve_indicator
import interop.gtk_menu_item_set_submenu
import interop.gtk_menu_item_set_use_underline
import interop.gtk_menu_item_toggle_size_allocate
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt
import org.gnome.toKString
import org.mrlem.gnome.gobject.connect

public typealias MenuItem = CPointer<GtkMenuItem>

public val MenuItem.asObject: Object
  get() = reinterpret()

public val MenuItem.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val MenuItem.asWidget: Widget
  get() = reinterpret()

public val MenuItem.asContainer: Container
  get() = reinterpret()

public val MenuItem.asBin: Bin
  get() = reinterpret()

public object MenuItemFactory {
  public fun new(): MenuItem = gtk_menu_item_new()!!.reinterpret()

  public fun newWithLabel(label: String): MenuItem =
      gtk_menu_item_new_with_label(label)!!.reinterpret()

  public fun newWithMnemonic(label: String): MenuItem =
      gtk_menu_item_new_with_mnemonic(label)!!.reinterpret()
}

public val MenuItem.bin: Bin
  get() = pointed.bin.ptr

public var MenuItem.accelPath: String
  get() = gtk_menu_item_get_accel_path(this).toKString()
  set(`value`) {
    gtk_menu_item_set_accel_path(this, `value`)
  }

public var MenuItem.label: String
  get() = gtk_menu_item_get_label(this).toKString()
  set(`value`) {
    gtk_menu_item_set_label(this, `value`)
  }

public var MenuItem.reserveIndicator: Boolean
  get() = gtk_menu_item_get_reserve_indicator(this).toBoolean()
  set(`value`) {
    gtk_menu_item_set_reserve_indicator(this, `value`.toInt())
  }

public val MenuItem.submenu: Widget?
  get() = gtk_menu_item_get_submenu(this)?.reinterpret()

public var MenuItem.useUnderline: Boolean
  get() = gtk_menu_item_get_use_underline(this).toBoolean()
  set(`value`) {
    gtk_menu_item_set_use_underline(this, `value`.toInt())
  }

public fun MenuItem.activate(): Unit {
  gtk_menu_item_activate(this)
}

public fun MenuItem.deselect(): Unit {
  gtk_menu_item_deselect(this)
}

public fun MenuItem.select(): Unit {
  gtk_menu_item_select(this)
}

public fun MenuItem.setSubmenu(submenu: Menu?): Unit {
  gtk_menu_item_set_submenu(this, submenu?.reinterpret())
}

public fun MenuItem.toggleSizeAllocate(allocation: Int): Unit {
  gtk_menu_item_toggle_size_allocate(this, allocation)
}

public fun MenuItem.onActivate(callback: (MenuItem) -> Unit): MenuItem {
  // TODO - handle callback data

  asObject.connect("activate") { callback(this) }
  return this
}

public fun MenuItem.onActivateItem(callback: (MenuItem) -> Unit): MenuItem {
  // TODO - handle callback data

  asObject.connect("activate-item") { callback(this) }
  return this
}

public fun MenuItem.onDeselect(callback: (MenuItem) -> Unit): MenuItem {
  // TODO - handle callback data

  asObject.connect("deselect") { callback(this) }
  return this
}

public fun MenuItem.onSelect(callback: (MenuItem) -> Unit): MenuItem {
  // TODO - handle callback data

  asObject.connect("select") { callback(this) }
  return this
}

public fun MenuItem.onToggleSizeAllocate(callback: (MenuItem) -> Unit): MenuItem {
  // TODO - handle callback data

  asObject.connect("toggle-size-allocate") { callback(this) }
  return this
}

public fun MenuItem.onToggleSizeRequest(callback: (MenuItem) -> Unit): MenuItem {
  // TODO - handle callback data

  asObject.connect("toggle-size-request") { callback(this) }
  return this
}
