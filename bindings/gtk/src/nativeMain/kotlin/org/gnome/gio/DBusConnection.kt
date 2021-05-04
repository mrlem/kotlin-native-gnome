// TODO - constructor: new_finish
// TODO - constructor: new_for_address_finish
// TODO - constructor: new_for_address_sync
// TODO - constructor: new_sync
// TODO - method: add_filter (param type)
// TODO - method: call (param type)
// TODO - method: call_finish (return type)
// TODO - method: call_sync (return type)
// TODO - method: call_with_unix_fd_list (param type)
// TODO - method: call_with_unix_fd_list_finish (return type)
// TODO - method: call_with_unix_fd_list_sync (return type)
// TODO - method: close (param type)
// TODO - method: emit_signal (param type)
// TODO - method: flush (param type)
// TODO - method: register_subtree (param type)
// TODO - method: send_message (param type)
// TODO - method: send_message_with_reply (param type)
// TODO - method: send_message_with_reply_sync (param type)
// TODO - method: signal_subscribe (param type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GDBusConnection
import interop.GError
import interop.g_dbus_connection_close_finish
import interop.g_dbus_connection_close_sync
import interop.g_dbus_connection_export_action_group
import interop.g_dbus_connection_export_menu_model
import interop.g_dbus_connection_flush_finish
import interop.g_dbus_connection_flush_sync
import interop.g_dbus_connection_get_capabilities
import interop.g_dbus_connection_get_exit_on_close
import interop.g_dbus_connection_get_flags
import interop.g_dbus_connection_get_guid
import interop.g_dbus_connection_get_last_serial
import interop.g_dbus_connection_get_peer_credentials
import interop.g_dbus_connection_get_stream
import interop.g_dbus_connection_get_unique_name
import interop.g_dbus_connection_is_closed
import interop.g_dbus_connection_register_object_with_closures
import interop.g_dbus_connection_remove_filter
import interop.g_dbus_connection_send_message_with_reply_finish
import interop.g_dbus_connection_set_exit_on_close
import interop.g_dbus_connection_signal_unsubscribe
import interop.g_dbus_connection_start_message_processing
import interop.g_dbus_connection_unexport_action_group
import interop.g_dbus_connection_unexport_menu_model
import interop.g_dbus_connection_unregister_object
import interop.g_dbus_connection_unregister_subtree
import kotlin.Boolean
import kotlin.String
import kotlin.Throws
import kotlin.UInt
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.glib.Error
import org.gnome.gobject.Closure
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
  get() = g_dbus_connection_get_exit_on_close(this).toBoolean()
  set(`value`) {
    g_dbus_connection_set_exit_on_close(this@exitOnClose, `value`.toInt())
  }

public val DBusConnection.flags: DBusConnectionFlags
  get() = g_dbus_connection_get_flags(this)

public val DBusConnection.guid: String?
  get() = g_dbus_connection_get_guid(this).toKString()

public val DBusConnection.lastSerial: UInt
  get() = g_dbus_connection_get_last_serial(this)

public val DBusConnection.peerCredentials: Credentials?
  get() = g_dbus_connection_get_peer_credentials(this)?.reinterpret()

public val DBusConnection.stream: IOStream?
  get() = g_dbus_connection_get_stream(this)?.reinterpret()

public val DBusConnection.uniqueName: String?
  get() = g_dbus_connection_get_unique_name(this).toKString()

@Throws(Error::class)
public fun DBusConnection.closeFinish(res: AsyncResult?): Boolean = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Boolean = g_dbus_connection_close_finish(this@closeFinish, res?.reinterpret(),
      errors).toBoolean()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun DBusConnection.closeSync(cancellable: Cancellable?): Boolean = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Boolean = g_dbus_connection_close_sync(this@closeSync, cancellable?.reinterpret(),
      errors).toBoolean()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun DBusConnection.exportActionGroup(objectPath: String?, actionGroup: ActionGroup?): UInt =
    memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: UInt = g_dbus_connection_export_action_group(this@exportActionGroup, objectPath,
      actionGroup?.reinterpret(), errors)
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun DBusConnection.exportMenuModel(objectPath: String?, menu: MenuModel?): UInt = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: UInt = g_dbus_connection_export_menu_model(this@exportMenuModel, objectPath,
      menu?.reinterpret(), errors)
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun DBusConnection.flushFinish(res: AsyncResult?): Boolean = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Boolean = g_dbus_connection_flush_finish(this@flushFinish, res?.reinterpret(),
      errors).toBoolean()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun DBusConnection.flushSync(cancellable: Cancellable?): Boolean = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Boolean = g_dbus_connection_flush_sync(this@flushSync, cancellable?.reinterpret(),
      errors).toBoolean()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

public fun DBusConnection.isClosed(): Boolean =
    g_dbus_connection_is_closed(this@isClosed).toBoolean()

@Throws(Error::class)
public fun DBusConnection.registerObject(
  objectPath: String?,
  interfaceInfo: DBusInterfaceInfo?,
  methodCallClosure: Closure?,
  getPropertyClosure: Closure?,
  setPropertyClosure: Closure?
): UInt = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: UInt = g_dbus_connection_register_object_with_closures(this@registerObject,
      objectPath, interfaceInfo?.reinterpret(), methodCallClosure?.reinterpret(),
      getPropertyClosure?.reinterpret(), setPropertyClosure?.reinterpret(), errors)
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

public fun DBusConnection.removeFilter(filterId: UInt): Unit {
  g_dbus_connection_remove_filter(this@removeFilter, filterId)
}

@Throws(Error::class)
public fun DBusConnection.sendMessageWithReplyFinish(res: AsyncResult?): DBusMessage? = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: DBusMessage? =
      g_dbus_connection_send_message_with_reply_finish(this@sendMessageWithReplyFinish,
      res?.reinterpret(), errors)?.reinterpret()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

public fun DBusConnection.signalUnsubscribe(subscriptionId: UInt): Unit {
  g_dbus_connection_signal_unsubscribe(this@signalUnsubscribe, subscriptionId)
}

public fun DBusConnection.startMessageProcessing(): Unit {
  g_dbus_connection_start_message_processing(this@startMessageProcessing)
}

public fun DBusConnection.unexportActionGroup(exportId: UInt): Unit {
  g_dbus_connection_unexport_action_group(this@unexportActionGroup, exportId)
}

public fun DBusConnection.unexportMenuModel(exportId: UInt): Unit {
  g_dbus_connection_unexport_menu_model(this@unexportMenuModel, exportId)
}

public fun DBusConnection.unregisterObject(registrationId: UInt): Boolean =
    g_dbus_connection_unregister_object(this@unregisterObject, registrationId).toBoolean()

public fun DBusConnection.unregisterSubtree(registrationId: UInt): Boolean =
    g_dbus_connection_unregister_subtree(this@unregisterSubtree, registrationId).toBoolean()

public fun DBusConnection.onClosed(callback: (DBusConnection) -> Unit): DBusConnection {
  // TODO - handle callback data

  asObject.connect("closed") { callback(this) }
  return this
}
