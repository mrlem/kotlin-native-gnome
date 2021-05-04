@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gio

import interop.GSimpleActionGroup
import interop.g_simple_action_group_new
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias SimpleActionGroup = CPointer<GSimpleActionGroup>

public val SimpleActionGroup.asObject: Object
  get() = reinterpret()

public object SimpleActionGroupFactory {
  public fun new(): SimpleActionGroup = g_simple_action_group_new()!!.reinterpret()
}

public val SimpleActionGroup.parentInstance: Object
  get() = pointed.parent_instance.ptr
