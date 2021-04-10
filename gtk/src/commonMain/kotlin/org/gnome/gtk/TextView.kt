// TODO - implement:
//   add_child_at_anchor
//   add_child_in_window
//   backward_display_line
//   backward_display_line_start
//   buffer_to_window_coords
//   forward_display_line
//   forward_display_line_end
//   get_border_window_size
//   get_cursor_locations
//   get_iter_at_location
//   get_iter_at_position
//   get_iter_location
//   get_line_at_y
//   get_line_yrange
//   get_visible_rect
//   get_window
//   get_window_type
//   im_context_filter_keypress
//   move_child
//   move_mark_onscreen
//   move_visually
//   scroll_mark_onscreen
//   scroll_to_iter
//   scroll_to_mark
//   set_border_window_size
//   set_buffer
//   set_input_hints
//   set_input_purpose
//   set_justification
//   set_tabs
//   set_wrap_mode
//   starts_display_line
//   window_to_buffer_coords
package org.gnome.gtk

import gtk3.GtkTextView
import gtk3.gtk_text_view_get_accepts_tab
import gtk3.gtk_text_view_get_bottom_margin
import gtk3.gtk_text_view_get_buffer
import gtk3.gtk_text_view_get_cursor_visible
import gtk3.gtk_text_view_get_default_attributes
import gtk3.gtk_text_view_get_editable
import gtk3.gtk_text_view_get_indent
import gtk3.gtk_text_view_get_input_hints
import gtk3.gtk_text_view_get_input_purpose
import gtk3.gtk_text_view_get_justification
import gtk3.gtk_text_view_get_left_margin
import gtk3.gtk_text_view_get_monospace
import gtk3.gtk_text_view_get_overwrite
import gtk3.gtk_text_view_get_pixels_above_lines
import gtk3.gtk_text_view_get_pixels_below_lines
import gtk3.gtk_text_view_get_pixels_inside_wrap
import gtk3.gtk_text_view_get_right_margin
import gtk3.gtk_text_view_get_tabs
import gtk3.gtk_text_view_get_top_margin
import gtk3.gtk_text_view_get_wrap_mode
import gtk3.gtk_text_view_place_cursor_onscreen
import gtk3.gtk_text_view_reset_cursor_blink
import gtk3.gtk_text_view_reset_im_context
import gtk3.gtk_text_view_set_accepts_tab
import gtk3.gtk_text_view_set_bottom_margin
import gtk3.gtk_text_view_set_cursor_visible
import gtk3.gtk_text_view_set_editable
import gtk3.gtk_text_view_set_indent
import gtk3.gtk_text_view_set_left_margin
import gtk3.gtk_text_view_set_monospace
import gtk3.gtk_text_view_set_overwrite
import gtk3.gtk_text_view_set_pixels_above_lines
import gtk3.gtk_text_view_set_pixels_below_lines
import gtk3.gtk_text_view_set_pixels_inside_wrap
import gtk3.gtk_text_view_set_right_margin
import gtk3.gtk_text_view_set_top_margin
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned
import org.gnome.glib.toBoolean
import org.gnome.glib.toInt

public typealias TextView = CPointer<GtkTextView>

public val TextView.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val TextView.asWidget: Widget
  get() = reinterpret()

public val TextView.asContainer: Container
  get() = reinterpret()

public fun TextView.getBuffer(): Unit {
  gtk_text_view_get_buffer(this)
}

public fun TextView.getDefaultAttributes(): Unit {
  gtk_text_view_get_default_attributes(this)
}

public fun TextView.getInputHints(): Unit {
  gtk_text_view_get_input_hints(this)
}

public fun TextView.getInputPurpose(): Unit {
  gtk_text_view_get_input_purpose(this)
}

public fun TextView.getJustification(): Unit {
  gtk_text_view_get_justification(this)
}

public fun TextView.getTabs(): Unit {
  gtk_text_view_get_tabs(this)
}

public fun TextView.getWrapMode(): Unit {
  gtk_text_view_get_wrap_mode(this)
}

public fun TextView.placeCursorOnscreen(): Boolean =
    gtk_text_view_place_cursor_onscreen(this).toBoolean

public fun TextView.resetCursorBlink(): Unit {
  gtk_text_view_reset_cursor_blink(this)
}

public fun TextView.resetImContext(): Unit {
  gtk_text_view_reset_im_context(this)
}

public var TextView.acceptsTab: Boolean
  get() = gtk_text_view_get_accepts_tab(this).toBoolean
  set(`value`) {
    gtk_text_view_set_accepts_tab(this, value.toInt)
  }

public var TextView.bottomMargin: Int
  get() = gtk_text_view_get_bottom_margin(this)
  set(`value`) {
    gtk_text_view_set_bottom_margin(this, value)
  }

public var TextView.cursorVisible: Boolean
  get() = gtk_text_view_get_cursor_visible(this).toBoolean
  set(`value`) {
    gtk_text_view_set_cursor_visible(this, value.toInt)
  }

public var TextView.editable: Boolean
  get() = gtk_text_view_get_editable(this).toBoolean
  set(`value`) {
    gtk_text_view_set_editable(this, value.toInt)
  }

public var TextView.indent: Int
  get() = gtk_text_view_get_indent(this)
  set(`value`) {
    gtk_text_view_set_indent(this, value)
  }

public var TextView.leftMargin: Int
  get() = gtk_text_view_get_left_margin(this)
  set(`value`) {
    gtk_text_view_set_left_margin(this, value)
  }

public var TextView.monospace: Boolean
  get() = gtk_text_view_get_monospace(this).toBoolean
  set(`value`) {
    gtk_text_view_set_monospace(this, value.toInt)
  }

public var TextView.overwrite: Boolean
  get() = gtk_text_view_get_overwrite(this).toBoolean
  set(`value`) {
    gtk_text_view_set_overwrite(this, value.toInt)
  }

public var TextView.pixelsAboveLines: Int
  get() = gtk_text_view_get_pixels_above_lines(this)
  set(`value`) {
    gtk_text_view_set_pixels_above_lines(this, value)
  }

public var TextView.pixelsBelowLines: Int
  get() = gtk_text_view_get_pixels_below_lines(this)
  set(`value`) {
    gtk_text_view_set_pixels_below_lines(this, value)
  }

public var TextView.pixelsInsideWrap: Int
  get() = gtk_text_view_get_pixels_inside_wrap(this)
  set(`value`) {
    gtk_text_view_set_pixels_inside_wrap(this, value)
  }

public var TextView.rightMargin: Int
  get() = gtk_text_view_get_right_margin(this)
  set(`value`) {
    gtk_text_view_set_right_margin(this, value)
  }

public var TextView.topMargin: Int
  get() = gtk_text_view_get_top_margin(this)
  set(`value`) {
    gtk_text_view_set_top_margin(this, value)
  }
