@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkEventBox
import interop.gtk_event_box_get_above_child
import interop.gtk_event_box_get_visible_window
import interop.gtk_event_box_new
import interop.gtk_event_box_set_above_child
import interop.gtk_event_box_set_visible_window
import kotlin.Boolean
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.mrlem.gnome.toBoolean
import org.mrlem.gnome.toInt

public typealias EventBox = CPointer<GtkEventBox>

public val EventBox.asObject: Object
  get() = reinterpret()

public val EventBox.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val EventBox.asWidget: Widget
  get() = reinterpret()

public val EventBox.asContainer: Container
  get() = reinterpret()

public val EventBox.asBin: Bin
  get() = reinterpret()

public object EventBoxFactory {
  public fun new(): EventBox = gtk_event_box_new()!!.reinterpret()
}

public val EventBox.bin: Bin
  get() = pointed.bin.ptr

public var EventBox.aboveChild: Boolean
  get() = gtk_event_box_get_above_child(this).toBoolean()
  set(`value`) {
    gtk_event_box_set_above_child(this@aboveChild, `value`.toInt())
  }

public var EventBox.visibleWindow: Boolean
  get() = gtk_event_box_get_visible_window(this).toBoolean()
  set(`value`) {
    gtk_event_box_set_visible_window(this@visibleWindow, `value`.toInt())
  }
