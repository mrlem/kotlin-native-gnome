// TODO - place_on_monitor
// TODO - popup_at_pointer
// TODO - popup_at_rect
// TODO - popup_at_widget
// TODO - set_screen
//
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

public fun Menu.attach(
  child: Widget,
  leftAttach: UInt,
  rightAttach: UInt,
  topAttach: UInt,
  bottomAttach: UInt
): Unit {
  gtk_menu_attach(this, child.reinterpret(), leftAttach, rightAttach, topAttach, bottomAttach)
}

public fun Menu.attachToWidget(attachWidget: Widget, detacher: MenuDetachFunc): Unit {
  gtk_menu_attach_to_widget(this, attachWidget.reinterpret(), detacher.reinterpret())
}

public fun Menu.detach(): Unit {
  gtk_menu_detach(this)
}

public fun Menu.getAccelGroup(): AccelGroup? = gtk_menu_get_accel_group(this)?.reinterpret()

public fun Menu.getAccelPath(): String = gtk_menu_get_accel_path(this).toKString

public fun Menu.getActive(): Widget? = gtk_menu_get_active(this)?.reinterpret()

public fun Menu.getAttachWidget(): Widget? = gtk_menu_get_attach_widget(this)?.reinterpret()

public fun Menu.getMonitor(): Int = gtk_menu_get_monitor(this)

public fun Menu.getReserveToggleSize(): Boolean = gtk_menu_get_reserve_toggle_size(this).toBoolean

public fun Menu.popdown(): Unit {
  gtk_menu_popdown(this)
}

public fun Menu.reorderChild(child: Widget, position: Int): Unit {
  gtk_menu_reorder_child(this, child.reinterpret(), position)
}

public fun Menu.reposition(): Unit {
  gtk_menu_reposition(this)
}

public fun Menu.setAccelGroup(accelGroup: AccelGroup): Unit {
  gtk_menu_set_accel_group(this, accelGroup.reinterpret())
}

public fun Menu.setAccelPath(accelPath: String?): Unit {
  gtk_menu_set_accel_path(this, accelPath)
}

public fun Menu.setActive(index: UInt): Unit {
  gtk_menu_set_active(this, index)
}

public fun Menu.setMonitor(monitorNum: Int): Unit {
  gtk_menu_set_monitor(this, monitorNum)
}

public fun Menu.setReserveToggleSize(reserveToggleSize: Boolean): Unit {
  gtk_menu_set_reserve_toggle_size(this, reserveToggleSize.toInt)
}
