@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType","FunctionName")

package org.gnome.gtk

import gtk3.GtkToggleButtonAccessible
import kotlinx.cinterop.CPointer
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
