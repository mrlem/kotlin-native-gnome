// TODO - method: fill_async (param type)
// TODO - method: peek_buffer (param type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GBufferedInputStream
import interop.GError
import interop.g_buffered_input_stream_fill
import interop.g_buffered_input_stream_fill_finish
import interop.g_buffered_input_stream_get_available
import interop.g_buffered_input_stream_get_buffer_size
import interop.g_buffered_input_stream_new
import interop.g_buffered_input_stream_new_sized
import interop.g_buffered_input_stream_peek
import interop.g_buffered_input_stream_read_byte
import interop.g_buffered_input_stream_set_buffer_size
import kotlin.Array
import kotlin.Int
import kotlin.Long
import kotlin.Throws
import kotlin.UByte
import kotlin.ULong
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toCArray
import org.mrlem.gnome.glib.Error

public typealias BufferedInputStream = CPointer<GBufferedInputStream>

public val BufferedInputStream.asObject: Object
  get() = reinterpret()

public val BufferedInputStream.asInputStream: InputStream
  get() = reinterpret()

public val BufferedInputStream.asFilterInputStream: FilterInputStream
  get() = reinterpret()

public object BufferedInputStreamFactory {
  public fun new(baseStream: InputStream?): BufferedInputStream =
      g_buffered_input_stream_new(baseStream?.reinterpret())!!.reinterpret()

  public fun newSized(baseStream: InputStream?, size: ULong): BufferedInputStream =
      g_buffered_input_stream_new_sized(baseStream?.reinterpret(), size)!!.reinterpret()
}

public val BufferedInputStream.parentInstance: FilterInputStream
  get() = pointed.parent_instance.ptr

public val BufferedInputStream.available: ULong
  get() = g_buffered_input_stream_get_available(this)

public var BufferedInputStream.bufferSize: ULong
  get() = g_buffered_input_stream_get_buffer_size(this)
  set(`value`) {
    g_buffered_input_stream_set_buffer_size(this@bufferSize, `value`)
  }

@Throws(Error::class)
public fun BufferedInputStream.fill(count: Long, cancellable: Cancellable?): Long = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Long = g_buffered_input_stream_fill(this@fill, count, cancellable?.reinterpret(),
      errors)
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun BufferedInputStream.fillFinish(result: AsyncResult?): Long = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Long = g_buffered_input_stream_fill_finish(this@fillFinish, result?.reinterpret(),
      errors)
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

public fun BufferedInputStream.peek(
  buffer: Array<UByte>?,
  offset: ULong,
  count: ULong
): ULong = memScoped { g_buffered_input_stream_peek(this@peek, buffer?.toCArray(memScope), offset,
    count) }

@Throws(Error::class)
public fun BufferedInputStream.readByte(cancellable: Cancellable?): Int = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Int = g_buffered_input_stream_read_byte(this@readByte, cancellable?.reinterpret(),
      errors)
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}
