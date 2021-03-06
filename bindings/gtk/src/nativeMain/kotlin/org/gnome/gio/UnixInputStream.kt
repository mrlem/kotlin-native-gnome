@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GUnixInputStream
import interop.g_unix_input_stream_get_close_fd
import interop.g_unix_input_stream_get_fd
import interop.g_unix_input_stream_new
import interop.g_unix_input_stream_set_close_fd
import kotlin.Boolean
import kotlin.Int
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.mrlem.gnome.toBoolean
import org.mrlem.gnome.toInt

public typealias UnixInputStream = CPointer<GUnixInputStream>

public val UnixInputStream.asObject: Object
  get() = reinterpret()

public val UnixInputStream.asInputStream: InputStream
  get() = reinterpret()

public object UnixInputStreamFactory {
  public fun new(fd: Int, closeFd: Boolean): UnixInputStream = g_unix_input_stream_new(fd,
      closeFd.toInt())!!.reinterpret()
}

public val UnixInputStream.parentInstance: InputStream
  get() = pointed.parent_instance.ptr

public var UnixInputStream.closeFd: Boolean
  get() = g_unix_input_stream_get_close_fd(this).toBoolean()
  set(`value`) {
    g_unix_input_stream_set_close_fd(this@closeFd, `value`.toInt())
  }

public val UnixInputStream.fd: Int
  get() = g_unix_input_stream_get_fd(this)
