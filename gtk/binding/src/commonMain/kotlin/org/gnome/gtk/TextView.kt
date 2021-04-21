// TODO - method: buffer_to_window_coords
// TODO - method: get_cursor_locations
// TODO - method: get_hadjustment
// TODO - method: get_iter_at_location
// TODO - method: get_iter_at_position
// TODO - method: get_iter_location
// TODO - method: get_line_at_y
// TODO - method: get_line_yrange
// TODO - method: get_tabs
// TODO - method: get_vadjustment
// TODO - method: get_visible_rect
// TODO - method: get_window
// TODO - method: get_window_type
// TODO - method: im_context_filter_keypress
// TODO - method: set_tabs
// TODO - method: window_to_buffer_coords
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType","FunctionName")

package org.gnome.gtk

import gtk3.GtkTextView
import gtk3.gtk_text_view_add_child_at_anchor
import gtk3.gtk_text_view_add_child_in_window
import gtk3.gtk_text_view_backward_display_line
import gtk3.gtk_text_view_backward_display_line_start
import gtk3.gtk_text_view_forward_display_line
import gtk3.gtk_text_view_forward_display_line_end
import gtk3.gtk_text_view_get_accepts_tab
import gtk3.gtk_text_view_get_border_window_size
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
import gtk3.gtk_text_view_get_top_margin
import gtk3.gtk_text_view_get_wrap_mode
import gtk3.gtk_text_view_move_child
import gtk3.gtk_text_view_move_mark_onscreen
import gtk3.gtk_text_view_move_visually
import gtk3.gtk_text_view_new
import gtk3.gtk_text_view_new_with_buffer
import gtk3.gtk_text_view_place_cursor_onscreen
import gtk3.gtk_text_view_reset_cursor_blink
import gtk3.gtk_text_view_reset_im_context
import gtk3.gtk_text_view_scroll_mark_onscreen
import gtk3.gtk_text_view_scroll_to_iter
import gtk3.gtk_text_view_scroll_to_mark
import gtk3.gtk_text_view_set_accepts_tab
import gtk3.gtk_text_view_set_border_window_size
import gtk3.gtk_text_view_set_bottom_margin
import gtk3.gtk_text_view_set_buffer
import gtk3.gtk_text_view_set_cursor_visible
import gtk3.gtk_text_view_set_editable
import gtk3.gtk_text_view_set_indent
import gtk3.gtk_text_view_set_input_hints
import gtk3.gtk_text_view_set_input_purpose
import gtk3.gtk_text_view_set_justification
import gtk3.gtk_text_view_set_left_margin
import gtk3.gtk_text_view_set_monospace
import gtk3.gtk_text_view_set_overwrite
import gtk3.gtk_text_view_set_pixels_above_lines
import gtk3.gtk_text_view_set_pixels_below_lines
import gtk3.gtk_text_view_set_pixels_inside_wrap
import gtk3.gtk_text_view_set_right_margin
import gtk3.gtk_text_view_set_top_margin
import gtk3.gtk_text_view_set_wrap_mode
import gtk3.gtk_text_view_starts_display_line
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.gobject.connect
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

public object TextViewFactory {
  public fun new(): TextView = gtk_text_view_new()!!.reinterpret()

