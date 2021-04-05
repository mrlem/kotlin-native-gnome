// TODO - implement:
//   get_bin_window
//   get_hadjustment
//   get_size
//   get_vadjustment
//   move
//   put
//   set_hadjustment
//   set_size
//   set_vadjustment
package org.gnome.gtk

import gtk3.GtkLayout
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias Layout = CPointer<GtkLayout>

public val Layout.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Layout.asWidget: Widget
  get() = reinterpret()

public val Layout.asContainer: Container
  get() = reinterpret()
