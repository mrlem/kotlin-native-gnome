@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType","FunctionName")

package org.gnome.gtk

import gtk3.GtkArrowAccessible
import kotlinx.cinterop.CPointer
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
