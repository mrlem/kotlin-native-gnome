// TODO - foreach
//
package org.gnome.gtk

import gtk3.GtkTextTagTable
import gtk3.gtk_text_tag_table_add
import gtk3.gtk_text_tag_table_get_size
import gtk3.gtk_text_tag_table_lookup
import gtk3.gtk_text_tag_table_remove
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toBoolean

public typealias TextTagTable = CPointer<GtkTextTagTable>

public val TextTagTable.asObject: Object
  get() = reinterpret()

public val TextTagTable.size: Int
  get() = gtk_text_tag_table_get_size(this)

public fun TextTagTable.add(tag: TextTag): Boolean = gtk_text_tag_table_add(this,
    tag.reinterpret()).toBoolean

public fun TextTagTable.lookup(name: String?): TextTag? = gtk_text_tag_table_lookup(this,
    name)?.reinterpret()

public fun TextTagTable.remove(tag: TextTag): Unit {
  gtk_text_tag_table_remove(this, tag.reinterpret())
}
