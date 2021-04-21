@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType","FunctionName")

package org.gnome.gtk

import gtk3.GtkEntryBuffer
import gtk3.gtk_entry_buffer_delete_text
import gtk3.gtk_entry_buffer_emit_deleted_text
import gtk3.gtk_entry_buffer_emit_inserted_text
import gtk3.gtk_entry_buffer_get_bytes
import gtk3.gtk_entry_buffer_get_length
import gtk3.gtk_entry_buffer_get_max_length
import gtk3.gtk_entry_buffer_get_text
import gtk3.gtk_entry_buffer_insert_text
import gtk3.gtk_entry_buffer_new
import gtk3.gtk_entry_buffer_set_max_length
import gtk3.gtk_entry_buffer_set_text
import kotlin.Int
import kotlin.String
import kotlin.UInt
import kotlin.ULong
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.gobject.connect
import org.gnome.toKString

public typealias EntryBuffer = CPointer<GtkEntryBuffer>

public val EntryBuffer.asObject: Object
  get() = reinterpret()

public object EntryBufferFactory {
  public fun new(initialChars: String, nInitialChars: Int): EntryBuffer =
      gtk_entry_buffer_new(initialChars, nInitialChars)!!.reinterpret()
}

public val EntryBuffer.bytes: ULong
  get() = gtk_entry_buffer_get_bytes(this)

public val EntryBuffer.length: UInt
  get() = gtk_entry_buffer_get_length(this)

public var EntryBuffer.maxLength: Int
  get() = gtk_entry_buffer_get_max_length(this)
  set(`value`) {
    gtk_entry_buffer_set_max_length(this, value)
  }

public val EntryBuffer.text: String
  get() = gtk_entry_buffer_get_text(this).toKString

public fun EntryBuffer.deleteText(position: UInt, nChars: Int): UInt =
    gtk_entry_buffer_delete_text(this, position, nChars)

public fun EntryBuffer.emitDeletedText(position: UInt, nChars: UInt): Unit {
  gtk_entry_buffer_emit_deleted_text(this, position, nChars)
}

public fun EntryBuffer.emitInsertedText(
  position: UInt,
  chars: String,
  nChars: UInt
): Unit {
  gtk_entry_buffer_emit_inserted_text(this, position, chars, nChars)
}

public fun EntryBuffer.insertText(
  position: UInt,
  chars: String,
  nChars: Int
): UInt = gtk_entry_buffer_insert_text(this, position, chars, nChars)

public fun EntryBuffer.setText(chars: String, nChars: Int): Unit {
  gtk_entry_buffer_set_text(this, chars, nChars)
}

public fun EntryBuffer.onDeletedText(callback: (EntryBuffer) -> Unit): EntryBuffer {
  // TODO - handle callback data

  asObject.connect("deleted-text") { callback(this) }
  return this
}

public fun EntryBuffer.onInsertedText(callback: (EntryBuffer) -> Unit): EntryBuffer {
  // TODO - handle callback data

  asObject.connect("inserted-text") { callback(this) }
  return this
}