  public fun newWithBuffer(buffer: TextBuffer?): TextView =
      gtk_text_view_new_with_buffer(buffer?.reinterpret())!!.reinterpret()
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

public var TextView.buffer: TextBuffer?
  get() = gtk_text_view_get_buffer(this)?.reinterpret()
  set(`value`) {
    gtk_text_view_set_buffer(this, value)
  }

public var TextView.cursorVisible: Boolean
  get() = gtk_text_view_get_cursor_visible(this).toBoolean
  set(`value`) {
    gtk_text_view_set_cursor_visible(this, value.toInt)
  }

public val TextView.defaultAttributes: TextAttributes?
  get() = gtk_text_view_get_default_attributes(this)?.reinterpret()

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

public var TextView.inputHints: InputHints
  get() = gtk_text_view_get_input_hints(this)
  set(`value`) {
    gtk_text_view_set_input_hints(this, value)
  }

public var TextView.inputPurpose: InputPurpose
  get() = gtk_text_view_get_input_purpose(this)
  set(`value`) {
    gtk_text_view_set_input_purpose(this, value)
  }

public var TextView.justification: Justification
  get() = gtk_text_view_get_justification(this)
  set(`value`) {
    gtk_text_view_set_justification(this, value)
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

public var TextView.wrapMode: WrapMode
  get() = gtk_text_view_get_wrap_mode(this)
  set(`value`) {
    gtk_text_view_set_wrap_mode(this, value)
  }

public fun TextView.addChildAtAnchor(child: Widget?, anchor: TextChildAnchor?): Unit {
  gtk_text_view_add_child_at_anchor(this, child?.reinterpret(), anchor?.reinterpret())
}

public fun TextView.addChildInWindow(
  child: Widget?,
  whichWindow: TextWindowType,
  xpos: Int,
  ypos: Int
): Unit {
  gtk_text_view_add_child_in_window(this, child?.reinterpret(), whichWindow, xpos, ypos)
}

public fun TextView.backwardDisplayLine(iter: TextIter?): Boolean =
    gtk_text_view_backward_display_line(this, iter?.reinterpret()).toBoolean

public fun TextView.backwardDisplayLineStart(iter: TextIter?): Boolean =
    gtk_text_view_backward_display_line_start(this, iter?.reinterpret()).toBoolean

public fun TextView.forwardDisplayLine(iter: TextIter?): Boolean =
    gtk_text_view_forward_display_line(this, iter?.reinterpret()).toBoolean

public fun TextView.forwardDisplayLineEnd(iter: TextIter?): Boolean =
    gtk_text_view_forward_display_line_end(this, iter?.reinterpret()).toBoolean

public fun TextView.getBorderWindowSize(type: TextWindowType): Int =
    gtk_text_view_get_border_window_size(this, type)

public fun TextView.moveChild(
  child: Widget?,
  xpos: Int,
  ypos: Int
): Unit {
  gtk_text_view_move_child(this, child?.reinterpret(), xpos, ypos)
}

public fun TextView.moveMarkOnscreen(mark: TextMark?): Boolean =
    gtk_text_view_move_mark_onscreen(this, mark?.reinterpret()).toBoolean

public fun TextView.moveVisually(iter: TextIter?, count: Int): Boolean =
    gtk_text_view_move_visually(this, iter?.reinterpret(), count).toBoolean

public fun TextView.placeCursorOnscreen(): Boolean =
    gtk_text_view_place_cursor_onscreen(this).toBoolean

public fun TextView.resetCursorBlink(): Unit {
  gtk_text_view_reset_cursor_blink(this)
}

public fun TextView.resetImContext(): Unit {
  gtk_text_view_reset_im_context(this)
}

public fun TextView.scrollMarkOnscreen(mark: TextMark?): Unit {
  gtk_text_view_scroll_mark_onscreen(this, mark?.reinterpret())
}

public fun TextView.scrollToIter(
  iter: TextIter?,
  withinMargin: Double,
  useAlign: Boolean,
  xalign: Double,
  yalign: Double
): Boolean = gtk_text_view_scroll_to_iter(this, iter?.reinterpret(), withinMargin, useAlign.toInt,
    xalign, yalign).toBoolean

public fun TextView.scrollToMark(
  mark: TextMark?,
  withinMargin: Double,
  useAlign: Boolean,
  xalign: Double,
  yalign: Double
): Unit {
  gtk_text_view_scroll_to_mark(this, mark?.reinterpret(), withinMargin, useAlign.toInt, xalign,
      yalign)
}

public fun TextView.setBorderWindowSize(type: TextWindowType, size: Int): Unit {
  gtk_text_view_set_border_window_size(this, type, size)
}

public fun TextView.startsDisplayLine(iter: TextIter?): Boolean =
    gtk_text_view_starts_display_line(this, iter?.reinterpret()).toBoolean

public fun TextView.onBackspace(callback: (TextView) -> Unit): TextView {
  // TODO - handle callback data

  asObject.connect("backspace") { callback(this) }
  return this
}

public fun TextView.onCopyClipboard(callback: (TextView) -> Unit): TextView {
  // TODO - handle callback data

  asObject.connect("copy-clipboard") { callback(this) }
  return this
}

public fun TextView.onCutClipboard(callback: (TextView) -> Unit): TextView {
  // TODO - handle callback data

  asObject.connect("cut-clipboard") { callback(this) }
  return this
}

public fun TextView.onDeleteFromCursor(callback: (TextView) -> Unit): TextView {
  // TODO - handle callback data

  asObject.connect("delete-from-cursor") { callback(this) }
  return this
}

public fun TextView.onExtendSelection(callback: (TextView) -> Unit): TextView {
  // TODO - handle callback data

  asObject.connect("extend-selection") { callback(this) }
  return this
}

public fun TextView.onInsertAtCursor(callback: (TextView) -> Unit): TextView {
  // TODO - handle callback data

  asObject.connect("insert-at-cursor") { callback(this) }
  return this
}

public fun TextView.onInsertEmoji(callback: (TextView) -> Unit): TextView {
  // TODO - handle callback data

  asObject.connect("insert-emoji") { callback(this) }
  return this
}

public fun TextView.onMoveCursor(callback: (TextView) -> Unit): TextView {
  // TODO - handle callback data

  asObject.connect("move-cursor") { callback(this) }
  return this
}

public fun TextView.onMoveViewport(callback: (TextView) -> Unit): TextView {
  // TODO - handle callback data

  asObject.connect("move-viewport") { callback(this) }
  return this
}

public fun TextView.onPasteClipboard(callback: (TextView) -> Unit): TextView {
  // TODO - handle callback data

  asObject.connect("paste-clipboard") { callback(this) }
  return this
}

public fun TextView.onPopulatePopup(callback: (TextView) -> Unit): TextView {
  // TODO - handle callback data

  asObject.connect("populate-popup") { callback(this) }
  return this
}

public fun TextView.onPreeditChanged(callback: (TextView) -> Unit): TextView {
  // TODO - handle callback data

  asObject.connect("preedit-changed") { callback(this) }
  return this
}

public fun TextView.onSelectAll(callback: (TextView) -> Unit): TextView {
  // TODO - handle callback data

  asObject.connect("select-all") { callback(this) }
  return this
}

public fun TextView.onSetAnchor(callback: (TextView) -> Unit): TextView {
  // TODO - handle callback data

  asObject.connect("set-anchor") { callback(this) }
  return this
}

public fun TextView.onToggleCursorVisible(callback: (TextView) -> Unit): TextView {
  // TODO - handle callback data

  asObject.connect("toggle-cursor-visible") { callback(this) }
  return this
}

public fun TextView.onToggleOverwrite(callback: (TextView) -> Unit): TextView {
  // TODO - handle callback data

  asObject.connect("toggle-overwrite") { callback(this) }
  return this
}
