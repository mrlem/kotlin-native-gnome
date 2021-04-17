// TODO - implement:
//   set_fixed_height_from_font
package org.gnome.gtk

import gtk3.GtkCellRendererText
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned
import org.gnome.glib.gobject.Object

public typealias CellRendererText = CPointer<GtkCellRendererText>

public val CellRendererText.asObject: Object
  get() = reinterpret()

public val CellRendererText.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val CellRendererText.asCellRenderer: CellRenderer
  get() = reinterpret()
