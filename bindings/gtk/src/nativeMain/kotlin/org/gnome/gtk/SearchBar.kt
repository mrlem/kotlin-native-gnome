@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkSearchBar
import interop.gtk_search_bar_connect_entry
import interop.gtk_search_bar_get_search_mode
import interop.gtk_search_bar_get_show_close_button
import interop.gtk_search_bar_handle_event
import interop.gtk_search_bar_new
import interop.gtk_search_bar_set_search_mode
import interop.gtk_search_bar_set_show_close_button
import kotlin.Boolean
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gdk.Event
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.mrlem.gnome.toBoolean
import org.mrlem.gnome.toInt

public typealias SearchBar = CPointer<GtkSearchBar>

public val SearchBar.asObject: Object
  get() = reinterpret()

public val SearchBar.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val SearchBar.asWidget: Widget
  get() = reinterpret()

public val SearchBar.asContainer: Container
  get() = reinterpret()

public val SearchBar.asBin: Bin
  get() = reinterpret()

public object SearchBarFactory {
  public fun new(): SearchBar = gtk_search_bar_new()!!.reinterpret()
}

public var SearchBar.searchMode: Boolean
  get() = gtk_search_bar_get_search_mode(this).toBoolean()
  set(`value`) {
    gtk_search_bar_set_search_mode(this@searchMode, `value`.toInt())
  }

public var SearchBar.showCloseButton: Boolean
  get() = gtk_search_bar_get_show_close_button(this).toBoolean()
  set(`value`) {
    gtk_search_bar_set_show_close_button(this@showCloseButton, `value`.toInt())
  }

public fun SearchBar.connectEntry(entry: Entry?): Unit {
  gtk_search_bar_connect_entry(this@connectEntry, entry?.reinterpret())
}

public fun SearchBar.handleEvent(event: Event?): Boolean =
    gtk_search_bar_handle_event(this@handleEvent, event?.reinterpret()).toBoolean()
