// TODO - method: list_shortcuts (return type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkPlacesSidebar
import interop.gtk_places_sidebar_add_shortcut
import interop.gtk_places_sidebar_get_local_only
import interop.gtk_places_sidebar_get_location
import interop.gtk_places_sidebar_get_nth_bookmark
import interop.gtk_places_sidebar_get_open_flags
import interop.gtk_places_sidebar_get_show_desktop
import interop.gtk_places_sidebar_get_show_enter_location
import interop.gtk_places_sidebar_get_show_other_locations
import interop.gtk_places_sidebar_get_show_recent
import interop.gtk_places_sidebar_get_show_starred_location
import interop.gtk_places_sidebar_get_show_trash
import interop.gtk_places_sidebar_new
import interop.gtk_places_sidebar_remove_shortcut
import interop.gtk_places_sidebar_set_drop_targets_visible
import interop.gtk_places_sidebar_set_local_only
import interop.gtk_places_sidebar_set_location
import interop.gtk_places_sidebar_set_open_flags
import interop.gtk_places_sidebar_set_show_desktop
import interop.gtk_places_sidebar_set_show_enter_location
import interop.gtk_places_sidebar_set_show_other_locations
import interop.gtk_places_sidebar_set_show_recent
import interop.gtk_places_sidebar_set_show_starred_location
import interop.gtk_places_sidebar_set_show_trash
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gdk.DragContext
import org.gnome.gio.File
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt
import org.mrlem.gnome.gobject.connect

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

public object PlacesSidebarFactory {
  public fun new(): PlacesSidebar = gtk_places_sidebar_new()!!.reinterpret()
}

public var PlacesSidebar.localOnly: Boolean
  get() = gtk_places_sidebar_get_local_only(this).toBoolean()
  set(`value`) {
    gtk_places_sidebar_set_local_only(this@localOnly, `value`.toInt())
  }

public var PlacesSidebar.location: File?
  get() = gtk_places_sidebar_get_location(this)?.reinterpret()
  set(`value`) {
    gtk_places_sidebar_set_location(this@location, `value`)
  }

public var PlacesSidebar.openFlags: PlacesOpenFlags
  get() = gtk_places_sidebar_get_open_flags(this)
  set(`value`) {
    gtk_places_sidebar_set_open_flags(this@openFlags, `value`)
  }

public var PlacesSidebar.showDesktop: Boolean
  get() = gtk_places_sidebar_get_show_desktop(this).toBoolean()
  set(`value`) {
    gtk_places_sidebar_set_show_desktop(this@showDesktop, `value`.toInt())
  }

public var PlacesSidebar.showEnterLocation: Boolean
  get() = gtk_places_sidebar_get_show_enter_location(this).toBoolean()
  set(`value`) {
    gtk_places_sidebar_set_show_enter_location(this@showEnterLocation, `value`.toInt())
  }

public var PlacesSidebar.showOtherLocations: Boolean
  get() = gtk_places_sidebar_get_show_other_locations(this).toBoolean()
  set(`value`) {
    gtk_places_sidebar_set_show_other_locations(this@showOtherLocations, `value`.toInt())
  }

public var PlacesSidebar.showRecent: Boolean
  get() = gtk_places_sidebar_get_show_recent(this).toBoolean()
  set(`value`) {
    gtk_places_sidebar_set_show_recent(this@showRecent, `value`.toInt())
  }

public var PlacesSidebar.showStarredLocation: Boolean
  get() = gtk_places_sidebar_get_show_starred_location(this).toBoolean()
  set(`value`) {
    gtk_places_sidebar_set_show_starred_location(this@showStarredLocation, `value`.toInt())
  }

public var PlacesSidebar.showTrash: Boolean
  get() = gtk_places_sidebar_get_show_trash(this).toBoolean()
  set(`value`) {
    gtk_places_sidebar_set_show_trash(this@showTrash, `value`.toInt())
  }

public fun PlacesSidebar.addShortcut(location: File?): Unit {
  gtk_places_sidebar_add_shortcut(this@addShortcut, location?.reinterpret())
}

public fun PlacesSidebar.getNthBookmark(n: Int): File? =
    gtk_places_sidebar_get_nth_bookmark(this@getNthBookmark, n)?.reinterpret()

public fun PlacesSidebar.removeShortcut(location: File?): Unit {
  gtk_places_sidebar_remove_shortcut(this@removeShortcut, location?.reinterpret())
}

public fun PlacesSidebar.setDropTargetsVisible(visible: Boolean, context: DragContext?): Unit {
  gtk_places_sidebar_set_drop_targets_visible(this@setDropTargetsVisible, visible.toInt(),
      context?.reinterpret())
}

public fun PlacesSidebar.onDragActionAsk(callback: (PlacesSidebar) -> Unit): PlacesSidebar {
  // TODO - handle callback data

  asObject.connect("drag-action-ask") { callback(this) }
  return this
}

public fun PlacesSidebar.onDragActionRequested(callback: (PlacesSidebar) -> Unit): PlacesSidebar {
  // TODO - handle callback data

  asObject.connect("drag-action-requested") { callback(this) }
  return this
}

public fun PlacesSidebar.onDragPerformDrop(callback: (PlacesSidebar) -> Unit): PlacesSidebar {
  // TODO - handle callback data

  asObject.connect("drag-perform-drop") { callback(this) }
  return this
}

public fun PlacesSidebar.onMount(callback: (PlacesSidebar) -> Unit): PlacesSidebar {
  // TODO - handle callback data

  asObject.connect("mount") { callback(this) }
  return this
}

public fun PlacesSidebar.onOpenLocation(callback: (PlacesSidebar) -> Unit): PlacesSidebar {
  // TODO - handle callback data

  asObject.connect("open-location") { callback(this) }
  return this
}

public fun PlacesSidebar.onPopulatePopup(callback: (PlacesSidebar) -> Unit): PlacesSidebar {
  // TODO - handle callback data

  asObject.connect("populate-popup") { callback(this) }
  return this
}

public fun PlacesSidebar.onShowConnectToServer(callback: (PlacesSidebar) -> Unit): PlacesSidebar {
  // TODO - handle callback data

  asObject.connect("show-connect-to-server") { callback(this) }
  return this
}

public fun PlacesSidebar.onShowEnterLocation(callback: (PlacesSidebar) -> Unit): PlacesSidebar {
  // TODO - handle callback data

  asObject.connect("show-enter-location") { callback(this) }
  return this
}

public fun PlacesSidebar.onShowErrorMessage(callback: (PlacesSidebar) -> Unit): PlacesSidebar {
  // TODO - handle callback data

  asObject.connect("show-error-message") { callback(this) }
  return this
}

public fun PlacesSidebar.onShowOtherLocations(callback: (PlacesSidebar) -> Unit): PlacesSidebar {
  // TODO - handle callback data

  asObject.connect("show-other-locations") { callback(this) }
  return this
}

public fun PlacesSidebar.onShowOtherLocationsWithFlags(callback: (PlacesSidebar) -> Unit):
    PlacesSidebar {
  // TODO - handle callback data

  asObject.connect("show-other-locations-with-flags") { callback(this) }
  return this
}

public fun PlacesSidebar.onShowStarredLocation(callback: (PlacesSidebar) -> Unit): PlacesSidebar {
  // TODO - handle callback data

  asObject.connect("show-starred-location") { callback(this) }
  return this
}

public fun PlacesSidebar.onUnmount(callback: (PlacesSidebar) -> Unit): PlacesSidebar {
  // TODO - handle callback data

  asObject.connect("unmount") { callback(this) }
  return this
}
