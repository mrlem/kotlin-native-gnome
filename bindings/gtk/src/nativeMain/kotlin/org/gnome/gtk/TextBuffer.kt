// TODO - method: create_tag
// TODO - method: deserialize
// TODO - method: deserialize_get_can_create_tags
// TODO - method: deserialize_set_can_create_tags
// TODO - method: get_bounds
// TODO - method: get_deserialize_formats
// TODO - method: get_end_iter
// TODO - method: get_iter_at_child_anchor
// TODO - method: get_iter_at_line
// TODO - method: get_iter_at_line_index
// TODO - method: get_iter_at_line_offset
// TODO - method: get_iter_at_mark
// TODO - method: get_iter_at_offset
// TODO - method: get_selection_bounds
// TODO - method: get_serialize_formats
// TODO - method: get_start_iter
// TODO - method: insert_pixbuf
// TODO - method: insert_with_tags
// TODO - method: insert_with_tags_by_name
// TODO - method: register_deserialize_format
// TODO - method: register_deserialize_tagset
// TODO - method: register_serialize_format
// TODO - method: register_serialize_tagset
// TODO - method: serialize
// TODO - method: unregister_deserialize_format
// TODO - method: unregister_serialize_format
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkTextBuffer
import interop.gtk_text_buffer_add_mark
import interop.gtk_text_buffer_add_selection_clipboard
import interop.gtk_text_buffer_apply_tag
import interop.gtk_text_buffer_apply_tag_by_name
import interop.gtk_text_buffer_backspace
import interop.gtk_text_buffer_begin_user_action
import interop.gtk_text_buffer_copy_clipboard
import interop.gtk_text_buffer_create_child_anchor
import interop.gtk_text_buffer_create_mark
import interop.gtk_text_buffer_cut_clipboard
import interop.gtk_text_buffer_delete
import interop.gtk_text_buffer_delete_interactive
import interop.gtk_text_buffer_delete_mark
import interop.gtk_text_buffer_delete_mark_by_name
import interop.gtk_text_buffer_delete_selection
import interop.gtk_text_buffer_end_user_action
import interop.gtk_text_buffer_get_char_count
import interop.gtk_text_buffer_get_copy_target_list
import interop.gtk_text_buffer_get_has_selection
import interop.gtk_text_buffer_get_insert
import interop.gtk_text_buffer_get_line_count
import interop.gtk_text_buffer_get_mark
import interop.gtk_text_buffer_get_modified
import interop.gtk_text_buffer_get_paste_target_list
import interop.gtk_text_buffer_get_selection_bound
import interop.gtk_text_buffer_get_slice
import interop.gtk_text_buffer_get_tag_table
import interop.gtk_text_buffer_get_text
import interop.gtk_text_buffer_insert
import interop.gtk_text_buffer_insert_at_cursor
import interop.gtk_text_buffer_insert_child_anchor
import interop.gtk_text_buffer_insert_interactive
import interop.gtk_text_buffer_insert_interactive_at_cursor
import interop.gtk_text_buffer_insert_markup
import interop.gtk_text_buffer_insert_range
import interop.gtk_text_buffer_insert_range_interactive
import interop.gtk_text_buffer_move_mark
import interop.gtk_text_buffer_move_mark_by_name
import interop.gtk_text_buffer_new
import interop.gtk_text_buffer_paste_clipboard
import interop.gtk_text_buffer_place_cursor
import interop.gtk_text_buffer_remove_all_tags
import interop.gtk_text_buffer_remove_selection_clipboard
import interop.gtk_text_buffer_remove_tag
import interop.gtk_text_buffer_remove_tag_by_name
import interop.gtk_text_buffer_select_range
import interop.gtk_text_buffer_set_modified
import interop.gtk_text_buffer_set_text
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt
import org.gnome.toKString
import org.mrlem.gnome.gobject.connect

public typealias TextBuffer = CPointer<GtkTextBuffer>

public val TextBuffer.asObject: Object
  get() = reinterpret()

public object TextBufferFactory {
  public fun new(table: TextTagTable?): TextBuffer =
      gtk_text_buffer_new(table?.reinterpret())!!.reinterpret()
}

public val TextBuffer.parentInstance: Object
  get() = pointed.parent_instance.ptr

