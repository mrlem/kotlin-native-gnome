// TODO - method: get_attributes
// TODO - method: get_icon_area
// TODO - method: get_icon_gicon
// TODO - method: get_icon_pixbuf
// TODO - method: get_icon_stock
// TODO - method: get_inner_border
// TODO - method: get_layout
// TODO - method: get_layout_offsets
// TODO - method: get_tabs
// TODO - method: get_text_area
// TODO - method: im_context_filter_keypress
// TODO - method: set_attributes
// TODO - method: set_icon_drag_source
// TODO - method: set_icon_from_gicon
// TODO - method: set_icon_from_pixbuf
// TODO - method: set_icon_from_stock
// TODO - method: set_inner_border
// TODO - method: set_tabs
// TODO - signal: activate
// TODO - signal: backspace
// TODO - signal: copy-clipboard
// TODO - signal: cut-clipboard
// TODO - signal: delete-from-cursor
// TODO - signal: icon-press
// TODO - signal: icon-release
// TODO - signal: insert-at-cursor
// TODO - signal: insert-emoji
// TODO - signal: move-cursor
// TODO - signal: paste-clipboard
// TODO - signal: populate-popup
// TODO - signal: preedit-changed
// TODO - signal: toggle-overwrite
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import gtk3.GtkEntry
import gtk3.gtk_entry_get_activates_default
import gtk3.gtk_entry_get_alignment
import gtk3.gtk_entry_get_buffer
import gtk3.gtk_entry_get_completion
import gtk3.gtk_entry_get_current_icon_drag_source
import gtk3.gtk_entry_get_cursor_hadjustment
import gtk3.gtk_entry_get_has_frame
import gtk3.gtk_entry_get_icon_activatable
import gtk3.gtk_entry_get_icon_at_pos
import gtk3.gtk_entry_get_icon_name
import gtk3.gtk_entry_get_icon_sensitive
import gtk3.gtk_entry_get_icon_storage_type
import gtk3.gtk_entry_get_icon_tooltip_markup
import gtk3.gtk_entry_get_icon_tooltip_text
import gtk3.gtk_entry_get_input_hints
import gtk3.gtk_entry_get_input_purpose
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
import gtk3.gtk_entry_set_icon_activatable
import gtk3.gtk_entry_set_icon_from_icon_name
import gtk3.gtk_entry_set_icon_sensitive
import gtk3.gtk_entry_set_icon_tooltip_markup
import gtk3.gtk_entry_set_icon_tooltip_text
import gtk3.gtk_entry_set_input_hints
import gtk3.gtk_entry_set_input_purpose
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

public var Entry.buffer: EntryBuffer?
  get() = gtk_entry_get_buffer(this)?.reinterpret()
  set(`value`) {
    gtk_entry_set_buffer(this, value)
  }

public var Entry.completion: EntryCompletion?
  get() = gtk_entry_get_completion(this)?.reinterpret()
  set(`value`) {
    gtk_entry_set_completion(this, value)
  }

public val Entry.currentIconDragSource: Int
  get() = gtk_entry_get_current_icon_drag_source(this)

public var Entry.cursorHadjustment: Adjustment?
  get() = gtk_entry_get_cursor_hadjustment(this)?.reinterpret()
  set(`value`) {
    gtk_entry_set_cursor_hadjustment(this, value)
  }

public var Entry.hasFrame: Boolean
  get() = gtk_entry_get_has_frame(this).toBoolean
  set(`value`) {
    gtk_entry_set_has_frame(this, value.toInt)
  }

public var Entry.inputHints: InputHints
  get() = gtk_entry_get_input_hints(this)
  set(`value`) {
    gtk_entry_set_input_hints(this, value)
  }

public var Entry.inputPurpose: InputPurpose
  get() = gtk_entry_get_input_purpose(this)
  set(`value`) {
    gtk_entry_set_input_purpose(this, value)
  }

public var Entry.invisibleChar: Char
  get() = gtk_entry_get_invisible_char(this).toChar
  set(`value`) {
    gtk_entry_set_invisible_char(this, value.toUInt)
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

public var Entry.placeholderText: String
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

public var Entry.text: String
  get() = gtk_entry_get_text(this).toKString
  set(`value`) {
    gtk_entry_set_text(this, value)
  }

public val Entry.textLength: UShort
  get() = gtk_entry_get_text_length(this)

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

public fun Entry.getIconActivatable(iconPos: EntryIconPosition): Boolean =
    gtk_entry_get_icon_activatable(this, iconPos).toBoolean

public fun Entry.getIconAtPos(x: Int, y: Int): Int = gtk_entry_get_icon_at_pos(this, x, y)

public fun Entry.getIconName(iconPos: EntryIconPosition): String = gtk_entry_get_icon_name(this,
    iconPos).toKString

public fun Entry.getIconSensitive(iconPos: EntryIconPosition): Boolean =
    gtk_entry_get_icon_sensitive(this, iconPos).toBoolean

public fun Entry.getIconStorageType(iconPos: EntryIconPosition): ImageType =
    gtk_entry_get_icon_storage_type(this, iconPos)

public fun Entry.getIconTooltipMarkup(iconPos: EntryIconPosition): String =
    gtk_entry_get_icon_tooltip_markup(this, iconPos).toKString

public fun Entry.getIconTooltipText(iconPos: EntryIconPosition): String =
    gtk_entry_get_icon_tooltip_text(this, iconPos).toKString

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

public fun Entry.setIconActivatable(iconPos: EntryIconPosition, activatable: Boolean): Unit {
  gtk_entry_set_icon_activatable(this, iconPos, activatable.toInt)
}

public fun Entry.setIconFromIconName(iconPos: EntryIconPosition, iconName: String): Unit {
  gtk_entry_set_icon_from_icon_name(this, iconPos, iconName)
}

public fun Entry.setIconSensitive(iconPos: EntryIconPosition, sensitive: Boolean): Unit {
  gtk_entry_set_icon_sensitive(this, iconPos, sensitive.toInt)
}

public fun Entry.setIconTooltipMarkup(iconPos: EntryIconPosition, tooltip: String): Unit {
  gtk_entry_set_icon_tooltip_markup(this, iconPos, tooltip)
}

public fun Entry.setIconTooltipText(iconPos: EntryIconPosition, tooltip: String): Unit {
  gtk_entry_set_icon_tooltip_text(this, iconPos, tooltip)
}

public fun Entry.textIndexToLayoutIndex(textIndex: Int): Int =
    gtk_entry_text_index_to_layout_index(this, textIndex)

public fun Entry.unsetInvisibleChar(): Unit {
  gtk_entry_unset_invisible_char(this)
}
