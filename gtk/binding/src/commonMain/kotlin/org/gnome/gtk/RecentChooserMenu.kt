package org.gnome.gtk

import gtk3.GtkRecentChooserMenu
import gtk3.gtk_recent_chooser_menu_get_show_numbers
import gtk3.gtk_recent_chooser_menu_set_show_numbers
import kotlin.Boolean
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt

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

public fun RecentChooserMenu.getShowNumbers(): Boolean =
    gtk_recent_chooser_menu_get_show_numbers(this).toBoolean

public fun RecentChooserMenu.setShowNumbers(showNumbers: Boolean): Unit {
  gtk_recent_chooser_menu_set_show_numbers(this, showNumbers.toInt)
}