public val TextBuffer.charCount: Int
  get() = gtk_text_buffer_get_char_count(this)

public val TextBuffer.copyTargetList: TargetList?
  get() = gtk_text_buffer_get_copy_target_list(this)?.reinterpret()

public val TextBuffer.hasSelection: Boolean
  get() = gtk_text_buffer_get_has_selection(this).toBoolean()

public val TextBuffer.insert: TextMark?
  get() = gtk_text_buffer_get_insert(this)?.reinterpret()

public val TextBuffer.lineCount: Int
  get() = gtk_text_buffer_get_line_count(this)

public var TextBuffer.modified: Boolean
  get() = gtk_text_buffer_get_modified(this).toBoolean()
  set(`value`) {
    gtk_text_buffer_set_modified(this@modified, `value`.toInt())
  }

public val TextBuffer.pasteTargetList: TargetList?
  get() = gtk_text_buffer_get_paste_target_list(this)?.reinterpret()

public val TextBuffer.selectionBound: TextMark?
  get() = gtk_text_buffer_get_selection_bound(this)?.reinterpret()

public val TextBuffer.tagTable: TextTagTable?
  get() = gtk_text_buffer_get_tag_table(this)?.reinterpret()

public fun TextBuffer.addMark(mark: TextMark?, `where`: TextIter?): Unit {
  gtk_text_buffer_add_mark(this@addMark, mark?.reinterpret(), `where`?.reinterpret())
}

public fun TextBuffer.addSelectionClipboard(clipboard: Clipboard?): Unit {
  gtk_text_buffer_add_selection_clipboard(this@addSelectionClipboard, clipboard?.reinterpret())
}

public fun TextBuffer.applyTag(
  tag: TextTag?,
  start: TextIter?,
  end: TextIter?
): Unit {
  gtk_text_buffer_apply_tag(this@applyTag, tag?.reinterpret(), start?.reinterpret(),
      end?.reinterpret())
}

public fun TextBuffer.applyTagByName(
  name: String?,
  start: TextIter?,
  end: TextIter?
): Unit {
  gtk_text_buffer_apply_tag_by_name(this@applyTagByName, name, start?.reinterpret(),
      end?.reinterpret())
}

public fun TextBuffer.backspace(
  iter: TextIter?,
  interactive: Boolean,
  defaultEditable: Boolean
): Boolean = gtk_text_buffer_backspace(this@backspace, iter?.reinterpret(), interactive.toInt(),
    defaultEditable.toInt()).toBoolean()

public fun TextBuffer.beginUserAction(): Unit {
  gtk_text_buffer_begin_user_action(this@beginUserAction)
}

public fun TextBuffer.copyClipboard(clipboard: Clipboard?): Unit {
  gtk_text_buffer_copy_clipboard(this@copyClipboard, clipboard?.reinterpret())
}

public fun TextBuffer.createChildAnchor(iter: TextIter?): TextChildAnchor? =
    gtk_text_buffer_create_child_anchor(this@createChildAnchor, iter?.reinterpret())?.reinterpret()

public fun TextBuffer.createMark(
  markName: String?,
  `where`: TextIter?,
  leftGravity: Boolean
): TextMark? = gtk_text_buffer_create_mark(this@createMark, markName, `where`?.reinterpret(),
    leftGravity.toInt())?.reinterpret()

public fun TextBuffer.cutClipboard(clipboard: Clipboard?, defaultEditable: Boolean): Unit {
  gtk_text_buffer_cut_clipboard(this@cutClipboard, clipboard?.reinterpret(),
      defaultEditable.toInt())
}

public fun TextBuffer.delete(start: TextIter?, end: TextIter?): Unit {
  gtk_text_buffer_delete(this@delete, start?.reinterpret(), end?.reinterpret())
}

public fun TextBuffer.deleteInteractive(
  startIter: TextIter?,
  endIter: TextIter?,
  defaultEditable: Boolean
): Boolean = gtk_text_buffer_delete_interactive(this@deleteInteractive, startIter?.reinterpret(),
    endIter?.reinterpret(), defaultEditable.toInt()).toBoolean()

public fun TextBuffer.deleteMark(mark: TextMark?): Unit {
  gtk_text_buffer_delete_mark(this@deleteMark, mark?.reinterpret())
}

