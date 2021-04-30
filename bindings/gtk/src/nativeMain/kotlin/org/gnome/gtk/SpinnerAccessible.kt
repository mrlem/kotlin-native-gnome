@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkSpinnerAccessible
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias SpinnerAccessible = CPointer<GtkSpinnerAccessible>

public val SpinnerAccessible.asObject: Object
  get() = reinterpret()

public val SpinnerAccessible.asAtkObject: org.gnome.atk.Object
  get() = reinterpret()

public val SpinnerAccessible.asAccessible: Accessible
  get() = reinterpret()

public val SpinnerAccessible.asWidgetAccessible: WidgetAccessible
  get() = reinterpret()

public val SpinnerAccessible.parent: WidgetAccessible
  get() = pointed.parent.ptr
