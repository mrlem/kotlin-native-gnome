// TODO - implement:
//   add
//   foreach
//   lookup
//   remove
package org.gnome.gtk

import gtk3.GtkTextTagTable
import gtk3.gtk_text_tag_table_get_size
import kotlin.Int
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object

public typealias TextTagTable = CPointer<GtkTextTagTable>

public val TextTagTable.asObject: Object
  get() = reinterpret()

public val TextTagTable.size: Int
  get() = gtk_text_tag_table_get_size(this)
