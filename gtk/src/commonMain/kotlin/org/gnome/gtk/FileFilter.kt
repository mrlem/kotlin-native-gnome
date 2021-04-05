package org.gnome.gtk

import gtk3.GtkFileFilter
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias FileFilter = CPointer<GtkFileFilter>

public val FileFilter.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()
