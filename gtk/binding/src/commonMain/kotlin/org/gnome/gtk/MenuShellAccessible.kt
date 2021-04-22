@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import gtk3.GtkMenuShellAccessible
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias MenuShellAccessible = CPointer<GtkMenuShellAccessible>

public val MenuShellAccessible.asObject: Object
  get() = reinterpret()

public val MenuShellAccessible.asAtkObject: org.gnome.atk.Object
  get() = reinterpret()

public val MenuShellAccessible.asAccessible: Accessible
  get() = reinterpret()

public val MenuShellAccessible.asWidgetAccessible: WidgetAccessible
  get() = reinterpret()

public val MenuShellAccessible.asContainerAccessible: ContainerAccessible
  get() = reinterpret()
