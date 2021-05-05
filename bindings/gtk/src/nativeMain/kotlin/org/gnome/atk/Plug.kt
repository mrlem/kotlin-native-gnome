@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.atk

import interop.AtkPlug
import interop.atk_plug_get_id
import interop.atk_plug_new
import interop.atk_plug_set_child
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.toKString

public typealias Plug = CPointer<AtkPlug>

public val Plug.asObject: org.gnome.gobject.Object
  get() = reinterpret()

public val Plug.asAtkObject: Object
  get() = reinterpret()

public object PlugFactory {
  public fun new(): Plug = atk_plug_new()!!.reinterpret()
}

public val Plug.parent: Object
  get() = pointed.parent.ptr

public val Plug.id: String?
  get() = atk_plug_get_id(this).toKString()

public fun Plug.setChild(child: Object?): Unit {
  atk_plug_set_child(this@setChild, child?.reinterpret())
}
