// TODO - method: connect
// TODO - method: make_pollfd
// TODO - method: source_new
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GCancellable
import interop.GError
import interop.g_cancellable_cancel
import interop.g_cancellable_disconnect
import interop.g_cancellable_get_fd
import interop.g_cancellable_is_cancelled
import interop.g_cancellable_new
import interop.g_cancellable_pop_current
import interop.g_cancellable_push_current
import interop.g_cancellable_release_fd
import interop.g_cancellable_reset
import interop.g_cancellable_set_error_if_cancelled
import kotlin.Boolean
import kotlin.Int
import kotlin.Throws
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
import org.mrlem.gnome.gobject.connect

public typealias Cancellable = CPointer<GCancellable>

public val Cancellable.asObject: Object
  get() = reinterpret()

public object CancellableFactory {
  public fun new(): Cancellable = g_cancellable_new()!!.reinterpret()
}

public val Cancellable.parentInstance: Object
  get() = pointed.parent_instance.ptr

public val Cancellable.fd: Int
  get() = g_cancellable_get_fd(this)

public fun Cancellable.cancel(): Unit {
  g_cancellable_cancel(this)
}

public fun Cancellable.disconnect(handlerId: ULong): Unit {
  g_cancellable_disconnect(this, handlerId)
}

public fun Cancellable.isCancelled(): Boolean = g_cancellable_is_cancelled(this).toBoolean

public fun Cancellable.popCurrent(): Unit {
  g_cancellable_pop_current(this)
}

public fun Cancellable.pushCurrent(): Unit {
  g_cancellable_push_current(this)
}

public fun Cancellable.releaseFd(): Unit {
  g_cancellable_release_fd(this)
}

public fun Cancellable.reset(): Unit {
  g_cancellable_reset(this)
}

@Throws(Error::class)
public fun Cancellable.setErrorIfCancelled(): Boolean = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Boolean = g_cancellable_set_error_if_cancelled(this@setErrorIfCancelled,
      errors).toBoolean
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

public fun Cancellable.onCancelled(callback: (Cancellable) -> Unit): Cancellable {
  // TODO - handle callback data

  asObject.connect("cancelled") { callback(this) }
  return this
}
