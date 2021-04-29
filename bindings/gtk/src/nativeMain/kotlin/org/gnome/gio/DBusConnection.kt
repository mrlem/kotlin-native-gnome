// TODO - constructor: new_finish
// TODO - constructor: new_for_address_finish
// TODO - constructor: new_for_address_sync
// TODO - constructor: new_sync
// TODO - method: add_filter
// TODO - method: call
// TODO - method: call_finish
// TODO - method: call_sync
// TODO - method: call_with_unix_fd_list
// TODO - method: call_with_unix_fd_list_finish
// TODO - method: call_with_unix_fd_list_sync
// TODO - method: close
// TODO - method: close_finish
// TODO - method: close_sync
// TODO - method: emit_signal
// TODO - method: export_action_group
// TODO - method: export_menu_model
// TODO - method: flush
// TODO - method: flush_finish
// TODO - method: flush_sync
// TODO - method: register_object
// TODO - method: register_subtree
// TODO - method: remove_filter
// TODO - method: send_message
// TODO - method: send_message_with_reply
// TODO - method: send_message_with_reply_finish
// TODO - method: send_message_with_reply_sync
// TODO - method: signal_subscribe
// TODO - method: signal_unsubscribe
// TODO - method: unexport_action_group
// TODO - method: unexport_menu_model
// TODO - method: unregister_object
// TODO - method: unregister_subtree
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GDBusConnection
import interop.g_dbus_connection_get_capabilities
import interop.g_dbus_connection_get_exit_on_close
import interop.g_dbus_connection_get_flags
import interop.g_dbus_connection_get_guid
import interop.g_dbus_connection_get_last_serial
import interop.g_dbus_connection_get_peer_credentials
import interop.g_dbus_connection_get_stream
import interop.g_dbus_connection_get_unique_name
import interop.g_dbus_connection_is_closed
import interop.g_dbus_connection_set_exit_on_close
import interop.g_dbus_connection_start_message_processing
import kotlin.Boolean
import kotlin.String
import kotlin.UInt
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt
import org.gnome.toKString
import org.mrlem.gnome.gobject.connect

public typealias DBusConnection = CPointer<GDBusConnection>

public val DBusConnection.asObject: Object
  get() = reinterpret()

public object DBusConnectionFactory

public val DBusConnection.capabilities: DBusCapabilityFlags
  get() = g_dbus_connection_get_capabilities(this)

public var DBusConnection.exitOnClose: Boolean
  get() = g_dbus_connection_get_exit_on_close(this).toBoolean
  set(`value`) {
    g_dbus_connection_set_exit_on_close(this, value.toInt)
  }

public val DBusConnection.flags: DBusConnectionFlags
  get() = g_dbus_connection_get_flags(this)

public val DBusConnection.guid: String
  get() = g_dbus_connection_get_guid(this).toKString

public val DBusConnection.lastSerial: UInt
  get() = g_dbus_connection_get_last_serial(this)

public val DBusConnection.peerCredentials: Credentials?
  get() = g_dbus_connection_get_peer_credentials(this)?.reinterpret()

public val DBusConnection.stream: IOStream?
  get() = g_dbus_connection_get_stream(this)?.reinterpret()

public val DBusConnection.uniqueName: String
  get() = g_dbus_connection_get_unique_name(this).toKString

public fun DBusConnection.isClosed(): Boolean = g_dbus_connection_is_closed(this).toBoolean

public fun DBusConnection.startMessageProcessing(): Unit {
  g_dbus_connection_start_message_processing(this)
}

public fun DBusConnection.onClosed(callback: (DBusConnection) -> Unit): DBusConnection {
  // TODO - handle callback data

  asObject.connect("closed") { callback(this) }
  return this
}
