// TODO - constructor: new
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GTcpWrapperConnection
import interop.g_tcp_wrapper_connection_get_base_io_stream
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias TcpWrapperConnection = CPointer<GTcpWrapperConnection>

public val TcpWrapperConnection.asObject: Object
  get() = reinterpret()

public val TcpWrapperConnection.asIOStream: IOStream
  get() = reinterpret()

public val TcpWrapperConnection.asSocketConnection: SocketConnection
  get() = reinterpret()

public val TcpWrapperConnection.asTcpConnection: TcpConnection
  get() = reinterpret()

public object TcpWrapperConnectionFactory

public val TcpWrapperConnection.parentInstance: TcpConnection
  get() = pointed.parent_instance.ptr

public val TcpWrapperConnection.baseIoStream: IOStream?
  get() = g_tcp_wrapper_connection_get_base_io_stream(this)?.reinterpret()
