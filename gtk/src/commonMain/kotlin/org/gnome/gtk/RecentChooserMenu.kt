package org.gnome.gtk

import gtk3.GtkRecentChooserMenu
import gtk3.gtk_recent_chooser_menu_get_show_numbers
import gtk3.gtk_recent_chooser_menu_set_show_numbers
import kotlin.Boolean
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned
import org.gnome.glib.gobject.Object
import org.gnome.glib.toBoolean
import org.gnome.glib.toInt

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

public var RecentChooserMenu.showNumbers: Boolean
  get() = gtk_recent_chooser_menu_get_show_numbers(this).toBoolean
  set(`value`) {
    gtk_recent_chooser_menu_set_show_numbers(this, value.toInt)
  }
