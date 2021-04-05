package org.gnome.gtk

import gtk3.GtkEntry
import gtk3.gtk_entry_get_text
import gtk3.gtk_entry_set_text
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gnome.glib.gobject.InitiallyUnowned
import org.gnome.glib.gobject.asObject
import org.gnome.glib.gobject.connect

public typealias Entry = CPointer<GtkEntry>

public val Entry.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Entry.asWidget: Widget
  get() = reinterpret()

///////////////////////////////////////////////////////////////////////////
// Public API (not generated)
///////////////////////////////////////////////////////////////////////////

val Entry.text
  get() = gtk_entry_get_text(this)!!.toKString()

fun Entry.setText(text: String) = gtk_entry_set_text(this, text)

///////////////////////////////////////////////////////////////////////////
// Events handlers
///////////////////////////////////////////////////////////////////////////

fun Entry.onActivate(onActivate: (Entry) -> Unit): Entry {
  asInitiallyUnowned.asObject.connect("activate") { onActivate(this) }
  return this
}
