// TODO - method: get_aligned_area (param type)
// TODO - method: get_alignment (param type)
// TODO - method: get_fixed_size (param type)
// TODO - method: get_padding (param type)
// TODO - method: get_preferred_height (param type)
// TODO - method: get_preferred_height_for_width (param type)
// TODO - method: get_preferred_size (param type)
// TODO - method: get_preferred_width (param type)
// TODO - method: get_preferred_width_for_height (param type)
// TODO - method: render (param type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkCellRenderer
import interop.gtk_cell_renderer_activate
import interop.gtk_cell_renderer_get_request_mode
import interop.gtk_cell_renderer_get_sensitive
import interop.gtk_cell_renderer_get_state
import interop.gtk_cell_renderer_get_visible
import interop.gtk_cell_renderer_is_activatable
import interop.gtk_cell_renderer_set_alignment
import interop.gtk_cell_renderer_set_fixed_size
import interop.gtk_cell_renderer_set_padding
import interop.gtk_cell_renderer_set_sensitive
import interop.gtk_cell_renderer_set_visible
import interop.gtk_cell_renderer_start_editing
import interop.gtk_cell_renderer_stop_editing
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gdk.Event
import org.gnome.gdk.Rectangle
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt
import org.mrlem.gnome.gobject.connect

public typealias CellRenderer = CPointer<GtkCellRenderer>

public val CellRenderer.asObject: Object
  get() = reinterpret()

public val CellRenderer.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val CellRenderer.parentInstance: InitiallyUnowned
  get() = pointed.parent_instance.ptr

public val CellRenderer.requestMode: SizeRequestMode
  get() = gtk_cell_renderer_get_request_mode(this)

public var CellRenderer.sensitive: Boolean
  get() = gtk_cell_renderer_get_sensitive(this).toBoolean()
  set(`value`) {
    gtk_cell_renderer_set_sensitive(this@sensitive, `value`.toInt())
  }

public var CellRenderer.visible: Boolean
  get() = gtk_cell_renderer_get_visible(this).toBoolean()
  set(`value`) {
    gtk_cell_renderer_set_visible(this@visible, `value`.toInt())
  }

public fun CellRenderer.activate(
  event: Event?,
  widget: Widget?,
  path: String?,
  backgroundArea: Rectangle?,
  cellArea: Rectangle?,
  flags: CellRendererState
): Boolean = gtk_cell_renderer_activate(this@activate, event?.reinterpret(), widget?.reinterpret(),
    path, backgroundArea?.reinterpret(), cellArea?.reinterpret(), flags).toBoolean()

public fun CellRenderer.getState(widget: Widget?, cellState: CellRendererState): StateFlags =
    gtk_cell_renderer_get_state(this@getState, widget?.reinterpret(), cellState)

public fun CellRenderer.isActivatable(): Boolean =
    gtk_cell_renderer_is_activatable(this@isActivatable).toBoolean()

public fun CellRenderer.setAlignment(xalign: Float, yalign: Float): Unit {
  gtk_cell_renderer_set_alignment(this@setAlignment, xalign, yalign)
}

public fun CellRenderer.setFixedSize(width: Int, height: Int): Unit {
  gtk_cell_renderer_set_fixed_size(this@setFixedSize, width, height)
}

public fun CellRenderer.setPadding(xpad: Int, ypad: Int): Unit {
  gtk_cell_renderer_set_padding(this@setPadding, xpad, ypad)
}

public fun CellRenderer.startEditing(
  event: Event?,
  widget: Widget?,
  path: String?,
  backgroundArea: Rectangle?,
  cellArea: Rectangle?,
  flags: CellRendererState
): CellEditable? = gtk_cell_renderer_start_editing(this@startEditing, event?.reinterpret(),
    widget?.reinterpret(), path, backgroundArea?.reinterpret(), cellArea?.reinterpret(),
    flags)?.reinterpret()

public fun CellRenderer.stopEditing(canceled: Boolean): Unit {
  gtk_cell_renderer_stop_editing(this@stopEditing, canceled.toInt())
}

public fun CellRenderer.onEditingCanceled(callback: (CellRenderer) -> Unit): CellRenderer {
  // TODO - handle callback data

  asObject.connect("editing-canceled") { callback(this) }
  return this
}

public fun CellRenderer.onEditingStarted(callback: (CellRenderer) -> Unit): CellRenderer {
  // TODO - handle callback data

  asObject.connect("editing-started") { callback(this) }
  return this
}
