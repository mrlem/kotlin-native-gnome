@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkSpinner
import interop.gtk_spinner_new
import interop.gtk_spinner_start
import interop.gtk_spinner_stop
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object

public typealias Spinner = CPointer<GtkSpinner>

public val Spinner.asObject: Object
  get() = reinterpret()

public val Spinner.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Spinner.asWidget: Widget
  get() = reinterpret()

public object SpinnerFactory {
  public fun new(): Spinner = gtk_spinner_new()!!.reinterpret()
}

public fun Spinner.start(): Unit {
  gtk_spinner_start(this)
}

public fun Spinner.stop(): Unit {
  gtk_spinner_stop(this)
}