// TODO - implement:
//   join_group
//   set_group
package org.gnome.gtk

import gtk3.GtkRadioMenuItem
import gtk3.gtk_radio_menu_item_get_group
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias RadioMenuItem = CPointer<GtkRadioMenuItem>

public val RadioMenuItem.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val RadioMenuItem.asWidget: Widget
  get() = reinterpret()

public val RadioMenuItem.asContainer: Container
  get() = reinterpret()

public val RadioMenuItem.asBin: Bin
  get() = reinterpret()

public val RadioMenuItem.asMenuItem: MenuItem
  get() = reinterpret()

public val RadioMenuItem.asCheckMenuItem: CheckMenuItem
  get() = reinterpret()

public fun RadioMenuItem.getGroup(): Unit {
  gtk_radio_menu_item_get_group(this)
}
