// TODO - method: close_async (param type)
// TODO - method: flush_async (param type)
// TODO - method: splice_async (param type)
// TODO - method: write_all (param type)
// TODO - method: write_all_async (param type)
// TODO - method: write_all_finish (param type)
// TODO - method: write_async (param type)
// TODO - method: write_bytes (param type)
// TODO - method: write_bytes_async (param type)
// TODO - method: writev (param type)
// TODO - method: writev_all (param type)
// TODO - method: writev_all_async (param type)
// TODO - method: writev_all_finish (param type)
// TODO - method: writev_async (param type)
// TODO - method: writev_finish (param type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GError
import interop.GOutputStream
import interop.g_output_stream_clear_pending
import interop.g_output_stream_close
import interop.g_output_stream_close_finish
import interop.g_output_stream_flush
import interop.g_output_stream_flush_finish
import interop.g_output_stream_has_pending
import interop.g_output_stream_is_closed
import interop.g_output_stream_is_closing
import interop.g_output_stream_set_pending
import interop.g_output_stream_splice
import interop.g_output_stream_splice_finish
import interop.g_output_stream_write
import interop.g_output_stream_write_bytes_finish
import interop.g_output_stream_write_finish
import kotlin.Array
import kotlin.Boolean
import kotlin.Long
import kotlin.Throws
import kotlin.UByte
import kotlin.ULong
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
import org.gnome.toCArray

public typealias OutputStream = CPointer<GOutputStream>

public val OutputStream.asObject: Object
  get() = reinterpret()

public val OutputStream.parentInstance: Object
  get() = pointed.parent_instance.ptr

public fun OutputStream.clearPending(): Unit {
  g_output_stream_clear_pending(this@clearPending)
}

@Throws(Error::class)
public fun OutputStream.close(cancellable: Cancellable?): Boolean = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Boolean = g_output_stream_close(this@close, cancellable?.reinterpret(),
      errors).toBoolean()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun OutputStream.closeFinish(result: AsyncResult?): Boolean = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Boolean = g_output_stream_close_finish(this@closeFinish, result?.reinterpret(),
      errors).toBoolean()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun OutputStream.flush(cancellable: Cancellable?): Boolean = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Boolean = g_output_stream_flush(this@flush, cancellable?.reinterpret(),
      errors).toBoolean()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun OutputStream.flushFinish(result: AsyncResult?): Boolean = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Boolean = g_output_stream_flush_finish(this@flushFinish, result?.reinterpret(),
      errors).toBoolean()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

public fun OutputStream.hasPending(): Boolean =
    g_output_stream_has_pending(this@hasPending).toBoolean()

public fun OutputStream.isClosed(): Boolean = g_output_stream_is_closed(this@isClosed).toBoolean()

public fun OutputStream.isClosing(): Boolean =
    g_output_stream_is_closing(this@isClosing).toBoolean()

@Throws(Error::class)
public fun OutputStream.setPending(): Boolean = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Boolean = g_output_stream_set_pending(this@setPending, errors).toBoolean()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun OutputStream.splice(
  source: InputStream?,
  flags: OutputStreamSpliceFlags,
  cancellable: Cancellable?
): Long = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Long = g_output_stream_splice(this@splice, source?.reinterpret(), flags,
      cancellable?.reinterpret(), errors)
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun OutputStream.spliceFinish(result: AsyncResult?): Long = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Long = g_output_stream_splice_finish(this@spliceFinish, result?.reinterpret(), errors)
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun OutputStream.write(
  buffer: Array<UByte>?,
  count: ULong,
  cancellable: Cancellable?
): Long = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Long = memScoped { g_output_stream_write(this@write, buffer?.toCArray(memScope),
      count, cancellable?.reinterpret(), errors) }
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun OutputStream.writeBytesFinish(result: AsyncResult?): Long = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Long = g_output_stream_write_bytes_finish(this@writeBytesFinish,
      result?.reinterpret(), errors)
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun OutputStream.writeFinish(result: AsyncResult?): Long = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Long = g_output_stream_write_finish(this@writeFinish, result?.reinterpret(), errors)
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}
