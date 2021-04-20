// TODO - create_tag
// TODO - deserialize
// TODO - deserialize_get_can_create_tags
// TODO - deserialize_set_can_create_tags
// TODO - get_bounds
// TODO - get_deserialize_formats
// TODO - get_end_iter
// TODO - get_iter_at_child_anchor
// TODO - get_iter_at_line
// TODO - get_iter_at_line_index
// TODO - get_iter_at_line_offset
// TODO - get_iter_at_mark
// TODO - get_iter_at_offset
// TODO - get_selection_bounds
// TODO - get_serialize_formats
// TODO - get_start_iter
// TODO - insert_pixbuf
// TODO - insert_with_tags
// TODO - insert_with_tags_by_name
// TODO - register_deserialize_format
// TODO - register_deserialize_tagset
// TODO - register_serialize_format
// TODO - register_serialize_tagset
// TODO - serialize
// TODO - unregister_deserialize_format
// TODO - unregister_serialize_format
//
package org.gnome.gtk

import gtk3.GtkTextBuffer
import gtk3.gtk_text_buffer_add_mark
import gtk3.gtk_text_buffer_add_selection_clipboard
import gtk3.gtk_text_buffer_apply_tag
import gtk3.gtk_text_buffer_apply_tag_by_name
import gtk3.gtk_text_buffer_backspace
import gtk3.gtk_text_buffer_begin_user_action
import gtk3.gtk_text_buffer_copy_clipboard
import gtk3.gtk_text_buffer_create_child_anchor
import gtk3.gtk_text_buffer_create_mark
import gtk3.gtk_text_buffer_cut_clipboard
import gtk3.gtk_text_buffer_delete
import gtk3.gtk_text_buffer_delete_interactive
import gtk3.gtk_text_buffer_delete_mark
import gtk3.gtk_text_buffer_delete_mark_by_name
import gtk3.gtk_text_buffer_delete_selection
import gtk3.gtk_text_buffer_end_user_action
import gtk3.gtk_text_buffer_get_char_count
import gtk3.gtk_text_buffer_get_copy_target_list
import gtk3.gtk_text_buffer_get_has_selection
import gtk3.gtk_text_buffer_get_insert
import gtk3.gtk_text_buffer_get_line_count
import gtk3.gtk_text_buffer_get_mark
import gtk3.gtk_text_buffer_get_modified
import gtk3.gtk_text_buffer_get_paste_target_list
import gtk3.gtk_text_buffer_get_selection_bound
import gtk3.gtk_text_buffer_get_slice
import gtk3.gtk_text_buffer_get_tag_table
import gtk3.gtk_text_buffer_get_text
import gtk3.gtk_text_buffer_insert
import gtk3.gtk_text_buffer_insert_at_cursor
import gtk3.gtk_text_buffer_insert_child_anchor
import gtk3.gtk_text_buffer_insert_interactive
import gtk3.gtk_text_buffer_insert_interactive_at_cursor
import gtk3.gtk_text_buffer_insert_markup
import gtk3.gtk_text_buffer_insert_range
import gtk3.gtk_text_buffer_insert_range_interactive
import gtk3.gtk_text_buffer_move_mark
import gtk3.gtk_text_buffer_move_mark_by_name
import gtk3.gtk_text_buffer_paste_clipboard
import gtk3.gtk_text_buffer_place_cursor
import gtk3.gtk_text_buffer_remove_all_tags
import gtk3.gtk_text_buffer_remove_selection_clipboard
import gtk3.gtk_text_buffer_remove_tag
import gtk3.gtk_text_buffer_remove_tag_by_name
import gtk3.gtk_text_buffer_select_range
import gtk3.gtk_text_buffer_set_modified
import gtk3.gtk_text_buffer_set_text
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt
import org.gnome.toKString

public typealias TextBuffer = CPointer<GtkTextBuffer>

public val TextBuffer.asObject: Object
  get() = reinterpret()

public val TextBuffer.charCount: Int
  get() = gtk_text_buffer_get_char_count(this)

public val TextBuffer.copyTargetList: TargetList?
  get() = gtk_text_buffer_get_copy_target_list(this)?.reinterpret()

public val TextBuffer.hasSelection: Boolean
  get() = gtk_text_buffer_get_has_selection(this).toBoolean

public val TextBuffer.insert: TextMark?
  get() = gtk_text_buffer_get_insert(this)?.reinterpret()

