@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GAppInfoMonitor
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.mrlem.gnome.gobject.connect

public typealias AppInfoMonitor = CPointer<GAppInfoMonitor>

public val AppInfoMonitor.asObject: Object
  get() = reinterpret()

public fun AppInfoMonitor.onChanged(callback: (AppInfoMonitor) -> Unit): AppInfoMonitor {
  // TODO - handle callback data

  asObject.connect("changed") { callback(this) }
  return this
}
