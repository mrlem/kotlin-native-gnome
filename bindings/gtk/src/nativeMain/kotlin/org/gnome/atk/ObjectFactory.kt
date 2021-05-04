// TODO - method: create_accessible
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.atk

import interop.AtkObjectFactory
import interop.GType
import interop.atk_object_factory_get_accessible_type
import interop.atk_object_factory_invalidate
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias ObjectFactory = CPointer<AtkObjectFactory>

public val ObjectFactory.asObject: Object
  get() = reinterpret()

public val ObjectFactory.parent: Object
  get() = pointed.parent.ptr

public val ObjectFactory.accessibleType: GType
  get() = atk_object_factory_get_accessible_type(this)

public fun ObjectFactory.invalidate(): Unit {
  atk_object_factory_invalidate(this@invalidate)
}
