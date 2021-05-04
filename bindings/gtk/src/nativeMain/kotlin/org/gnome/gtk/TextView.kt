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
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkTextView
import interop.gtk_text_view_add_child_at_anchor
import interop.gtk_text_view_add_child_in_window
import interop.gtk_text_view_backward_display_line
import interop.gtk_text_view_backward_display_line_start
import interop.gtk_text_view_forward_display_line
import interop.gtk_text_view_forward_display_line_end
import interop.gtk_text_view_get_accepts_tab
import interop.gtk_text_view_get_border_window_size
import interop.gtk_text_view_get_bottom_margin
import interop.gtk_text_view_get_buffer
import interop.gtk_text_view_get_cursor_visible
import interop.gtk_text_view_get_default_attributes
import interop.gtk_text_view_get_editable
import interop.gtk_text_view_get_indent
import interop.gtk_text_view_get_input_hints
import interop.gtk_text_view_get_input_purpose
import interop.gtk_text_view_get_justification
import interop.gtk_text_view_get_left_margin
import interop.gtk_text_view_get_monospace
import interop.gtk_text_view_get_overwrite
import interop.gtk_text_view_get_pixels_above_lines
import interop.gtk_text_view_get_pixels_below_lines
import interop.gtk_text_view_get_pixels_inside_wrap
import interop.gtk_text_view_get_right_margin
import interop.gtk_text_view_get_top_margin
import interop.gtk_text_view_get_wrap_mode
import interop.gtk_text_view_move_child
import interop.gtk_text_view_move_mark_onscreen
import interop.gtk_text_view_move_visually
import interop.gtk_text_view_new
import interop.gtk_text_view_new_with_buffer
import interop.gtk_text_view_place_cursor_onscreen
import interop.gtk_text_view_reset_cursor_blink
import interop.gtk_text_view_reset_im_context
import interop.gtk_text_view_scroll_mark_onscreen
import interop.gtk_text_view_scroll_to_iter
import interop.gtk_text_view_scroll_to_mark
import interop.gtk_text_view_set_accepts_tab
import interop.gtk_text_view_set_border_window_size
import interop.gtk_text_view_set_bottom_margin
import interop.gtk_text_view_set_buffer
import interop.gtk_text_view_set_cursor_visible
import interop.gtk_text_view_set_editable
import interop.gtk_text_view_set_indent
import interop.gtk_text_view_set_input_hints
import interop.gtk_text_view_set_input_purpose
import interop.gtk_text_view_set_justification
import interop.gtk_text_view_set_left_margin
import interop.gtk_text_view_set_monospace
import interop.gtk_text_view_set_overwrite
import interop.gtk_text_view_set_pixels_above_lines
import interop.gtk_text_view_set_pixels_below_lines
import interop.gtk_text_view_set_pixels_inside_wrap
import interop.gtk_text_view_set_right_margin
import interop.gtk_text_view_set_top_margin
import interop.gtk_text_view_set_wrap_mode
import interop.gtk_text_view_starts_display_line
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt
import org.mrlem.gnome.gobject.connect

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

public val TextView.parentInstance: Container
  get() = pointed.parent_instance.ptr

public var TextView.acceptsTab: Boolean
  get() = gtk_text_view_get_accepts_tab(this).toBoolean()
  set(`value`) {
    gtk_text_view_set_accepts_tab(this@acceptsTab, `value`.toInt())
  }

public var TextView.bottomMargin: Int
  get() = gtk_text_view_get_bottom_margin(this)
  set(`value`) {
    gtk_text_view_set_bottom_margin(this@bottomMargin, `value`)
  }

public var TextView.buffer: TextBuffer?
  get() = gtk_text_view_get_buffer(this)?.reinterpret()
  set(`value`) {
    gtk_text_view_set_buffer(this@buffer, `value`)
  }

public var TextView.cursorVisible: Boolean
  get() = gtk_text_view_get_cursor_visible(this).toBoolean()
  set(`value`) {
    gtk_text_view_set_cursor_visible(this@cursorVisible, `value`.toInt())
  }

public val TextView.defaultAttributes: TextAttributes?
  get() = gtk_text_view_get_default_attributes(this)?.reinterpret()

public var TextView.editable: Boolean
  get() = gtk_text_view_get_editable(this).toBoolean()
  set(`value`) {
    gtk_text_view_set_editable(this@editable, `value`.toInt())
  }

public var TextView.indent: Int
  get() = gtk_text_view_get_indent(this)
  set(`value`) {
    gtk_text_view_set_indent(this@indent, `value`)
  }

public var TextView.inputHints: InputHints
  get() = gtk_text_view_get_input_hints(this)
  set(`value`) {
    gtk_text_view_set_input_hints(this@inputHints, `value`)
  }

public var TextView.inputPurpose: InputPurpose
  get() = gtk_text_view_get_input_purpose(this)
  set(`value`) {
    gtk_text_view_set_input_purpose(this@inputPurpose, `value`)
  }

public var TextView.justification: Justification
  get() = gtk_text_view_get_justification(this)
  set(`value`) {
    gtk_text_view_set_justification(this@justification, `value`)
  }

public var TextView.leftMargin: Int
  get() = gtk_text_view_get_left_margin(this)
  set(`value`) {
    gtk_text_view_set_left_margin(this@leftMargin, `value`)
  }

public var TextView.monospace: Boolean
  get() = gtk_text_view_get_monospace(this).toBoolean()
  set(`value`) {
    gtk_text_view_set_monospace(this@monospace, `value`.toInt())
  }

