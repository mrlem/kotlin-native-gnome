// TODO - method: get_bin_window
// TODO - method: get_hadjustment
// TODO - method: get_vadjustment
// TODO - method: get_view_window
// TODO - method: set_hadjustment
// TODO - method: set_vadjustment
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import gtk3.GtkViewport
import gtk3.gtk_viewport_get_shadow_type
import gtk3.gtk_viewport_set_shadow_type
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

public var Viewport.shadowType: ShadowType
  get() = gtk_viewport_get_shadow_type(this)
  set(`value`) {
    gtk_viewport_set_shadow_type(this, value)
  }
