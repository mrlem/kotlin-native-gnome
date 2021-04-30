// TODO - method: acquire
// TODO - method: acquire_async
// TODO - method: acquire_finish
// TODO - method: impl_update
// TODO - method: release
// TODO - method: release_async
// TODO - method: release_finish
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GPermission
import interop.g_permission_get_allowed
import interop.g_permission_get_can_acquire
import interop.g_permission_get_can_release
import kotlin.Boolean
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toBoolean

public typealias Permission = CPointer<GPermission>

public val Permission.asObject: Object
  get() = reinterpret()

public val Permission.parentInstance: Object
  get() = pointed.parent_instance.ptr

public val Permission.allowed: Boolean
  get() = g_permission_get_allowed(this).toBoolean

public val Permission.canAcquire: Boolean
  get() = g_permission_get_can_acquire(this).toBoolean

public val Permission.canRelease: Boolean
  get() = g_permission_get_can_release(this).toBoolean
