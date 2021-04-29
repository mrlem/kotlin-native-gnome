@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkLinkButtonAccessible
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias LinkButtonAccessible = CPointer<GtkLinkButtonAccessible>

public val LinkButtonAccessible.asObject: Object
  get() = reinterpret()

public val LinkButtonAccessible.asAtkObject: org.gnome.atk.Object
  get() = reinterpret()

public val LinkButtonAccessible.asAccessible: Accessible
  get() = reinterpret()

public val LinkButtonAccessible.asWidgetAccessible: WidgetAccessible
  get() = reinterpret()

public val LinkButtonAccessible.asContainerAccessible: ContainerAccessible
  get() = reinterpret()

public val LinkButtonAccessible.asButtonAccessible: ButtonAccessible
  get() = reinterpret()
