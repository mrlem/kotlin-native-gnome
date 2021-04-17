// TODO - implement:
//   add_overlay
//   get_overlay_pass_through
//   reorder_overlay
//   set_overlay_pass_through
package org.gnome.gtk

import gtk3.GtkOverlay
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned
import org.gnome.glib.gobject.Object

public typealias Overlay = CPointer<GtkOverlay>

public val Overlay.asObject: Object
  get() = reinterpret()

public val Overlay.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Overlay.asWidget: Widget
  get() = reinterpret()

public val Overlay.asContainer: Container
  get() = reinterpret()

public val Overlay.asBin: Bin
  get() = reinterpret()
