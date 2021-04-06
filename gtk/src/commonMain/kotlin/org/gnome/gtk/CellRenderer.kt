// TODO - implement:
//   activate
//   get_aligned_area
//   get_alignment
//   get_fixed_size
//   get_padding
//   get_preferred_height
//   get_preferred_height_for_width
//   get_preferred_size
//   get_preferred_width
//   get_preferred_width_for_height
//   get_request_mode
//   get_size
//   get_state
//   is_activatable
//   render
//   set_alignment
//   set_fixed_size
//   set_padding
//   start_editing
//   stop_editing
package org.gnome.gtk

import gtk3.GtkCellRenderer
import gtk3.gtk_cell_renderer_get_sensitive
import gtk3.gtk_cell_renderer_get_visible
import gtk3.gtk_cell_renderer_set_sensitive
import gtk3.gtk_cell_renderer_set_visible
import kotlin.Boolean
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned
import org.gnome.glib.toBoolean
import org.gnome.glib.toInt

public typealias CellRenderer = CPointer<GtkCellRenderer>

public val CellRenderer.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public var CellRenderer.sensitive: Boolean
  get() = gtk_cell_renderer_get_sensitive(this).toBoolean
  set(`value`) {
    gtk_cell_renderer_set_sensitive(this, value.toInt)
  }

public var CellRenderer.visible: Boolean
  get() = gtk_cell_renderer_get_visible(this).toBoolean
  set(`value`) {
    gtk_cell_renderer_set_visible(this, value.toInt)
  }
