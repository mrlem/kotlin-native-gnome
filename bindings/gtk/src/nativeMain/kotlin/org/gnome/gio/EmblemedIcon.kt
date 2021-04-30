// TODO - constructor: new
// TODO - method: add_emblem
// TODO - method: get_emblems
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GEmblemedIcon
import interop.g_emblemed_icon_clear_emblems
import interop.g_emblemed_icon_get_icon
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias EmblemedIcon = CPointer<GEmblemedIcon>

public val EmblemedIcon.asObject: Object
  get() = reinterpret()

public object EmblemedIconFactory

public val EmblemedIcon.parentInstance: Object
  get() = pointed.parent_instance.ptr

public val EmblemedIcon.icon: Icon?
  get() = g_emblemed_icon_get_icon(this)?.reinterpret()

public fun EmblemedIcon.clearEmblems(): Unit {
  g_emblemed_icon_clear_emblems(this)
}
