@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkStackAccessible
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias StackAccessible = CPointer<GtkStackAccessible>

public val StackAccessible.asObject: Object
  get() = reinterpret()

public val StackAccessible.asAtkObject: org.gnome.atk.Object
  get() = reinterpret()

public val StackAccessible.asAccessible: Accessible
  get() = reinterpret()

public val StackAccessible.asWidgetAccessible: WidgetAccessible
  get() = reinterpret()

public val StackAccessible.asContainerAccessible: ContainerAccessible
  get() = reinterpret()

public val StackAccessible.parent: ContainerAccessible
  get() = pointed.parent.ptr
