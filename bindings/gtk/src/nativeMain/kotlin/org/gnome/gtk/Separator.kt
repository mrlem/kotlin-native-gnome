@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkSeparator
import interop.gtk_separator_new
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object

public typealias Separator = CPointer<GtkSeparator>

public val Separator.asObject: Object
  get() = reinterpret()

public val Separator.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Separator.asWidget: Widget
  get() = reinterpret()

public object SeparatorFactory {
  public fun new(orientation: Orientation): Separator =
      gtk_separator_new(orientation)!!.reinterpret()
}

public val Separator.widget: Widget
  get() = pointed.widget.ptr
