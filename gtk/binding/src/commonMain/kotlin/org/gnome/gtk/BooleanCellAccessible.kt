package org.gnome.gtk

import gtk3.GtkBooleanCellAccessible
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias BooleanCellAccessible = CPointer<GtkBooleanCellAccessible>

public val BooleanCellAccessible.asObject: Object
  get() = reinterpret()

public val BooleanCellAccessible.asAtkObject: org.gnome.atk.Object
  get() = reinterpret()

public val BooleanCellAccessible.asAccessible: Accessible
  get() = reinterpret()

public val BooleanCellAccessible.asCellAccessible: CellAccessible
  get() = reinterpret()

public val BooleanCellAccessible.asRendererCellAccessible: RendererCellAccessible
  get() = reinterpret()
