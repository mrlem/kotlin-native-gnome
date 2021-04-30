// TODO - constructor: new_from_array
// TODO - method: append
// TODO - method: get
// TODO - method: peek_fds
// TODO - method: steal_fds
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GUnixFDList
import interop.g_unix_fd_list_get_length
import interop.g_unix_fd_list_new
import kotlin.Int
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias UnixFDList = CPointer<GUnixFDList>

public val UnixFDList.asObject: Object
  get() = reinterpret()

public object UnixFDListFactory {
  public fun new(): UnixFDList = g_unix_fd_list_new()!!.reinterpret()
}

public val UnixFDList.parentInstance: Object
  get() = pointed.parent_instance.ptr

public val UnixFDList.length: Int
  get() = g_unix_fd_list_get_length(this)
