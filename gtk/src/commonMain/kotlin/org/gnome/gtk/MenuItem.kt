// TODO - implement:
//   set_submenu
//   toggle_size_allocate
//   toggle_size_request
package org.gnome.gtk

import gtk3.GtkMenuItem
import gtk3.gtk_menu_item_activate
import gtk3.gtk_menu_item_deselect
import gtk3.gtk_menu_item_get_accel_path
import gtk3.gtk_menu_item_get_label
import gtk3.gtk_menu_item_get_reserve_indicator
import gtk3.gtk_menu_item_get_right_justified
import gtk3.gtk_menu_item_get_submenu
import gtk3.gtk_menu_item_get_use_underline
import gtk3.gtk_menu_item_select
import gtk3.gtk_menu_item_set_accel_path
import gtk3.gtk_menu_item_set_label
import gtk3.gtk_menu_item_set_reserve_indicator
import gtk3.gtk_menu_item_set_right_justified
import gtk3.gtk_menu_item_set_use_underline
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned
import org.gnome.glib.gobject.Object
import org.gnome.glib.toBoolean
import org.gnome.glib.toInt
import org.gnome.glib.toKString

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

public fun MenuItem.getSubmenu(): Unit {
  gtk_menu_item_get_submenu(this)
}

public fun MenuItem.select(): Unit {
  gtk_menu_item_select(this)
}

public var MenuItem.accelPath: String?
  get() = gtk_menu_item_get_accel_path(this).toKString
  set(`value`) {
    gtk_menu_item_set_accel_path(this, value)
  }

public var MenuItem.label: String?
  get() = gtk_menu_item_get_label(this).toKString
  set(`value`) {
    gtk_menu_item_set_label(this, value)
  }

public var MenuItem.reserveIndicator: Boolean
  get() = gtk_menu_item_get_reserve_indicator(this).toBoolean
  set(`value`) {
    gtk_menu_item_set_reserve_indicator(this, value.toInt)
  }

public var MenuItem.rightJustified: Boolean
  get() = gtk_menu_item_get_right_justified(this).toBoolean
  set(`value`) {
    gtk_menu_item_set_right_justified(this, value.toInt)
  }

public var MenuItem.useUnderline: Boolean
  get() = gtk_menu_item_get_use_underline(this).toBoolean
  set(`value`) {
    gtk_menu_item_set_use_underline(this, value.toInt)
  }
