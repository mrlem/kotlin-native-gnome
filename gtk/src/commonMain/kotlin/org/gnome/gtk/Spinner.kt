package org.gnome.gtk

import gtk3.GtkSpinner
import gtk3.gtk_spinner_start
import gtk3.gtk_spinner_stop
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias Spinner = CPointer<GtkSpinner>

public val Spinner.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Spinner.asWidget: Widget
  get() = reinterpret()

public fun Spinner.start(): Unit {
  gtk_spinner_start(this)
}

public fun Spinner.stop(): Unit {
  gtk_spinner_stop(this)
}
