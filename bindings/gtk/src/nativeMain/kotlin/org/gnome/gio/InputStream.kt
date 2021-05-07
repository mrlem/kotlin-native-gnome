// TODO - method: close_async (param type)
// TODO - method: read (param type)
// TODO - method: read_all (param type)
// TODO - method: read_all_async (param type)
// TODO - method: read_all_finish (param type)
// TODO - method: read_async (param type)
// TODO - method: read_bytes_async (param type)
// TODO - method: skip_async (param type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GError
import interop.GInputStream
import interop.g_input_stream_clear_pending
import interop.g_input_stream_close
import interop.g_input_stream_close_finish
import interop.g_input_stream_has_pending
import interop.g_input_stream_is_closed
import interop.g_input_stream_read_bytes
import interop.g_input_stream_read_bytes_finish
import interop.g_input_stream_read_finish
import interop.g_input_stream_set_pending
import interop.g_input_stream_skip
import interop.g_input_stream_skip_finish
import kotlin.Boolean
import kotlin.Long
import kotlin.Throws
import kotlin.ULong
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.glib.Bytes
import org.gnome.gobject.Object
import org.mrlem.gnome.glib.Error
import org.mrlem.gnome.toBoolean

public typealias InputStream = CPointer<GInputStream>

public val InputStream.asObject: Object
  get() = reinterpret()

public val InputStream.parentInstance: Object
  get() = pointed.parent_instance.ptr

public fun InputStream.clearPending(): Unit {
  g_input_stream_clear_pending(this@clearPending)
}

@Throws(Error::class)
public fun InputStream.close(cancellable: Cancellable?): Boolean = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Boolean = g_input_stream_close(this@close, cancellable?.reinterpret(),
      errors).toBoolean()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun InputStream.closeFinish(result: AsyncResult?): Boolean = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Boolean = g_input_stream_close_finish(this@closeFinish, result?.reinterpret(),
      errors).toBoolean()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

public fun InputStream.hasPending(): Boolean =
    g_input_stream_has_pending(this@hasPending).toBoolean()

public fun InputStream.isClosed(): Boolean = g_input_stream_is_closed(this@isClosed).toBoolean()

@Throws(Error::class)
public fun InputStream.readBytes(count: ULong, cancellable: Cancellable?): Bytes? = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Bytes? = g_input_stream_read_bytes(this@readBytes, count, cancellable?.reinterpret(),
      errors)?.reinterpret()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun InputStream.readBytesFinish(result: AsyncResult?): Bytes? = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Bytes? = g_input_stream_read_bytes_finish(this@readBytesFinish, result?.reinterpret(),
      errors)?.reinterpret()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun InputStream.readFinish(result: AsyncResult?): Long = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Long = g_input_stream_read_finish(this@readFinish, result?.reinterpret(), errors)
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun InputStream.setPending(): Boolean = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Boolean = g_input_stream_set_pending(this@setPending, errors).toBoolean()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun InputStream.skip(count: ULong, cancellable: Cancellable?): Long = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Long = g_input_stream_skip(this@skip, count, cancellable?.reinterpret(), errors)
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun InputStream.skipFinish(result: AsyncResult?): Long = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Long = g_input_stream_skip_finish(this@skipFinish, result?.reinterpret(), errors)
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}
