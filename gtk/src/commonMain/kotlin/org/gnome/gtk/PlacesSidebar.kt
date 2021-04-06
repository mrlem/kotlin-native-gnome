// TODO - implement:
//   add_shortcut
//   get_location
//   get_nth_bookmark
//   get_open_flags
//   list_shortcuts
//   remove_shortcut
//   set_drop_targets_visible
//   set_location
//   set_open_flags
package org.gnome.gtk

import gtk3.GtkPlacesSidebar
import gtk3.gtk_places_sidebar_get_local_only
import gtk3.gtk_places_sidebar_get_show_connect_to_server
import gtk3.gtk_places_sidebar_get_show_desktop
import gtk3.gtk_places_sidebar_get_show_enter_location
import gtk3.gtk_places_sidebar_get_show_other_locations
import gtk3.gtk_places_sidebar_get_show_recent
import gtk3.gtk_places_sidebar_get_show_starred_location
import gtk3.gtk_places_sidebar_get_show_trash
import gtk3.gtk_places_sidebar_set_local_only
import gtk3.gtk_places_sidebar_set_show_connect_to_server
import gtk3.gtk_places_sidebar_set_show_desktop
import gtk3.gtk_places_sidebar_set_show_enter_location
import gtk3.gtk_places_sidebar_set_show_other_locations
import gtk3.gtk_places_sidebar_set_show_recent
import gtk3.gtk_places_sidebar_set_show_starred_location
import gtk3.gtk_places_sidebar_set_show_trash
import kotlin.Boolean
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned
import org.gnome.glib.toBoolean
import org.gnome.glib.toInt

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

public var PlacesSidebar.localOnly: Boolean
  get() = gtk_places_sidebar_get_local_only(this).toBoolean
  set(`value`) {
    gtk_places_sidebar_set_local_only(this, value.toInt)
  }

public var PlacesSidebar.showConnectToServer: Boolean
  get() = gtk_places_sidebar_get_show_connect_to_server(this).toBoolean
  set(`value`) {
    gtk_places_sidebar_set_show_connect_to_server(this, value.toInt)
  }

public var PlacesSidebar.showDesktop: Boolean
  get() = gtk_places_sidebar_get_show_desktop(this).toBoolean
  set(`value`) {
    gtk_places_sidebar_set_show_desktop(this, value.toInt)
  }

public var PlacesSidebar.showEnterLocation: Boolean
  get() = gtk_places_sidebar_get_show_enter_location(this).toBoolean
  set(`value`) {
    gtk_places_sidebar_set_show_enter_location(this, value.toInt)
  }

public var PlacesSidebar.showOtherLocations: Boolean
  get() = gtk_places_sidebar_get_show_other_locations(this).toBoolean
  set(`value`) {
    gtk_places_sidebar_set_show_other_locations(this, value.toInt)
  }

public var PlacesSidebar.showRecent: Boolean
  get() = gtk_places_sidebar_get_show_recent(this).toBoolean
  set(`value`) {
    gtk_places_sidebar_set_show_recent(this, value.toInt)
  }

public var PlacesSidebar.showStarredLocation: Boolean
  get() = gtk_places_sidebar_get_show_starred_location(this).toBoolean
  set(`value`) {
    gtk_places_sidebar_set_show_starred_location(this, value.toInt)
  }

public var PlacesSidebar.showTrash: Boolean
  get() = gtk_places_sidebar_get_show_trash(this).toBoolean
  set(`value`) {
    gtk_places_sidebar_set_show_trash(this, value.toInt)
  }
