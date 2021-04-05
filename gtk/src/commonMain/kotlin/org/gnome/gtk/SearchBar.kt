// TODO - implement:
//   connect_entry
//   get_search_mode
//   get_show_close_button
//   handle_event
//   set_search_mode
//   set_show_close_button
package org.gnome.gtk

import gtk3.GtkSearchBar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias SearchBar = CPointer<GtkSearchBar>

public val SearchBar.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val SearchBar.asWidget: Widget
  get() = reinterpret()

public val SearchBar.asContainer: Container
  get() = reinterpret()

public val SearchBar.asBin: Bin
  get() = reinterpret()
