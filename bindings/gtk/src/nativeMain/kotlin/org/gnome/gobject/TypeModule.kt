// TODO - field: type_infos
// TODO - field: interface_infos
// TODO - method: add_interface
// TODO - method: register_enum
// TODO - method: register_flags
// TODO - method: register_type
// TODO - method: set_name
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gobject

import interop.GTypeModule
import interop.g_type_module_unuse
import interop.g_type_module_use
import kotlin.Boolean
import kotlin.String
import kotlin.UInt
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.toBoolean
import org.gnome.toKString

public typealias TypeModule = CPointer<GTypeModule>

public val TypeModule.asObject: Object
  get() = reinterpret()

public val TypeModule.parentInstance: Object
  get() = pointed.parent_instance.ptr

public val TypeModule.useCount: UInt
  get() = pointed.use_count

public val TypeModule.name: String
  get() = pointed.name.toKString

public fun TypeModule.unuse(): Unit {
  g_type_module_unuse(this)
}

public fun TypeModule.use(): Boolean = g_type_module_use(this).toBoolean