public var TextView.overwrite: Boolean
  get() = gtk_text_view_get_overwrite(this).toBoolean()
  set(`value`) {
    gtk_text_view_set_overwrite(this@overwrite, `value`.toInt())
  }

public var TextView.pixelsAboveLines: Int
  get() = gtk_text_view_get_pixels_above_lines(this)
  set(`value`) {
    gtk_text_view_set_pixels_above_lines(this@pixelsAboveLines, `value`)
  }

public var TextView.pixelsBelowLines: Int
  get() = gtk_text_view_get_pixels_below_lines(this)
  set(`value`) {
    gtk_text_view_set_pixels_below_lines(this@pixelsBelowLines, `value`)
  }

public var TextView.pixelsInsideWrap: Int
  get() = gtk_text_view_get_pixels_inside_wrap(this)
  set(`value`) {
    gtk_text_view_set_pixels_inside_wrap(this@pixelsInsideWrap, `value`)
  }

public var TextView.rightMargin: Int
  get() = gtk_text_view_get_right_margin(this)
  set(`value`) {
    gtk_text_view_set_right_margin(this@rightMargin, `value`)
  }

public var TextView.topMargin: Int
  get() = gtk_text_view_get_top_margin(this)
  set(`value`) {
    gtk_text_view_set_top_margin(this@topMargin, `value`)
  }

public var TextView.wrapMode: WrapMode
  get() = gtk_text_view_get_wrap_mode(this)
  set(`value`) {
    gtk_text_view_set_wrap_mode(this@wrapMode, `value`)
  }

public fun TextView.addChildAtAnchor(child: Widget?, anchor: TextChildAnchor?): Unit {
  gtk_text_view_add_child_at_anchor(this@addChildAtAnchor, child?.reinterpret(),
      anchor?.reinterpret())
}

public fun TextView.addChildInWindow(
  child: Widget?,
  whichWindow: TextWindowType,
  xpos: Int,
  ypos: Int
): Unit {
  gtk_text_view_add_child_in_window(this@addChildInWindow, child?.reinterpret(), whichWindow, xpos,
      ypos)
}

public fun TextView.backwardDisplayLine(iter: TextIter?): Boolean =
    gtk_text_view_backward_display_line(this@backwardDisplayLine, iter?.reinterpret()).toBoolean()

public fun TextView.backwardDisplayLineStart(iter: TextIter?): Boolean =
    gtk_text_view_backward_display_line_start(this@backwardDisplayLineStart,
    iter?.reinterpret()).toBoolean()

public fun TextView.forwardDisplayLine(iter: TextIter?): Boolean =
    gtk_text_view_forward_display_line(this@forwardDisplayLine, iter?.reinterpret()).toBoolean()

public fun TextView.forwardDisplayLineEnd(iter: TextIter?): Boolean =
    gtk_text_view_forward_display_line_end(this@forwardDisplayLineEnd,
    iter?.reinterpret()).toBoolean()

public fun TextView.getBorderWindowSize(type: TextWindowType): Int =
    gtk_text_view_get_border_window_size(this@getBorderWindowSize, type)

public fun TextView.moveChild(
  child: Widget?,
  xpos: Int,
  ypos: Int
): Unit {
  gtk_text_view_move_child(this@moveChild, child?.reinterpret(), xpos, ypos)
}

public fun TextView.moveMarkOnscreen(mark: TextMark?): Boolean =
    gtk_text_view_move_mark_onscreen(this@moveMarkOnscreen, mark?.reinterpret()).toBoolean()

public fun TextView.moveVisually(iter: TextIter?, count: Int): Boolean =
    gtk_text_view_move_visually(this@moveVisually, iter?.reinterpret(), count).toBoolean()

public fun TextView.placeCursorOnscreen(): Boolean =
    gtk_text_view_place_cursor_onscreen(this@placeCursorOnscreen).toBoolean()

public fun TextView.resetCursorBlink(): Unit {
  gtk_text_view_reset_cursor_blink(this@resetCursorBlink)
}

public fun TextView.resetImContext(): Unit {
  gtk_text_view_reset_im_context(this@resetImContext)
}

public fun TextView.scrollMarkOnscreen(mark: TextMark?): Unit {
  gtk_text_view_scroll_mark_onscreen(this@scrollMarkOnscreen, mark?.reinterpret())
}

public fun TextView.scrollToIter(
  iter: TextIter?,
  withinMargin: Double,
  useAlign: Boolean,
  xalign: Double,
  yalign: Double
): Boolean = gtk_text_view_scroll_to_iter(this@scrollToIter, iter?.reinterpret(), withinMargin,
    useAlign.toInt(), xalign, yalign).toBoolean()

public fun TextView.scrollToMark(
  mark: TextMark?,
  withinMargin: Double,
  useAlign: Boolean,
  xalign: Double,
  yalign: Double
): Unit {
  gtk_text_view_scroll_to_mark(this@scrollToMark, mark?.reinterpret(), withinMargin,
      useAlign.toInt(), xalign, yalign)
}

public fun TextView.setBorderWindowSize(type: TextWindowType, size: Int): Unit {
  gtk_text_view_set_border_window_size(this@setBorderWindowSize, type, size)
}

public fun TextView.startsDisplayLine(iter: TextIter?): Boolean =
    gtk_text_view_starts_display_line(this@startsDisplayLine, iter?.reinterpret()).toBoolean()

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
