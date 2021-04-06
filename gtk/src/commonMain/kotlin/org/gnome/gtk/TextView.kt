// TODO - implement:
//   add_child_at_anchor
//   add_child_in_window
//   backward_display_line
//   backward_display_line_start
//   buffer_to_window_coords
//   forward_display_line
//   forward_display_line_end
//   get_border_window_size
//   get_buffer
//   get_cursor_locations
//   get_default_attributes
//   get_hadjustment
//   get_input_hints
//   get_input_purpose
//   get_iter_at_location
//   get_iter_at_position
//   get_iter_location
//   get_justification
//   get_line_at_y
//   get_line_yrange
//   get_tabs
//   get_vadjustment
//   get_visible_rect
//   get_window
//   get_window_type
//   get_wrap_mode
//   im_context_filter_keypress
//   move_child
//   move_mark_onscreen
//   move_visually
//   place_cursor_onscreen
//   reset_cursor_blink
//   reset_im_context
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
import gtk3.gtk_text_view_get_cursor_visible
import gtk3.gtk_text_view_get_editable
import gtk3.gtk_text_view_get_indent
import gtk3.gtk_text_view_get_left_margin
import gtk3.gtk_text_view_get_monospace
import gtk3.gtk_text_view_get_overwrite
import gtk3.gtk_text_view_get_pixels_above_lines
import gtk3.gtk_text_view_get_pixels_below_lines
import gtk3.gtk_text_view_get_pixels_inside_wrap
import gtk3.gtk_text_view_get_right_margin
import gtk3.gtk_text_view_get_top_margin
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