public fun TextBuffer.deleteMarkByName(name: String?): Unit {
  gtk_text_buffer_delete_mark_by_name(this@deleteMarkByName, name)
}

public fun TextBuffer.deleteSelection(interactive: Boolean, defaultEditable: Boolean): Boolean =
    gtk_text_buffer_delete_selection(this@deleteSelection, interactive.toInt(),
    defaultEditable.toInt()).toBoolean()

public fun TextBuffer.endUserAction(): Unit {
  gtk_text_buffer_end_user_action(this@endUserAction)
}

public fun TextBuffer.getMark(name: String?): TextMark? = gtk_text_buffer_get_mark(this@getMark,
    name)?.reinterpret()

public fun TextBuffer.getSlice(
  start: TextIter?,
  end: TextIter?,
  includeHiddenChars: Boolean
): String? = gtk_text_buffer_get_slice(this@getSlice, start?.reinterpret(), end?.reinterpret(),
    includeHiddenChars.toInt()).toKString()

public fun TextBuffer.getText(
  start: TextIter?,
  end: TextIter?,
  includeHiddenChars: Boolean
): String? = gtk_text_buffer_get_text(this@getText, start?.reinterpret(), end?.reinterpret(),
    includeHiddenChars.toInt()).toKString()

public fun TextBuffer.insert(
  iter: TextIter?,
  text: String?,
  len: Int
): Unit {
  gtk_text_buffer_insert(this@insert, iter?.reinterpret(), text, len)
}

public fun TextBuffer.insertAtCursor(text: String?, len: Int): Unit {
  gtk_text_buffer_insert_at_cursor(this@insertAtCursor, text, len)
}

public fun TextBuffer.insertChildAnchor(iter: TextIter?, anchor: TextChildAnchor?): Unit {
  gtk_text_buffer_insert_child_anchor(this@insertChildAnchor, iter?.reinterpret(),
      anchor?.reinterpret())
}

public fun TextBuffer.insertInteractive(
  iter: TextIter?,
  text: String?,
  len: Int,
  defaultEditable: Boolean
): Boolean = gtk_text_buffer_insert_interactive(this@insertInteractive, iter?.reinterpret(), text,
    len, defaultEditable.toInt()).toBoolean()

public fun TextBuffer.insertInteractiveAtCursor(
  text: String?,
  len: Int,
  defaultEditable: Boolean
): Boolean = gtk_text_buffer_insert_interactive_at_cursor(this@insertInteractiveAtCursor, text, len,
    defaultEditable.toInt()).toBoolean()

public fun TextBuffer.insertMarkup(
  iter: TextIter?,
  markup: String?,
  len: Int
): Unit {
  gtk_text_buffer_insert_markup(this@insertMarkup, iter?.reinterpret(), markup, len)
}

public fun TextBuffer.insertRange(
  iter: TextIter?,
  start: TextIter?,
  end: TextIter?
): Unit {
  gtk_text_buffer_insert_range(this@insertRange, iter?.reinterpret(), start?.reinterpret(),
      end?.reinterpret())
}

public fun TextBuffer.insertRangeInteractive(
  iter: TextIter?,
  start: TextIter?,
  end: TextIter?,
  defaultEditable: Boolean
): Boolean = gtk_text_buffer_insert_range_interactive(this@insertRangeInteractive,
    iter?.reinterpret(), start?.reinterpret(), end?.reinterpret(),
    defaultEditable.toInt()).toBoolean()

public fun TextBuffer.moveMark(mark: TextMark?, `where`: TextIter?): Unit {
  gtk_text_buffer_move_mark(this@moveMark, mark?.reinterpret(), `where`?.reinterpret())
}

public fun TextBuffer.moveMarkByName(name: String?, `where`: TextIter?): Unit {
  gtk_text_buffer_move_mark_by_name(this@moveMarkByName, name, `where`?.reinterpret())
}

public fun TextBuffer.pasteClipboard(
  clipboard: Clipboard?,
  overrideLocation: TextIter?,
  defaultEditable: Boolean
): Unit {
  gtk_text_buffer_paste_clipboard(this@pasteClipboard, clipboard?.reinterpret(),
      overrideLocation?.reinterpret(), defaultEditable.toInt())
}

