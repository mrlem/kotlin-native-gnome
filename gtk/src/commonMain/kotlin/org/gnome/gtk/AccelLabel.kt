// TODO - implement:
//   get_accel
//   get_accel_widget
//   get_accel_width
//   refetch
//   set_accel
//   set_accel_closure
//   set_accel_widget
package org.gnome.gtk

import gtk3.GtkAccelLabel
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias AccelLabel = CPointer<GtkAccelLabel>

public val AccelLabel.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val AccelLabel.asWidget: Widget
  get() = reinterpret()

public val AccelLabel.asMisc: Misc
  get() = reinterpret()

public val AccelLabel.asLabel: Label
  get() = reinterpret()
