// TODO - constructor: new
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GDataOutputStream
import interop.GError
import interop.g_data_output_stream_get_byte_order
import interop.g_data_output_stream_put_byte
import interop.g_data_output_stream_put_int16
import interop.g_data_output_stream_put_int32
import interop.g_data_output_stream_put_int64
import interop.g_data_output_stream_put_string
import interop.g_data_output_stream_put_uint16
import interop.g_data_output_stream_put_uint32
import interop.g_data_output_stream_put_uint64
import interop.g_data_output_stream_set_byte_order
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Short
import kotlin.String
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
import org.gnome.toBoolean

public typealias DataOutputStream = CPointer<GDataOutputStream>

public val DataOutputStream.asObject: Object
  get() = reinterpret()

public val DataOutputStream.asOutputStream: OutputStream
  get() = reinterpret()

public val DataOutputStream.asFilterOutputStream: FilterOutputStream
  get() = reinterpret()

public object DataOutputStreamFactory

public val DataOutputStream.parentInstance: FilterOutputStream
  get() = pointed.parent_instance.ptr

public var DataOutputStream.byteOrder: DataStreamByteOrder
  get() = g_data_output_stream_get_byte_order(this)
  set(`value`) {
    g_data_output_stream_set_byte_order(this, `value`)
  }

@Throws(Error::class)
public fun DataOutputStream.putByte(`data`: UByte, cancellable: Cancellable?): Boolean = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Boolean = g_data_output_stream_put_byte(this@putByte, `data`,
      cancellable?.reinterpret(), errors).toBoolean
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun DataOutputStream.putInt16(`data`: Short, cancellable: Cancellable?): Boolean =
    memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Boolean = g_data_output_stream_put_int16(this@putInt16, `data`,
      cancellable?.reinterpret(), errors).toBoolean
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun DataOutputStream.putInt32(`data`: Int, cancellable: Cancellable?): Boolean = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Boolean = g_data_output_stream_put_int32(this@putInt32, `data`,
      cancellable?.reinterpret(), errors).toBoolean
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun DataOutputStream.putInt64(`data`: Long, cancellable: Cancellable?): Boolean = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Boolean = g_data_output_stream_put_int64(this@putInt64, `data`,
      cancellable?.reinterpret(), errors).toBoolean
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun DataOutputStream.putString(str: String, cancellable: Cancellable?): Boolean = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Boolean = g_data_output_stream_put_string(this@putString, str,
      cancellable?.reinterpret(), errors).toBoolean
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun DataOutputStream.putUint16(`data`: UShort, cancellable: Cancellable?): Boolean =
    memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Boolean = g_data_output_stream_put_uint16(this@putUint16, `data`,
      cancellable?.reinterpret(), errors).toBoolean
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun DataOutputStream.putUint32(`data`: UInt, cancellable: Cancellable?): Boolean =
    memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Boolean = g_data_output_stream_put_uint32(this@putUint32, `data`,
      cancellable?.reinterpret(), errors).toBoolean
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun DataOutputStream.putUint64(`data`: ULong, cancellable: Cancellable?): Boolean =
    memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Boolean = g_data_output_stream_put_uint64(this@putUint64, `data`,
      cancellable?.reinterpret(), errors).toBoolean
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}
