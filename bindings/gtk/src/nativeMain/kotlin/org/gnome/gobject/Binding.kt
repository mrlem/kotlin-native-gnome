@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gobject

import interop.GBinding
import interop.g_binding_get_flags
import interop.g_binding_get_source
import interop.g_binding_get_source_property
import interop.g_binding_get_target
import interop.g_binding_get_target_property
import interop.g_binding_unbind
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.toKString

public typealias Binding = CPointer<GBinding>

public val Binding.asObject: Object
  get() = reinterpret()

public val Binding.flags: BindingFlags
  get() = g_binding_get_flags(this)

public val Binding.source: Object?
  get() = g_binding_get_source(this)?.reinterpret()

public val Binding.sourceProperty: String
  get() = g_binding_get_source_property(this).toKString()

public val Binding.target: Object?
  get() = g_binding_get_target(this)?.reinterpret()

public val Binding.targetProperty: String
  get() = g_binding_get_target_property(this).toKString()

public fun Binding.unbind(): Unit {
  g_binding_unbind(this)
}
