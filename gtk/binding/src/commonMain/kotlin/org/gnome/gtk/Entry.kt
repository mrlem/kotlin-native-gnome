// TODO - get_attributes
// TODO - get_icon_activatable
// TODO - get_icon_area
// TODO - get_icon_gicon
// TODO - get_icon_name
// TODO - get_icon_pixbuf
// TODO - get_icon_sensitive
// TODO - get_icon_storage_type
// TODO - get_icon_tooltip_markup
// TODO - get_icon_tooltip_text
// TODO - get_input_purpose
// TODO - get_layout
// TODO - get_layout_offsets
// TODO - get_tabs
// TODO - get_text_area
// TODO - im_context_filter_keypress
// TODO - set_attributes
// TODO - set_icon_activatable
// TODO - set_icon_drag_source
// TODO - set_icon_from_gicon
// TODO - set_icon_from_icon_name
// TODO - set_icon_from_pixbuf
// TODO - set_icon_sensitive
// TODO - set_icon_tooltip_markup
// TODO - set_icon_tooltip_text
// TODO - set_input_purpose
// TODO - set_tabs
//
package org.gnome.gtk

import gtk3.GtkEntry
import gtk3.gtk_entry_get_activates_default
import gtk3.gtk_entry_get_alignment
import gtk3.gtk_entry_get_buffer
import gtk3.gtk_entry_get_completion
import gtk3.gtk_entry_get_current_icon_drag_source
import gtk3.gtk_entry_get_cursor_hadjustment
import gtk3.gtk_entry_get_has_frame
import gtk3.gtk_entry_get_icon_at_pos
import gtk3.gtk_entry_get_input_hints
import gtk3.gtk_entry_get_invisible_char
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
import gtk3.gtk_entry_grab_focus_without_selecting
import gtk3.gtk_entry_layout_index_to_text_index
import gtk3.gtk_entry_progress_pulse
import gtk3.gtk_entry_reset_im_context
import gtk3.gtk_entry_set_activates_default
import gtk3.gtk_entry_set_alignment
import gtk3.gtk_entry_set_buffer
import gtk3.gtk_entry_set_completion
import gtk3.gtk_entry_set_cursor_hadjustment
import gtk3.gtk_entry_set_has_frame
import gtk3.gtk_entry_set_input_hints
import gtk3.gtk_entry_set_invisible_char
import gtk3.gtk_entry_set_max_length
import gtk3.gtk_entry_set_max_width_chars
import gtk3.gtk_entry_set_overwrite_mode
import gtk3.gtk_entry_set_placeholder_text
import gtk3.gtk_entry_set_progress_fraction
import gtk3.gtk_entry_set_progress_pulse_step
import gtk3.gtk_entry_set_text
import gtk3.gtk_entry_set_visibility
import gtk3.gtk_entry_set_width_chars
import gtk3.gtk_entry_text_index_to_layout_index
import gtk3.gtk_entry_unset_invisible_char
import kotlin.Boolean
import kotlin.Char
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.UShort
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toChar
import org.gnome.toInt
import org.gnome.toKString
import org.gnome.toUInt

public typealias Entry = CPointer<GtkEntry>

public val Entry.asObject: Object
  get() = reinterpret()

public val Entry.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Entry.asWidget: Widget
  get() = reinterpret()

public fun Entry.getActivatesDefault(): Boolean = gtk_entry_get_activates_default(this).toBoolean

public fun Entry.getAlignment(): Float = gtk_entry_get_alignment(this)

public fun Entry.getBuffer(): EntryBuffer? = gtk_entry_get_buffer(this)?.reinterpret()

public fun Entry.getCompletion(): EntryCompletion? = gtk_entry_get_completion(this)?.reinterpret()

public fun Entry.getCurrentIconDragSource(): Int = gtk_entry_get_current_icon_drag_source(this)

public fun Entry.getCursorHadjustment(): Adjustment? =
    gtk_entry_get_cursor_hadjustment(this)?.reinterpret()

public fun Entry.getHasFrame(): Boolean = gtk_entry_get_has_frame(this).toBoolean

public fun Entry.getIconAtPos(x: Int, y: Int): Int = gtk_entry_get_icon_at_pos(this, x, y)

