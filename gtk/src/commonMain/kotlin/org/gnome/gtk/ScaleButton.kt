// TODO - implement:
//   get_adjustment
//   get_minus_button
//   get_plus_button
//   get_popup
//   get_value
//   set_adjustment
//   set_icons
//   set_value
package org.gnome.gtk

import gtk3.GtkScaleButton
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
