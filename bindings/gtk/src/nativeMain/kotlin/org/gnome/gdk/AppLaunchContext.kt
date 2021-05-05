// TODO - constructor: new
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gdk

import interop.GdkAppLaunchContext
import interop.gdk_app_launch_context_set_desktop
import interop.gdk_app_launch_context_set_icon
import interop.gdk_app_launch_context_set_icon_name
import interop.gdk_app_launch_context_set_screen
import interop.gdk_app_launch_context_set_timestamp
import kotlin.Int
import kotlin.String
import kotlin.UInt
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gio.Icon
import org.gnome.gobject.Object

public typealias AppLaunchContext = CPointer<GdkAppLaunchContext>

public val AppLaunchContext.asObject: Object
  get() = reinterpret()

public val AppLaunchContext.asAppLaunchContext: org.gnome.gio.AppLaunchContext
  get() = reinterpret()

public object AppLaunchContextFactory

public fun AppLaunchContext.setDesktop(desktop: Int): Unit {
  gdk_app_launch_context_set_desktop(this@setDesktop, desktop)
}

public fun AppLaunchContext.setIcon(icon: Icon?): Unit {
  gdk_app_launch_context_set_icon(this@setIcon, icon?.reinterpret())
}

public fun AppLaunchContext.setIconName(iconName: String?): Unit {
  gdk_app_launch_context_set_icon_name(this@setIconName, iconName)
}

public fun AppLaunchContext.setScreen(screen: Screen?): Unit {
  gdk_app_launch_context_set_screen(this@setScreen, screen?.reinterpret())
}

public fun AppLaunchContext.setTimestamp(timestamp: UInt): Unit {
  gdk_app_launch_context_set_timestamp(this@setTimestamp, timestamp)
}
