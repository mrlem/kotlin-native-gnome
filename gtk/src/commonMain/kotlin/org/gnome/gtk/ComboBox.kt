// TODO - implement:
//   get_active_iter
//   popup_for_device
//   set_active_iter
//   set_button_sensitivity
//   set_model
//   set_row_separator_func
package org.gnome.gtk

import gtk3.GtkComboBox
import gtk3.gtk_combo_box_get_active
import gtk3.gtk_combo_box_get_active_id
import gtk3.gtk_combo_box_get_add_tearoffs
import gtk3.gtk_combo_box_get_button_sensitivity
import gtk3.gtk_combo_box_get_column_span_column
import gtk3.gtk_combo_box_get_entry_text_column
import gtk3.gtk_combo_box_get_focus_on_click
import gtk3.gtk_combo_box_get_has_entry
import gtk3.gtk_combo_box_get_id_column
import gtk3.gtk_combo_box_get_model
import gtk3.gtk_combo_box_get_popup_accessible
import gtk3.gtk_combo_box_get_popup_fixed_width
import gtk3.gtk_combo_box_get_row_separator_func
import gtk3.gtk_combo_box_get_row_span_column
import gtk3.gtk_combo_box_get_title
import gtk3.gtk_combo_box_get_wrap_width
import gtk3.gtk_combo_box_popdown
import gtk3.gtk_combo_box_popup
import gtk3.gtk_combo_box_set_active
import gtk3.gtk_combo_box_set_active_id
import gtk3.gtk_combo_box_set_add_tearoffs
import gtk3.gtk_combo_box_set_column_span_column
import gtk3.gtk_combo_box_set_entry_text_column
import gtk3.gtk_combo_box_set_focus_on_click
import gtk3.gtk_combo_box_set_id_column
import gtk3.gtk_combo_box_set_popup_fixed_width
import gtk3.gtk_combo_box_set_row_span_column
import gtk3.gtk_combo_box_set_title
import gtk3.gtk_combo_box_set_wrap_width
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned
import org.gnome.glib.toBoolean
import org.gnome.glib.toInt
import org.gnome.glib.toKString

public typealias ComboBox = CPointer<GtkComboBox>

public val ComboBox.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val ComboBox.asWidget: Widget
  get() = reinterpret()

public val ComboBox.asContainer: Container
  get() = reinterpret()

public val ComboBox.asBin: Bin
  get() = reinterpret()

public fun ComboBox.getButtonSensitivity(): Unit {
  gtk_combo_box_get_button_sensitivity(this)
}

public fun ComboBox.getModel(): Unit {
  gtk_combo_box_get_model(this)
}

public fun ComboBox.getPopupAccessible(): Unit {
  gtk_combo_box_get_popup_accessible(this)
}

public fun ComboBox.getRowSeparatorFunc(): Unit {
  gtk_combo_box_get_row_separator_func(this)
}

public fun ComboBox.popdown(): Unit {
  gtk_combo_box_popdown(this)
}

public fun ComboBox.popup(): Unit {
  gtk_combo_box_popup(this)
}

public var ComboBox.active: Int
  get() = gtk_combo_box_get_active(this)
  set(`value`) {
    gtk_combo_box_set_active(this, value)
  }

public var ComboBox.activeId: String?
  get() = gtk_combo_box_get_active_id(this).toKString
  set(`value`) {
    gtk_combo_box_set_active_id(this, value)
  }

public var ComboBox.addTearoffs: Boolean
  get() = gtk_combo_box_get_add_tearoffs(this).toBoolean
  set(`value`) {
    gtk_combo_box_set_add_tearoffs(this, value.toInt)
  }

public var ComboBox.columnSpanColumn: Int
  get() = gtk_combo_box_get_column_span_column(this)
  set(`value`) {
    gtk_combo_box_set_column_span_column(this, value)
  }

public var ComboBox.entryTextColumn: Int
  get() = gtk_combo_box_get_entry_text_column(this)
  set(`value`) {
    gtk_combo_box_set_entry_text_column(this, value)
  }

public var ComboBox.focusOnClick: Boolean
  get() = gtk_combo_box_get_focus_on_click(this).toBoolean
  set(`value`) {
    gtk_combo_box_set_focus_on_click(this, value.toInt)
  }

public var ComboBox.idColumn: Int
  get() = gtk_combo_box_get_id_column(this)
  set(`value`) {
    gtk_combo_box_set_id_column(this, value)
  }

public var ComboBox.popupFixedWidth: Boolean
  get() = gtk_combo_box_get_popup_fixed_width(this).toBoolean
  set(`value`) {
    gtk_combo_box_set_popup_fixed_width(this, value.toInt)
  }

public var ComboBox.rowSpanColumn: Int
  get() = gtk_combo_box_get_row_span_column(this)
  set(`value`) {
    gtk_combo_box_set_row_span_column(this, value)
  }

public var ComboBox.title: String?
  get() = gtk_combo_box_get_title(this).toKString
  set(`value`) {
    gtk_combo_box_set_title(this, value)
  }

public var ComboBox.wrapWidth: Int
  get() = gtk_combo_box_get_wrap_width(this)
  set(`value`) {
    gtk_combo_box_set_wrap_width(this, value)
  }

public val ComboBox.hasEntry: Boolean
  get() = gtk_combo_box_get_has_entry(this).toBoolean
