@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkRecentChooserMenu
import interop.gtk_recent_chooser_menu_get_show_numbers
import interop.gtk_recent_chooser_menu_new
import interop.gtk_recent_chooser_menu_new_for_manager
import interop.gtk_recent_chooser_menu_set_show_numbers
import kotlin.Boolean
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.mrlem.gnome.toBoolean
import org.mrlem.gnome.toInt

public typealias RecentChooserMenu = CPointer<GtkRecentChooserMenu>

public val RecentChooserMenu.asObject: Object
  get() = reinterpret()

public val RecentChooserMenu.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val RecentChooserMenu.asWidget: Widget
  get() = reinterpret()

public val RecentChooserMenu.asContainer: Container
  get() = reinterpret()

public val RecentChooserMenu.asMenuShell: MenuShell
  get() = reinterpret()

public val RecentChooserMenu.asMenu: Menu
  get() = reinterpret()

public object RecentChooserMenuFactory {
  public fun new(): RecentChooserMenu = gtk_recent_chooser_menu_new()!!.reinterpret()

  public fun newForManager(manager: RecentManager?): RecentChooserMenu =
      gtk_recent_chooser_menu_new_for_manager(manager?.reinterpret())!!.reinterpret()
}

public val RecentChooserMenu.parentInstance: Menu
  get() = pointed.parent_instance.ptr

public var RecentChooserMenu.showNumbers: Boolean
  get() = gtk_recent_chooser_menu_get_show_numbers(this).toBoolean()
  set(`value`) {
    gtk_recent_chooser_menu_set_show_numbers(this@showNumbers, `value`.toInt())
  }