public val TextBuffer.lineCount: Int
  get() = gtk_text_buffer_get_line_count(this)

public var TextBuffer.modified: Boolean
  get() = gtk_text_buffer_get_modified(this).toBoolean
  set(`value`) {
    gtk_text_buffer_set_modified(this, value.toInt)
  }

public val TextBuffer.pasteTargetList: TargetList?
  get() = gtk_text_buffer_get_paste_target_list(this)?.reinterpret()

public val TextBuffer.selectionBound: TextMark?
  get() = gtk_text_buffer_get_selection_bound(this)?.reinterpret()

public val TextBuffer.tagTable: TextTagTable?
  get() = gtk_text_buffer_get_tag_table(this)?.reinterpret()

public fun TextBuffer.addMark(mark: TextMark?, `where`: TextIter?): Unit {
  gtk_text_buffer_add_mark(this, mark?.reinterpret(), where?.reinterpret())
}

public fun TextBuffer.addSelectionClipboard(clipboard: Clipboard?): Unit {
  gtk_text_buffer_add_selection_clipboard(this, clipboard?.reinterpret())
}

public fun TextBuffer.applyTag(
  tag: TextTag?,
  start: TextIter?,
  end: TextIter?
): Unit {
  gtk_text_buffer_apply_tag(this, tag?.reinterpret(), start?.reinterpret(), end?.reinterpret())
}

public fun TextBuffer.applyTagByName(
  name: String,
  start: TextIter?,
  end: TextIter?
): Unit {
  gtk_text_buffer_apply_tag_by_name(this, name, start?.reinterpret(), end?.reinterpret())
}

public fun TextBuffer.backspace(
  iter: TextIter?,
  interactive: Boolean,
  defaultEditable: Boolean
): Boolean = gtk_text_buffer_backspace(this, iter?.reinterpret(), interactive.toInt,
    defaultEditable.toInt).toBoolean

public fun TextBuffer.beginUserAction(): Unit {
  gtk_text_buffer_begin_user_action(this)
}

public fun TextBuffer.copyClipboard(clipboard: Clipboard?): Unit {
  gtk_text_buffer_copy_clipboard(this, clipboard?.reinterpret())
}

public fun TextBuffer.createChildAnchor(iter: TextIter?): TextChildAnchor? =
    gtk_text_buffer_create_child_anchor(this, iter?.reinterpret())?.reinterpret()

public fun TextBuffer.createMark(
  markName: String,
  `where`: TextIter?,
  leftGravity: Boolean
): TextMark? = gtk_text_buffer_create_mark(this, markName, where?.reinterpret(),
    leftGravity.toInt)?.reinterpret()

public fun TextBuffer.cutClipboard(clipboard: Clipboard?, defaultEditable: Boolean): Unit {
  gtk_text_buffer_cut_clipboard(this, clipboard?.reinterpret(), defaultEditable.toInt)
}

public fun TextBuffer.delete(start: TextIter?, end: TextIter?): Unit {
  gtk_text_buffer_delete(this, start?.reinterpret(), end?.reinterpret())
}

public fun TextBuffer.deleteInteractive(
  startIter: TextIter?,
  endIter: TextIter?,
  defaultEditable: Boolean
): Boolean = gtk_text_buffer_delete_interactive(this, startIter?.reinterpret(),
    endIter?.reinterpret(), defaultEditable.toInt).toBoolean

public fun TextBuffer.deleteMark(mark: TextMark?): Unit {
  gtk_text_buffer_delete_mark(this, mark?.reinterpret())
}

public fun TextBuffer.deleteMarkByName(name: String): Unit {
  gtk_text_buffer_delete_mark_by_name(this, name)
}

public fun TextBuffer.deleteSelection(interactive: Boolean, defaultEditable: Boolean): Boolean =
    gtk_text_buffer_delete_selection(this, interactive.toInt, defaultEditable.toInt).toBoolean

public fun TextBuffer.endUserAction(): Unit {
  gtk_text_buffer_end_user_action(this)
}

public fun TextBuffer.getMark(name: String): TextMark? = gtk_text_buffer_get_mark(this,
    name)?.reinterpret()

public fun TextBuffer.getSlice(
  start: TextIter?,
  end: TextIter?,
  includeHiddenChars: Boolean
): String = gtk_text_buffer_get_slice(this, start?.reinterpret(), end?.reinterpret(),
    includeHiddenChars.toInt).toKString

