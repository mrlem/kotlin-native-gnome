@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GUnixOutputStream
import interop.g_unix_output_stream_get_close_fd
import interop.g_unix_output_stream_get_fd
import interop.g_unix_output_stream_new
import interop.g_unix_output_stream_set_close_fd
import kotlin.Boolean
import kotlin.Int
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt

public typealias UnixOutputStream = CPointer<GUnixOutputStream>

public val UnixOutputStream.asObject: Object
  get() = reinterpret()

public val UnixOutputStream.asOutputStream: OutputStream
  get() = reinterpret()

public object UnixOutputStreamFactory {
  public fun new(fd: Int, closeFd: Boolean): UnixOutputStream = g_unix_output_stream_new(fd,
      closeFd.toInt())!!.reinterpret()
}

public val UnixOutputStream.parentInstance: OutputStream
  get() = pointed.parent_instance.ptr

public var UnixOutputStream.closeFd: Boolean
  get() = g_unix_output_stream_get_close_fd(this).toBoolean()
  set(`value`) {
    g_unix_output_stream_set_close_fd(this, `value`.toInt())
  }

public val UnixOutputStream.fd: Int
  get() = g_unix_output_stream_get_fd(this)
