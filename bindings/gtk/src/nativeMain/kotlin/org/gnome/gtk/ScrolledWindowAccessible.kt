@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkScrolledWindowAccessible
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias ScrolledWindowAccessible = CPointer<GtkScrolledWindowAccessible>

public val ScrolledWindowAccessible.asObject: Object
  get() = reinterpret()

public val ScrolledWindowAccessible.asAtkObject: org.gnome.atk.Object
  get() = reinterpret()

public val ScrolledWindowAccessible.asAccessible: Accessible
  get() = reinterpret()

public val ScrolledWindowAccessible.asWidgetAccessible: WidgetAccessible
  get() = reinterpret()

public val ScrolledWindowAccessible.asContainerAccessible: ContainerAccessible
  get() = reinterpret()

public val ScrolledWindowAccessible.parent: ContainerAccessible
  get() = pointed.parent.ptr
