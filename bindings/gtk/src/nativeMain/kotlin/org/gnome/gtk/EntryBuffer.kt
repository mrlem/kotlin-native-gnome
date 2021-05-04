@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkEntryBuffer
import interop.gtk_entry_buffer_delete_text
import interop.gtk_entry_buffer_emit_deleted_text
import interop.gtk_entry_buffer_emit_inserted_text
import interop.gtk_entry_buffer_get_bytes
import interop.gtk_entry_buffer_get_length
import interop.gtk_entry_buffer_get_max_length
import interop.gtk_entry_buffer_get_text
import interop.gtk_entry_buffer_insert_text
import interop.gtk_entry_buffer_new
import interop.gtk_entry_buffer_set_max_length
import interop.gtk_entry_buffer_set_text
import kotlin.Int
import kotlin.String
import kotlin.UInt
import kotlin.ULong
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toKString
import org.mrlem.gnome.gobject.connect

public typealias EntryBuffer = CPointer<GtkEntryBuffer>

public val EntryBuffer.asObject: Object
  get() = reinterpret()

public object EntryBufferFactory {
  public fun new(initialChars: String?, nInitialChars: Int): EntryBuffer =
      gtk_entry_buffer_new(initialChars, nInitialChars)!!.reinterpret()
}

public val EntryBuffer.parentInstance: Object
  get() = pointed.parent_instance.ptr

public val EntryBuffer.bytes: ULong
  get() = gtk_entry_buffer_get_bytes(this)

public val EntryBuffer.length: UInt
  get() = gtk_entry_buffer_get_length(this)

public var EntryBuffer.maxLength: Int
  get() = gtk_entry_buffer_get_max_length(this)
  set(`value`) {
    gtk_entry_buffer_set_max_length(this@maxLength, `value`)
  }

public val EntryBuffer.text: String?
  get() = gtk_entry_buffer_get_text(this).toKString()

public fun EntryBuffer.deleteText(position: UInt, nChars: Int): UInt =
    gtk_entry_buffer_delete_text(this@deleteText, position, nChars)

public fun EntryBuffer.emitDeletedText(position: UInt, nChars: UInt): Unit {
  gtk_entry_buffer_emit_deleted_text(this@emitDeletedText, position, nChars)
}

public fun EntryBuffer.emitInsertedText(
  position: UInt,
  chars: String?,
  nChars: UInt
): Unit {
  gtk_entry_buffer_emit_inserted_text(this@emitInsertedText, position, chars, nChars)
}

public fun EntryBuffer.insertText(
  position: UInt,
  chars: String?,
  nChars: Int
): UInt = gtk_entry_buffer_insert_text(this@insertText, position, chars, nChars)

public fun EntryBuffer.setText(chars: String?, nChars: Int): Unit {
  gtk_entry_buffer_set_text(this@setText, chars, nChars)
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
