// TODO - method: close
// TODO - method: close_async
// TODO - method: close_finish
// TODO - method: splice_async
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GError
import interop.GIOStream
import interop.g_io_stream_clear_pending
import interop.g_io_stream_get_input_stream
import interop.g_io_stream_get_output_stream
import interop.g_io_stream_has_pending
import interop.g_io_stream_is_closed
import interop.g_io_stream_set_pending
import kotlin.Boolean
import kotlin.Throws
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.glib.Error
import org.gnome.gobject.Object
import org.gnome.toBoolean

public typealias IOStream = CPointer<GIOStream>

public val IOStream.asObject: Object
  get() = reinterpret()

public val IOStream.inputStream: InputStream?
  get() = g_io_stream_get_input_stream(this)?.reinterpret()

public val IOStream.outputStream: OutputStream?
  get() = g_io_stream_get_output_stream(this)?.reinterpret()

public fun IOStream.clearPending(): Unit {
  g_io_stream_clear_pending(this)
}

public fun IOStream.hasPending(): Boolean = g_io_stream_has_pending(this).toBoolean

public fun IOStream.isClosed(): Boolean = g_io_stream_is_closed(this).toBoolean

@Throws(Error::class)
public fun IOStream.setPending(): Boolean = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Boolean = g_io_stream_set_pending(this@setPending, errors).toBoolean
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}
