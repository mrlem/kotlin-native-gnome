// TODO - implement:
//   get_activates_default
//   get_alignment
//   get_attributes
//   get_buffer
//   get_completion
//   get_current_icon_drag_source
//   get_cursor_hadjustment
//   get_has_frame
//   get_icon_activatable
//   get_icon_area
//   get_icon_at_pos
//   get_icon_gicon
//   get_icon_name
//   get_icon_pixbuf
//   get_icon_sensitive
//   get_icon_stock
//   get_icon_storage_type
//   get_icon_tooltip_markup
//   get_icon_tooltip_text
//   get_inner_border
//   get_input_hints
//   get_input_purpose
//   get_invisible_char
//   get_layout
//   get_layout_offsets
//   get_max_length
//   get_max_width_chars
//   get_overwrite_mode
//   get_placeholder_text
//   get_progress_fraction
//   get_progress_pulse_step
//   get_tabs
//   get_text
//   get_text_area
//   get_text_length
//   get_visibility
//   get_width_chars
//   grab_focus_without_selecting
//   im_context_filter_keypress
//   layout_index_to_text_index
//   progress_pulse
//   reset_im_context
//   set_activates_default
//   set_alignment
//   set_attributes
//   set_buffer
//   set_completion
//   set_cursor_hadjustment
//   set_has_frame
//   set_icon_activatable
//   set_icon_drag_source
//   set_icon_from_gicon
//   set_icon_from_icon_name
//   set_icon_from_pixbuf
//   set_icon_from_stock
//   set_icon_sensitive
//   set_icon_tooltip_markup
//   set_icon_tooltip_text
//   set_inner_border
//   set_input_hints
//   set_input_purpose
//   set_invisible_char
//   set_max_length
//   set_max_width_chars
//   set_overwrite_mode
//   set_placeholder_text
//   set_progress_fraction
//   set_progress_pulse_step
//   set_tabs
//   set_text
//   set_visibility
//   set_width_chars
//   text_index_to_layout_index
//   unset_invisible_char
package org.gnome.gtk

import gtk3.GtkEntry
import gtk3.gtk_entry_get_text
import gtk3.gtk_entry_set_text
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gnome.glib.gobject.InitiallyUnowned
import org.gnome.glib.gobject.asObject
import org.gnome.glib.gobject.connect

public typealias Entry = CPointer<GtkEntry>

public val Entry.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Entry.asWidget: Widget
  get() = reinterpret()

///////////////////////////////////////////////////////////////////////////
// Public API (not generated)
///////////////////////////////////////////////////////////////////////////

val Entry.text
  get() = gtk_entry_get_text(this)!!.toKString()

fun Entry.setText(text: String) = gtk_entry_set_text(this, text)

///////////////////////////////////////////////////////////////////////////
// Events handlers
///////////////////////////////////////////////////////////////////////////

fun Entry.onActivate(onActivate: (Entry) -> Unit): Entry {
  asInitiallyUnowned.asObject.connect("activate") { onActivate(this) }
  return this
}
