// TODO - method: add_with_properties (param type)
// TODO - method: cell_get (param type)
// TODO - method: cell_get_valist (param type)
// TODO - method: cell_set (param type)
// TODO - method: cell_set_valist (param type)
// TODO - method: foreach (param type)
// TODO - method: foreach_alloc (param type)
// TODO - method: get_cell_allocation (param type)
// TODO - method: get_cell_at_position (param type)
// TODO - method: get_preferred_height (param type)
// TODO - method: get_preferred_height_for_width (param type)
// TODO - method: get_preferred_width (param type)
// TODO - method: get_preferred_width_for_height (param type)
// TODO - method: inner_cell_area (param type)
// TODO - method: render (param type)
// TODO - method: request_renderer (param type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GList
import interop.GtkCellArea
import interop.gtk_cell_area_activate
import interop.gtk_cell_area_activate_cell
import interop.gtk_cell_area_add
import interop.gtk_cell_area_add_focus_sibling
import interop.gtk_cell_area_apply_attributes
import interop.gtk_cell_area_attribute_connect
import interop.gtk_cell_area_attribute_disconnect
import interop.gtk_cell_area_attribute_get_column
import interop.gtk_cell_area_cell_get_property
import interop.gtk_cell_area_cell_set_property
import interop.gtk_cell_area_copy_context
import interop.gtk_cell_area_create_context
import interop.gtk_cell_area_event
import interop.gtk_cell_area_focus
import interop.gtk_cell_area_get_current_path_string
import interop.gtk_cell_area_get_edit_widget
import interop.gtk_cell_area_get_edited_cell
import interop.gtk_cell_area_get_focus_cell
import interop.gtk_cell_area_get_focus_from_sibling
import interop.gtk_cell_area_get_focus_siblings
import interop.gtk_cell_area_get_request_mode
import interop.gtk_cell_area_has_renderer
import interop.gtk_cell_area_is_activatable
import interop.gtk_cell_area_is_focus_sibling
import interop.gtk_cell_area_remove
import interop.gtk_cell_area_remove_focus_sibling
import interop.gtk_cell_area_set_focus_cell
import interop.gtk_cell_area_stop_editing
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gdk.Event
import org.gnome.gdk.Rectangle
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.gobject.Value
import org.mrlem.gnome.gobject.connect
import org.mrlem.gnome.toBoolean
import org.mrlem.gnome.toInt
import org.mrlem.gnome.toKList
import org.mrlem.gnome.toKString

public typealias CellArea = CPointer<GtkCellArea>

public val CellArea.asObject: Object
  get() = reinterpret()

public val CellArea.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val CellArea.currentPathString: String?
  get() = gtk_cell_area_get_current_path_string(this).toKString()

public val CellArea.editWidget: CellEditable?
  get() = gtk_cell_area_get_edit_widget(this)?.reinterpret()

public val CellArea.editedCell: CellRenderer?
  get() = gtk_cell_area_get_edited_cell(this)?.reinterpret()

public var CellArea.focusCell: CellRenderer?
  get() = gtk_cell_area_get_focus_cell(this)?.reinterpret()
  set(`value`) {
    gtk_cell_area_set_focus_cell(this@focusCell, `value`)
  }

public val CellArea.requestMode: SizeRequestMode
  get() = gtk_cell_area_get_request_mode(this)

public fun CellArea.activate(
  context: CellAreaContext?,
  widget: Widget?,
  cellArea: Rectangle?,
  flags: CellRendererState,
  editOnly: Boolean
): Boolean = gtk_cell_area_activate(this@activate, context?.reinterpret(), widget?.reinterpret(),
    cellArea?.reinterpret(), flags, editOnly.toInt()).toBoolean()

public fun CellArea.activateCell(
  widget: Widget?,
  renderer: CellRenderer?,
  event: Event?,
  cellArea: Rectangle?,
  flags: CellRendererState
): Boolean = gtk_cell_area_activate_cell(this@activateCell, widget?.reinterpret(),
    renderer?.reinterpret(), event?.reinterpret(), cellArea?.reinterpret(), flags).toBoolean()

public fun CellArea.add(renderer: CellRenderer?): Unit {
  gtk_cell_area_add(this@add, renderer?.reinterpret())
}

public fun CellArea.addFocusSibling(renderer: CellRenderer?, sibling: CellRenderer?): Unit {
  gtk_cell_area_add_focus_sibling(this@addFocusSibling, renderer?.reinterpret(),
      sibling?.reinterpret())
}

public fun CellArea.applyAttributes(
  treeModel: TreeModel?,
  iter: TreeIter?,
  isExpander: Boolean,
  isExpanded: Boolean
): Unit {
  gtk_cell_area_apply_attributes(this@applyAttributes, treeModel?.reinterpret(),
      iter?.reinterpret(), isExpander.toInt(), isExpanded.toInt())
}

