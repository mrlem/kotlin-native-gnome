// TODO - implement:
//   get_ellipsize
//   get_fraction
//   get_inverted
//   get_pulse_step
//   get_show_text
//   get_text
//   pulse
//   set_ellipsize
//   set_fraction
//   set_inverted
//   set_pulse_step
//   set_show_text
//   set_text
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
