// TODO - method: serialize
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GSocketControlMessage
import interop.g_socket_control_message_get_level
import interop.g_socket_control_message_get_msg_type
import interop.g_socket_control_message_get_size
import kotlin.Int
import kotlin.ULong
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias SocketControlMessage = CPointer<GSocketControlMessage>

public val SocketControlMessage.asObject: Object
  get() = reinterpret()

public val SocketControlMessage.parentInstance: Object
  get() = pointed.parent_instance.ptr

public val SocketControlMessage.level: Int
  get() = g_socket_control_message_get_level(this)

public val SocketControlMessage.msgType: Int
  get() = g_socket_control_message_get_msg_type(this)

public val SocketControlMessage.size: ULong
  get() = g_socket_control_message_get_size(this)
