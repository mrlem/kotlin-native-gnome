// TODO - implement:
//   get_size
//   move
//   put
//   set_hadjustment
//   set_size
//   set_vadjustment
package org.gnome.gtk

import gtk3.GtkLayout
import gtk3.gtk_layout_get_bin_window
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias Layout = CPointer<GtkLayout>

public val Layout.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Layout.asWidget: Widget
  get() = reinterpret()

public val Layout.asContainer: Container
  get() = reinterpret()

public fun Layout.getBinWindow(): Unit {
  gtk_layout_get_bin_window(this)
}
