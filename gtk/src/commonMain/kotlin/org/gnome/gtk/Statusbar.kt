// TODO - implement:
//   get_context_id
//   pop
//   push
//   remove
//   remove_all
package org.gnome.gtk

import gtk3.GtkStatusbar
import gtk3.gtk_statusbar_get_message_area
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned
import org.gnome.glib.gobject.Object

public typealias Statusbar = CPointer<GtkStatusbar>

public val Statusbar.asObject: Object
  get() = reinterpret()

public val Statusbar.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Statusbar.asWidget: Widget
  get() = reinterpret()

public val Statusbar.asContainer: Container
  get() = reinterpret()

public val Statusbar.asBox: Box
  get() = reinterpret()

public fun Statusbar.getMessageArea(): Unit {
  gtk_statusbar_get_message_area(this)
}
