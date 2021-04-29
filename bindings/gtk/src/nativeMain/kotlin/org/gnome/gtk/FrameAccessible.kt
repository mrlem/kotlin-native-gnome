@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkFrameAccessible
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias FrameAccessible = CPointer<GtkFrameAccessible>

public val FrameAccessible.asObject: Object
  get() = reinterpret()

public val FrameAccessible.asAtkObject: org.gnome.atk.Object
  get() = reinterpret()

public val FrameAccessible.asAccessible: Accessible
  get() = reinterpret()

public val FrameAccessible.asWidgetAccessible: WidgetAccessible
  get() = reinterpret()

public val FrameAccessible.asContainerAccessible: ContainerAccessible
  get() = reinterpret()