public fun TextBuffer.getText(
  start: TextIter?,
  end: TextIter?,
  includeHiddenChars: Boolean
): String = gtk_text_buffer_get_text(this, start?.reinterpret(), end?.reinterpret(),
    includeHiddenChars.toInt).toKString

public fun TextBuffer.insert(
  iter: TextIter?,
  text: String,
  len: Int
): Unit {
  gtk_text_buffer_insert(this, iter?.reinterpret(), text, len)
}

public fun TextBuffer.insertAtCursor(text: String, len: Int): Unit {
  gtk_text_buffer_insert_at_cursor(this, text, len)
}

public fun TextBuffer.insertChildAnchor(iter: TextIter?, anchor: TextChildAnchor?): Unit {
  gtk_text_buffer_insert_child_anchor(this, iter?.reinterpret(), anchor?.reinterpret())
}

public fun TextBuffer.insertInteractive(
  iter: TextIter?,
  text: String,
  len: Int,
  defaultEditable: Boolean
): Boolean = gtk_text_buffer_insert_interactive(this, iter?.reinterpret(), text, len,
    defaultEditable.toInt).toBoolean

public fun TextBuffer.insertInteractiveAtCursor(
  text: String,
  len: Int,
  defaultEditable: Boolean
): Boolean = gtk_text_buffer_insert_interactive_at_cursor(this, text, len,
    defaultEditable.toInt).toBoolean

public fun TextBuffer.insertMarkup(
  iter: TextIter?,
  markup: String,
  len: Int
): Unit {
  gtk_text_buffer_insert_markup(this, iter?.reinterpret(), markup, len)
}

public fun TextBuffer.insertRange(
  iter: TextIter?,
  start: TextIter?,
  end: TextIter?
): Unit {
  gtk_text_buffer_insert_range(this, iter?.reinterpret(), start?.reinterpret(), end?.reinterpret())
}

public fun TextBuffer.insertRangeInteractive(
  iter: TextIter?,
  start: TextIter?,
  end: TextIter?,
  defaultEditable: Boolean
): Boolean = gtk_text_buffer_insert_range_interactive(this, iter?.reinterpret(),
    start?.reinterpret(), end?.reinterpret(), defaultEditable.toInt).toBoolean

public fun TextBuffer.moveMark(mark: TextMark?, `where`: TextIter?): Unit {
  gtk_text_buffer_move_mark(this, mark?.reinterpret(), where?.reinterpret())
}

public fun TextBuffer.moveMarkByName(name: String, `where`: TextIter?): Unit {
  gtk_text_buffer_move_mark_by_name(this, name, where?.reinterpret())
}

public fun TextBuffer.pasteClipboard(
  clipboard: Clipboard?,
  overrideLocation: TextIter?,
  defaultEditable: Boolean
): Unit {
  gtk_text_buffer_paste_clipboard(this, clipboard?.reinterpret(), overrideLocation?.reinterpret(),
      defaultEditable.toInt)
}

public fun TextBuffer.placeCursor(`where`: TextIter?): Unit {
  gtk_text_buffer_place_cursor(this, where?.reinterpret())
}

public fun TextBuffer.removeAllTags(start: TextIter?, end: TextIter?): Unit {
  gtk_text_buffer_remove_all_tags(this, start?.reinterpret(), end?.reinterpret())
}

public fun TextBuffer.removeSelectionClipboard(clipboard: Clipboard?): Unit {
  gtk_text_buffer_remove_selection_clipboard(this, clipboard?.reinterpret())
}

public fun TextBuffer.removeTag(
  tag: TextTag?,
  start: TextIter?,
  end: TextIter?
): Unit {
  gtk_text_buffer_remove_tag(this, tag?.reinterpret(), start?.reinterpret(), end?.reinterpret())
}

public fun TextBuffer.removeTagByName(
  name: String,
  start: TextIter?,
  end: TextIter?
): Unit {
  gtk_text_buffer_remove_tag_by_name(this, name, start?.reinterpret(), end?.reinterpret())
}

public fun TextBuffer.selectRange(ins: TextIter?, bound: TextIter?): Unit {
  gtk_text_buffer_select_range(this, ins?.reinterpret(), bound?.reinterpret())
}

public fun TextBuffer.setText(text: String, len: Int): Unit {
  gtk_text_buffer_set_text(this, text, len)
}
