@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.atk

import interop.AtkObjectFactory
import interop.GType
import interop.atk_object_factory_create_accessible
import interop.atk_object_factory_get_accessible_type
import interop.atk_object_factory_invalidate
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret

public typealias ObjectFactory = CPointer<AtkObjectFactory>

public val ObjectFactory.asObject: org.gnome.gobject.Object
  get() = reinterpret()

public val ObjectFactory.parent: org.gnome.gobject.Object
  get() = pointed.parent.ptr

public val ObjectFactory.accessibleType: GType
  get() = atk_object_factory_get_accessible_type(this)

public fun ObjectFactory.createAccessible(obj: org.gnome.gobject.Object?): Object? =
    atk_object_factory_create_accessible(this@createAccessible, obj?.reinterpret())?.reinterpret()

public fun ObjectFactory.invalidate(): Unit {
  atk_object_factory_invalidate(this@invalidate)
}
