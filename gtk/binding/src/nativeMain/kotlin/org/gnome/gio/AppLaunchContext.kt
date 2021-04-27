// TODO - method: get_display
// TODO - method: get_environment
// TODO - method: get_startup_notify_id
// TODO - method: launch_failed
// TODO - method: setenv
// TODO - method: unsetenv
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GAppLaunchContext
import interop.g_app_launch_context_new
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.mrlem.gnome.gobject.connect

public typealias AppLaunchContext = CPointer<GAppLaunchContext>

public val AppLaunchContext.asObject: Object
  get() = reinterpret()

public object AppLaunchContextFactory {
  public fun new(): AppLaunchContext = g_app_launch_context_new()!!.reinterpret()
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
