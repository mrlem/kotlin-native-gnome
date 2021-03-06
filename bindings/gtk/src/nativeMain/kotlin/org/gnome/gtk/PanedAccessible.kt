@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkPanedAccessible
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias PanedAccessible = CPointer<GtkPanedAccessible>

public val PanedAccessible.asObject: Object
  get() = reinterpret()

public val PanedAccessible.asAtkObject: org.gnome.atk.Object
  get() = reinterpret()

public val PanedAccessible.asAccessible: Accessible
  get() = reinterpret()

public val PanedAccessible.asWidgetAccessible: WidgetAccessible
  get() = reinterpret()

public val PanedAccessible.asContainerAccessible: ContainerAccessible
  get() = reinterpret()

public val PanedAccessible.parent: ContainerAccessible
  get() = pointed.parent.ptr
