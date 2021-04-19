// TODO - set_match_func
//
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

public fun EntryCompletion.complete(): Unit {
  gtk_entry_completion_complete(this)
}

public fun EntryCompletion.computePrefix(key: String?): String =
    gtk_entry_completion_compute_prefix(this, key).toKString

public fun EntryCompletion.deleteAction(index: Int): Unit {
  gtk_entry_completion_delete_action(this, index)
}

public fun EntryCompletion.getCompletionPrefix(): String =
    gtk_entry_completion_get_completion_prefix(this).toKString

public fun EntryCompletion.getEntry(): Widget? = gtk_entry_completion_get_entry(this)?.reinterpret()

public fun EntryCompletion.getInlineCompletion(): Boolean =
    gtk_entry_completion_get_inline_completion(this).toBoolean

public fun EntryCompletion.getInlineSelection(): Boolean =
    gtk_entry_completion_get_inline_selection(this).toBoolean

public fun EntryCompletion.getMinimumKeyLength(): Int =
    gtk_entry_completion_get_minimum_key_length(this)

public fun EntryCompletion.getModel(): TreeModel? =
    gtk_entry_completion_get_model(this)?.reinterpret()

public fun EntryCompletion.getPopupCompletion(): Boolean =
    gtk_entry_completion_get_popup_completion(this).toBoolean

public fun EntryCompletion.getPopupSetWidth(): Boolean =
    gtk_entry_completion_get_popup_set_width(this).toBoolean

public fun EntryCompletion.getPopupSingleMatch(): Boolean =
    gtk_entry_completion_get_popup_single_match(this).toBoolean

public fun EntryCompletion.getTextColumn(): Int = gtk_entry_completion_get_text_column(this)

public fun EntryCompletion.insertActionMarkup(index: Int, markup: String?): Unit {
  gtk_entry_completion_insert_action_markup(this, index, markup)
}

public fun EntryCompletion.insertActionText(index: Int, text: String?): Unit {
  gtk_entry_completion_insert_action_text(this, index, text)
}

public fun EntryCompletion.insertPrefix(): Unit {
  gtk_entry_completion_insert_prefix(this)
}

public fun EntryCompletion.setInlineCompletion(inlineCompletion: Boolean): Unit {
  gtk_entry_completion_set_inline_completion(this, inlineCompletion.toInt)
}

public fun EntryCompletion.setInlineSelection(inlineSelection: Boolean): Unit {
  gtk_entry_completion_set_inline_selection(this, inlineSelection.toInt)
}

public fun EntryCompletion.setMinimumKeyLength(length: Int): Unit {
  gtk_entry_completion_set_minimum_key_length(this, length)
}

public fun EntryCompletion.setModel(model: TreeModel): Unit {
  gtk_entry_completion_set_model(this, model.reinterpret())
}

public fun EntryCompletion.setPopupCompletion(popupCompletion: Boolean): Unit {
  gtk_entry_completion_set_popup_completion(this, popupCompletion.toInt)
}

public fun EntryCompletion.setPopupSetWidth(popupSetWidth: Boolean): Unit {
  gtk_entry_completion_set_popup_set_width(this, popupSetWidth.toInt)
}

public fun EntryCompletion.setPopupSingleMatch(popupSingleMatch: Boolean): Unit {
  gtk_entry_completion_set_popup_single_match(this, popupSingleMatch.toInt)
}

public fun EntryCompletion.setTextColumn(column: Int): Unit {
  gtk_entry_completion_set_text_column(this, column)
}
