// TODO - method: foreach (param type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkTextTagTable
import interop.gtk_text_tag_table_add
import interop.gtk_text_tag_table_get_size
import interop.gtk_text_tag_table_lookup
import interop.gtk_text_tag_table_new
import interop.gtk_text_tag_table_remove
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.mrlem.gnome.gobject.connect
import org.mrlem.gnome.toBoolean

public typealias TextTagTable = CPointer<GtkTextTagTable>

public val TextTagTable.asObject: Object
  get() = reinterpret()

public object TextTagTableFactory {
  public fun new(): TextTagTable = gtk_text_tag_table_new()!!.reinterpret()
}

public val TextTagTable.parentInstance: Object
  get() = pointed.parent_instance.ptr

public val TextTagTable.size: Int
  get() = gtk_text_tag_table_get_size(this)

public fun TextTagTable.add(tag: TextTag?): Boolean = gtk_text_tag_table_add(this@add,
    tag?.reinterpret()).toBoolean()

public fun TextTagTable.lookup(name: String?): TextTag? = gtk_text_tag_table_lookup(this@lookup,
    name)?.reinterpret()

public fun TextTagTable.remove(tag: TextTag?): Unit {
  gtk_text_tag_table_remove(this@remove, tag?.reinterpret())
}

public fun TextTagTable.onTagAdded(callback: (TextTagTable) -> Unit): TextTagTable {
  // TODO - handle callback data

  asObject.connect("tag-added") { callback(this) }
  return this
}

public fun TextTagTable.onTagChanged(callback: (TextTagTable) -> Unit): TextTagTable {
  // TODO - handle callback data

  asObject.connect("tag-changed") { callback(this) }
  return this
}

public fun TextTagTable.onTagRemoved(callback: (TextTagTable) -> Unit): TextTagTable {
  // TODO - handle callback data

  asObject.connect("tag-removed") { callback(this) }
  return this
}
