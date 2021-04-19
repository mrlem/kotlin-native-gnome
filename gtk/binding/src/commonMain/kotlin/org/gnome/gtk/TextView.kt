// TODO - add_child_in_window
// TODO - buffer_to_window_coords
// TODO - get_border_window_size
// TODO - get_cursor_locations
// TODO - get_input_purpose
// TODO - get_iter_at_location
// TODO - get_iter_at_position
// TODO - get_iter_location
// TODO - get_justification
// TODO - get_line_at_y
// TODO - get_line_yrange
// TODO - get_tabs
// TODO - get_visible_rect
// TODO - get_window
// TODO - get_window_type
// TODO - get_wrap_mode
// TODO - im_context_filter_keypress
// TODO - set_border_window_size
// TODO - set_input_purpose
// TODO - set_justification
// TODO - set_tabs
// TODO - set_wrap_mode
// TODO - window_to_buffer_coords
//
package org.gnome.gtk

import gtk3.GtkTextView
import gtk3.gtk_text_view_add_child_at_anchor
import gtk3.gtk_text_view_backward_display_line
import gtk3.gtk_text_view_backward_display_line_start
import gtk3.gtk_text_view_forward_display_line
import gtk3.gtk_text_view_forward_display_line_end
import gtk3.gtk_text_view_get_accepts_tab
import gtk3.gtk_text_view_get_bottom_margin
import gtk3.gtk_text_view_get_buffer
import gtk3.gtk_text_view_get_cursor_visible
import gtk3.gtk_text_view_get_default_attributes
import gtk3.gtk_text_view_get_editable
import gtk3.gtk_text_view_get_indent
import gtk3.gtk_text_view_get_input_hints
import gtk3.gtk_text_view_get_left_margin
import gtk3.gtk_text_view_get_monospace
import gtk3.gtk_text_view_get_overwrite
import gtk3.gtk_text_view_get_pixels_above_lines
import gtk3.gtk_text_view_get_pixels_below_lines
import gtk3.gtk_text_view_get_pixels_inside_wrap
import gtk3.gtk_text_view_get_right_margin
import gtk3.gtk_text_view_get_top_margin
import gtk3.gtk_text_view_move_child
import gtk3.gtk_text_view_move_mark_onscreen
import gtk3.gtk_text_view_move_visually
import gtk3.gtk_text_view_place_cursor_onscreen
import gtk3.gtk_text_view_reset_cursor_blink
import gtk3.gtk_text_view_reset_im_context
import gtk3.gtk_text_view_scroll_mark_onscreen
import gtk3.gtk_text_view_scroll_to_iter
import gtk3.gtk_text_view_scroll_to_mark
import gtk3.gtk_text_view_set_accepts_tab
import gtk3.gtk_text_view_set_bottom_margin
import gtk3.gtk_text_view_set_buffer
import gtk3.gtk_text_view_set_cursor_visible
import gtk3.gtk_text_view_set_editable
import gtk3.gtk_text_view_set_indent
import gtk3.gtk_text_view_set_input_hints
import gtk3.gtk_text_view_set_left_margin
import gtk3.gtk_text_view_set_monospace
import gtk3.gtk_text_view_set_overwrite
import gtk3.gtk_text_view_set_pixels_above_lines
import gtk3.gtk_text_view_set_pixels_below_lines
import gtk3.gtk_text_view_set_pixels_inside_wrap
import gtk3.gtk_text_view_set_right_margin
import gtk3.gtk_text_view_set_top_margin
import gtk3.gtk_text_view_starts_display_line
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt

public typealias TextView = CPointer<GtkTextView>

public val TextView.asObject: Object
  get() = reinterpret()

public val TextView.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val TextView.asWidget: Widget
  get() = reinterpret()

public val TextView.asContainer: Container
  get() = reinterpret()

public fun TextView.addChildAtAnchor(child: Widget, anchor: TextChildAnchor): Unit {
  gtk_text_view_add_child_at_anchor(this, child.reinterpret(), anchor.reinterpret())
}

public fun TextView.backwardDisplayLine(iter: TextIter): Boolean =
    gtk_text_view_backward_display_line(this, iter.reinterpret()).toBoolean

public fun TextView.backwardDisplayLineStart(iter: TextIter): Boolean =
    gtk_text_view_backward_display_line_start(this, iter.reinterpret()).toBoolean

public fun TextView.forwardDisplayLine(iter: TextIter): Boolean =
    gtk_text_view_forward_display_line(this, iter.reinterpret()).toBoolean

public fun TextView.forwardDisplayLineEnd(iter: TextIter): Boolean =
    gtk_text_view_forward_display_line_end(this, iter.reinterpret()).toBoolean

public fun TextView.getAcceptsTab(): Boolean = gtk_text_view_get_accepts_tab(this).toBoolean

public fun TextView.getBottomMargin(): Int = gtk_text_view_get_bottom_margin(this)

public fun TextView.getBuffer(): TextBuffer? = gtk_text_view_get_buffer(this)?.reinterpret()

public fun TextView.getCursorVisible(): Boolean = gtk_text_view_get_cursor_visible(this).toBoolean

public fun TextView.getDefaultAttributes(): TextAttributes? =
    gtk_text_view_get_default_attributes(this)?.reinterpret()

