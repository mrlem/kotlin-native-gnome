@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkToggleButtonAccessible
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias ToggleButtonAccessible = CPointer<GtkToggleButtonAccessible>

public val ToggleButtonAccessible.asObject: Object
  get() = reinterpret()

public val ToggleButtonAccessible.asAtkObject: org.gnome.atk.Object
  get() = reinterpret()

public val ToggleButtonAccessible.asAccessible: Accessible
  get() = reinterpret()

public val ToggleButtonAccessible.asWidgetAccessible: WidgetAccessible
  get() = reinterpret()

public val ToggleButtonAccessible.asContainerAccessible: ContainerAccessible
  get() = reinterpret()

public val ToggleButtonAccessible.asButtonAccessible: ButtonAccessible
  get() = reinterpret()

public val ToggleButtonAccessible.parent: ButtonAccessible
  get() = pointed.parent.ptr
