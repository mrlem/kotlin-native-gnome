@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkRadioButtonAccessible
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias RadioButtonAccessible = CPointer<GtkRadioButtonAccessible>

public val RadioButtonAccessible.asObject: Object
  get() = reinterpret()

public val RadioButtonAccessible.asAtkObject: org.gnome.atk.Object
  get() = reinterpret()

public val RadioButtonAccessible.asAccessible: Accessible
  get() = reinterpret()

public val RadioButtonAccessible.asWidgetAccessible: WidgetAccessible
  get() = reinterpret()

public val RadioButtonAccessible.asContainerAccessible: ContainerAccessible
  get() = reinterpret()

public val RadioButtonAccessible.asButtonAccessible: ButtonAccessible
  get() = reinterpret()

public val RadioButtonAccessible.asToggleButtonAccessible: ToggleButtonAccessible
  get() = reinterpret()
