// TODO - method: get_parameters
// TODO - method: return_dbus_error
// TODO - method: return_error_literal
// TODO - method: return_gerror
// TODO - method: return_value
// TODO - method: return_value_with_unix_fd_list
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GDBusMethodInvocation
import interop.g_dbus_method_invocation_get_connection
import interop.g_dbus_method_invocation_get_interface_name
import interop.g_dbus_method_invocation_get_message
import interop.g_dbus_method_invocation_get_method_info
import interop.g_dbus_method_invocation_get_method_name
import interop.g_dbus_method_invocation_get_object_path
import interop.g_dbus_method_invocation_get_property_info
import interop.g_dbus_method_invocation_get_sender
import kotlin.String
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toKString

public typealias DBusMethodInvocation = CPointer<GDBusMethodInvocation>

public val DBusMethodInvocation.asObject: Object
  get() = reinterpret()

public val DBusMethodInvocation.connection: DBusConnection?
  get() = g_dbus_method_invocation_get_connection(this)?.reinterpret()

public val DBusMethodInvocation.interfaceName: String
  get() = g_dbus_method_invocation_get_interface_name(this).toKString

public val DBusMethodInvocation.message: DBusMessage?
  get() = g_dbus_method_invocation_get_message(this)?.reinterpret()

public val DBusMethodInvocation.methodInfo: DBusMethodInfo?
  get() = g_dbus_method_invocation_get_method_info(this)?.reinterpret()

public val DBusMethodInvocation.methodName: String
  get() = g_dbus_method_invocation_get_method_name(this).toKString

public val DBusMethodInvocation.objectPath: String
  get() = g_dbus_method_invocation_get_object_path(this).toKString

public val DBusMethodInvocation.propertyInfo: DBusPropertyInfo?
  get() = g_dbus_method_invocation_get_property_info(this)?.reinterpret()

public val DBusMethodInvocation.sender: String
  get() = g_dbus_method_invocation_get_sender(this).toKString
