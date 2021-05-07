// TODO - method: get_icon_area (param type)
// TODO - method: get_layout_offsets (param type)
// TODO - method: get_text_area (param type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkEntry
import interop.gtk_entry_get_activates_default
import interop.gtk_entry_get_alignment
import interop.gtk_entry_get_attributes
import interop.gtk_entry_get_buffer
import interop.gtk_entry_get_completion
import interop.gtk_entry_get_current_icon_drag_source
import interop.gtk_entry_get_cursor_hadjustment
import interop.gtk_entry_get_has_frame
import interop.gtk_entry_get_icon_activatable
import interop.gtk_entry_get_icon_at_pos
import interop.gtk_entry_get_icon_gicon
import interop.gtk_entry_get_icon_name
import interop.gtk_entry_get_icon_pixbuf
import interop.gtk_entry_get_icon_sensitive
import interop.gtk_entry_get_icon_storage_type
import interop.gtk_entry_get_icon_tooltip_markup
import interop.gtk_entry_get_icon_tooltip_text
import interop.gtk_entry_get_input_hints
import interop.gtk_entry_get_input_purpose
import interop.gtk_entry_get_invisible_char
import interop.gtk_entry_get_layout
import interop.gtk_entry_get_max_length
import interop.gtk_entry_get_max_width_chars
import interop.gtk_entry_get_overwrite_mode
import interop.gtk_entry_get_placeholder_text
import interop.gtk_entry_get_progress_fraction
import interop.gtk_entry_get_progress_pulse_step
import interop.gtk_entry_get_tabs
import interop.gtk_entry_get_text
import interop.gtk_entry_get_text_length
import interop.gtk_entry_get_visibility
import interop.gtk_entry_get_width_chars
import interop.gtk_entry_grab_focus_without_selecting
import interop.gtk_entry_im_context_filter_keypress
import interop.gtk_entry_layout_index_to_text_index
import interop.gtk_entry_new
import interop.gtk_entry_new_with_buffer
import interop.gtk_entry_progress_pulse
import interop.gtk_entry_reset_im_context
import interop.gtk_entry_set_activates_default
import interop.gtk_entry_set_alignment
import interop.gtk_entry_set_attributes
import interop.gtk_entry_set_buffer
import interop.gtk_entry_set_completion
import interop.gtk_entry_set_cursor_hadjustment
import interop.gtk_entry_set_has_frame
import interop.gtk_entry_set_icon_activatable
import interop.gtk_entry_set_icon_drag_source
import interop.gtk_entry_set_icon_from_gicon
import interop.gtk_entry_set_icon_from_icon_name
import interop.gtk_entry_set_icon_from_pixbuf
import interop.gtk_entry_set_icon_sensitive
import interop.gtk_entry_set_icon_tooltip_markup
import interop.gtk_entry_set_icon_tooltip_text
import interop.gtk_entry_set_input_hints
import interop.gtk_entry_set_input_purpose
import interop.gtk_entry_set_invisible_char
import interop.gtk_entry_set_max_length
import interop.gtk_entry_set_max_width_chars
import interop.gtk_entry_set_overwrite_mode
import interop.gtk_entry_set_placeholder_text
import interop.gtk_entry_set_progress_fraction
import interop.gtk_entry_set_progress_pulse_step
import interop.gtk_entry_set_tabs
import interop.gtk_entry_set_text
import interop.gtk_entry_set_visibility
import interop.gtk_entry_set_width_chars
import interop.gtk_entry_text_index_to_layout_index
import interop.gtk_entry_unset_invisible_char
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
import org.gnome.gdk.DragAction
import org.gnome.gdk.EventKey
import org.gnome.gdkpixbuf.Pixbuf
import org.gnome.gio.Icon
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.pango.AttrList
import org.gnome.pango.Layout
import org.gnome.pango.TabArray
import org.mrlem.gnome.gobject.connect
import org.mrlem.gnome.toBoolean
import org.mrlem.gnome.toChar
import org.mrlem.gnome.toInt
import org.mrlem.gnome.toKString
import org.mrlem.gnome.toUInt

