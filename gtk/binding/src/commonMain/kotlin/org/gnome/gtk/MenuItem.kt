// TODO - toggle_size_request
//
package org.gnome.gtk

import gtk3.GtkMenuItem
import gtk3.gtk_menu_item_activate
import gtk3.gtk_menu_item_deselect
import gtk3.gtk_menu_item_get_accel_path
import gtk3.gtk_menu_item_get_label
import gtk3.gtk_menu_item_get_reserve_indicator
import gtk3.gtk_menu_item_get_submenu
import gtk3.gtk_menu_item_get_use_underline
import gtk3.gtk_menu_item_select
import gtk3.gtk_menu_item_set_accel_path
import gtk3.gtk_menu_item_set_label
import gtk3.gtk_menu_item_set_reserve_indicator
import gtk3.gtk_menu_item_set_submenu
import gtk3.gtk_menu_item_set_use_underline
import gtk3.gtk_menu_item_toggle_size_allocate
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt
import org.gnome.toKString

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

public fun MenuItem.activate(): Unit {
  gtk_menu_item_activate(this)
}

public fun MenuItem.deselect(): Unit {
  gtk_menu_item_deselect(this)
}

public fun MenuItem.getAccelPath(): String = gtk_menu_item_get_accel_path(this).toKString

public fun MenuItem.getLabel(): String = gtk_menu_item_get_label(this).toKString

public fun MenuItem.getReserveIndicator(): Boolean =
    gtk_menu_item_get_reserve_indicator(this).toBoolean

public fun MenuItem.getSubmenu(): Widget? = gtk_menu_item_get_submenu(this)?.reinterpret()

public fun MenuItem.getUseUnderline(): Boolean = gtk_menu_item_get_use_underline(this).toBoolean

public fun MenuItem.select(): Unit {
  gtk_menu_item_select(this)
}

public fun MenuItem.setAccelPath(accelPath: String?): Unit {
  gtk_menu_item_set_accel_path(this, accelPath)
}

public fun MenuItem.setLabel(label: String?): Unit {
  gtk_menu_item_set_label(this, label)
}

public fun MenuItem.setReserveIndicator(reserve: Boolean): Unit {
  gtk_menu_item_set_reserve_indicator(this, reserve.toInt)
}

public fun MenuItem.setSubmenu(submenu: Menu): Unit {
  gtk_menu_item_set_submenu(this, submenu.reinterpret())
}

public fun MenuItem.setUseUnderline(setting: Boolean): Unit {
  gtk_menu_item_set_use_underline(this, setting.toInt)
}

public fun MenuItem.toggleSizeAllocate(allocation: Int): Unit {
  gtk_menu_item_toggle_size_allocate(this, allocation)
}
