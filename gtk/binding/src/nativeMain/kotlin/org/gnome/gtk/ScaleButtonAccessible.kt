@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkScaleButtonAccessible
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias ScaleButtonAccessible = CPointer<GtkScaleButtonAccessible>

public val ScaleButtonAccessible.asObject: Object
  get() = reinterpret()

public val ScaleButtonAccessible.asAtkObject: org.gnome.atk.Object
  get() = reinterpret()

public val ScaleButtonAccessible.asAccessible: Accessible
  get() = reinterpret()

public val ScaleButtonAccessible.asWidgetAccessible: WidgetAccessible
  get() = reinterpret()

public val ScaleButtonAccessible.asContainerAccessible: ContainerAccessible
  get() = reinterpret()

public val ScaleButtonAccessible.asButtonAccessible: ButtonAccessible
  get() = reinterpret()
