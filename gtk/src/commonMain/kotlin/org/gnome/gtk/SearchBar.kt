// TODO - implement:
//   connect_entry
//   handle_event
package org.gnome.gtk

import gtk3.GtkSearchBar
import gtk3.gtk_search_bar_get_search_mode
import gtk3.gtk_search_bar_get_show_close_button
import gtk3.gtk_search_bar_set_search_mode
import gtk3.gtk_search_bar_set_show_close_button
import kotlin.Boolean
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned
import org.gnome.glib.toBoolean
import org.gnome.glib.toInt

public typealias SearchBar = CPointer<GtkSearchBar>

public val SearchBar.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val SearchBar.asWidget: Widget
  get() = reinterpret()

public val SearchBar.asContainer: Container
  get() = reinterpret()

public val SearchBar.asBin: Bin
  get() = reinterpret()

public var SearchBar.searchMode: Boolean
  get() = gtk_search_bar_get_search_mode(this).toBoolean
  set(`value`) {
    gtk_search_bar_set_search_mode(this, value.toInt)
  }

public var SearchBar.showCloseButton: Boolean
  get() = gtk_search_bar_get_show_close_button(this).toBoolean
  set(`value`) {
    gtk_search_bar_set_show_close_button(this, value.toInt)
  }
