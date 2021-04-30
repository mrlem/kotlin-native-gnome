// TODO - method: receive_credentials
// TODO - method: receive_credentials_async
// TODO - method: receive_credentials_finish
// TODO - method: receive_fd
// TODO - method: send_credentials
// TODO - method: send_credentials_async
// TODO - method: send_credentials_finish
// TODO - method: send_fd
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GUnixConnection
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias UnixConnection = CPointer<GUnixConnection>

public val UnixConnection.asObject: Object
  get() = reinterpret()

public val UnixConnection.asIOStream: IOStream
  get() = reinterpret()

public val UnixConnection.asSocketConnection: SocketConnection
  get() = reinterpret()

public val UnixConnection.parentInstance: SocketConnection
  get() = pointed.parent_instance.ptr
