@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkWindowAccessible
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias WindowAccessible = CPointer<GtkWindowAccessible>

public val WindowAccessible.asObject: Object
  get() = reinterpret()

public val WindowAccessible.asAtkObject: org.gnome.atk.Object
  get() = reinterpret()

public val WindowAccessible.asAccessible: Accessible
  get() = reinterpret()

public val WindowAccessible.asWidgetAccessible: WidgetAccessible
  get() = reinterpret()

public val WindowAccessible.asContainerAccessible: ContainerAccessible
  get() = reinterpret()
