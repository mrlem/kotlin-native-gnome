@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkArrowAccessible
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias ArrowAccessible = CPointer<GtkArrowAccessible>

public val ArrowAccessible.asObject: Object
  get() = reinterpret()

public val ArrowAccessible.asAtkObject: org.gnome.atk.Object
  get() = reinterpret()

public val ArrowAccessible.asAccessible: Accessible
  get() = reinterpret()

public val ArrowAccessible.asWidgetAccessible: WidgetAccessible
  get() = reinterpret()

public val ArrowAccessible.parent: WidgetAccessible
  get() = pointed.parent.ptr
