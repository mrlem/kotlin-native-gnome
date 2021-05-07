@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GList
import interop.GtkWindowGroup
import interop.gtk_window_group_add_window
import interop.gtk_window_group_get_current_device_grab
import interop.gtk_window_group_get_current_grab
import interop.gtk_window_group_list_windows
import interop.gtk_window_group_new
import interop.gtk_window_group_remove_window
import kotlin.Unit
import kotlin.collections.List
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gdk.Device
import org.gnome.gobject.Object
import org.mrlem.gnome.toKList

public typealias WindowGroup = CPointer<GtkWindowGroup>

public val WindowGroup.asObject: Object
  get() = reinterpret()

public object WindowGroupFactory {
  public fun new(): WindowGroup = gtk_window_group_new()!!.reinterpret()
}

public val WindowGroup.parentInstance: Object
  get() = pointed.parent_instance.ptr

public val WindowGroup.currentGrab: Widget?
  get() = gtk_window_group_get_current_grab(this)?.reinterpret()

public fun WindowGroup.addWindow(window: Window?): Unit {
  gtk_window_group_add_window(this@addWindow, window?.reinterpret())
}

public fun WindowGroup.getCurrentDeviceGrab(device: Device?): Widget? =
    gtk_window_group_get_current_device_grab(this@getCurrentDeviceGrab,
    device?.reinterpret())?.reinterpret()

public fun WindowGroup.listWindows(): List<Window>? =
    gtk_window_group_list_windows(this@listWindows)?.reinterpret<GList>()?.toKList()

public fun WindowGroup.removeWindow(window: Window?): Unit {
  gtk_window_group_remove_window(this@removeWindow, window?.reinterpret())
}
