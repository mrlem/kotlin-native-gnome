// TODO - implement:
//   get_bin_window
//   get_hadjustment
//   get_shadow_type
//   get_vadjustment
//   get_view_window
//   set_hadjustment
//   set_shadow_type
//   set_vadjustment
package org.gnome.gtk

import gtk3.GtkViewport
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias Viewport = CPointer<GtkViewport>

public val Viewport.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Viewport.asWidget: Widget
  get() = reinterpret()

public val Viewport.asContainer: Container
  get() = reinterpret()

public val Viewport.asBin: Bin
  get() = reinterpret()
