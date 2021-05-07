// TODO - method: get_maximal_cursor_size (param type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gdk

import interop.GList
import interop.GdkDisplay
import interop.gdk_display_beep
import interop.gdk_display_close
import interop.gdk_display_device_is_grabbed
import interop.gdk_display_flush
import interop.gdk_display_get_app_launch_context
import interop.gdk_display_get_default_cursor_size
import interop.gdk_display_get_default_group
import interop.gdk_display_get_default_screen
import interop.gdk_display_get_default_seat
import interop.gdk_display_get_event
import interop.gdk_display_get_monitor
import interop.gdk_display_get_monitor_at_point
import interop.gdk_display_get_monitor_at_window
import interop.gdk_display_get_n_monitors
import interop.gdk_display_get_name
import interop.gdk_display_get_primary_monitor
import interop.gdk_display_has_pending
import interop.gdk_display_is_closed
import interop.gdk_display_list_seats
import interop.gdk_display_notify_startup_complete
import interop.gdk_display_peek_event
import interop.gdk_display_put_event
import interop.gdk_display_request_selection_notification
import interop.gdk_display_set_double_click_distance
import interop.gdk_display_set_double_click_time
import interop.gdk_display_store_clipboard
import interop.gdk_display_supports_clipboard_persistence
import interop.gdk_display_supports_cursor_alpha
import interop.gdk_display_supports_cursor_color
import interop.gdk_display_supports_input_shapes
import interop.gdk_display_supports_selection_notification
import interop.gdk_display_supports_shapes
import interop.gdk_display_sync
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.UInt
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.map
import kotlin.collections.toTypedArray
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.mrlem.gnome.gobject.connect
import org.mrlem.gnome.toBoolean
import org.mrlem.gnome.toCArray
import org.mrlem.gnome.toKList
import org.mrlem.gnome.toKString

public typealias Display = CPointer<GdkDisplay>

public val Display.asObject: Object
  get() = reinterpret()

public val Display.appLaunchContext: AppLaunchContext?
  get() = gdk_display_get_app_launch_context(this)?.reinterpret()

public val Display.defaultCursorSize: UInt
  get() = gdk_display_get_default_cursor_size(this)

public val Display.defaultGroup: Window?
  get() = gdk_display_get_default_group(this)?.reinterpret()

public val Display.defaultScreen: Screen?
  get() = gdk_display_get_default_screen(this)?.reinterpret()

public val Display.defaultSeat: Seat?
  get() = gdk_display_get_default_seat(this)?.reinterpret()

public val Display.event: Event?
  get() = gdk_display_get_event(this)?.reinterpret()

public val Display.nMonitors: Int
  get() = gdk_display_get_n_monitors(this)

public val Display.name: String?
  get() = gdk_display_get_name(this).toKString()

public val Display.primaryMonitor: Monitor?
  get() = gdk_display_get_primary_monitor(this)?.reinterpret()

public fun Display.beep(): Unit {
  gdk_display_beep(this@beep)
}

public fun Display.close(): Unit {
  gdk_display_close(this@close)
}

public fun Display.deviceIsGrabbed(device: Device?): Boolean =
    gdk_display_device_is_grabbed(this@deviceIsGrabbed, device?.reinterpret()).toBoolean()

public fun Display.flush(): Unit {
  gdk_display_flush(this@flush)
}

public fun Display.getMonitor(monitorNum: Int): Monitor? = gdk_display_get_monitor(this@getMonitor,
    monitorNum)?.reinterpret()

public fun Display.getMonitorAtPoint(x: Int, y: Int): Monitor? =
    gdk_display_get_monitor_at_point(this@getMonitorAtPoint, x, y)?.reinterpret()

public fun Display.getMonitorAtWindow(window: Window?): Monitor? =
    gdk_display_get_monitor_at_window(this@getMonitorAtWindow, window?.reinterpret())?.reinterpret()

public fun Display.hasPending(): Boolean = gdk_display_has_pending(this@hasPending).toBoolean()

public fun Display.isClosed(): Boolean = gdk_display_is_closed(this@isClosed).toBoolean()

public fun Display.listSeats(): List<Seat>? =
    gdk_display_list_seats(this@listSeats)?.reinterpret<GList>()?.toKList()

public fun Display.notifyStartupComplete(startupId: String?): Unit {
  gdk_display_notify_startup_complete(this@notifyStartupComplete, startupId)
}

public fun Display.peekEvent(): Event? = gdk_display_peek_event(this@peekEvent)?.reinterpret()

public fun Display.putEvent(event: Event?): Unit {
  gdk_display_put_event(this@putEvent, event?.reinterpret())
}

public fun Display.requestSelectionNotification(selection: Atom?): Boolean =
    gdk_display_request_selection_notification(this@requestSelectionNotification,
    selection?.reinterpret()).toBoolean()

public fun Display.setDoubleClickDistance(distance: UInt): Unit {
  gdk_display_set_double_click_distance(this@setDoubleClickDistance, distance)
}

public fun Display.setDoubleClickTime(msec: UInt): Unit {
  gdk_display_set_double_click_time(this@setDoubleClickTime, msec)
}

public fun Display.storeClipboard(
  clipboardWindow: Window?,
  time: UInt,
  targets: Array<Atom>?,
  nTargets: Int
): Unit {
  memScoped { gdk_display_store_clipboard(this@storeClipboard, clipboardWindow?.reinterpret(), time,
      targets?.map { it }?.toTypedArray()?.toCArray(memScope), nTargets) }
}

public fun Display.supportsClipboardPersistence(): Boolean =
    gdk_display_supports_clipboard_persistence(this@supportsClipboardPersistence).toBoolean()

public fun Display.supportsCursorAlpha(): Boolean =
    gdk_display_supports_cursor_alpha(this@supportsCursorAlpha).toBoolean()

public fun Display.supportsCursorColor(): Boolean =
    gdk_display_supports_cursor_color(this@supportsCursorColor).toBoolean()

public fun Display.supportsInputShapes(): Boolean =
    gdk_display_supports_input_shapes(this@supportsInputShapes).toBoolean()

public fun Display.supportsSelectionNotification(): Boolean =
    gdk_display_supports_selection_notification(this@supportsSelectionNotification).toBoolean()

public fun Display.supportsShapes(): Boolean =
    gdk_display_supports_shapes(this@supportsShapes).toBoolean()

public fun Display.sync(): Unit {
  gdk_display_sync(this@sync)
}

public fun Display.onClosed(callback: (Display) -> Unit): Display {
  // TODO - handle callback data

  asObject.connect("closed") { callback(this) }
  return this
}

public fun Display.onMonitorAdded(callback: (Display) -> Unit): Display {
  // TODO - handle callback data

  asObject.connect("monitor-added") { callback(this) }
  return this
}

public fun Display.onMonitorRemoved(callback: (Display) -> Unit): Display {
  // TODO - handle callback data

  asObject.connect("monitor-removed") { callback(this) }
  return this
}

public fun Display.onOpened(callback: (Display) -> Unit): Display {
  // TODO - handle callback data

  asObject.connect("opened") { callback(this) }
  return this
}

public fun Display.onSeatAdded(callback: (Display) -> Unit): Display {
  // TODO - handle callback data

  asObject.connect("seat-added") { callback(this) }
  return this
}

public fun Display.onSeatRemoved(callback: (Display) -> Unit): Display {
  // TODO - handle callback data

  asObject.connect("seat-removed") { callback(this) }
  return this
}
