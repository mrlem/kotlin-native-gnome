// TODO - method: peek_fds (param type)
// TODO - method: steal_fds (param type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GError
import interop.GUnixFDList
import interop.g_unix_fd_list_append
import interop.g_unix_fd_list_get
import interop.g_unix_fd_list_get_length
import interop.g_unix_fd_list_new
import interop.g_unix_fd_list_new_from_array
import kotlin.Array
import kotlin.Int
import kotlin.Throws
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toCArray
import org.mrlem.gnome.glib.Error

public typealias UnixFDList = CPointer<GUnixFDList>

public val UnixFDList.asObject: Object
  get() = reinterpret()

public object UnixFDListFactory {
  public fun new(): UnixFDList = g_unix_fd_list_new()!!.reinterpret()

  public fun newFromArray(fds: Array<Int>?, nFds: Int): UnixFDList = memScoped {
      g_unix_fd_list_new_from_array(fds?.toCArray(memScope), nFds)!!.reinterpret() }
}

public val UnixFDList.parentInstance: Object
  get() = pointed.parent_instance.ptr

public val UnixFDList.length: Int
  get() = g_unix_fd_list_get_length(this)

@Throws(Error::class)
public fun UnixFDList.append(fd: Int): Int = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Int = g_unix_fd_list_append(this@append, fd, errors)
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun UnixFDList.`get`(index: Int): Int = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Int = g_unix_fd_list_get(this@`get`, index, errors)
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}
