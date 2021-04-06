// TODO - implement:
//   toggled
package org.gnome.gtk

import gtk3.GtkCheckMenuItem
import gtk3.gtk_check_menu_item_get_active
import gtk3.gtk_check_menu_item_get_draw_as_radio
import gtk3.gtk_check_menu_item_get_inconsistent
import gtk3.gtk_check_menu_item_set_active
import gtk3.gtk_check_menu_item_set_draw_as_radio
import gtk3.gtk_check_menu_item_set_inconsistent
import kotlin.Boolean
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned
import org.gnome.glib.toBoolean
import org.gnome.glib.toInt

public typealias CheckMenuItem = CPointer<GtkCheckMenuItem>

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
