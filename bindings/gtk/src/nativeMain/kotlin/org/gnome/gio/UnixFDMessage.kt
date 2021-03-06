// TODO - method: steal_fds (param type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GError
import interop.GUnixFDMessage
import interop.g_unix_fd_message_append_fd
import interop.g_unix_fd_message_get_fd_list
import interop.g_unix_fd_message_new
import interop.g_unix_fd_message_new_with_fd_list
import kotlin.Boolean
import kotlin.Int
import kotlin.Throws
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.mrlem.gnome.glib.Error
import org.mrlem.gnome.toBoolean

public typealias UnixFDMessage = CPointer<GUnixFDMessage>

public val UnixFDMessage.asObject: Object
  get() = reinterpret()

public val UnixFDMessage.asSocketControlMessage: SocketControlMessage
  get() = reinterpret()

public object UnixFDMessageFactory {
  public fun new(): UnixFDMessage = g_unix_fd_message_new()!!.reinterpret()

  public fun newWithFdList(fdList: UnixFDList?): UnixFDMessage =
      g_unix_fd_message_new_with_fd_list(fdList?.reinterpret())!!.reinterpret()
}

public val UnixFDMessage.parentInstance: SocketControlMessage
  get() = pointed.parent_instance.ptr

public val UnixFDMessage.fdList: UnixFDList?
  get() = g_unix_fd_message_get_fd_list(this)?.reinterpret()

@Throws(Error::class)
public fun UnixFDMessage.appendFd(fd: Int): Boolean = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Boolean = g_unix_fd_message_append_fd(this@appendFd, fd, errors).toBoolean()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}
