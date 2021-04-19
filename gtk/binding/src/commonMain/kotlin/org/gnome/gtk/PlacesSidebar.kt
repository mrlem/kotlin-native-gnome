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
import kotlin.Unit
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

public fun PlacesSidebar.getLocalOnly(): Boolean = gtk_places_sidebar_get_local_only(this).toBoolean

public fun PlacesSidebar.getOpenFlags(): PlacesOpenFlags = gtk_places_sidebar_get_open_flags(this)

public fun PlacesSidebar.getShowDesktop(): Boolean =
    gtk_places_sidebar_get_show_desktop(this).toBoolean

public fun PlacesSidebar.getShowEnterLocation(): Boolean =
    gtk_places_sidebar_get_show_enter_location(this).toBoolean

public fun PlacesSidebar.getShowOtherLocations(): Boolean =
    gtk_places_sidebar_get_show_other_locations(this).toBoolean

public fun PlacesSidebar.getShowRecent(): Boolean =
    gtk_places_sidebar_get_show_recent(this).toBoolean

public fun PlacesSidebar.getShowStarredLocation(): Boolean =
    gtk_places_sidebar_get_show_starred_location(this).toBoolean

public fun PlacesSidebar.getShowTrash(): Boolean = gtk_places_sidebar_get_show_trash(this).toBoolean

public fun PlacesSidebar.setLocalOnly(localOnly: Boolean): Unit {
  gtk_places_sidebar_set_local_only(this, localOnly.toInt)
}

public fun PlacesSidebar.setOpenFlags(flags: PlacesOpenFlags): Unit {
  gtk_places_sidebar_set_open_flags(this, flags)
}

public fun PlacesSidebar.setShowDesktop(showDesktop: Boolean): Unit {
  gtk_places_sidebar_set_show_desktop(this, showDesktop.toInt)
}

public fun PlacesSidebar.setShowEnterLocation(showEnterLocation: Boolean): Unit {
  gtk_places_sidebar_set_show_enter_location(this, showEnterLocation.toInt)
}

public fun PlacesSidebar.setShowOtherLocations(showOtherLocations: Boolean): Unit {
  gtk_places_sidebar_set_show_other_locations(this, showOtherLocations.toInt)
}

public fun PlacesSidebar.setShowRecent(showRecent: Boolean): Unit {
  gtk_places_sidebar_set_show_recent(this, showRecent.toInt)
}

public fun PlacesSidebar.setShowStarredLocation(showStarredLocation: Boolean): Unit {
  gtk_places_sidebar_set_show_starred_location(this, showStarredLocation.toInt)
}

public fun PlacesSidebar.setShowTrash(showTrash: Boolean): Unit {
  gtk_places_sidebar_set_show_trash(this, showTrash.toInt)
}
