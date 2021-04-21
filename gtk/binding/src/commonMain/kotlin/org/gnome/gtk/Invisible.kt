// TODO - constructor: new_for_screen
// TODO - method: get_screen
// TODO - method: set_screen
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType","FunctionName")

package org.gnome.gtk

import gtk3.GtkInvisible
import gtk3.gtk_invisible_new
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

public object InvisibleFactory {
  public fun new(): Invisible = gtk_invisible_new()!!.reinterpret()
}
