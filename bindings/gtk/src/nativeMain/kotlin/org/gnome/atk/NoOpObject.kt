@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.atk

import interop.AtkNoOpObject
import interop.atk_no_op_object_new
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret

public typealias NoOpObject = CPointer<AtkNoOpObject>

public val NoOpObject.asObject: org.gnome.gobject.Object
  get() = reinterpret()

public val NoOpObject.asAtkObject: Object
  get() = reinterpret()

public object NoOpObjectFactory {
  public fun new(obj: org.gnome.gobject.Object?): NoOpObject =
      atk_no_op_object_new(obj?.reinterpret())!!.reinterpret()
}

public val NoOpObject.parent: Object
  get() = pointed.parent.ptr
