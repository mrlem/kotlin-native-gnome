// TODO - method: close_async (param type)
// TODO - method: splice_async (param type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GError
import interop.GIOStream
import interop.g_io_stream_clear_pending
import interop.g_io_stream_close
import interop.g_io_stream_close_finish
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
import org.gnome.gobject.Object
import org.mrlem.gnome.glib.Error
import org.mrlem.gnome.toBoolean

public typealias IOStream = CPointer<GIOStream>

public val IOStream.asObject: Object
  get() = reinterpret()

public val IOStream.parentInstance: Object
  get() = pointed.parent_instance.ptr

public val IOStream.inputStream: InputStream?
  get() = g_io_stream_get_input_stream(this)?.reinterpret()

public val IOStream.outputStream: OutputStream?
  get() = g_io_stream_get_output_stream(this)?.reinterpret()

public fun IOStream.clearPending(): Unit {
  g_io_stream_clear_pending(this@clearPending)
}

@Throws(Error::class)
public fun IOStream.close(cancellable: Cancellable?): Boolean = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Boolean = g_io_stream_close(this@close, cancellable?.reinterpret(),
      errors).toBoolean()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun IOStream.closeFinish(result: AsyncResult?): Boolean = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Boolean = g_io_stream_close_finish(this@closeFinish, result?.reinterpret(),
      errors).toBoolean()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

public fun IOStream.hasPending(): Boolean = g_io_stream_has_pending(this@hasPending).toBoolean()

public fun IOStream.isClosed(): Boolean = g_io_stream_is_closed(this@isClosed).toBoolean()

@Throws(Error::class)
public fun IOStream.setPending(): Boolean = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Boolean = g_io_stream_set_pending(this@setPending, errors).toBoolean()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}
