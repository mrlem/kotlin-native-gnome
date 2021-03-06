@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkSearchEntry
import interop.gtk_search_entry_handle_event
import interop.gtk_search_entry_new
import kotlin.Boolean
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gdk.Event
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.mrlem.gnome.gobject.connect
import org.mrlem.gnome.toBoolean

public typealias SearchEntry = CPointer<GtkSearchEntry>

public val SearchEntry.asObject: Object
  get() = reinterpret()

public val SearchEntry.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val SearchEntry.asWidget: Widget
  get() = reinterpret()

public val SearchEntry.asEntry: Entry
  get() = reinterpret()

public object SearchEntryFactory {
  public fun new(): SearchEntry = gtk_search_entry_new()!!.reinterpret()
}

public val SearchEntry.parent: Entry
  get() = pointed.parent.ptr

public fun SearchEntry.handleEvent(event: Event?): Boolean =
    gtk_search_entry_handle_event(this@handleEvent, event?.reinterpret()).toBoolean()

public fun SearchEntry.onNextMatch(callback: (SearchEntry) -> Unit): SearchEntry {
  // TODO - handle callback data

  asObject.connect("next-match") { callback(this) }
  return this
}

public fun SearchEntry.onPreviousMatch(callback: (SearchEntry) -> Unit): SearchEntry {
  // TODO - handle callback data

  asObject.connect("previous-match") { callback(this) }
  return this
}

public fun SearchEntry.onSearchChanged(callback: (SearchEntry) -> Unit): SearchEntry {
  // TODO - handle callback data

  asObject.connect("search-changed") { callback(this) }
  return this
}

public fun SearchEntry.onStopSearch(callback: (SearchEntry) -> Unit): SearchEntry {
  // TODO - handle callback data

  asObject.connect("stop-search") { callback(this) }
  return this
}