public typealias Entry = CPointer<GtkEntry>

public val Entry.asObject: Object
  get() = reinterpret()

public val Entry.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Entry.asWidget: Widget
  get() = reinterpret()

public object EntryFactory {
  public fun new(): Entry = gtk_entry_new()!!.reinterpret()

  public fun newWithBuffer(buffer: EntryBuffer?): Entry =
      gtk_entry_new_with_buffer(buffer?.reinterpret())!!.reinterpret()
}

public var Entry.activatesDefault: Boolean
  get() = gtk_entry_get_activates_default(this).toBoolean()
  set(`value`) {
    gtk_entry_set_activates_default(this@activatesDefault, `value`.toInt())
  }

public var Entry.alignment: Float
  get() = gtk_entry_get_alignment(this)
  set(`value`) {
    gtk_entry_set_alignment(this@alignment, `value`)
  }

public var Entry.attributes: AttrList?
  get() = gtk_entry_get_attributes(this)?.reinterpret()
  set(`value`) {
    gtk_entry_set_attributes(this@attributes, `value`)
  }

public var Entry.buffer: EntryBuffer?
  get() = gtk_entry_get_buffer(this)?.reinterpret()
  set(`value`) {
    gtk_entry_set_buffer(this@buffer, `value`)
  }

public var Entry.completion: EntryCompletion?
  get() = gtk_entry_get_completion(this)?.reinterpret()
  set(`value`) {
    gtk_entry_set_completion(this@completion, `value`)
  }

public val Entry.currentIconDragSource: Int
  get() = gtk_entry_get_current_icon_drag_source(this)

public var Entry.cursorHadjustment: Adjustment?
  get() = gtk_entry_get_cursor_hadjustment(this)?.reinterpret()
  set(`value`) {
    gtk_entry_set_cursor_hadjustment(this@cursorHadjustment, `value`)
  }

public var Entry.hasFrame: Boolean
  get() = gtk_entry_get_has_frame(this).toBoolean()
  set(`value`) {
    gtk_entry_set_has_frame(this@hasFrame, `value`.toInt())
  }

public var Entry.inputHints: InputHints
  get() = gtk_entry_get_input_hints(this)
  set(`value`) {
    gtk_entry_set_input_hints(this@inputHints, `value`)
  }

public var Entry.inputPurpose: InputPurpose
  get() = gtk_entry_get_input_purpose(this)
  set(`value`) {
    gtk_entry_set_input_purpose(this@inputPurpose, `value`)
  }

public var Entry.invisibleChar: Char
  get() = gtk_entry_get_invisible_char(this).toChar()
  set(`value`) {
    gtk_entry_set_invisible_char(this@invisibleChar, `value`.toUInt())
  }

public val Entry.layout: Layout?
  get() = gtk_entry_get_layout(this)?.reinterpret()

public var Entry.maxLength: Int
  get() = gtk_entry_get_max_length(this)
  set(`value`) {
    gtk_entry_set_max_length(this@maxLength, `value`)
  }

public var Entry.maxWidthChars: Int
  get() = gtk_entry_get_max_width_chars(this)
  set(`value`) {
    gtk_entry_set_max_width_chars(this@maxWidthChars, `value`)
  }

public var Entry.overwriteMode: Boolean
  get() = gtk_entry_get_overwrite_mode(this).toBoolean()
  set(`value`) {
    gtk_entry_set_overwrite_mode(this@overwriteMode, `value`.toInt())
  }

public var Entry.placeholderText: String?
  get() = gtk_entry_get_placeholder_text(this).toKString()
  set(`value`) {
    gtk_entry_set_placeholder_text(this@placeholderText, `value`)
  }

public var Entry.progressFraction: Double
  get() = gtk_entry_get_progress_fraction(this)
  set(`value`) {
    gtk_entry_set_progress_fraction(this@progressFraction, `value`)
  }

public var Entry.progressPulseStep: Double
  get() = gtk_entry_get_progress_pulse_step(this)
  set(`value`) {
    gtk_entry_set_progress_pulse_step(this@progressPulseStep, `value`)
  }

