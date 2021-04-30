@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkCellAccessible
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias CellAccessible = CPointer<GtkCellAccessible>

public val CellAccessible.asObject: Object
  get() = reinterpret()

public val CellAccessible.asAtkObject: org.gnome.atk.Object
  get() = reinterpret()

public val CellAccessible.asAccessible: Accessible
  get() = reinterpret()

public val CellAccessible.parent: Accessible
  get() = pointed.parent.ptr
