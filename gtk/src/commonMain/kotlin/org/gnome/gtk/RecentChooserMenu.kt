// TODO - implement:
//   get_show_numbers
//   set_show_numbers
package org.gnome.gtk

import gtk3.GtkRecentChooserMenu
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias RecentChooserMenu = CPointer<GtkRecentChooserMenu>

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
