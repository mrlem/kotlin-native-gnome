// TODO - method: get_tearoff_state
// TODO - method: get_title
// TODO - method: place_on_monitor
// TODO - method: popup
// TODO - method: popup_at_pointer
// TODO - method: popup_at_rect
// TODO - method: popup_at_widget
// TODO - method: popup_for_device
// TODO - method: set_screen
// TODO - method: set_tearoff_state
// TODO - method: set_title
// TODO - signal: move-scroll
// TODO - signal: popped-up
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import gtk3.GtkMenu
import gtk3.gtk_menu_attach
import gtk3.gtk_menu_attach_to_widget
import gtk3.gtk_menu_detach
import gtk3.gtk_menu_get_accel_group
import gtk3.gtk_menu_get_accel_path
import gtk3.gtk_menu_get_active
import gtk3.gtk_menu_get_attach_widget
import gtk3.gtk_menu_get_monitor
import gtk3.gtk_menu_get_reserve_toggle_size
import gtk3.gtk_menu_popdown
import gtk3.gtk_menu_reorder_child
import gtk3.gtk_menu_reposition
import gtk3.gtk_menu_set_accel_group
import gtk3.gtk_menu_set_accel_path
import gtk3.gtk_menu_set_active
import gtk3.gtk_menu_set_monitor
import gtk3.gtk_menu_set_reserve_toggle_size
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.UInt
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt
import org.gnome.toKString

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

public var Menu.accelGroup: AccelGroup?
  get() = gtk_menu_get_accel_group(this)?.reinterpret()
  set(`value`) {
    gtk_menu_set_accel_group(this, value)
  }

public var Menu.accelPath: String
  get() = gtk_menu_get_accel_path(this).toKString
  set(`value`) {
    gtk_menu_set_accel_path(this, value)
  }

public val Menu.active: Widget?
  get() = gtk_menu_get_active(this)?.reinterpret()

public val Menu.attachWidget: Widget?
  get() = gtk_menu_get_attach_widget(this)?.reinterpret()

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

public fun Menu.attach(
  child: Widget?,
  leftAttach: UInt,
  rightAttach: UInt,
  topAttach: UInt,
  bottomAttach: UInt
): Unit {
  gtk_menu_attach(this, child?.reinterpret(), leftAttach, rightAttach, topAttach, bottomAttach)
}

public fun Menu.attachToWidget(attachWidget: Widget?, detacher: MenuDetachFunc?): Unit {
  gtk_menu_attach_to_widget(this, attachWidget?.reinterpret(), detacher?.reinterpret())
}

public fun Menu.detach(): Unit {
  gtk_menu_detach(this)
}

public fun Menu.popdown(): Unit {
  gtk_menu_popdown(this)
}

public fun Menu.reorderChild(child: Widget?, position: Int): Unit {
  gtk_menu_reorder_child(this, child?.reinterpret(), position)
}

public fun Menu.reposition(): Unit {
  gtk_menu_reposition(this)
}

public fun Menu.setActive(index: UInt): Unit {
  gtk_menu_set_active(this, index)
}
