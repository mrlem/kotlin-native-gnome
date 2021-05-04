// TODO - field: factory_type_registry
// TODO - field: factory_singleton_cache
// TODO - method: get_factory
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.atk

import interop.AtkRegistry
import interop.GType
import interop.atk_registry_get_factory_type
import interop.atk_registry_set_factory_type
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias Registry = CPointer<AtkRegistry>

public val Registry.asObject: Object
  get() = reinterpret()

public val Registry.parent: Object
  get() = pointed.parent.ptr

public fun Registry.getFactoryType(type: GType): GType =
    atk_registry_get_factory_type(this@getFactoryType, type)

public fun Registry.setFactoryType(type: GType, factoryType: GType): Unit {
  atk_registry_set_factory_type(this@setFactoryType, type, factoryType)
}
