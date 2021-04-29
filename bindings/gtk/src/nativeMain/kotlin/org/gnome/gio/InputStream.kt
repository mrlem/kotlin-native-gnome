// TODO - method: close
// TODO - method: close_async
// TODO - method: close_finish
// TODO - method: read
// TODO - method: read_all
// TODO - method: read_all_async
// TODO - method: read_all_finish
// TODO - method: read_async
// TODO - method: read_bytes
// TODO - method: read_bytes_async
// TODO - method: read_bytes_finish
// TODO - method: read_finish
// TODO - method: skip
// TODO - method: skip_async
// TODO - method: skip_finish
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GError
import interop.GInputStream
import interop.g_input_stream_clear_pending
import interop.g_input_stream_has_pending
import interop.g_input_stream_is_closed
import interop.g_input_stream_set_pending
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

public typealias InputStream = CPointer<GInputStream>

public val InputStream.asObject: Object
  get() = reinterpret()

public fun InputStream.clearPending(): Unit {
  g_input_stream_clear_pending(this)
}

public fun InputStream.hasPending(): Boolean = g_input_stream_has_pending(this).toBoolean

public fun InputStream.isClosed(): Boolean = g_input_stream_is_closed(this).toBoolean

@Throws(Error::class)
public fun InputStream.setPending(): Boolean = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Boolean = g_input_stream_set_pending(this@setPending, errors).toBoolean
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}