public var Entry.tabs: TabArray?
  get() = gtk_entry_get_tabs(this)?.reinterpret()
  set(`value`) {
    gtk_entry_set_tabs(this@tabs, `value`)
  }

public var Entry.text: String?
  get() = gtk_entry_get_text(this).toKString()
  set(`value`) {
    gtk_entry_set_text(this@text, `value`)
  }

public val Entry.textLength: UShort
  get() = gtk_entry_get_text_length(this)

public var Entry.visibility: Boolean
  get() = gtk_entry_get_visibility(this).toBoolean()
  set(`value`) {
    gtk_entry_set_visibility(this@visibility, `value`.toInt())
  }

public var Entry.widthChars: Int
  get() = gtk_entry_get_width_chars(this)
  set(`value`) {
    gtk_entry_set_width_chars(this@widthChars, `value`)
  }

public fun Entry.getIconActivatable(iconPos: EntryIconPosition): Boolean =
    gtk_entry_get_icon_activatable(this@getIconActivatable, iconPos).toBoolean()

public fun Entry.getIconAtPos(x: Int, y: Int): Int = gtk_entry_get_icon_at_pos(this@getIconAtPos, x,
    y)

public fun Entry.getIconGicon(iconPos: EntryIconPosition): Icon? =
    gtk_entry_get_icon_gicon(this@getIconGicon, iconPos)?.reinterpret()

public fun Entry.getIconName(iconPos: EntryIconPosition): String? =
    gtk_entry_get_icon_name(this@getIconName, iconPos).toKString()

public fun Entry.getIconPixbuf(iconPos: EntryIconPosition): Pixbuf? =
    gtk_entry_get_icon_pixbuf(this@getIconPixbuf, iconPos)?.reinterpret()

public fun Entry.getIconSensitive(iconPos: EntryIconPosition): Boolean =
    gtk_entry_get_icon_sensitive(this@getIconSensitive, iconPos).toBoolean()

public fun Entry.getIconStorageType(iconPos: EntryIconPosition): ImageType =
    gtk_entry_get_icon_storage_type(this@getIconStorageType, iconPos)

public fun Entry.getIconTooltipMarkup(iconPos: EntryIconPosition): String? =
    gtk_entry_get_icon_tooltip_markup(this@getIconTooltipMarkup, iconPos).toKString()

public fun Entry.getIconTooltipText(iconPos: EntryIconPosition): String? =
    gtk_entry_get_icon_tooltip_text(this@getIconTooltipText, iconPos).toKString()

public fun Entry.grabFocusWithoutSelecting(): Unit {
  gtk_entry_grab_focus_without_selecting(this@grabFocusWithoutSelecting)
}

public fun Entry.imContextFilterKeypress(event: EventKey?): Boolean =
    gtk_entry_im_context_filter_keypress(this@imContextFilterKeypress,
    event?.reinterpret()).toBoolean()

public fun Entry.layoutIndexToTextIndex(layoutIndex: Int): Int =
    gtk_entry_layout_index_to_text_index(this@layoutIndexToTextIndex, layoutIndex)

public fun Entry.progressPulse(): Unit {
  gtk_entry_progress_pulse(this@progressPulse)
}

public fun Entry.resetImContext(): Unit {
  gtk_entry_reset_im_context(this@resetImContext)
}

public fun Entry.setIconActivatable(iconPos: EntryIconPosition, activatable: Boolean): Unit {
  gtk_entry_set_icon_activatable(this@setIconActivatable, iconPos, activatable.toInt())
}

public fun Entry.setIconDragSource(
  iconPos: EntryIconPosition,
  targetList: TargetList?,
  actions: DragAction
): Unit {
  gtk_entry_set_icon_drag_source(this@setIconDragSource, iconPos, targetList?.reinterpret(),
      actions)
}

public fun Entry.setIconFromGicon(iconPos: EntryIconPosition, icon: Icon?): Unit {
  gtk_entry_set_icon_from_gicon(this@setIconFromGicon, iconPos, icon?.reinterpret())
}

