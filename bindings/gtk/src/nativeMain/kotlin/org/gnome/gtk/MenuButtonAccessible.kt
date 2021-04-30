@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkMenuButtonAccessible
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias MenuButtonAccessible = CPointer<GtkMenuButtonAccessible>

public val MenuButtonAccessible.asObject: Object
  get() = reinterpret()

public val MenuButtonAccessible.asAtkObject: org.gnome.atk.Object
  get() = reinterpret()

public val MenuButtonAccessible.asAccessible: Accessible
  get() = reinterpret()

public val MenuButtonAccessible.asWidgetAccessible: WidgetAccessible
  get() = reinterpret()

public val MenuButtonAccessible.asContainerAccessible: ContainerAccessible
  get() = reinterpret()

public val MenuButtonAccessible.asButtonAccessible: ButtonAccessible
  get() = reinterpret()

public val MenuButtonAccessible.asToggleButtonAccessible: ToggleButtonAccessible
  get() = reinterpret()

public val MenuButtonAccessible.parent: ToggleButtonAccessible
  get() = pointed.parent.ptr
