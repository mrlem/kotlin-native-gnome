// TODO - implement:
//   delete_text
//   emit_deleted_text
//   emit_inserted_text
//   get_bytes
//   get_length
//   get_max_length
//   get_text
//   insert_text
//   set_max_length
//   set_text
package org.gnome.gtk

import gtk3.GtkEntryBuffer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object

public typealias EntryBuffer = CPointer<GtkEntryBuffer>

public val EntryBuffer.asObject: Object
  get() = reinterpret()
