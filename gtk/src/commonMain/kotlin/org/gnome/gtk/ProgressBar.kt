// TODO - implement:
//   get_ellipsize
//   pulse
//   set_ellipsize
package org.gnome.gtk

import gtk3.GtkProgressBar
import gtk3.gtk_progress_bar_get_fraction
import gtk3.gtk_progress_bar_get_inverted
import gtk3.gtk_progress_bar_get_pulse_step
import gtk3.gtk_progress_bar_get_show_text
import gtk3.gtk_progress_bar_get_text
import gtk3.gtk_progress_bar_set_fraction
import gtk3.gtk_progress_bar_set_inverted
import gtk3.gtk_progress_bar_set_pulse_step
import gtk3.gtk_progress_bar_set_show_text
import gtk3.gtk_progress_bar_set_text
import kotlin.Boolean
import kotlin.Double
import kotlin.String
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned
import org.gnome.glib.toBoolean
import org.gnome.glib.toInt
import org.gnome.glib.toKString

public typealias ProgressBar = CPointer<GtkProgressBar>

public val ProgressBar.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val ProgressBar.asWidget: Widget
  get() = reinterpret()

public var ProgressBar.fraction: Double
  get() = gtk_progress_bar_get_fraction(this)
  set(`value`) {
    gtk_progress_bar_set_fraction(this, value)
  }

public var ProgressBar.inverted: Boolean
  get() = gtk_progress_bar_get_inverted(this).toBoolean
  set(`value`) {
    gtk_progress_bar_set_inverted(this, value.toInt)
  }

public var ProgressBar.pulseStep: Double
  get() = gtk_progress_bar_get_pulse_step(this)
  set(`value`) {
    gtk_progress_bar_set_pulse_step(this, value)
  }

public var ProgressBar.showText: Boolean
  get() = gtk_progress_bar_get_show_text(this).toBoolean
  set(`value`) {
    gtk_progress_bar_set_show_text(this, value.toInt)
  }

public var ProgressBar.text: String?
  get() = gtk_progress_bar_get_text(this).toKString
  set(`value`) {
    gtk_progress_bar_set_text(this, value)
  }
