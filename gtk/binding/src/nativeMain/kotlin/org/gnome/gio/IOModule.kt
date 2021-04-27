// TODO - constructor: new
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GIOModule
import interop.g_io_module_load
import interop.g_io_module_unload
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.gobject.TypeModule

public typealias IOModule = CPointer<GIOModule>

public val IOModule.asObject: Object
  get() = reinterpret()

public val IOModule.asTypeModule: TypeModule
  get() = reinterpret()

public object IOModuleFactory

public fun IOModule.load(): Unit {
  g_io_module_load(this)
}

public fun IOModule.unload(): Unit {
  g_io_module_unload(this)
}
