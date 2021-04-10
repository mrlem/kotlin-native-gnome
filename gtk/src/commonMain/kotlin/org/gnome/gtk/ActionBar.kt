// TODO - implement:
//   pack_end
//   pack_start
//   set_center_widget
package org.gnome.gtk

import gtk3.GtkActionBar
import gtk3.gtk_action_bar_get_center_widget
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned
import org.gnome.glib.gobject.Object

public typealias ActionBar = CPointer<GtkActionBar>

public val ActionBar.asObject: Object
  get() = reinterpret()

public val ActionBar.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val ActionBar.asWidget: Widget
  get() = reinterpret()

public val ActionBar.asContainer: Container
  get() = reinterpret()

public val ActionBar.asBin: Bin
  get() = reinterpret()

public fun ActionBar.getCenterWidget(): Unit {
  gtk_action_bar_get_center_widget(this)
}
