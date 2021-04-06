// TODO - implement:
//   add_mark
//   add_selection_clipboard
//   apply_tag
//   apply_tag_by_name
//   backspace
//   begin_user_action
//   copy_clipboard
//   create_child_anchor
//   create_mark
//   create_tag
//   cut_clipboard
//   delete
//   delete_interactive
//   delete_mark
//   delete_mark_by_name
//   delete_selection
//   deserialize
//   deserialize_get_can_create_tags
//   deserialize_set_can_create_tags
//   end_user_action
//   get_bounds
//   get_copy_target_list
//   get_deserialize_formats
//   get_end_iter
//   get_insert
//   get_iter_at_child_anchor
//   get_iter_at_line
//   get_iter_at_line_index
//   get_iter_at_line_offset
//   get_iter_at_mark
//   get_iter_at_offset
//   get_mark
//   get_paste_target_list
//   get_selection_bound
//   get_selection_bounds
//   get_serialize_formats
//   get_slice
//   get_start_iter
//   get_tag_table
//   get_text
//   insert
//   insert_at_cursor
//   insert_child_anchor
//   insert_interactive
//   insert_interactive_at_cursor
//   insert_markup
//   insert_pixbuf
//   insert_range
//   insert_range_interactive
//   insert_with_tags
//   insert_with_tags_by_name
//   move_mark
//   move_mark_by_name
//   paste_clipboard
//   place_cursor
//   register_deserialize_format
//   register_deserialize_tagset
//   register_serialize_format
//   register_serialize_tagset
//   remove_all_tags
//   remove_selection_clipboard
//   remove_tag
//   remove_tag_by_name
//   select_range
//   serialize
//   set_text
//   unregister_deserialize_format
//   unregister_serialize_format
package org.gnome.gtk

import gtk3.GtkTextBuffer
import gtk3.gtk_text_buffer_get_char_count
import gtk3.gtk_text_buffer_get_has_selection
import gtk3.gtk_text_buffer_get_line_count
import gtk3.gtk_text_buffer_get_modified
import gtk3.gtk_text_buffer_set_modified
import kotlin.Boolean
import kotlin.Int
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object
import org.gnome.glib.toBoolean
import org.gnome.glib.toInt

public typealias TextBuffer = CPointer<GtkTextBuffer>

public val TextBuffer.asObject: Object
  get() = reinterpret()

public var TextBuffer.modified: Boolean
  get() = gtk_text_buffer_get_modified(this).toBoolean
  set(`value`) {
    gtk_text_buffer_set_modified(this, value.toInt)
  }

public val TextBuffer.charCount: Int
  get() = gtk_text_buffer_get_char_count(this)

public val TextBuffer.hasSelection: Boolean
  get() = gtk_text_buffer_get_has_selection(this).toBoolean

public val TextBuffer.lineCount: Int
  get() = gtk_text_buffer_get_line_count(this)
