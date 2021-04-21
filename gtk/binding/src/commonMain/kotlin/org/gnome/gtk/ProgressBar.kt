// TODO - method: get_ellipsize
// TODO - method: set_ellipsize
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import gtk3.GtkProgressBar
import gtk3.gtk_progress_bar_get_fraction
import gtk3.gtk_progress_bar_get_inverted
import gtk3.gtk_progress_bar_get_pulse_step
import gtk3.gtk_progress_bar_get_show_text
import gtk3.gtk_progress_bar_get_text
import gtk3.gtk_progress_bar_pulse
import gtk3.gtk_progress_bar_set_fraction
import gtk3.gtk_progress_bar_set_inverted
import gtk3.gtk_progress_bar_set_pulse_step
import gtk3.gtk_progress_bar_set_show_text
import gtk3.gtk_progress_bar_set_text
import kotlin.Boolean
import kotlin.Double
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt
import org.gnome.toKString

public typealias ProgressBar = CPointer<GtkProgressBar>

public val ProgressBar.asObject: Object
  get() = reinterpret()

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

public var ProgressBar.text: String
  get() = gtk_progress_bar_get_text(this).toKString
  set(`value`) {
    gtk_progress_bar_set_text(this, value)
  }

public fun ProgressBar.pulse(): Unit {
  gtk_progress_bar_pulse(this)
}
