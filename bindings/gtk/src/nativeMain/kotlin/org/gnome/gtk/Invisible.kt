@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkInvisible
import interop.gtk_invisible_get_screen
import interop.gtk_invisible_new
import interop.gtk_invisible_new_for_screen
import interop.gtk_invisible_set_screen
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gdk.Screen
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

  public fun newForScreen(screen: Screen?): Invisible =
      gtk_invisible_new_for_screen(screen?.reinterpret())!!.reinterpret()
}

public val Invisible.widget: Widget
  get() = pointed.widget.ptr

public var Invisible.screen: Screen?
  get() = gtk_invisible_get_screen(this)?.reinterpret()
  set(`value`) {
    gtk_invisible_set_screen(this@screen, `value`)
  }
