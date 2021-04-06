// TODO - implement:
//   get_adjustment
//   get_minus_button
//   get_plus_button
//   get_popup
//   set_adjustment
//   set_icons
package org.gnome.gtk

import gtk3.GtkScaleButton
import gtk3.gtk_scale_button_get_value
import gtk3.gtk_scale_button_set_value
import kotlin.Double
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias ScaleButton = CPointer<GtkScaleButton>

public val ScaleButton.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val ScaleButton.asWidget: Widget
  get() = reinterpret()

public val ScaleButton.asContainer: Container
  get() = reinterpret()

public val ScaleButton.asBin: Bin
  get() = reinterpret()

public val ScaleButton.asButton: Button
  get() = reinterpret()

public var ScaleButton.`value`: Double
  get() = gtk_scale_button_get_value(this)
  set(`value`) {
    gtk_scale_button_set_value(this, value)
  }
