@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkScaleAccessible
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias ScaleAccessible = CPointer<GtkScaleAccessible>

public val ScaleAccessible.asObject: Object
  get() = reinterpret()

public val ScaleAccessible.asAtkObject: org.gnome.atk.Object
  get() = reinterpret()

public val ScaleAccessible.asAccessible: Accessible
  get() = reinterpret()

public val ScaleAccessible.asWidgetAccessible: WidgetAccessible
  get() = reinterpret()

public val ScaleAccessible.asRangeAccessible: RangeAccessible
  get() = reinterpret()

public val ScaleAccessible.parent: RangeAccessible
  get() = pointed.parent.ptr
