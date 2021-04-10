package org.gnome.gtk

import gtk3.GtkCellRendererSpinner
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned
import org.gnome.glib.gobject.Object

public typealias CellRendererSpinner = CPointer<GtkCellRendererSpinner>

public val CellRendererSpinner.asObject: Object
  get() = reinterpret()

public val CellRendererSpinner.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val CellRendererSpinner.asCellRenderer: CellRenderer
  get() = reinterpret()
