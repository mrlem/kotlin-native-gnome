@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import gtk3.GtkImageAccessible
import kotlinx.cinterop.CPointer
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
