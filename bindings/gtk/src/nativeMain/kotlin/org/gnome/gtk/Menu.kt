@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkMenu
import interop.gtk_menu_attach
import interop.gtk_menu_attach_to_widget
import interop.gtk_menu_detach
import interop.gtk_menu_get_accel_group
import interop.gtk_menu_get_accel_path
import interop.gtk_menu_get_active
import interop.gtk_menu_get_attach_widget
import interop.gtk_menu_get_monitor
import interop.gtk_menu_get_reserve_toggle_size
import interop.gtk_menu_new
import interop.gtk_menu_new_from_model
import interop.gtk_menu_place_on_monitor
import interop.gtk_menu_popdown
import interop.gtk_menu_popup_at_pointer
import interop.gtk_menu_popup_at_rect
import interop.gtk_menu_popup_at_widget
import interop.gtk_menu_reorder_child
import interop.gtk_menu_reposition
import interop.gtk_menu_set_accel_group
import interop.gtk_menu_set_accel_path
import interop.gtk_menu_set_active
import interop.gtk_menu_set_monitor
import interop.gtk_menu_set_reserve_toggle_size
import interop.gtk_menu_set_screen
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.UInt
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gdk.Event
import org.gnome.gdk.Gravity
import org.gnome.gdk.Monitor
import org.gnome.gdk.Rectangle
import org.gnome.gdk.Screen
import org.gnome.gdk.Window
import org.gnome.gio.MenuModel
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.mrlem.gnome.gobject.connect
import org.mrlem.gnome.toBoolean
import org.mrlem.gnome.toInt
import org.mrlem.gnome.toKString

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

public object MenuFactory {
  public fun new(): Menu = gtk_menu_new()!!.reinterpret()

  public fun newFromModel(model: MenuModel?): Menu =
      gtk_menu_new_from_model(model?.reinterpret())!!.reinterpret()
}

public val Menu.menuShell: MenuShell
  get() = pointed.menu_shell.ptr

public var Menu.accelGroup: AccelGroup?
  get() = gtk_menu_get_accel_group(this)?.reinterpret()
  set(`value`) {
    gtk_menu_set_accel_group(this@accelGroup, `value`)
  }

public var Menu.accelPath: String?
  get() = gtk_menu_get_accel_path(this).toKString()
  set(`value`) {
    gtk_menu_set_accel_path(this@accelPath, `value`)
  }

public val Menu.active: Widget?
  get() = gtk_menu_get_active(this)?.reinterpret()

public val Menu.attachWidget: Widget?
  get() = gtk_menu_get_attach_widget(this)?.reinterpret()

public var Menu.monitor: Int
  get() = gtk_menu_get_monitor(this)
  set(`value`) {
    gtk_menu_set_monitor(this@monitor, `value`)
  }

public var Menu.reserveToggleSize: Boolean
  get() = gtk_menu_get_reserve_toggle_size(this).toBoolean()
  set(`value`) {
    gtk_menu_set_reserve_toggle_size(this@reserveToggleSize, `value`.toInt())
  }

public fun Menu.attach(
  child: Widget?,
  leftAttach: UInt,
  rightAttach: UInt,
  topAttach: UInt,
  bottomAttach: UInt
): Unit {
  gtk_menu_attach(this@attach, child?.reinterpret(), leftAttach, rightAttach, topAttach,
      bottomAttach)
}

public fun Menu.attachToWidget(attachWidget: Widget?, detacher: MenuDetachFunc?): Unit {
  gtk_menu_attach_to_widget(this@attachToWidget, attachWidget?.reinterpret(),
      detacher?.reinterpret())
}

public fun Menu.detach(): Unit {
  gtk_menu_detach(this@detach)
}

public fun Menu.placeOnMonitor(monitor: Monitor?): Unit {
  gtk_menu_place_on_monitor(this@placeOnMonitor, monitor?.reinterpret())
}

public fun Menu.popdown(): Unit {
  gtk_menu_popdown(this@popdown)
}

public fun Menu.popupAtPointer(triggerEvent: Event?): Unit {
  gtk_menu_popup_at_pointer(this@popupAtPointer, triggerEvent?.reinterpret())
}

public fun Menu.popupAtRect(
  rectWindow: Window?,
  rect: Rectangle?,
  rectAnchor: Gravity,
  menuAnchor: Gravity,
  triggerEvent: Event?
): Unit {
  gtk_menu_popup_at_rect(this@popupAtRect, rectWindow?.reinterpret(), rect?.reinterpret(),
      rectAnchor, menuAnchor, triggerEvent?.reinterpret())
}

public fun Menu.popupAtWidget(
  widget: Widget?,
  widgetAnchor: Gravity,
  menuAnchor: Gravity,
  triggerEvent: Event?
): Unit {
  gtk_menu_popup_at_widget(this@popupAtWidget, widget?.reinterpret(), widgetAnchor, menuAnchor,
      triggerEvent?.reinterpret())
}

public fun Menu.reorderChild(child: Widget?, position: Int): Unit {
  gtk_menu_reorder_child(this@reorderChild, child?.reinterpret(), position)
}

public fun Menu.reposition(): Unit {
  gtk_menu_reposition(this@reposition)
}

public fun Menu.setActive(index: UInt): Unit {
  gtk_menu_set_active(this@setActive, index)
}

public fun Menu.setScreen(screen: Screen?): Unit {
  gtk_menu_set_screen(this@setScreen, screen?.reinterpret())
}

public fun Menu.onMoveScroll(callback: (Menu) -> Unit): Menu {
  // TODO - handle callback data

  asObject.connect("move-scroll") { callback(this) }
  return this
}

public fun Menu.onPoppedUp(callback: (Menu) -> Unit): Menu {
  // TODO - handle callback data

  asObject.connect("popped-up") { callback(this) }
  return this
}
