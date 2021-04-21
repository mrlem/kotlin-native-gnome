@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType","FunctionName")

package org.gnome.gtk

import gtk3.GtkContainerAccessible
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias ContainerAccessible = CPointer<GtkContainerAccessible>

public val ContainerAccessible.asObject: Object
  get() = reinterpret()

public val ContainerAccessible.asAtkObject: org.gnome.atk.Object
  get() = reinterpret()

public val ContainerAccessible.asAccessible: Accessible
  get() = reinterpret()

public val ContainerAccessible.asWidgetAccessible: WidgetAccessible
  get() = reinterpret()
