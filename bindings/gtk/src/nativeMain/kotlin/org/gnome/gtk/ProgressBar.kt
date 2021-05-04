// TODO - method: get_ellipsize
// TODO - method: set_ellipsize
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkProgressBar
import interop.gtk_progress_bar_get_fraction
import interop.gtk_progress_bar_get_inverted
import interop.gtk_progress_bar_get_pulse_step
import interop.gtk_progress_bar_get_show_text
import interop.gtk_progress_bar_get_text
import interop.gtk_progress_bar_new
import interop.gtk_progress_bar_pulse
import interop.gtk_progress_bar_set_fraction
import interop.gtk_progress_bar_set_inverted
import interop.gtk_progress_bar_set_pulse_step
import interop.gtk_progress_bar_set_show_text
import interop.gtk_progress_bar_set_text
import kotlin.Boolean
import kotlin.Double
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
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

public object ProgressBarFactory {
  public fun new(): ProgressBar = gtk_progress_bar_new()!!.reinterpret()
}

public val ProgressBar.parent: Widget
  get() = pointed.parent.ptr

public var ProgressBar.fraction: Double
  get() = gtk_progress_bar_get_fraction(this)
  set(`value`) {
    gtk_progress_bar_set_fraction(this@fraction, `value`)
  }

public var ProgressBar.inverted: Boolean
  get() = gtk_progress_bar_get_inverted(this).toBoolean()
  set(`value`) {
    gtk_progress_bar_set_inverted(this@inverted, `value`.toInt())
  }

public var ProgressBar.pulseStep: Double
  get() = gtk_progress_bar_get_pulse_step(this)
  set(`value`) {
    gtk_progress_bar_set_pulse_step(this@pulseStep, `value`)
  }

public var ProgressBar.showText: Boolean
  get() = gtk_progress_bar_get_show_text(this).toBoolean()
  set(`value`) {
    gtk_progress_bar_set_show_text(this@showText, `value`.toInt())
  }

public var ProgressBar.text: String?
  get() = gtk_progress_bar_get_text(this).toKString()
  set(`value`) {
    gtk_progress_bar_set_text(this@text, `value`)
  }

public fun ProgressBar.pulse(): Unit {
  gtk_progress_bar_pulse(this@pulse)
}