public fun Entry.getInputHints(): InputHints = gtk_entry_get_input_hints(this)

public fun Entry.getInvisibleChar(): Char = gtk_entry_get_invisible_char(this).toChar

public fun Entry.getMaxLength(): Int = gtk_entry_get_max_length(this)

public fun Entry.getMaxWidthChars(): Int = gtk_entry_get_max_width_chars(this)

public fun Entry.getOverwriteMode(): Boolean = gtk_entry_get_overwrite_mode(this).toBoolean

public fun Entry.getPlaceholderText(): String = gtk_entry_get_placeholder_text(this).toKString

public fun Entry.getProgressFraction(): Double = gtk_entry_get_progress_fraction(this)

public fun Entry.getProgressPulseStep(): Double = gtk_entry_get_progress_pulse_step(this)

public fun Entry.getText(): String = gtk_entry_get_text(this).toKString

public fun Entry.getTextLength(): UShort = gtk_entry_get_text_length(this)

public fun Entry.getVisibility(): Boolean = gtk_entry_get_visibility(this).toBoolean

public fun Entry.getWidthChars(): Int = gtk_entry_get_width_chars(this)

public fun Entry.grabFocusWithoutSelecting(): Unit {
  gtk_entry_grab_focus_without_selecting(this)
}

public fun Entry.layoutIndexToTextIndex(layoutIndex: Int): Int =
    gtk_entry_layout_index_to_text_index(this, layoutIndex)

public fun Entry.progressPulse(): Unit {
  gtk_entry_progress_pulse(this)
}

public fun Entry.resetImContext(): Unit {
  gtk_entry_reset_im_context(this)
}

public fun Entry.setActivatesDefault(setting: Boolean): Unit {
  gtk_entry_set_activates_default(this, setting.toInt)
}

public fun Entry.setAlignment(xalign: Float): Unit {
  gtk_entry_set_alignment(this, xalign)
}

public fun Entry.setBuffer(buffer: EntryBuffer): Unit {
  gtk_entry_set_buffer(this, buffer.reinterpret())
}

public fun Entry.setCompletion(completion: EntryCompletion): Unit {
  gtk_entry_set_completion(this, completion.reinterpret())
}

public fun Entry.setCursorHadjustment(adjustment: Adjustment): Unit {
  gtk_entry_set_cursor_hadjustment(this, adjustment.reinterpret())
}

public fun Entry.setHasFrame(setting: Boolean): Unit {
  gtk_entry_set_has_frame(this, setting.toInt)
}

public fun Entry.setInputHints(hints: InputHints): Unit {
  gtk_entry_set_input_hints(this, hints)
}

public fun Entry.setInvisibleChar(ch: Char): Unit {
  gtk_entry_set_invisible_char(this, ch.toUInt)
}

public fun Entry.setMaxLength(max: Int): Unit {
  gtk_entry_set_max_length(this, max)
}

public fun Entry.setMaxWidthChars(nChars: Int): Unit {
  gtk_entry_set_max_width_chars(this, nChars)
}

public fun Entry.setOverwriteMode(overwrite: Boolean): Unit {
  gtk_entry_set_overwrite_mode(this, overwrite.toInt)
}

public fun Entry.setPlaceholderText(text: String?): Unit {
  gtk_entry_set_placeholder_text(this, text)
}

public fun Entry.setProgressFraction(fraction: Double): Unit {
  gtk_entry_set_progress_fraction(this, fraction)
}

public fun Entry.setProgressPulseStep(fraction: Double): Unit {
  gtk_entry_set_progress_pulse_step(this, fraction)
}

public fun Entry.setText(text: String?): Unit {
  gtk_entry_set_text(this, text)
}

public fun Entry.setVisibility(visible: Boolean): Unit {
  gtk_entry_set_visibility(this, visible.toInt)
}

public fun Entry.setWidthChars(nChars: Int): Unit {
  gtk_entry_set_width_chars(this, nChars)
}

public fun Entry.textIndexToLayoutIndex(textIndex: Int): Int =
    gtk_entry_text_index_to_layout_index(this, textIndex)

public fun Entry.unsetInvisibleChar(): Unit {
  gtk_entry_unset_invisible_char(this)
}
