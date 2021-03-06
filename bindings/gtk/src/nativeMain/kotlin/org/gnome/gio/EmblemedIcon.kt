@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GEmblemedIcon
import interop.GList
import interop.g_emblemed_icon_add_emblem
import interop.g_emblemed_icon_clear_emblems
import interop.g_emblemed_icon_get_emblems
import interop.g_emblemed_icon_get_icon
import interop.g_emblemed_icon_new
import kotlin.Unit
import kotlin.collections.List
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.mrlem.gnome.toKList

public typealias EmblemedIcon = CPointer<GEmblemedIcon>

public val EmblemedIcon.asObject: Object
  get() = reinterpret()

public object EmblemedIconFactory {
  public fun new(icon: Icon?, emblem: Emblem?): EmblemedIcon =
      g_emblemed_icon_new(icon?.reinterpret(), emblem?.reinterpret())!!.reinterpret()
}

public val EmblemedIcon.parentInstance: Object
  get() = pointed.parent_instance.ptr

public val EmblemedIcon.emblems: List<Emblem>?
  get() = g_emblemed_icon_get_emblems(this)?.reinterpret<GList>()?.toKList()

public val EmblemedIcon.icon: Icon?
  get() = g_emblemed_icon_get_icon(this)?.reinterpret()

public fun EmblemedIcon.addEmblem(emblem: Emblem?): Unit {
  g_emblemed_icon_add_emblem(this@addEmblem, emblem?.reinterpret())
}

public fun EmblemedIcon.clearEmblems(): Unit {
  g_emblemed_icon_clear_emblems(this@clearEmblems)
}
