package org.gnome.gtk

import gtk3.GtkEventBox
import gtk3.gtk_event_box_get_above_child
import gtk3.gtk_event_box_get_visible_window
import gtk3.gtk_event_box_set_above_child
import gtk3.gtk_event_box_set_visible_window
import kotlin.Boolean
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt

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

public fun EventBox.getAboveChild(): Boolean = gtk_event_box_get_above_child(this).toBoolean

public fun EventBox.getVisibleWindow(): Boolean = gtk_event_box_get_visible_window(this).toBoolean

public fun EventBox.setAboveChild(aboveChild: Boolean): Unit {
  gtk_event_box_set_above_child(this, aboveChild.toInt)
}

public fun EventBox.setVisibleWindow(visibleWindow: Boolean): Unit {
  gtk_event_box_set_visible_window(this, visibleWindow.toInt)
}
