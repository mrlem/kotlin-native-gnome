@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkRangeAccessible
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias RangeAccessible = CPointer<GtkRangeAccessible>

public val RangeAccessible.asObject: Object
  get() = reinterpret()

public val RangeAccessible.asAtkObject: org.gnome.atk.Object
  get() = reinterpret()

public val RangeAccessible.asAccessible: Accessible
  get() = reinterpret()

public val RangeAccessible.asWidgetAccessible: WidgetAccessible
  get() = reinterpret()
