// TODO - get_bin_window
// TODO - get_shadow_type
// TODO - get_view_window
// TODO - get_bin_window
// TODO - get_shadow_type
// TODO - get_view_window
// TODO - set_shadow_type
//
package org.gnome.gtk

import gtk3.GtkViewport
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object

public typealias Viewport = CPointer<GtkViewport>

public val Viewport.asObject: Object
  get() = reinterpret()

public val Viewport.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Viewport.asWidget: Widget
  get() = reinterpret()

public val Viewport.asContainer: Container
  get() = reinterpret()

public val Viewport.asBin: Bin
  get() = reinterpret()
