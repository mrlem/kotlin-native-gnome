// TODO - method: close
// TODO - method: close_async
// TODO - method: close_finish
// TODO - method: flush
// TODO - method: flush_async
// TODO - method: flush_finish
// TODO - method: splice
// TODO - method: splice_async
// TODO - method: splice_finish
// TODO - method: write
// TODO - method: write_all
// TODO - method: write_all_async
// TODO - method: write_all_finish
// TODO - method: write_async
// TODO - method: write_bytes
// TODO - method: write_bytes_async
// TODO - method: write_bytes_finish
// TODO - method: write_finish
// TODO - method: writev
// TODO - method: writev_all
// TODO - method: writev_all_async
// TODO - method: writev_all_finish
// TODO - method: writev_async
// TODO - method: writev_finish
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GError
import interop.GOutputStream
import interop.g_output_stream_clear_pending
import interop.g_output_stream_has_pending
import interop.g_output_stream_is_closed
import interop.g_output_stream_is_closing
import interop.g_output_stream_set_pending
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

public typealias OutputStream = CPointer<GOutputStream>

public val OutputStream.asObject: Object
  get() = reinterpret()

public fun OutputStream.clearPending(): Unit {
  g_output_stream_clear_pending(this)
}

public fun OutputStream.hasPending(): Boolean = g_output_stream_has_pending(this).toBoolean

public fun OutputStream.isClosed(): Boolean = g_output_stream_is_closed(this).toBoolean

public fun OutputStream.isClosing(): Boolean = g_output_stream_is_closing(this).toBoolean

@Throws(Error::class)
public fun OutputStream.setPending(): Boolean = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Boolean = g_output_stream_set_pending(this@setPending, errors).toBoolean
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}
