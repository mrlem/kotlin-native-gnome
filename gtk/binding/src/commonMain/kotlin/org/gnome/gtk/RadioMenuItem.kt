// TODO - method: get_group
// TODO - method: set_group
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import gtk3.GtkRadioMenuItem
import gtk3.gtk_radio_menu_item_join_group
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object

public typealias RadioMenuItem = CPointer<GtkRadioMenuItem>

public val RadioMenuItem.asObject: Object
  get() = reinterpret()

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

public fun RadioMenuItem.joinGroup(groupSource: RadioMenuItem?): Unit {
  gtk_radio_menu_item_join_group(this, groupSource?.reinterpret())
}