public fun Entry.setIconFromIconName(iconPos: EntryIconPosition, iconName: String?): Unit {
  gtk_entry_set_icon_from_icon_name(this@setIconFromIconName, iconPos, iconName)
}

public fun Entry.setIconFromPixbuf(iconPos: EntryIconPosition, pixbuf: Pixbuf?): Unit {
  gtk_entry_set_icon_from_pixbuf(this@setIconFromPixbuf, iconPos, pixbuf?.reinterpret())
}

public fun Entry.setIconSensitive(iconPos: EntryIconPosition, sensitive: Boolean): Unit {
  gtk_entry_set_icon_sensitive(this@setIconSensitive, iconPos, sensitive.toInt())
}

public fun Entry.setIconTooltipMarkup(iconPos: EntryIconPosition, tooltip: String?): Unit {
  gtk_entry_set_icon_tooltip_markup(this@setIconTooltipMarkup, iconPos, tooltip)
}

public fun Entry.setIconTooltipText(iconPos: EntryIconPosition, tooltip: String?): Unit {
  gtk_entry_set_icon_tooltip_text(this@setIconTooltipText, iconPos, tooltip)
}

public fun Entry.textIndexToLayoutIndex(textIndex: Int): Int =
    gtk_entry_text_index_to_layout_index(this@textIndexToLayoutIndex, textIndex)

public fun Entry.unsetInvisibleChar(): Unit {
  gtk_entry_unset_invisible_char(this@unsetInvisibleChar)
}

public fun Entry.onActivate(callback: (Entry) -> Unit): Entry {
  // TODO - handle callback data

  asObject.connect("activate") { callback(this) }
  return this
}

public fun Entry.onBackspace(callback: (Entry) -> Unit): Entry {
  // TODO - handle callback data

  asObject.connect("backspace") { callback(this) }
  return this
}

public fun Entry.onCopyClipboard(callback: (Entry) -> Unit): Entry {
  // TODO - handle callback data

  asObject.connect("copy-clipboard") { callback(this) }
  return this
}

public fun Entry.onCutClipboard(callback: (Entry) -> Unit): Entry {
  // TODO - handle callback data

  asObject.connect("cut-clipboard") { callback(this) }
  return this
}

public fun Entry.onDeleteFromCursor(callback: (Entry) -> Unit): Entry {
  // TODO - handle callback data

  asObject.connect("delete-from-cursor") { callback(this) }
  return this
}

public fun Entry.onIconPress(callback: (Entry) -> Unit): Entry {
  // TODO - handle callback data

  asObject.connect("icon-press") { callback(this) }
  return this
}

public fun Entry.onIconRelease(callback: (Entry) -> Unit): Entry {
  // TODO - handle callback data

  asObject.connect("icon-release") { callback(this) }
  return this
}

public fun Entry.onInsertAtCursor(callback: (Entry) -> Unit): Entry {
  // TODO - handle callback data

  asObject.connect("insert-at-cursor") { callback(this) }
  return this
}

public fun Entry.onInsertEmoji(callback: (Entry) -> Unit): Entry {
  // TODO - handle callback data

  asObject.connect("insert-emoji") { callback(this) }
  return this
}

public fun Entry.onMoveCursor(callback: (Entry) -> Unit): Entry {
  // TODO - handle callback data

  asObject.connect("move-cursor") { callback(this) }
  return this
}

public fun Entry.onPasteClipboard(callback: (Entry) -> Unit): Entry {
  // TODO - handle callback data

  asObject.connect("paste-clipboard") { callback(this) }
  return this
}

public fun Entry.onPopulatePopup(callback: (Entry) -> Unit): Entry {
  // TODO - handle callback data

  asObject.connect("populate-popup") { callback(this) }
  return this
}

public fun Entry.onPreeditChanged(callback: (Entry) -> Unit): Entry {
  // TODO - handle callback data

  asObject.connect("preedit-changed") { callback(this) }
  return this
}

public fun Entry.onToggleOverwrite(callback: (Entry) -> Unit): Entry {
  // TODO - handle callback data

  asObject.connect("toggle-overwrite") { callback(this) }
  return this
}
