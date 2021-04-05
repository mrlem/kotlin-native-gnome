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
