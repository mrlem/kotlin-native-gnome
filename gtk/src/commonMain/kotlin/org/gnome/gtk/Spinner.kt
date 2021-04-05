// TODO - implement:
//   start
//   stop
package org.gnome.gtk

import gtk3.GtkSpinner
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias Spinner = CPointer<GtkSpinner>

public val Spinner.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Spinner.asWidget: Widget
  get() = reinterpret()
