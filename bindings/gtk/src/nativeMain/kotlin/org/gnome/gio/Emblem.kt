@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GEmblem
import interop.g_emblem_get_icon
import interop.g_emblem_get_origin
import interop.g_emblem_new
import interop.g_emblem_new_with_origin
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias Emblem = CPointer<GEmblem>

public val Emblem.asObject: Object
  get() = reinterpret()

public object EmblemFactory {
  public fun new(icon: Icon?): Emblem = g_emblem_new(icon?.reinterpret())!!.reinterpret()

  public fun newWithOrigin(icon: Icon?, origin: EmblemOrigin): Emblem =
      g_emblem_new_with_origin(icon?.reinterpret(), origin)!!.reinterpret()
}

public val Emblem.icon: Icon?
  get() = g_emblem_get_icon(this)?.reinterpret()

public val Emblem.origin: EmblemOrigin
  get() = g_emblem_get_origin(this)
