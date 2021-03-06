@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GAppLaunchContext
import interop.g_app_launch_context_get_display
import interop.g_app_launch_context_get_environment
import interop.g_app_launch_context_get_startup_notify_id
import interop.g_app_launch_context_launch_failed
import interop.g_app_launch_context_new
import interop.g_app_launch_context_setenv
import interop.g_app_launch_context_unsetenv
import kotlin.Array
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.mrlem.gnome.gobject.connect
import org.mrlem.gnome.toCList
import org.mrlem.gnome.toKArray
import org.mrlem.gnome.toKString

public typealias AppLaunchContext = CPointer<GAppLaunchContext>

public val AppLaunchContext.asObject: Object
  get() = reinterpret()

public object AppLaunchContextFactory {
  public fun new(): AppLaunchContext = g_app_launch_context_new()!!.reinterpret()
}

public val AppLaunchContext.parentInstance: Object
  get() = pointed.parent_instance.ptr

public val AppLaunchContext.environment: Array<String>?
  get() = g_app_launch_context_get_environment(this)?.toKArray { it.toKString()!! }

public fun AppLaunchContext.getDisplay(info: AppInfo?, files: List<File>?): String? =
    g_app_launch_context_get_display(this@getDisplay, info?.reinterpret(),
    files?.toCList()).toKString()

public fun AppLaunchContext.getStartupNotifyId(info: AppInfo?, files: List<File>?): String? =
    g_app_launch_context_get_startup_notify_id(this@getStartupNotifyId, info?.reinterpret(),
    files?.toCList()).toKString()

public fun AppLaunchContext.launchFailed(startupNotifyId: String?): Unit {
  g_app_launch_context_launch_failed(this@launchFailed, startupNotifyId)
}

public fun AppLaunchContext.setenv(variable: String?, `value`: String?): Unit {
  g_app_launch_context_setenv(this@setenv, variable, `value`)
}

public fun AppLaunchContext.unsetenv(variable: String?): Unit {
  g_app_launch_context_unsetenv(this@unsetenv, variable)
}

public fun AppLaunchContext.onLaunchFailed(callback: (AppLaunchContext) -> Unit): AppLaunchContext {
  // TODO - handle callback data

  asObject.connect("launch-failed") { callback(this) }
  return this
}

public fun AppLaunchContext.onLaunched(callback: (AppLaunchContext) -> Unit): AppLaunchContext {
  // TODO - handle callback data

  asObject.connect("launched") { callback(this) }
  return this
}