public fun TextView.getEditable(): Boolean = gtk_text_view_get_editable(this).toBoolean

public fun TextView.getIndent(): Int = gtk_text_view_get_indent(this)

public fun TextView.getInputHints(): InputHints = gtk_text_view_get_input_hints(this)

public fun TextView.getLeftMargin(): Int = gtk_text_view_get_left_margin(this)

public fun TextView.getMonospace(): Boolean = gtk_text_view_get_monospace(this).toBoolean

public fun TextView.getOverwrite(): Boolean = gtk_text_view_get_overwrite(this).toBoolean

public fun TextView.getPixelsAboveLines(): Int = gtk_text_view_get_pixels_above_lines(this)

public fun TextView.getPixelsBelowLines(): Int = gtk_text_view_get_pixels_below_lines(this)

public fun TextView.getPixelsInsideWrap(): Int = gtk_text_view_get_pixels_inside_wrap(this)

public fun TextView.getRightMargin(): Int = gtk_text_view_get_right_margin(this)

public fun TextView.getTopMargin(): Int = gtk_text_view_get_top_margin(this)

public fun TextView.moveChild(
  child: Widget,
  xpos: Int,
  ypos: Int
): Unit {
  gtk_text_view_move_child(this, child.reinterpret(), xpos, ypos)
}

public fun TextView.moveMarkOnscreen(mark: TextMark): Boolean =
    gtk_text_view_move_mark_onscreen(this, mark.reinterpret()).toBoolean

public fun TextView.moveVisually(iter: TextIter, count: Int): Boolean =
    gtk_text_view_move_visually(this, iter.reinterpret(), count).toBoolean

public fun TextView.placeCursorOnscreen(): Boolean =
    gtk_text_view_place_cursor_onscreen(this).toBoolean

public fun TextView.resetCursorBlink(): Unit {
  gtk_text_view_reset_cursor_blink(this)
}

public fun TextView.resetImContext(): Unit {
  gtk_text_view_reset_im_context(this)
}

public fun TextView.scrollMarkOnscreen(mark: TextMark): Unit {
  gtk_text_view_scroll_mark_onscreen(this, mark.reinterpret())
}

public fun TextView.scrollToIter(
  iter: TextIter,
  withinMargin: Double,
  useAlign: Boolean,
  xalign: Double,
  yalign: Double
): Boolean = gtk_text_view_scroll_to_iter(this, iter.reinterpret(), withinMargin, useAlign.toInt,
    xalign, yalign).toBoolean

public fun TextView.scrollToMark(
  mark: TextMark,
  withinMargin: Double,
  useAlign: Boolean,
  xalign: Double,
  yalign: Double
): Unit {
  gtk_text_view_scroll_to_mark(this, mark.reinterpret(), withinMargin, useAlign.toInt, xalign,
      yalign)
}

public fun TextView.setAcceptsTab(acceptsTab: Boolean): Unit {
  gtk_text_view_set_accepts_tab(this, acceptsTab.toInt)
}

public fun TextView.setBottomMargin(bottomMargin: Int): Unit {
  gtk_text_view_set_bottom_margin(this, bottomMargin)
}

public fun TextView.setBuffer(buffer: TextBuffer): Unit {
  gtk_text_view_set_buffer(this, buffer.reinterpret())
}

public fun TextView.setCursorVisible(setting: Boolean): Unit {
  gtk_text_view_set_cursor_visible(this, setting.toInt)
}

public fun TextView.setEditable(setting: Boolean): Unit {
  gtk_text_view_set_editable(this, setting.toInt)
}

public fun TextView.setIndent(indent: Int): Unit {
  gtk_text_view_set_indent(this, indent)
}

public fun TextView.setInputHints(hints: InputHints): Unit {
  gtk_text_view_set_input_hints(this, hints)
}

public fun TextView.setLeftMargin(leftMargin: Int): Unit {
  gtk_text_view_set_left_margin(this, leftMargin)
}

public fun TextView.setMonospace(monospace: Boolean): Unit {
  gtk_text_view_set_monospace(this, monospace.toInt)
}

public fun TextView.setOverwrite(overwrite: Boolean): Unit {
  gtk_text_view_set_overwrite(this, overwrite.toInt)
}

public fun TextView.setPixelsAboveLines(pixelsAboveLines: Int): Unit {
  gtk_text_view_set_pixels_above_lines(this, pixelsAboveLines)
}

public fun TextView.setPixelsBelowLines(pixelsBelowLines: Int): Unit {
  gtk_text_view_set_pixels_below_lines(this, pixelsBelowLines)
}

public fun TextView.setPixelsInsideWrap(pixelsInsideWrap: Int): Unit {
  gtk_text_view_set_pixels_inside_wrap(this, pixelsInsideWrap)
}

public fun TextView.setRightMargin(rightMargin: Int): Unit {
  gtk_text_view_set_right_margin(this, rightMargin)
}

public fun TextView.setTopMargin(topMargin: Int): Unit {
  gtk_text_view_set_top_margin(this, topMargin)
}

public fun TextView.startsDisplayLine(iter: TextIter): Boolean =
    gtk_text_view_starts_display_line(this, iter.reinterpret()).toBoolean
