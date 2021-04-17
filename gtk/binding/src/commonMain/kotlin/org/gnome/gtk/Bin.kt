package org.gnome.gtk

import gtk3.GtkBin
import gtk3.gtk_bin_get_child
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned
import org.gnome.glib.gobject.Object

public typealias Bin = CPointer<GtkBin>

public val Bin.asObject: Object
  get() = reinterpret()

public val Bin.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Bin.asWidget: Widget
  get() = reinterpret()

public val Bin.asContainer: Container
  get() = reinterpret()

public fun Bin.getChild(): Unit {
  gtk_bin_get_child(this)
}
