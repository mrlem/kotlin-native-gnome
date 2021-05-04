// TODO - method: get_active_iter (param type)
// TODO - method: get_popup_accessible (return type)
// TODO - method: popup_for_device (param type)
// TODO - method: set_row_separator_func (param type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkComboBox
import interop.gtk_combo_box_get_active
import interop.gtk_combo_box_get_active_id
import interop.gtk_combo_box_get_button_sensitivity
import interop.gtk_combo_box_get_column_span_column
import interop.gtk_combo_box_get_entry_text_column
import interop.gtk_combo_box_get_has_entry
import interop.gtk_combo_box_get_id_column
import interop.gtk_combo_box_get_model
import interop.gtk_combo_box_get_popup_fixed_width
import interop.gtk_combo_box_get_row_separator_func
import interop.gtk_combo_box_get_row_span_column
import interop.gtk_combo_box_get_wrap_width
import interop.gtk_combo_box_new
import interop.gtk_combo_box_new_with_area
import interop.gtk_combo_box_new_with_area_and_entry
import interop.gtk_combo_box_new_with_entry
import interop.gtk_combo_box_new_with_model
import interop.gtk_combo_box_new_with_model_and_entry
import interop.gtk_combo_box_popdown
import interop.gtk_combo_box_popup
import interop.gtk_combo_box_set_active
import interop.gtk_combo_box_set_active_id
import interop.gtk_combo_box_set_active_iter
import interop.gtk_combo_box_set_button_sensitivity
import interop.gtk_combo_box_set_column_span_column
import interop.gtk_combo_box_set_entry_text_column
import interop.gtk_combo_box_set_id_column
import interop.gtk_combo_box_set_model
import interop.gtk_combo_box_set_popup_fixed_width
import interop.gtk_combo_box_set_row_span_column
import interop.gtk_combo_box_set_wrap_width
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt
import org.gnome.toKString
import org.mrlem.gnome.gobject.connect

public typealias ComboBox = CPointer<GtkComboBox>

public val ComboBox.asObject: Object
  get() = reinterpret()

public val ComboBox.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val ComboBox.asWidget: Widget
  get() = reinterpret()

public val ComboBox.asContainer: Container
  get() = reinterpret()

public val ComboBox.asBin: Bin
  get() = reinterpret()

public object ComboBoxFactory {
  public fun new(): ComboBox = gtk_combo_box_new()!!.reinterpret()

  public fun newWithArea(area: CellArea?): ComboBox =
      gtk_combo_box_new_with_area(area?.reinterpret())!!.reinterpret()

  public fun newWithAreaAndEntry(area: CellArea?): ComboBox =
      gtk_combo_box_new_with_area_and_entry(area?.reinterpret())!!.reinterpret()

  public fun newWithEntry(): ComboBox = gtk_combo_box_new_with_entry()!!.reinterpret()

  public fun newWithModel(model: TreeModel?): ComboBox =
      gtk_combo_box_new_with_model(model?.reinterpret())!!.reinterpret()

  public fun newWithModelAndEntry(model: TreeModel?): ComboBox =
      gtk_combo_box_new_with_model_and_entry(model?.reinterpret())!!.reinterpret()
}

public val ComboBox.parentInstance: Bin
  get() = pointed.parent_instance.ptr

public var ComboBox.active: Int
  get() = gtk_combo_box_get_active(this)
  set(`value`) {
    gtk_combo_box_set_active(this@active, `value`)
  }

public var ComboBox.activeId: String?
  get() = gtk_combo_box_get_active_id(this).toKString()
  set(`value`) {
    gtk_combo_box_set_active_id(this@activeId, `value`)
  }

public var ComboBox.buttonSensitivity: SensitivityType
  get() = gtk_combo_box_get_button_sensitivity(this)
  set(`value`) {
    gtk_combo_box_set_button_sensitivity(this@buttonSensitivity, `value`)
  }

public var ComboBox.columnSpanColumn: Int
  get() = gtk_combo_box_get_column_span_column(this)
  set(`value`) {
    gtk_combo_box_set_column_span_column(this@columnSpanColumn, `value`)
  }

public var ComboBox.entryTextColumn: Int
  get() = gtk_combo_box_get_entry_text_column(this)
  set(`value`) {
    gtk_combo_box_set_entry_text_column(this@entryTextColumn, `value`)
  }

public val ComboBox.hasEntry: Boolean
  get() = gtk_combo_box_get_has_entry(this).toBoolean()

public var ComboBox.idColumn: Int
  get() = gtk_combo_box_get_id_column(this)
  set(`value`) {
    gtk_combo_box_set_id_column(this@idColumn, `value`)
  }

public var ComboBox.model: TreeModel?
  get() = gtk_combo_box_get_model(this)?.reinterpret()
  set(`value`) {
    gtk_combo_box_set_model(this@model, `value`)
  }

public var ComboBox.popupFixedWidth: Boolean
  get() = gtk_combo_box_get_popup_fixed_width(this).toBoolean()
  set(`value`) {
    gtk_combo_box_set_popup_fixed_width(this@popupFixedWidth, `value`.toInt())
  }

public val ComboBox.rowSeparatorFunc: TreeViewRowSeparatorFunc?
  get() = gtk_combo_box_get_row_separator_func(this)?.reinterpret()

public var ComboBox.rowSpanColumn: Int
  get() = gtk_combo_box_get_row_span_column(this)
  set(`value`) {
    gtk_combo_box_set_row_span_column(this@rowSpanColumn, `value`)
  }

public var ComboBox.wrapWidth: Int
  get() = gtk_combo_box_get_wrap_width(this)
  set(`value`) {
    gtk_combo_box_set_wrap_width(this@wrapWidth, `value`)
  }

public fun ComboBox.popdown(): Unit {
  gtk_combo_box_popdown(this@popdown)
}

public fun ComboBox.popup(): Unit {
  gtk_combo_box_popup(this@popup)
}

public fun ComboBox.setActiveIter(iter: TreeIter?): Unit {
  gtk_combo_box_set_active_iter(this@setActiveIter, iter?.reinterpret())
}

public fun ComboBox.onChanged(callback: (ComboBox) -> Unit): ComboBox {
  // TODO - handle callback data

  asObject.connect("changed") { callback(this) }
  return this
}

public fun ComboBox.onFormatEntryText(callback: (ComboBox) -> Unit): ComboBox {
  // TODO - handle callback data

  asObject.connect("format-entry-text") { callback(this) }
  return this
}

public fun ComboBox.onMoveActive(callback: (ComboBox) -> Unit): ComboBox {
  // TODO - handle callback data

  asObject.connect("move-active") { callback(this) }
  return this
}

public fun ComboBox.onPopdown(callback: (ComboBox) -> Unit): ComboBox {
  // TODO - handle callback data

  asObject.connect("popdown") { callback(this) }
  return this
}

public fun ComboBox.onPopup(callback: (ComboBox) -> Unit): ComboBox {
  // TODO - handle callback data

  asObject.connect("popup") { callback(this) }
  return this
}
