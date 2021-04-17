// TODO - implement:
//   attach
//   attach_to_widget
//   place_on_monitor
//   popup
//   popup_at_pointer
//   popup_at_rect
//   popup_at_widget
//   popup_for_device
//   reorder_child
//   set_accel_group
//   set_screen
//   set_active
package org.gnome.gtk

import gtk3.GtkMenu
import gtk3.gtk_menu_detach
import gtk3.gtk_menu_get_accel_group
import gtk3.gtk_menu_get_accel_path
import gtk3.gtk_menu_get_active
import gtk3.gtk_menu_get_attach_widget
import gtk3.gtk_menu_get_monitor
import gtk3.gtk_menu_get_reserve_toggle_size
import gtk3.gtk_menu_get_tearoff_state
import gtk3.gtk_menu_get_title
import gtk3.gtk_menu_popdown
import gtk3.gtk_menu_reposition
import gtk3.gtk_menu_set_accel_path
import gtk3.gtk_menu_set_monitor
import gtk3.gtk_menu_set_reserve_toggle_size
import gtk3.gtk_menu_set_tearoff_state
import gtk3.gtk_menu_set_title
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned
import org.gnome.glib.gobject.Object
import org.gnome.glib.toBoolean
import org.gnome.glib.toInt
import org.gnome.glib.toKString

public typealias Menu = CPointer<GtkMenu>

public val Menu.asObject: Object
  get() = reinterpret()

public val Menu.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Menu.asWidget: Widget
  get() = reinterpret()

public val Menu.asContainer: Container
  get() = reinterpret()

public val Menu.asMenuShell: MenuShell
  get() = reinterpret()

public fun Menu.detach(): Unit {
  gtk_menu_detach(this)
}

public fun Menu.getAccelGroup(): Unit {
  gtk_menu_get_accel_group(this)
}

public fun Menu.getActive(): Unit {
  gtk_menu_get_active(this)
}

public fun Menu.getAttachWidget(): Unit {
  gtk_menu_get_attach_widget(this)
}

public fun Menu.popdown(): Unit {
  gtk_menu_popdown(this)
}

public fun Menu.reposition(): Unit {
  gtk_menu_reposition(this)
}

public var Menu.accelPath: String?
  get() = gtk_menu_get_accel_path(this).toKString
  set(`value`) {
    gtk_menu_set_accel_path(this, value)
  }

public var Menu.monitor: Int
  get() = gtk_menu_get_monitor(this)
  set(`value`) {
    gtk_menu_set_monitor(this, value)
  }

public var Menu.reserveToggleSize: Boolean
  get() = gtk_menu_get_reserve_toggle_size(this).toBoolean
  set(`value`) {
    gtk_menu_set_reserve_toggle_size(this, value.toInt)
  }

public var Menu.tearoffState: Boolean
  get() = gtk_menu_get_tearoff_state(this).toBoolean
  set(`value`) {
    gtk_menu_set_tearoff_state(this, value.toInt)
  }

public var Menu.title: String?
  get() = gtk_menu_get_title(this).toKString
  set(`value`) {
    gtk_menu_set_title(this, value)
  }
