// TODO - get_location
// TODO - add_shortcut
// TODO - get_location
// TODO - get_nth_bookmark
// TODO - list_shortcuts
// TODO - remove_shortcut
// TODO - set_drop_targets_visible
// TODO - set_location
//
package org.gnome.gtk

import gtk3.GtkPlacesSidebar
import gtk3.gtk_places_sidebar_get_local_only
import gtk3.gtk_places_sidebar_get_open_flags
import gtk3.gtk_places_sidebar_get_show_desktop
import gtk3.gtk_places_sidebar_get_show_enter_location
import gtk3.gtk_places_sidebar_get_show_other_locations
import gtk3.gtk_places_sidebar_get_show_recent
import gtk3.gtk_places_sidebar_get_show_starred_location
import gtk3.gtk_places_sidebar_get_show_trash
import gtk3.gtk_places_sidebar_set_local_only
import gtk3.gtk_places_sidebar_set_open_flags
import gtk3.gtk_places_sidebar_set_show_desktop
import gtk3.gtk_places_sidebar_set_show_enter_location
import gtk3.gtk_places_sidebar_set_show_other_locations
import gtk3.gtk_places_sidebar_set_show_recent
import gtk3.gtk_places_sidebar_set_show_starred_location
import gtk3.gtk_places_sidebar_set_show_trash
import kotlin.Boolean
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt

public typealias PlacesSidebar = CPointer<GtkPlacesSidebar>

public val PlacesSidebar.asObject: Object
  get() = reinterpret()

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

public var PlacesSidebar.openFlags: PlacesOpenFlags
  get() = gtk_places_sidebar_get_open_flags(this)
  set(`value`) {
    gtk_places_sidebar_set_open_flags(this, value)
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
