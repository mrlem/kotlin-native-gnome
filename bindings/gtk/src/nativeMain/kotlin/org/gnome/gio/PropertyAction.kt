@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GPropertyAction
import interop.g_property_action_new
import kotlin.String
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias PropertyAction = CPointer<GPropertyAction>

public val PropertyAction.asObject: Object
  get() = reinterpret()

public object PropertyActionFactory {
  public fun new(
    name: String?,
    `object`: Object?,
    propertyName: String?
  ): PropertyAction = g_property_action_new(name, `object`?.reinterpret(),
      propertyName)!!.reinterpret()
}
