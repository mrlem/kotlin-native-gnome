@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkButtonAccessible
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias ButtonAccessible = CPointer<GtkButtonAccessible>

public val ButtonAccessible.asObject: Object
  get() = reinterpret()

public val ButtonAccessible.asAtkObject: org.gnome.atk.Object
  get() = reinterpret()

public val ButtonAccessible.asAccessible: Accessible
  get() = reinterpret()

public val ButtonAccessible.asWidgetAccessible: WidgetAccessible
  get() = reinterpret()

public val ButtonAccessible.asContainerAccessible: ContainerAccessible
  get() = reinterpret()

public val ButtonAccessible.parent: ContainerAccessible
  get() = pointed.parent.ptr
