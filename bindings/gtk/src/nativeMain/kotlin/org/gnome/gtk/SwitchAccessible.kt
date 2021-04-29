@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkSwitchAccessible
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias SwitchAccessible = CPointer<GtkSwitchAccessible>

public val SwitchAccessible.asObject: Object
  get() = reinterpret()

public val SwitchAccessible.asAtkObject: org.gnome.atk.Object
  get() = reinterpret()

public val SwitchAccessible.asAccessible: Accessible
  get() = reinterpret()

public val SwitchAccessible.asWidgetAccessible: WidgetAccessible
  get() = reinterpret()
