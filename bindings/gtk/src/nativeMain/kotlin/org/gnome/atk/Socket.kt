// TODO - constructor: new
// TODO - field: parent
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.atk

import interop.AtkSocket
import interop.atk_socket_embed
import interop.atk_socket_is_occupied
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gnome.toBoolean
import org.gnome.toKString

public typealias Socket = CPointer<AtkSocket>

public val Socket.asObject: org.gnome.gobject.Object
  get() = reinterpret()

public val Socket.asAtkObject: Object
  get() = reinterpret()

public object SocketFactory

public val Socket.embeddedPlugId: String
  get() = pointed.embedded_plug_id.toKString()

public fun Socket.embed(plugId: String?): Unit {
  atk_socket_embed(this@embed, plugId)
}

public fun Socket.isOccupied(): Boolean = atk_socket_is_occupied(this@isOccupied).toBoolean()
