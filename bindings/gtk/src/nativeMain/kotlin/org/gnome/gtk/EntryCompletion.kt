// TODO - method: set_match_func
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkEntryCompletion
import interop.gtk_entry_completion_complete
import interop.gtk_entry_completion_compute_prefix
import interop.gtk_entry_completion_delete_action
import interop.gtk_entry_completion_get_completion_prefix
import interop.gtk_entry_completion_get_entry
import interop.gtk_entry_completion_get_inline_completion
import interop.gtk_entry_completion_get_inline_selection
import interop.gtk_entry_completion_get_minimum_key_length
import interop.gtk_entry_completion_get_model
import interop.gtk_entry_completion_get_popup_completion
import interop.gtk_entry_completion_get_popup_set_width
import interop.gtk_entry_completion_get_popup_single_match
import interop.gtk_entry_completion_get_text_column
import interop.gtk_entry_completion_insert_action_markup
import interop.gtk_entry_completion_insert_action_text
import interop.gtk_entry_completion_insert_prefix
import interop.gtk_entry_completion_new
import interop.gtk_entry_completion_new_with_area
import interop.gtk_entry_completion_set_inline_completion
import interop.gtk_entry_completion_set_inline_selection
import interop.gtk_entry_completion_set_minimum_key_length
import interop.gtk_entry_completion_set_model
import interop.gtk_entry_completion_set_popup_completion
import interop.gtk_entry_completion_set_popup_set_width
import interop.gtk_entry_completion_set_popup_single_match
import interop.gtk_entry_completion_set_text_column
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

public typealias EntryCompletion = CPointer<GtkEntryCompletion>

public val EntryCompletion.asObject: Object
  get() = reinterpret()

public object EntryCompletionFactory {
  public fun new(): EntryCompletion = gtk_entry_completion_new()!!.reinterpret()

  public fun newWithArea(area: CellArea?): EntryCompletion =
      gtk_entry_completion_new_with_area(area?.reinterpret())!!.reinterpret()
}

public val EntryCompletion.parentInstance: Object
  get() = pointed.parent_instance.ptr

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

public fun EntryCompletion.onActionActivated(callback: (EntryCompletion) -> Unit): EntryCompletion {
  // TODO - handle callback data

  asObject.connect("action-activated") { callback(this) }
  return this
}

public fun EntryCompletion.onCursorOnMatch(callback: (EntryCompletion) -> Unit): EntryCompletion {
  // TODO - handle callback data

  asObject.connect("cursor-on-match") { callback(this) }
  return this
}

public fun EntryCompletion.onInsertPrefix(callback: (EntryCompletion) -> Unit): EntryCompletion {
  // TODO - handle callback data

  asObject.connect("insert-prefix") { callback(this) }
  return this
}

public fun EntryCompletion.onMatchSelected(callback: (EntryCompletion) -> Unit): EntryCompletion {
  // TODO - handle callback data

  asObject.connect("match-selected") { callback(this) }
  return this
}

public fun EntryCompletion.onNoMatches(callback: (EntryCompletion) -> Unit): EntryCompletion {
  // TODO - handle callback data

  asObject.connect("no-matches") { callback(this) }
  return this
}
