@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType","FunctionName")

package org.gnome.gtk

import gtk3.GtkCellAccessible
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias CellAccessible = CPointer<GtkCellAccessible>

public val CellAccessible.asObject: Object
  get() = reinterpret()

public val CellAccessible.asAtkObject: org.gnome.atk.Object
  get() = reinterpret()

public val CellAccessible.asAccessible: Accessible
  get() = reinterpret()