public fun TextBuffer.placeCursor(`where`: TextIter?): Unit {
  gtk_text_buffer_place_cursor(this@placeCursor, `where`?.reinterpret())
}

public fun TextBuffer.removeAllTags(start: TextIter?, end: TextIter?): Unit {
  gtk_text_buffer_remove_all_tags(this@removeAllTags, start?.reinterpret(), end?.reinterpret())
}

public fun TextBuffer.removeSelectionClipboard(clipboard: Clipboard?): Unit {
  gtk_text_buffer_remove_selection_clipboard(this@removeSelectionClipboard,
      clipboard?.reinterpret())
}

public fun TextBuffer.removeTag(
  tag: TextTag?,
  start: TextIter?,
  end: TextIter?
): Unit {
  gtk_text_buffer_remove_tag(this@removeTag, tag?.reinterpret(), start?.reinterpret(),
      end?.reinterpret())
}

public fun TextBuffer.removeTagByName(
  name: String?,
  start: TextIter?,
  end: TextIter?
): Unit {
  gtk_text_buffer_remove_tag_by_name(this@removeTagByName, name, start?.reinterpret(),
      end?.reinterpret())
}

public fun TextBuffer.selectRange(ins: TextIter?, bound: TextIter?): Unit {
  gtk_text_buffer_select_range(this@selectRange, ins?.reinterpret(), bound?.reinterpret())
}

public fun TextBuffer.setText(text: String?, len: Int): Unit {
  gtk_text_buffer_set_text(this@setText, text, len)
}

public fun TextBuffer.onApplyTag(callback: (TextBuffer) -> Unit): TextBuffer {
  // TODO - handle callback data

  asObject.connect("apply-tag") { callback(this) }
  return this
}

public fun TextBuffer.onBeginUserAction(callback: (TextBuffer) -> Unit): TextBuffer {
  // TODO - handle callback data

  asObject.connect("begin-user-action") { callback(this) }
  return this
}

public fun TextBuffer.onChanged(callback: (TextBuffer) -> Unit): TextBuffer {
  // TODO - handle callback data

  asObject.connect("changed") { callback(this) }
  return this
}

public fun TextBuffer.onDeleteRange(callback: (TextBuffer) -> Unit): TextBuffer {
  // TODO - handle callback data

  asObject.connect("delete-range") { callback(this) }
  return this
}

public fun TextBuffer.onEndUserAction(callback: (TextBuffer) -> Unit): TextBuffer {
  // TODO - handle callback data

  asObject.connect("end-user-action") { callback(this) }
  return this
}

public fun TextBuffer.onInsertChildAnchor(callback: (TextBuffer) -> Unit): TextBuffer {
  // TODO - handle callback data

  asObject.connect("insert-child-anchor") { callback(this) }
  return this
}

public fun TextBuffer.onInsertPixbuf(callback: (TextBuffer) -> Unit): TextBuffer {
  // TODO - handle callback data

  asObject.connect("insert-pixbuf") { callback(this) }
  return this
}

public fun TextBuffer.onInsertText(callback: (TextBuffer) -> Unit): TextBuffer {
  // TODO - handle callback data

  asObject.connect("insert-text") { callback(this) }
  return this
}

public fun TextBuffer.onMarkDeleted(callback: (TextBuffer) -> Unit): TextBuffer {
  // TODO - handle callback data

  asObject.connect("mark-deleted") { callback(this) }
  return this
}

public fun TextBuffer.onMarkSet(callback: (TextBuffer) -> Unit): TextBuffer {
  // TODO - handle callback data

  asObject.connect("mark-set") { callback(this) }
  return this
}

public fun TextBuffer.onModifiedChanged(callback: (TextBuffer) -> Unit): TextBuffer {
  // TODO - handle callback data

  asObject.connect("modified-changed") { callback(this) }
  return this
}

public fun TextBuffer.onPasteDone(callback: (TextBuffer) -> Unit): TextBuffer {
  // TODO - handle callback data

  asObject.connect("paste-done") { callback(this) }
  return this
}

public fun TextBuffer.onRemoveTag(callback: (TextBuffer) -> Unit): TextBuffer {
  // TODO - handle callback data

  asObject.connect("remove-tag") { callback(this) }
  return this
}