public fun CellArea.attributeConnect(
  renderer: CellRenderer?,
  attribute: String?,
  column: Int
): Unit {
  gtk_cell_area_attribute_connect(this@attributeConnect, renderer?.reinterpret(), attribute, column)
}

public fun CellArea.attributeDisconnect(renderer: CellRenderer?, attribute: String?): Unit {
  gtk_cell_area_attribute_disconnect(this@attributeDisconnect, renderer?.reinterpret(), attribute)
}

public fun CellArea.attributeGetColumn(renderer: CellRenderer?, attribute: String?): Int =
    gtk_cell_area_attribute_get_column(this@attributeGetColumn, renderer?.reinterpret(), attribute)

public fun CellArea.cellGetProperty(
  renderer: CellRenderer?,
  propertyName: String?,
  `value`: Value?
): Unit {
  gtk_cell_area_cell_get_property(this@cellGetProperty, renderer?.reinterpret(), propertyName,
      `value`?.reinterpret())
}

public fun CellArea.cellSetProperty(
  renderer: CellRenderer?,
  propertyName: String?,
  `value`: Value?
): Unit {
  gtk_cell_area_cell_set_property(this@cellSetProperty, renderer?.reinterpret(), propertyName,
      `value`?.reinterpret())
}

public fun CellArea.copyContext(context: CellAreaContext?): CellAreaContext? =
    gtk_cell_area_copy_context(this@copyContext, context?.reinterpret())?.reinterpret()

public fun CellArea.createContext(): CellAreaContext? =
    gtk_cell_area_create_context(this@createContext)?.reinterpret()

public fun CellArea.event(
  context: CellAreaContext?,
  widget: Widget?,
  event: Event?,
  cellArea: Rectangle?,
  flags: CellRendererState
): Int = gtk_cell_area_event(this@event, context?.reinterpret(), widget?.reinterpret(),
    event?.reinterpret(), cellArea?.reinterpret(), flags)

public fun CellArea.focus(direction: DirectionType): Boolean = gtk_cell_area_focus(this@focus,
    direction).toBoolean()

public fun CellArea.getFocusFromSibling(renderer: CellRenderer?): CellRenderer? =
    gtk_cell_area_get_focus_from_sibling(this@getFocusFromSibling,
    renderer?.reinterpret())?.reinterpret()

public fun CellArea.getFocusSiblings(renderer: CellRenderer?): List<CellRenderer>? =
    gtk_cell_area_get_focus_siblings(this@getFocusSiblings,
    renderer?.reinterpret())?.reinterpret<GList>()?.toKList()

public fun CellArea.hasRenderer(renderer: CellRenderer?): Boolean =
    gtk_cell_area_has_renderer(this@hasRenderer, renderer?.reinterpret()).toBoolean()

public fun CellArea.isActivatable(): Boolean =
    gtk_cell_area_is_activatable(this@isActivatable).toBoolean()

public fun CellArea.isFocusSibling(renderer: CellRenderer?, sibling: CellRenderer?): Boolean =
    gtk_cell_area_is_focus_sibling(this@isFocusSibling, renderer?.reinterpret(),
    sibling?.reinterpret()).toBoolean()

public fun CellArea.remove(renderer: CellRenderer?): Unit {
  gtk_cell_area_remove(this@remove, renderer?.reinterpret())
}

public fun CellArea.removeFocusSibling(renderer: CellRenderer?, sibling: CellRenderer?): Unit {
  gtk_cell_area_remove_focus_sibling(this@removeFocusSibling, renderer?.reinterpret(),
      sibling?.reinterpret())
}

public fun CellArea.stopEditing(canceled: Boolean): Unit {
  gtk_cell_area_stop_editing(this@stopEditing, canceled.toInt())
}

public fun CellArea.onAddEditable(callback: (CellArea) -> Unit): CellArea {
  // TODO - handle callback data

  asObject.connect("add-editable") { callback(this) }
  return this
}

public fun CellArea.onApplyAttributes(callback: (CellArea) -> Unit): CellArea {
  // TODO - handle callback data

  asObject.connect("apply-attributes") { callback(this) }
  return this
}

public fun CellArea.onFocusChanged(callback: (CellArea) -> Unit): CellArea {
  // TODO - handle callback data

  asObject.connect("focus-changed") { callback(this) }
  return this
}

public fun CellArea.onRemoveEditable(callback: (CellArea) -> Unit): CellArea {
  // TODO - handle callback data

  asObject.connect("remove-editable") { callback(this) }
  return this
}
