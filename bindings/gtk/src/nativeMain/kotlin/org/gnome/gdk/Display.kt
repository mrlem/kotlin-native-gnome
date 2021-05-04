// TODO - method: device_is_grabbed (param type)
// TODO - method: get_app_launch_context (return type)
// TODO - method: get_default_group (return type)
// TODO - method: get_default_screen (return type)
// TODO - method: get_default_seat (return type)
// TODO - method: get_event (return type)
// TODO - method: get_maximal_cursor_size (param type)
// TODO - method: get_monitor (return type)
// TODO - method: get_monitor_at_point (return type)
// TODO - method: get_monitor_at_window (return type)
// TODO - method: get_primary_monitor (return type)
// TODO - method: list_seats (return type)
// TODO - method: peek_event (return type)
// TODO - method: put_event (param type)
// TODO - method: request_selection_notification (param type)
// TODO - method: store_clipboard (param type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gdk

import interop.GdkDisplay
import interop.gdk_display_beep
import interop.gdk_display_close
import interop.gdk_display_flush
import interop.gdk_display_get_default_cursor_size
import interop.gdk_display_get_n_monitors
import interop.gdk_display_get_name
import interop.gdk_display_has_pending
import interop.gdk_display_is_closed
import interop.gdk_display_notify_startup_complete
import interop.gdk_display_set_double_click_distance
import interop.gdk_display_set_double_click_time
import interop.gdk_display_supports_clipboard_persistence
import interop.gdk_display_supports_cursor_alpha
import interop.gdk_display_supports_cursor_color
import interop.gdk_display_supports_input_shapes
import interop.gdk_display_supports_selection_notification
import interop.gdk_display_supports_shapes
import interop.gdk_display_sync
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.UInt
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toKString
import org.mrlem.gnome.gobject.connect

public typealias Display = CPointer<GdkDisplay>

public val Display.asObject: Object
  get() = reinterpret()

public val Display.defaultCursorSize: UInt
  get() = gdk_display_get_default_cursor_size(this)

public val Display.nMonitors: Int
  get() = gdk_display_get_n_monitors(this)

public val Display.name: String?
  get() = gdk_display_get_name(this).toKString()

public fun Display.beep(): Unit {
  gdk_display_beep(this@beep)
}

public fun Display.close(): Unit {
  gdk_display_close(this@close)
}

public fun Display.flush(): Unit {
  gdk_display_flush(this@flush)
}

public fun Display.hasPending(): Boolean = gdk_display_has_pending(this@hasPending).toBoolean()

public fun Display.isClosed(): Boolean = gdk_display_is_closed(this@isClosed).toBoolean()

public fun Display.notifyStartupComplete(startupId: String?): Unit {
  gdk_display_notify_startup_complete(this@notifyStartupComplete, startupId)
}

public fun Display.setDoubleClickDistance(distance: UInt): Unit {
  gdk_display_set_double_click_distance(this@setDoubleClickDistance, distance)
}

public fun Display.setDoubleClickTime(msec: UInt): Unit {
  gdk_display_set_double_click_time(this@setDoubleClickTime, msec)
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
