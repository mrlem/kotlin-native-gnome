package org.gnome.gtk

import gtk3.GtkRendererCellAccessible
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias RendererCellAccessible = CPointer<GtkRendererCellAccessible>

public val RendererCellAccessible.asObject: Object
  get() = reinterpret()

public val RendererCellAccessible.asAtkObject: org.gnome.atk.Object
  get() = reinterpret()

public val RendererCellAccessible.asAccessible: Accessible
  get() = reinterpret()

public val RendererCellAccessible.asCellAccessible: CellAccessible
  get() = reinterpret()
