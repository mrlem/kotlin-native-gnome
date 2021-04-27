@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkAccelMap
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.mrlem.gnome.gobject.connect

public typealias AccelMap = CPointer<GtkAccelMap>

public val AccelMap.asObject: Object
  get() = reinterpret()

public fun AccelMap.onChanged(callback: (AccelMap) -> Unit): AccelMap {
  // TODO - handle callback data

  asObject.connect("changed") { callback(this) }
  return this
}
