@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkCheckMenuItem
import interop.gtk_check_menu_item_get_active
import interop.gtk_check_menu_item_get_draw_as_radio
import interop.gtk_check_menu_item_get_inconsistent
import interop.gtk_check_menu_item_new
import interop.gtk_check_menu_item_new_with_label
import interop.gtk_check_menu_item_new_with_mnemonic
import interop.gtk_check_menu_item_set_active
import interop.gtk_check_menu_item_set_draw_as_radio
import interop.gtk_check_menu_item_set_inconsistent
import interop.gtk_check_menu_item_toggled
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt
import org.mrlem.gnome.gobject.connect

public typealias CheckMenuItem = CPointer<GtkCheckMenuItem>

public val CheckMenuItem.asObject: Object
  get() = reinterpret()

public val CheckMenuItem.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val CheckMenuItem.asWidget: Widget
  get() = reinterpret()

public val CheckMenuItem.asContainer: Container
  get() = reinterpret()

public val CheckMenuItem.asBin: Bin
  get() = reinterpret()

public val CheckMenuItem.asMenuItem: MenuItem
  get() = reinterpret()

public object CheckMenuItemFactory {
  public fun new(): CheckMenuItem = gtk_check_menu_item_new()!!.reinterpret()

  public fun newWithLabel(label: String): CheckMenuItem =
      gtk_check_menu_item_new_with_label(label)!!.reinterpret()

  public fun newWithMnemonic(label: String): CheckMenuItem =
      gtk_check_menu_item_new_with_mnemonic(label)!!.reinterpret()
}

public var CheckMenuItem.active: Boolean
  get() = gtk_check_menu_item_get_active(this).toBoolean
  set(`value`) {
    gtk_check_menu_item_set_active(this, value.toInt)
  }

public var CheckMenuItem.drawAsRadio: Boolean
  get() = gtk_check_menu_item_get_draw_as_radio(this).toBoolean
  set(`value`) {
    gtk_check_menu_item_set_draw_as_radio(this, value.toInt)
  }

public var CheckMenuItem.inconsistent: Boolean
  get() = gtk_check_menu_item_get_inconsistent(this).toBoolean
  set(`value`) {
    gtk_check_menu_item_set_inconsistent(this, value.toInt)
  }

public fun CheckMenuItem.toggled(): Unit {
  gtk_check_menu_item_toggled(this)
}

public fun CheckMenuItem.onToggled(callback: (CheckMenuItem) -> Unit): CheckMenuItem {
  // TODO - handle callback data

  asObject.connect("toggled") { callback(this) }
  return this
}
