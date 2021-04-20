package org.gnome.gtk

import gtk3.GtkImageCellAccessible
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias ImageCellAccessible = CPointer<GtkImageCellAccessible>

public val ImageCellAccessible.asObject: Object
  get() = reinterpret()

public val ImageCellAccessible.asAtkObject: org.gnome.atk.Object
  get() = reinterpret()

public val ImageCellAccessible.asAccessible: Accessible
  get() = reinterpret()

public val ImageCellAccessible.asCellAccessible: CellAccessible
  get() = reinterpret()

public val ImageCellAccessible.asRendererCellAccessible: RendererCellAccessible
  get() = reinterpret()
