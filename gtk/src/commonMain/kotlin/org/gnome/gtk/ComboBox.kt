// TODO - implement:
//   get_active
//   get_active_id
//   get_active_iter
//   get_add_tearoffs
//   get_button_sensitivity
//   get_column_span_column
//   get_entry_text_column
//   get_focus_on_click
//   get_has_entry
//   get_id_column
//   get_model
//   get_popup_accessible
//   get_popup_fixed_width
//   get_row_separator_func
//   get_row_span_column
//   get_title
//   get_wrap_width
//   popdown
//   popup
//   popup_for_device
//   set_active
//   set_active_id
//   set_active_iter
//   set_add_tearoffs
//   set_button_sensitivity
//   set_column_span_column
//   set_entry_text_column
//   set_focus_on_click
//   set_id_column
//   set_model
//   set_popup_fixed_width
//   set_row_separator_func
//   set_row_span_column
//   set_title
//   set_wrap_width
package org.gnome.gtk

import gtk3.GtkComboBox
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias ComboBox = CPointer<GtkComboBox>

public val ComboBox.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val ComboBox.asWidget: Widget
  get() = reinterpret()

public val ComboBox.asContainer: Container
  get() = reinterpret()

public val ComboBox.asBin: Bin
  get() = reinterpret()
