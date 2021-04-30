@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkContainerAccessible
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
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

public val ContainerAccessible.parent: WidgetAccessible
  get() = pointed.parent.ptr
