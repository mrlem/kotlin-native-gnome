// TODO - implement:
//   set_screen
package org.gnome.gtk

import gtk3.GtkInvisible
import gtk3.gtk_invisible_get_screen
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned
import org.gnome.glib.gobject.Object

public typealias Invisible = CPointer<GtkInvisible>

public val Invisible.asObject: Object
  get() = reinterpret()

public val Invisible.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Invisible.asWidget: Widget
  get() = reinterpret()

public fun Invisible.getScreen(): Unit {
  gtk_invisible_get_screen(this)
}
