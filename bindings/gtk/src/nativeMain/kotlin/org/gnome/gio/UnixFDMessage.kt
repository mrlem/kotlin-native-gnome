// TODO - constructor: new_with_fd_list
// TODO - method: append_fd
// TODO - method: steal_fds
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GUnixFDMessage
import interop.g_unix_fd_message_get_fd_list
import interop.g_unix_fd_message_new
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias UnixFDMessage = CPointer<GUnixFDMessage>

public val UnixFDMessage.asObject: Object
  get() = reinterpret()

public val UnixFDMessage.asSocketControlMessage: SocketControlMessage
  get() = reinterpret()

public object UnixFDMessageFactory {
  public fun new(): UnixFDMessage = g_unix_fd_message_new()!!.reinterpret()
}

public val UnixFDMessage.parentInstance: SocketControlMessage
  get() = pointed.parent_instance.ptr

public val UnixFDMessage.fdList: UnixFDList?
  get() = g_unix_fd_message_get_fd_list(this)?.reinterpret()
