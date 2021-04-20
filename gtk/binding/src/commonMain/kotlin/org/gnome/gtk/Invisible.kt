// TODO - get_screen
// TODO - set_screen
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import gtk3.GtkInvisible
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object

public typealias Invisible = CPointer<GtkInvisible>

public val Invisible.asObject: Object
  get() = reinterpret()

public val Invisible.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Invisible.asWidget: Widget
  get() = reinterpret()
