// TODO - implement:
//   add_child_at_anchor
//   add_child_in_window
//   backward_display_line
//   backward_display_line_start
//   buffer_to_window_coords
//   forward_display_line
//   forward_display_line_end
//   get_accepts_tab
//   get_border_window_size
//   get_bottom_margin
//   get_buffer
//   get_cursor_locations
//   get_cursor_visible
//   get_default_attributes
//   get_editable
//   get_hadjustment
//   get_indent
//   get_input_hints
//   get_input_purpose
//   get_iter_at_location
//   get_iter_at_position
//   get_iter_location
//   get_justification
//   get_left_margin
//   get_line_at_y
//   get_line_yrange
//   get_monospace
//   get_overwrite
//   get_pixels_above_lines
//   get_pixels_below_lines
//   get_pixels_inside_wrap
//   get_right_margin
//   get_tabs
//   get_top_margin
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
//   set_accepts_tab
//   set_border_window_size
//   set_bottom_margin
//   set_buffer
//   set_cursor_visible
//   set_editable
//   set_indent
//   set_input_hints
//   set_input_purpose
//   set_justification
//   set_left_margin
//   set_monospace
//   set_overwrite
//   set_pixels_above_lines
//   set_pixels_below_lines
//   set_pixels_inside_wrap
//   set_right_margin
//   set_tabs
//   set_top_margin
//   set_wrap_mode
//   starts_display_line
//   window_to_buffer_coords
package org.gnome.gtk

import gtk3.GtkTextView
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias TextView = CPointer<GtkTextView>

public val TextView.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val TextView.asWidget: Widget
  get() = reinterpret()

public val TextView.asContainer: Container
  get() = reinterpret()
