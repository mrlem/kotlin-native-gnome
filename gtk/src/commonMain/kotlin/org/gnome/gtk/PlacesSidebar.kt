// TODO - implement:
//   add_shortcut
//   get_local_only
//   get_location
//   get_nth_bookmark
//   get_open_flags
//   get_show_connect_to_server
//   get_show_desktop
//   get_show_enter_location
//   get_show_other_locations
//   get_show_recent
//   get_show_starred_location
//   get_show_trash
//   list_shortcuts
//   remove_shortcut
//   set_drop_targets_visible
//   set_local_only
//   set_location
//   set_open_flags
//   set_show_connect_to_server
//   set_show_desktop
//   set_show_enter_location
//   set_show_other_locations
//   set_show_recent
//   set_show_starred_location
//   set_show_trash
package org.gnome.gtk

import gtk3.GtkPlacesSidebar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias PlacesSidebar = CPointer<GtkPlacesSidebar>

public val PlacesSidebar.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val PlacesSidebar.asWidget: Widget
  get() = reinterpret()

public val PlacesSidebar.asContainer: Container
  get() = reinterpret()

public val PlacesSidebar.asBin: Bin
  get() = reinterpret()

public val PlacesSidebar.asScrolledWindow: ScrolledWindow
  get() = reinterpret()
