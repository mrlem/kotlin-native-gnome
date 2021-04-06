// TODO - implement:
//   complete
//   compute_prefix
//   delete_action
//   get_entry
//   get_model
//   insert_action_markup
//   insert_action_text
//   insert_prefix
//   set_match_func
//   set_model
package org.gnome.gtk

import gtk3.GtkEntryCompletion
import gtk3.gtk_entry_completion_get_completion_prefix
import gtk3.gtk_entry_completion_get_inline_completion
import gtk3.gtk_entry_completion_get_inline_selection
import gtk3.gtk_entry_completion_get_minimum_key_length
import gtk3.gtk_entry_completion_get_popup_completion
import gtk3.gtk_entry_completion_get_popup_set_width
import gtk3.gtk_entry_completion_get_popup_single_match
import gtk3.gtk_entry_completion_get_text_column
import gtk3.gtk_entry_completion_set_inline_completion
import gtk3.gtk_entry_completion_set_inline_selection
import gtk3.gtk_entry_completion_set_minimum_key_length
import gtk3.gtk_entry_completion_set_popup_completion
import gtk3.gtk_entry_completion_set_popup_set_width
import gtk3.gtk_entry_completion_set_popup_single_match
import gtk3.gtk_entry_completion_set_text_column
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object
import org.gnome.glib.toBoolean
import org.gnome.glib.toInt
import org.gnome.glib.toKString

public typealias EntryCompletion = CPointer<GtkEntryCompletion>

public val EntryCompletion.asObject: Object
  get() = reinterpret()

public var EntryCompletion.inlineCompletion: Boolean
  get() = gtk_entry_completion_get_inline_completion(this).toBoolean
  set(`value`) {
    gtk_entry_completion_set_inline_completion(this, value.toInt)
  }

public var EntryCompletion.inlineSelection: Boolean
  get() = gtk_entry_completion_get_inline_selection(this).toBoolean
  set(`value`) {
    gtk_entry_completion_set_inline_selection(this, value.toInt)
  }

public var EntryCompletion.minimumKeyLength: Int
  get() = gtk_entry_completion_get_minimum_key_length(this)
  set(`value`) {
    gtk_entry_completion_set_minimum_key_length(this, value)
  }

public var EntryCompletion.popupCompletion: Boolean
  get() = gtk_entry_completion_get_popup_completion(this).toBoolean
  set(`value`) {
    gtk_entry_completion_set_popup_completion(this, value.toInt)
  }

public var EntryCompletion.popupSetWidth: Boolean
  get() = gtk_entry_completion_get_popup_set_width(this).toBoolean
  set(`value`) {
    gtk_entry_completion_set_popup_set_width(this, value.toInt)
  }

public var EntryCompletion.popupSingleMatch: Boolean
  get() = gtk_entry_completion_get_popup_single_match(this).toBoolean
  set(`value`) {
    gtk_entry_completion_set_popup_single_match(this, value.toInt)
  }

public var EntryCompletion.textColumn: Int
  get() = gtk_entry_completion_get_text_column(this)
  set(`value`) {
    gtk_entry_completion_set_text_column(this, value)
  }

public val EntryCompletion.completionPrefix: String?
  get() = gtk_entry_completion_get_completion_prefix(this).toKString
