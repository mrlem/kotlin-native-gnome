// TODO - constructor: new
// TODO - method: add_main_option
// TODO - method: add_main_option_entries
// TODO - method: add_option_group
// TODO - method: bind_busy_property
// TODO - method: open
// TODO - method: register
// TODO - method: run
// TODO - method: send_notification
// TODO - method: set_action_group
// TODO - method: set_option_context_description
// TODO - method: set_option_context_parameter_string
// TODO - method: set_option_context_summary
// TODO - method: unbind_busy_property
// TODO - method: withdraw_notification
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GApplication
import interop.g_application_activate
import interop.g_application_get_application_id
import interop.g_application_get_dbus_connection
import interop.g_application_get_dbus_object_path
import interop.g_application_get_flags
import interop.g_application_get_inactivity_timeout
import interop.g_application_get_is_busy
import interop.g_application_get_is_registered
import interop.g_application_get_is_remote
import interop.g_application_get_resource_base_path
import interop.g_application_hold
import interop.g_application_mark_busy
import interop.g_application_quit
import interop.g_application_release
import interop.g_application_set_application_id
import interop.g_application_set_default
import interop.g_application_set_flags
import interop.g_application_set_inactivity_timeout
import interop.g_application_set_resource_base_path
import interop.g_application_unmark_busy
import kotlin.Boolean
import kotlin.String
import kotlin.UInt
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toKString
import org.mrlem.gnome.gobject.connect

public typealias Application = CPointer<GApplication>

public val Application.asObject: Object
  get() = reinterpret()

public object ApplicationFactory

public var Application.applicationId: String
  get() = g_application_get_application_id(this).toKString
  set(`value`) {
    g_application_set_application_id(this, value)
  }

public val Application.dbusConnection: DBusConnection?
  get() = g_application_get_dbus_connection(this)?.reinterpret()

public val Application.dbusObjectPath: String
  get() = g_application_get_dbus_object_path(this).toKString

public var Application.flags: ApplicationFlags
  get() = g_application_get_flags(this)
  set(`value`) {
    g_application_set_flags(this, value)
  }

public var Application.inactivityTimeout: UInt
  get() = g_application_get_inactivity_timeout(this)
  set(`value`) {
    g_application_set_inactivity_timeout(this, value)
  }

public val Application.isBusy: Boolean
  get() = g_application_get_is_busy(this).toBoolean

public val Application.isRegistered: Boolean
  get() = g_application_get_is_registered(this).toBoolean

public val Application.isRemote: Boolean
  get() = g_application_get_is_remote(this).toBoolean

public var Application.resourceBasePath: String
  get() = g_application_get_resource_base_path(this).toKString
  set(`value`) {
    g_application_set_resource_base_path(this, value)
  }

public fun Application.activate(): Unit {
  g_application_activate(this)
}

public fun Application.hold(): Unit {
  g_application_hold(this)
}

public fun Application.markBusy(): Unit {
  g_application_mark_busy(this)
}

public fun Application.quit(): Unit {
  g_application_quit(this)
}

public fun Application.release(): Unit {
  g_application_release(this)
}

public fun Application.setDefault(): Unit {
  g_application_set_default(this)
}

public fun Application.unmarkBusy(): Unit {
  g_application_unmark_busy(this)
}

public fun Application.onActivate(callback: (Application) -> Unit): Application {
  // TODO - handle callback data

  asObject.connect("activate") { callback(this) }
  return this
}

public fun Application.onCommandLine(callback: (Application) -> Unit): Application {
  // TODO - handle callback data

  asObject.connect("command-line") { callback(this) }
  return this
}

public fun Application.onHandleLocalOptions(callback: (Application) -> Unit): Application {
  // TODO - handle callback data

  asObject.connect("handle-local-options") { callback(this) }
  return this
}

public fun Application.onNameLost(callback: (Application) -> Unit): Application {
  // TODO - handle callback data

  asObject.connect("name-lost") { callback(this) }
  return this
}

public fun Application.onOpen(callback: (Application) -> Unit): Application {
  // TODO - handle callback data

  asObject.connect("open") { callback(this) }
  return this
}

public fun Application.onShutdown(callback: (Application) -> Unit): Application {
  // TODO - handle callback data

  asObject.connect("shutdown") { callback(this) }
  return this
}

public fun Application.onStartup(callback: (Application) -> Unit): Application {
  // TODO - handle callback data

  asObject.connect("startup") { callback(this) }
  return this
}
