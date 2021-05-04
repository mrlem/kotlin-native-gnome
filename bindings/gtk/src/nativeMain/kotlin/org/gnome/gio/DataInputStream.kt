// TODO - method: read_line (param type)
// TODO - method: read_line_async (param type)
// TODO - method: read_line_finish (param type)
// TODO - method: read_line_finish_utf8 (param type)
// TODO - method: read_line_utf8 (param type)
// TODO - method: read_upto (param type)
// TODO - method: read_upto_async (param type)
// TODO - method: read_upto_finish (param type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GDataInputStream
import interop.GError
import interop.g_data_input_stream_get_byte_order
import interop.g_data_input_stream_get_newline_type
import interop.g_data_input_stream_new
import interop.g_data_input_stream_read_byte
import interop.g_data_input_stream_read_int16
import interop.g_data_input_stream_read_int32
import interop.g_data_input_stream_read_int64
import interop.g_data_input_stream_read_uint16
import interop.g_data_input_stream_read_uint32
import interop.g_data_input_stream_read_uint64
import interop.g_data_input_stream_set_byte_order
import interop.g_data_input_stream_set_newline_type
import kotlin.Int
import kotlin.Long
import kotlin.Short
import kotlin.Throws
import kotlin.UByte
import kotlin.UInt
import kotlin.ULong
import kotlin.UShort
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.glib.Error
import org.gnome.gobject.Object

public typealias DataInputStream = CPointer<GDataInputStream>

public val DataInputStream.asObject: Object
  get() = reinterpret()

public val DataInputStream.asInputStream: InputStream
  get() = reinterpret()

public val DataInputStream.asFilterInputStream: FilterInputStream
  get() = reinterpret()

public val DataInputStream.asBufferedInputStream: BufferedInputStream
  get() = reinterpret()

public object DataInputStreamFactory {
  public fun new(baseStream: InputStream?): DataInputStream =
      g_data_input_stream_new(baseStream?.reinterpret())!!.reinterpret()
}

public val DataInputStream.parentInstance: BufferedInputStream
  get() = pointed.parent_instance.ptr

public var DataInputStream.byteOrder: DataStreamByteOrder
  get() = g_data_input_stream_get_byte_order(this)
  set(`value`) {
    g_data_input_stream_set_byte_order(this@byteOrder, `value`)
  }

public var DataInputStream.newlineType: DataStreamNewlineType
  get() = g_data_input_stream_get_newline_type(this)
  set(`value`) {
    g_data_input_stream_set_newline_type(this@newlineType, `value`)
  }

@Throws(Error::class)
public fun DataInputStream.readByte(cancellable: Cancellable?): UByte = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: UByte = g_data_input_stream_read_byte(this@readByte, cancellable?.reinterpret(),
      errors)
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun DataInputStream.readInt16(cancellable: Cancellable?): Short = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Short = g_data_input_stream_read_int16(this@readInt16, cancellable?.reinterpret(),
      errors)
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun DataInputStream.readInt32(cancellable: Cancellable?): Int = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Int = g_data_input_stream_read_int32(this@readInt32, cancellable?.reinterpret(),
      errors)
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun DataInputStream.readInt64(cancellable: Cancellable?): Long = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Long = g_data_input_stream_read_int64(this@readInt64, cancellable?.reinterpret(),
      errors)
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun DataInputStream.readUint16(cancellable: Cancellable?): UShort = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: UShort = g_data_input_stream_read_uint16(this@readUint16, cancellable?.reinterpret(),
      errors)
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun DataInputStream.readUint32(cancellable: Cancellable?): UInt = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: UInt = g_data_input_stream_read_uint32(this@readUint32, cancellable?.reinterpret(),
      errors)
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun DataInputStream.readUint64(cancellable: Cancellable?): ULong = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: ULong = g_data_input_stream_read_uint64(this@readUint64, cancellable?.reinterpret(),
      errors)
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}
