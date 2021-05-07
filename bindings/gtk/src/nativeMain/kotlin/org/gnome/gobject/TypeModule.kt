@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gobject

import interop.GType
import interop.GTypeModule
import interop.g_type_module_add_interface
import interop.g_type_module_register_enum
import interop.g_type_module_register_flags
import interop.g_type_module_register_type
import interop.g_type_module_set_name
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
import org.gnome.glib.SList
import org.gnome.toBoolean
import org.gnome.toKString

public typealias TypeModule = CPointer<GTypeModule>

public val TypeModule.asObject: Object
  get() = reinterpret()

public val TypeModule.parentInstance: Object
  get() = pointed.parent_instance.ptr

public val TypeModule.useCount: UInt
  get() = pointed.use_count

public val TypeModule.typeInfos: SList?
  get() = pointed.type_infos

public val TypeModule.interfaceInfos: SList?
  get() = pointed.interface_infos

public val TypeModule.name: String
  get() = pointed.name.toKString()

public fun TypeModule.addInterface(
  instanceType: GType,
  interfaceType: GType,
  interfaceInfo: InterfaceInfo?
): Unit {
  g_type_module_add_interface(this@addInterface, instanceType, interfaceType,
      interfaceInfo?.reinterpret())
}

public fun TypeModule.registerEnum(name: String?, constStaticValues: EnumValue?): GType =
    g_type_module_register_enum(this@registerEnum, name, constStaticValues?.reinterpret())

public fun TypeModule.registerFlags(name: String?, constStaticValues: FlagsValue?): GType =
    g_type_module_register_flags(this@registerFlags, name, constStaticValues?.reinterpret())

public fun TypeModule.registerType(
  parentType: GType,
  typeName: String?,
  typeInfo: TypeInfo?,
  flags: TypeFlags
): GType = g_type_module_register_type(this@registerType, parentType, typeName,
    typeInfo?.reinterpret(), flags)

public fun TypeModule.setName(name: String?): Unit {
  g_type_module_set_name(this@setName, name)
}

public fun TypeModule.unuse(): Unit {
  g_type_module_unuse(this@unuse)
}

public fun TypeModule.use(): Boolean = g_type_module_use(this@use).toBoolean()
