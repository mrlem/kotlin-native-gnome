package org.gnome.gtk

import gtk3.GtkProgressBar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias ProgressBar = CPointer<GtkProgressBar>

public val ProgressBar.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val ProgressBar.asWidget: Widget
  get() = reinterpret()
