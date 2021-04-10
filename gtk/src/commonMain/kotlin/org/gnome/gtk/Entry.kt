// TODO - implement:
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
//   get_layout_offsets
//   get_text_area
//   im_context_filter_keypress
//   layout_index_to_text_index
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
package org.gnome.gtk

import gtk3.GtkEntry
import gtk3.gtk_entry_get_activates_default
import gtk3.gtk_entry_get_alignment
import gtk3.gtk_entry_get_attributes
import gtk3.gtk_entry_get_buffer
import gtk3.gtk_entry_get_completion
import gtk3.gtk_entry_get_current_icon_drag_source
import gtk3.gtk_entry_get_cursor_hadjustment
import gtk3.gtk_entry_get_has_frame
import gtk3.gtk_entry_get_input_hints
import gtk3.gtk_entry_get_input_purpose
import gtk3.gtk_entry_get_invisible_char
import gtk3.gtk_entry_get_layout
import gtk3.gtk_entry_get_max_length
import gtk3.gtk_entry_get_max_width_chars
import gtk3.gtk_entry_get_overwrite_mode
import gtk3.gtk_entry_get_placeholder_text
import gtk3.gtk_entry_get_progress_fraction
import gtk3.gtk_entry_get_progress_pulse_step
import gtk3.gtk_entry_get_tabs
import gtk3.gtk_entry_get_text
import gtk3.gtk_entry_get_text_length
import gtk3.gtk_entry_get_visibility
import gtk3.gtk_entry_get_width_chars
import gtk3.gtk_entry_grab_focus_without_selecting
import gtk3.gtk_entry_progress_pulse
import gtk3.gtk_entry_reset_im_context
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
import gtk3.gtk_entry_unset_invisible_char
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.UShort
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned
import org.gnome.glib.gobject.Object
import org.gnome.glib.toBoolean
import org.gnome.glib.toInt
import org.gnome.glib.toKString

public typealias Entry = CPointer<GtkEntry>

public val Entry.asObject: Object
  get() = reinterpret()

public val Entry.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Entry.asWidget: Widget
  get() = reinterpret()

public fun Entry.getAttributes(): Unit {
  gtk_entry_get_attributes(this)
}

public fun Entry.getBuffer(): Unit {
  gtk_entry_get_buffer(this)
}

public fun Entry.getCompletion(): Unit {
  gtk_entry_get_completion(this)
}

public fun Entry.getCursorHadjustment(): Unit {
  gtk_entry_get_cursor_hadjustment(this)
}

public fun Entry.getInputHints(): Unit {
  gtk_entry_get_input_hints(this)
}

public fun Entry.getInputPurpose(): Unit {
  gtk_entry_get_input_purpose(this)
}

public fun Entry.getInvisibleChar(): Unit {
  gtk_entry_get_invisible_char(this)
}

public fun Entry.getLayout(): Unit {
  gtk_entry_get_layout(this)
}

public fun Entry.getTabs(): Unit {
  gtk_entry_get_tabs(this)
}

public fun Entry.grabFocusWithoutSelecting(): Unit {
  gtk_entry_grab_focus_without_selecting(this)
}

public fun Entry.progressPulse(): Unit {
  gtk_entry_progress_pulse(this)
}

public fun Entry.resetImContext(): Unit {
  gtk_entry_reset_im_context(this)
}

public fun Entry.unsetInvisibleChar(): Unit {
  gtk_entry_unset_invisible_char(this)
}

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

public val Entry.textLength: UShort
  get() = gtk_entry_get_text_length(this)
