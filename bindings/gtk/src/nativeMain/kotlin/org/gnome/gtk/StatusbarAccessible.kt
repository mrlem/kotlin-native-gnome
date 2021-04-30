@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkStatusbarAccessible
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias StatusbarAccessible = CPointer<GtkStatusbarAccessible>

public val StatusbarAccessible.asObject: Object
  get() = reinterpret()

public val StatusbarAccessible.asAtkObject: org.gnome.atk.Object
  get() = reinterpret()

public val StatusbarAccessible.asAccessible: Accessible
  get() = reinterpret()

public val StatusbarAccessible.asWidgetAccessible: WidgetAccessible
  get() = reinterpret()

public val StatusbarAccessible.asContainerAccessible: ContainerAccessible
  get() = reinterpret()

public val StatusbarAccessible.parent: ContainerAccessible
  get() = pointed.parent.ptr
