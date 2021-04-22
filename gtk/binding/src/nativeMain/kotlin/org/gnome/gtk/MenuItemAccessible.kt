@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkMenuItemAccessible
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias MenuItemAccessible = CPointer<GtkMenuItemAccessible>

public val MenuItemAccessible.asObject: Object
  get() = reinterpret()

public val MenuItemAccessible.asAtkObject: org.gnome.atk.Object
  get() = reinterpret()

public val MenuItemAccessible.asAccessible: Accessible
  get() = reinterpret()

public val MenuItemAccessible.asWidgetAccessible: WidgetAccessible
  get() = reinterpret()

public val MenuItemAccessible.asContainerAccessible: ContainerAccessible
  get() = reinterpret()
