// TODO - get_ellipsize
// TODO - set_ellipsize
//
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

public fun ProgressBar.getFraction(): Double = gtk_progress_bar_get_fraction(this)

public fun ProgressBar.getInverted(): Boolean = gtk_progress_bar_get_inverted(this).toBoolean

public fun ProgressBar.getPulseStep(): Double = gtk_progress_bar_get_pulse_step(this)

public fun ProgressBar.getShowText(): Boolean = gtk_progress_bar_get_show_text(this).toBoolean

public fun ProgressBar.getText(): String = gtk_progress_bar_get_text(this).toKString

public fun ProgressBar.pulse(): Unit {
  gtk_progress_bar_pulse(this)
}

public fun ProgressBar.setFraction(fraction: Double): Unit {
  gtk_progress_bar_set_fraction(this, fraction)
}

public fun ProgressBar.setInverted(inverted: Boolean): Unit {
  gtk_progress_bar_set_inverted(this, inverted.toInt)
}

public fun ProgressBar.setPulseStep(fraction: Double): Unit {
  gtk_progress_bar_set_pulse_step(this, fraction)
}

public fun ProgressBar.setShowText(showText: Boolean): Unit {
  gtk_progress_bar_set_show_text(this, showText.toInt)
}

public fun ProgressBar.setText(text: String?): Unit {
  gtk_progress_bar_set_text(this, text)
}
