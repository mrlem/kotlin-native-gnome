// TODO - constructor: new
// TODO - constructor: new_with_origin
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GEmblem
import interop.g_emblem_get_icon
import interop.g_emblem_get_origin
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias Emblem = CPointer<GEmblem>

public val Emblem.asObject: Object
  get() = reinterpret()

public object EmblemFactory

public val Emblem.icon: Icon?
  get() = g_emblem_get_icon(this)?.reinterpret()

public val Emblem.origin: EmblemOrigin
  get() = g_emblem_get_origin(this)
