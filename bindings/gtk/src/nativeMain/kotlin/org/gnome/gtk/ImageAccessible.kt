@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkImageAccessible
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias ImageAccessible = CPointer<GtkImageAccessible>

public val ImageAccessible.asObject: Object
  get() = reinterpret()

public val ImageAccessible.asAtkObject: org.gnome.atk.Object
  get() = reinterpret()

public val ImageAccessible.asAccessible: Accessible
  get() = reinterpret()

public val ImageAccessible.asWidgetAccessible: WidgetAccessible
  get() = reinterpret()

public val ImageAccessible.parent: WidgetAccessible
  get() = pointed.parent.ptr
