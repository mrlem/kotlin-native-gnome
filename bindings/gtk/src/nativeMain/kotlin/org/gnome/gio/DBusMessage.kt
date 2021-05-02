// TODO - constructor: new_from_blob
// TODO - constructor: new_method_call
// TODO - constructor: new_signal
// TODO - method: get_body
// TODO - method: get_header
// TODO - method: get_header_fields
// TODO - method: new_method_error_literal
// TODO - method: print
// TODO - method: set_body
// TODO - method: set_header
// TODO - method: to_blob
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GDBusMessage
import interop.GError
import interop.g_dbus_message_copy
import interop.g_dbus_message_get_arg0
import interop.g_dbus_message_get_byte_order
import interop.g_dbus_message_get_destination
import interop.g_dbus_message_get_error_name
import interop.g_dbus_message_get_flags
import interop.g_dbus_message_get_interface
import interop.g_dbus_message_get_locked
import interop.g_dbus_message_get_member
import interop.g_dbus_message_get_message_type
import interop.g_dbus_message_get_num_unix_fds
import interop.g_dbus_message_get_path
import interop.g_dbus_message_get_reply_serial
import interop.g_dbus_message_get_sender
import interop.g_dbus_message_get_serial
import interop.g_dbus_message_get_signature
import interop.g_dbus_message_get_unix_fd_list
import interop.g_dbus_message_lock
import interop.g_dbus_message_new
import interop.g_dbus_message_new_method_reply
import interop.g_dbus_message_set_byte_order
import interop.g_dbus_message_set_destination
import interop.g_dbus_message_set_error_name
import interop.g_dbus_message_set_flags
import interop.g_dbus_message_set_interface
import interop.g_dbus_message_set_member
import interop.g_dbus_message_set_message_type
import interop.g_dbus_message_set_num_unix_fds
import interop.g_dbus_message_set_path
import interop.g_dbus_message_set_reply_serial
import interop.g_dbus_message_set_sender
import interop.g_dbus_message_set_serial
import interop.g_dbus_message_set_signature
import interop.g_dbus_message_set_unix_fd_list
import interop.g_dbus_message_to_gerror
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
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toKString

public typealias DBusMessage = CPointer<GDBusMessage>

public val DBusMessage.asObject: Object
  get() = reinterpret()

public object DBusMessageFactory {
  public fun new(): DBusMessage = g_dbus_message_new()!!.reinterpret()
}

public val DBusMessage.arg0: String
  get() = g_dbus_message_get_arg0(this).toKString

public var DBusMessage.byteOrder: DBusMessageByteOrder
  get() = g_dbus_message_get_byte_order(this)
  set(`value`) {
    g_dbus_message_set_byte_order(this, `value`)
  }

public var DBusMessage.destination: String
  get() = g_dbus_message_get_destination(this).toKString
  set(`value`) {
    g_dbus_message_set_destination(this, `value`)
  }

public var DBusMessage.errorName: String
  get() = g_dbus_message_get_error_name(this).toKString
  set(`value`) {
    g_dbus_message_set_error_name(this, `value`)
  }

public var DBusMessage.flags: DBusMessageFlags
  get() = g_dbus_message_get_flags(this)
  set(`value`) {
    g_dbus_message_set_flags(this, `value`)
  }

public var DBusMessage.`interface`: String
  get() = g_dbus_message_get_interface(this).toKString
  set(`value`) {
    g_dbus_message_set_interface(this, `value`)
  }

public val DBusMessage.locked: Boolean
  get() = g_dbus_message_get_locked(this).toBoolean

public var DBusMessage.member: String
  get() = g_dbus_message_get_member(this).toKString
  set(`value`) {
    g_dbus_message_set_member(this, `value`)
  }

public var DBusMessage.messageType: DBusMessageType
  get() = g_dbus_message_get_message_type(this)
  set(`value`) {
    g_dbus_message_set_message_type(this, `value`)
  }

public var DBusMessage.numUnixFds: UInt
  get() = g_dbus_message_get_num_unix_fds(this)
  set(`value`) {
    g_dbus_message_set_num_unix_fds(this, `value`)
  }

public var DBusMessage.path: String
  get() = g_dbus_message_get_path(this).toKString
  set(`value`) {
    g_dbus_message_set_path(this, `value`)
  }

public var DBusMessage.replySerial: UInt
  get() = g_dbus_message_get_reply_serial(this)
  set(`value`) {
    g_dbus_message_set_reply_serial(this, `value`)
  }

public var DBusMessage.sender: String
  get() = g_dbus_message_get_sender(this).toKString
  set(`value`) {
    g_dbus_message_set_sender(this, `value`)
  }

public var DBusMessage.serial: UInt
  get() = g_dbus_message_get_serial(this)
  set(`value`) {
    g_dbus_message_set_serial(this, `value`)
  }

public var DBusMessage.signature: String
  get() = g_dbus_message_get_signature(this).toKString
  set(`value`) {
    g_dbus_message_set_signature(this, `value`)
  }

public var DBusMessage.unixFdList: UnixFDList?
  get() = g_dbus_message_get_unix_fd_list(this)?.reinterpret()
  set(`value`) {
    g_dbus_message_set_unix_fd_list(this, `value`)
  }

@Throws(Error::class)
public fun DBusMessage.copy(): DBusMessage? = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: DBusMessage? = g_dbus_message_copy(this@copy, errors)?.reinterpret()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

public fun DBusMessage.lock(): Unit {
  g_dbus_message_lock(this)
}

public fun DBusMessage.newMethodReply(): DBusMessage? =
    g_dbus_message_new_method_reply(this)?.reinterpret()

@Throws(Error::class)
public fun DBusMessage.toGerror(): Boolean = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Boolean = g_dbus_message_to_gerror(this@toGerror, errors).toBoolean
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}
