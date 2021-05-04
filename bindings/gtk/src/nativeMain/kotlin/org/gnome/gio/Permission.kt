// TODO - method: acquire_async (param type)
// TODO - method: release_async (param type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GError
import interop.GPermission
import interop.g_permission_acquire
import interop.g_permission_acquire_finish
import interop.g_permission_get_allowed
import interop.g_permission_get_can_acquire
import interop.g_permission_get_can_release
import interop.g_permission_impl_update
import interop.g_permission_release
import interop.g_permission_release_finish
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
import org.gnome.toInt

public typealias Permission = CPointer<GPermission>

public val Permission.asObject: Object
  get() = reinterpret()

public val Permission.parentInstance: Object
  get() = pointed.parent_instance.ptr

public val Permission.allowed: Boolean
  get() = g_permission_get_allowed(this).toBoolean()

public val Permission.canAcquire: Boolean
  get() = g_permission_get_can_acquire(this).toBoolean()

public val Permission.canRelease: Boolean
  get() = g_permission_get_can_release(this).toBoolean()

@Throws(Error::class)
public fun Permission.acquire(cancellable: Cancellable?): Boolean = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Boolean = g_permission_acquire(this@acquire, cancellable?.reinterpret(),
      errors).toBoolean()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun Permission.acquireFinish(result: AsyncResult?): Boolean = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Boolean = g_permission_acquire_finish(this@acquireFinish, result?.reinterpret(),
      errors).toBoolean()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

public fun Permission.implUpdate(
  allowed: Boolean,
  canAcquire: Boolean,
  canRelease: Boolean
): Unit {
  g_permission_impl_update(this@implUpdate, allowed.toInt(), canAcquire.toInt(), canRelease.toInt())
}

@Throws(Error::class)
public fun Permission.release(cancellable: Cancellable?): Boolean = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Boolean = g_permission_release(this@release, cancellable?.reinterpret(),
      errors).toBoolean()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun Permission.releaseFinish(result: AsyncResult?): Boolean = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Boolean = g_permission_release_finish(this@releaseFinish, result?.reinterpret(),
      errors).toBoolean()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}
