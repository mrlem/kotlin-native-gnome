@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkWidgetAccessible
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias WidgetAccessible = CPointer<GtkWidgetAccessible>

public val WidgetAccessible.asObject: Object
  get() = reinterpret()

public val WidgetAccessible.asAtkObject: org.gnome.atk.Object
  get() = reinterpret()

public val WidgetAccessible.asAccessible: Accessible
  get() = reinterpret()

public val WidgetAccessible.parent: Accessible
  get() = pointed.parent.ptr
