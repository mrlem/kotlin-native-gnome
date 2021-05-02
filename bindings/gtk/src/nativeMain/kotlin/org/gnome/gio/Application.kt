// TODO - method: add_main_option
// TODO - method: add_main_option_entries
// TODO - method: add_option_group
// TODO - method: open
// TODO - method: run
// TODO - method: set_action_group
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GApplication
import interop.GError
import interop.g_application_activate
import interop.g_application_bind_busy_property
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
import interop.g_application_new
import interop.g_application_quit
import interop.g_application_register
import interop.g_application_release
import interop.g_application_send_notification
import interop.g_application_set_application_id
import interop.g_application_set_default
import interop.g_application_set_flags
import interop.g_application_set_inactivity_timeout
import interop.g_application_set_option_context_description
import interop.g_application_set_option_context_parameter_string
import interop.g_application_set_option_context_summary
import interop.g_application_set_resource_base_path
import interop.g_application_unbind_busy_property
import interop.g_application_unmark_busy
import interop.g_application_withdraw_notification
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
import org.mrlem.gnome.gobject.connect

public typealias Application = CPointer<GApplication>

public val Application.asObject: Object
  get() = reinterpret()

public object ApplicationFactory {
  public fun new(applicationId: String, flags: ApplicationFlags): Application =
      g_application_new(applicationId, flags)!!.reinterpret()
}

public val Application.parentInstance: Object
  get() = pointed.parent_instance.ptr

public var Application.applicationId: String
  get() = g_application_get_application_id(this).toKString()
  set(`value`) {
    g_application_set_application_id(this, `value`)
  }

public val Application.dbusConnection: DBusConnection?
  get() = g_application_get_dbus_connection(this)?.reinterpret()

public val Application.dbusObjectPath: String
  get() = g_application_get_dbus_object_path(this).toKString()

public var Application.flags: ApplicationFlags
  get() = g_application_get_flags(this)
  set(`value`) {
    g_application_set_flags(this, `value`)
  }

public var Application.inactivityTimeout: UInt
  get() = g_application_get_inactivity_timeout(this)
  set(`value`) {
    g_application_set_inactivity_timeout(this, `value`)
  }

public val Application.isBusy: Boolean
  get() = g_application_get_is_busy(this).toBoolean()

public val Application.isRegistered: Boolean
  get() = g_application_get_is_registered(this).toBoolean()

public val Application.isRemote: Boolean
  get() = g_application_get_is_remote(this).toBoolean()

public var Application.resourceBasePath: String
  get() = g_application_get_resource_base_path(this).toKString()
  set(`value`) {
    g_application_set_resource_base_path(this, `value`)
  }

public fun Application.activate(): Unit {
  g_application_activate(this)
}

public fun Application.bindBusyProperty(`object`: Object?, `property`: String): Unit {
  g_application_bind_busy_property(this, `object`?.reinterpret(), `property`)
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

@Throws(Error::class)
public fun Application.register(cancellable: Cancellable?): Boolean = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Boolean = g_application_register(this@register, cancellable?.reinterpret(),
      errors).toBoolean()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

public fun Application.release(): Unit {
  g_application_release(this)
}

public fun Application.sendNotification(id: String, notification: Notification?): Unit {
  g_application_send_notification(this, id, notification?.reinterpret())
}

public fun Application.setDefault(): Unit {
  g_application_set_default(this)
}

public fun Application.setOptionContextDescription(description: String): Unit {
  g_application_set_option_context_description(this, description)
}

public fun Application.setOptionContextParameterString(parameterString: String): Unit {
  g_application_set_option_context_parameter_string(this, parameterString)
}

public fun Application.setOptionContextSummary(summary: String): Unit {
  g_application_set_option_context_summary(this, summary)
}

public fun Application.unbindBusyProperty(`object`: Object?, `property`: String): Unit {
  g_application_unbind_busy_property(this, `object`?.reinterpret(), `property`)
}

public fun Application.unmarkBusy(): Unit {
  g_application_unmark_busy(this)
}

public fun Application.withdrawNotification(id: String): Unit {
  g_application_withdraw_notification(this, id)
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
