@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GSimplePermission
import interop.g_simple_permission_new
import kotlin.Boolean
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toInt

public typealias SimplePermission = CPointer<GSimplePermission>

public val SimplePermission.asObject: Object
  get() = reinterpret()

public val SimplePermission.asPermission: Permission
  get() = reinterpret()

public object SimplePermissionFactory {
  public fun new(allowed: Boolean): SimplePermission =
      g_simple_permission_new(allowed.toInt())!!.reinterpret()
}
