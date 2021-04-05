// TODO - implement:
//   complete
//   compute_prefix
//   delete_action
//   get_completion_prefix
//   get_entry
//   get_inline_completion
//   get_inline_selection
//   get_minimum_key_length
//   get_model
//   get_popup_completion
//   get_popup_set_width
//   get_popup_single_match
//   get_text_column
//   insert_action_markup
//   insert_action_text
//   insert_prefix
//   set_inline_completion
//   set_inline_selection
//   set_match_func
//   set_minimum_key_length
//   set_model
//   set_popup_completion
//   set_popup_set_width
//   set_popup_single_match
//   set_text_column
package org.gnome.gtk

import gtk3.GtkEntryCompletion
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object

public typealias EntryCompletion = CPointer<GtkEntryCompletion>

public val EntryCompletion.asObject: Object
  get() = reinterpret()
