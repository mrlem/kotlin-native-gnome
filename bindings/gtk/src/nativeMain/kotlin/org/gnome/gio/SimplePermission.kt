// TODO - constructor: new
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GSimplePermission
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias SimplePermission = CPointer<GSimplePermission>

public val SimplePermission.asObject: Object
  get() = reinterpret()

public val SimplePermission.asPermission: Permission
  get() = reinterpret()

public object SimplePermissionFactory
