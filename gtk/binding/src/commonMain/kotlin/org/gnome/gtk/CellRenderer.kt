// TODO - method: activate
// TODO - method: get_aligned_area
// TODO - method: get_alignment
// TODO - method: get_fixed_size
// TODO - method: get_padding
// TODO - method: get_preferred_height
// TODO - method: get_preferred_height_for_width
// TODO - method: get_preferred_size
// TODO - method: get_preferred_width
// TODO - method: get_preferred_width_for_height
// TODO - method: get_size
// TODO - method: render
// TODO - method: start_editing
// TODO - signal: editing-canceled
// TODO - signal: editing-started
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import gtk3.GtkCellRenderer
import gtk3.gtk_cell_renderer_get_request_mode
import gtk3.gtk_cell_renderer_get_sensitive
import gtk3.gtk_cell_renderer_get_state
import gtk3.gtk_cell_renderer_get_visible
import gtk3.gtk_cell_renderer_is_activatable
import gtk3.gtk_cell_renderer_set_alignment
import gtk3.gtk_cell_renderer_set_fixed_size
import gtk3.gtk_cell_renderer_set_padding
import gtk3.gtk_cell_renderer_set_sensitive
import gtk3.gtk_cell_renderer_set_visible
import gtk3.gtk_cell_renderer_stop_editing
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt

public typealias CellRenderer = CPointer<GtkCellRenderer>

public val CellRenderer.asObject: Object
  get() = reinterpret()

public val CellRenderer.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val CellRenderer.requestMode: SizeRequestMode
  get() = gtk_cell_renderer_get_request_mode(this)

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

public fun CellRenderer.getState(widget: Widget?, cellState: CellRendererState): StateFlags =
    gtk_cell_renderer_get_state(this, widget?.reinterpret(), cellState)

public fun CellRenderer.isActivatable(): Boolean = gtk_cell_renderer_is_activatable(this).toBoolean

public fun CellRenderer.setAlignment(xalign: Float, yalign: Float): Unit {
  gtk_cell_renderer_set_alignment(this, xalign, yalign)
}

public fun CellRenderer.setFixedSize(width: Int, height: Int): Unit {
  gtk_cell_renderer_set_fixed_size(this, width, height)
}

public fun CellRenderer.setPadding(xpad: Int, ypad: Int): Unit {
  gtk_cell_renderer_set_padding(this, xpad, ypad)
}

public fun CellRenderer.stopEditing(canceled: Boolean): Unit {
  gtk_cell_renderer_stop_editing(this, canceled.toInt)
}
