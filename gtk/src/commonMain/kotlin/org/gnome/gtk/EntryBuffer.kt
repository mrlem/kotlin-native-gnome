// TODO - implement:
//   delete_text
//   emit_deleted_text
//   emit_inserted_text
//   get_bytes
//   insert_text
//   set_text
package org.gnome.gtk

import gtk3.GtkEntryBuffer
import gtk3.gtk_entry_buffer_get_length
import gtk3.gtk_entry_buffer_get_max_length
import gtk3.gtk_entry_buffer_get_text
import gtk3.gtk_entry_buffer_set_max_length
import kotlin.Int
import kotlin.String
import kotlin.UInt
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object
import org.gnome.glib.toKString

public typealias EntryBuffer = CPointer<GtkEntryBuffer>

public val EntryBuffer.asObject: Object
  get() = reinterpret()

public var EntryBuffer.maxLength: Int
  get() = gtk_entry_buffer_get_max_length(this)
  set(`value`) {
    gtk_entry_buffer_set_max_length(this, value)
  }

public val EntryBuffer.length: UInt
  get() = gtk_entry_buffer_get_length(this)

public val EntryBuffer.text: String?
  get() = gtk_entry_buffer_get_text(this).toKString
