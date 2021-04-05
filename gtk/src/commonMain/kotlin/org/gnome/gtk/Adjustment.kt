package org.gnome.gtk

import gtk3.GtkAdjustment
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias Adjustment = CPointer<GtkAdjustment>

public val Adjustment.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()
