// TODO - method: get_display
// TODO - method: get_environment
// TODO - method: get_startup_notify_id
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GAppLaunchContext
import interop.g_app_launch_context_launch_failed
import interop.g_app_launch_context_new
import interop.g_app_launch_context_setenv
import interop.g_app_launch_context_unsetenv
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.mrlem.gnome.gobject.connect

public typealias AppLaunchContext = CPointer<GAppLaunchContext>

public val AppLaunchContext.asObject: Object
  get() = reinterpret()

public object AppLaunchContextFactory {
  public fun new(): AppLaunchContext = g_app_launch_context_new()!!.reinterpret()
}

public val AppLaunchContext.parentInstance: Object
  get() = pointed.parent_instance.ptr

public fun AppLaunchContext.launchFailed(startupNotifyId: String): Unit {
  g_app_launch_context_launch_failed(this, startupNotifyId)
}

public fun AppLaunchContext.setenv(variable: String, `value`: String): Unit {
  g_app_launch_context_setenv(this, variable, `value`)
}

public fun AppLaunchContext.unsetenv(variable: String): Unit {
  g_app_launch_context_unsetenv(this, variable)
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
