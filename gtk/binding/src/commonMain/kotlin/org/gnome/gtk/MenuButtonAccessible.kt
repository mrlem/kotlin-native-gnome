@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType","FunctionName")

package org.gnome.gtk

import gtk3.GtkMenuButtonAccessible
import kotlinx.cinterop.CPointer
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
