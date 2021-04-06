// TODO - implement:
//   get_attributes
//   get_buffer
//   get_completion
//   get_cursor_hadjustment
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
//   get_tabs
//   get_text_area
//   grab_focus_without_selecting
//   im_context_filter_keypress
//   layout_index_to_text_index
//   progress_pulse
//   reset_im_context
//   set_attributes
//   set_buffer
//   set_completion
//   set_cursor_hadjustment
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
//   set_tabs
//   text_index_to_layout_index
//   unset_invisible_char
package org.gnome.gtk

import gtk3.GtkEntry
import gtk3.gtk_entry_get_activates_default
import gtk3.gtk_entry_get_alignment
import gtk3.gtk_entry_get_current_icon_drag_source
import gtk3.gtk_entry_get_has_frame
import gtk3.gtk_entry_get_max_length
import gtk3.gtk_entry_get_max_width_chars
import gtk3.gtk_entry_get_overwrite_mode
import gtk3.gtk_entry_get_placeholder_text
import gtk3.gtk_entry_get_progress_fraction
import gtk3.gtk_entry_get_progress_pulse_step
import gtk3.gtk_entry_get_text
import gtk3.gtk_entry_get_text_length
import gtk3.gtk_entry_get_visibility
import gtk3.gtk_entry_get_width_chars
import gtk3.gtk_entry_set_activates_default
import gtk3.gtk_entry_set_alignment
import gtk3.gtk_entry_set_has_frame
import gtk3.gtk_entry_set_max_length
import gtk3.gtk_entry_set_max_width_chars
import gtk3.gtk_entry_set_overwrite_mode
import gtk3.gtk_entry_set_placeholder_text
import gtk3.gtk_entry_set_progress_fraction
import gtk3.gtk_entry_set_progress_pulse_step
import gtk3.gtk_entry_set_text
import gtk3.gtk_entry_set_visibility
import gtk3.gtk_entry_set_width_chars
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.UInt
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.convert
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gnome.glib.gobject.InitiallyUnowned
import org.gnome.glib.gobject.asObject
import org.gnome.glib.gobject.connect
import org.gnome.glib.toBoolean
import org.gnome.glib.toInt
import org.gnome.glib.toKString

public typealias Entry = CPointer<GtkEntry>

public val Entry.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Entry.asWidget: Widget
  get() = reinterpret()

public var Entry.activatesDefault: Boolean
  get() = gtk_entry_get_activates_default(this).toBoolean
  set(`value`) {
    gtk_entry_set_activates_default(this, value.toInt)
  }

public var Entry.alignment: Float
  get() = gtk_entry_get_alignment(this)
  set(`value`) {
    gtk_entry_set_alignment(this, value)
  }

public var Entry.hasFrame: Boolean
  get() = gtk_entry_get_has_frame(this).toBoolean
  set(`value`) {
    gtk_entry_set_has_frame(this, value.toInt)
  }

public var Entry.maxLength: Int
  get() = gtk_entry_get_max_length(this)
  set(`value`) {
    gtk_entry_set_max_length(this, value)
  }

public var Entry.maxWidthChars: Int
  get() = gtk_entry_get_max_width_chars(this)
  set(`value`) {
    gtk_entry_set_max_width_chars(this, value)
  }

public var Entry.overwriteMode: Boolean
  get() = gtk_entry_get_overwrite_mode(this).toBoolean
  set(`value`) {
    gtk_entry_set_overwrite_mode(this, value.toInt)
  }

public var Entry.placeholderText: String?
  get() = gtk_entry_get_placeholder_text(this).toKString
  set(`value`) {
    gtk_entry_set_placeholder_text(this, value)
  }

public var Entry.progressFraction: Double
  get() = gtk_entry_get_progress_fraction(this)
  set(`value`) {
    gtk_entry_set_progress_fraction(this, value)
  }

public var Entry.progressPulseStep: Double
  get() = gtk_entry_get_progress_pulse_step(this)
  set(`value`) {
    gtk_entry_set_progress_pulse_step(this, value)
  }

public var Entry.text: String?
  get() = gtk_entry_get_text(this).toKString
  set(`value`) {
    gtk_entry_set_text(this, value)
  }

public var Entry.visibility: Boolean
  get() = gtk_entry_get_visibility(this).toBoolean
  set(`value`) {
    gtk_entry_set_visibility(this, value.toInt)
  }

public var Entry.widthChars: Int
  get() = gtk_entry_get_width_chars(this)
  set(`value`) {
    gtk_entry_set_width_chars(this, value)
  }

public val Entry.currentIconDragSource: Int
  get() = gtk_entry_get_current_icon_drag_source(this)

public val Entry.textLength: UInt
  get() = gtk_entry_get_text_length(this).convert()

///////////////////////////////////////////////////////////////////////////
// Public API (not generated)
///////////////////////////////////////////////////////////////////////////

fun Entry.setText(text: String) = gtk_entry_set_text(this, text)

///////////////////////////////////////////////////////////////////////////
// Events handlers
///////////////////////////////////////////////////////////////////////////

fun Entry.onActivate(onActivate: (Entry) -> Unit): Entry {
  asInitiallyUnowned.asObject.connect("activate") { onActivate(this) }
  return this
}
