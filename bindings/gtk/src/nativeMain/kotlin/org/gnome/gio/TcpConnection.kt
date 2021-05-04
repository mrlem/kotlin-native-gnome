@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GTcpConnection
import interop.g_tcp_connection_get_graceful_disconnect
import interop.g_tcp_connection_set_graceful_disconnect
import kotlin.Boolean
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt

public typealias TcpConnection = CPointer<GTcpConnection>

public val TcpConnection.asObject: Object
  get() = reinterpret()

public val TcpConnection.asIOStream: IOStream
  get() = reinterpret()

public val TcpConnection.asSocketConnection: SocketConnection
  get() = reinterpret()

public val TcpConnection.parentInstance: SocketConnection
  get() = pointed.parent_instance.ptr

public var TcpConnection.gracefulDisconnect: Boolean
  get() = g_tcp_connection_get_graceful_disconnect(this).toBoolean()
  set(`value`) {
    g_tcp_connection_set_graceful_disconnect(this@gracefulDisconnect, `value`.toInt())
  }
