// TODO - method: set_match_func
// TODO - signal: action-activated
// TODO - signal: cursor-on-match
// TODO - signal: insert-prefix
// TODO - signal: match-selected
// TODO - signal: no-matches
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import gtk3.GtkEntryCompletion
import gtk3.gtk_entry_completion_complete
import gtk3.gtk_entry_completion_compute_prefix
import gtk3.gtk_entry_completion_delete_action
import gtk3.gtk_entry_completion_get_completion_prefix
import gtk3.gtk_entry_completion_get_entry
import gtk3.gtk_entry_completion_get_inline_completion
import gtk3.gtk_entry_completion_get_inline_selection
import gtk3.gtk_entry_completion_get_minimum_key_length
import gtk3.gtk_entry_completion_get_model
import gtk3.gtk_entry_completion_get_popup_completion
import gtk3.gtk_entry_completion_get_popup_set_width
import gtk3.gtk_entry_completion_get_popup_single_match
import gtk3.gtk_entry_completion_get_text_column
import gtk3.gtk_entry_completion_insert_action_markup
import gtk3.gtk_entry_completion_insert_action_text
import gtk3.gtk_entry_completion_insert_prefix
import gtk3.gtk_entry_completion_set_inline_completion
import gtk3.gtk_entry_completion_set_inline_selection
import gtk3.gtk_entry_completion_set_minimum_key_length
import gtk3.gtk_entry_completion_set_model
import gtk3.gtk_entry_completion_set_popup_completion
import gtk3.gtk_entry_completion_set_popup_set_width
import gtk3.gtk_entry_completion_set_popup_single_match
import gtk3.gtk_entry_completion_set_text_column
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

public typealias EntryCompletion = CPointer<GtkEntryCompletion>

public val EntryCompletion.asObject: Object
  get() = reinterpret()

public val EntryCompletion.completionPrefix: String
  get() = gtk_entry_completion_get_completion_prefix(this).toKString

public val EntryCompletion.entry: Widget?
  get() = gtk_entry_completion_get_entry(this)?.reinterpret()

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

public var EntryCompletion.model: TreeModel?
  get() = gtk_entry_completion_get_model(this)?.reinterpret()
  set(`value`) {
    gtk_entry_completion_set_model(this, value)
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

public fun EntryCompletion.complete(): Unit {
  gtk_entry_completion_complete(this)
}

public fun EntryCompletion.computePrefix(key: String): String =
    gtk_entry_completion_compute_prefix(this, key).toKString

public fun EntryCompletion.deleteAction(index: Int): Unit {
  gtk_entry_completion_delete_action(this, index)
}

public fun EntryCompletion.insertActionMarkup(index: Int, markup: String): Unit {
  gtk_entry_completion_insert_action_markup(this, index, markup)
}

public fun EntryCompletion.insertActionText(index: Int, text: String): Unit {
  gtk_entry_completion_insert_action_text(this, index, text)
}

public fun EntryCompletion.insertPrefix(): Unit {
  gtk_entry_completion_insert_prefix(this)
}
