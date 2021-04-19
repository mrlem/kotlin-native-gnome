// TODO - bind_model
// TODO - get_constrain_to
// TODO - get_pointing_to
// TODO - get_position
// TODO - set_constrain_to
// TODO - set_pointing_to
// TODO - set_position
//
package org.gnome.gtk

import gtk3.GtkPopover
import gtk3.gtk_popover_get_default_widget
import gtk3.gtk_popover_get_modal
import gtk3.gtk_popover_get_relative_to
import gtk3.gtk_popover_popdown
import gtk3.gtk_popover_popup
import gtk3.gtk_popover_set_default_widget
import gtk3.gtk_popover_set_modal
import gtk3.gtk_popover_set_relative_to
import kotlin.Boolean
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt

public typealias Popover = CPointer<GtkPopover>

public val Popover.asObject: Object
  get() = reinterpret()

public val Popover.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Popover.asWidget: Widget
  get() = reinterpret()

public val Popover.asContainer: Container
  get() = reinterpret()

public val Popover.asBin: Bin
  get() = reinterpret()

public fun Popover.getDefaultWidget(): Widget? = gtk_popover_get_default_widget(this)?.reinterpret()

public fun Popover.getModal(): Boolean = gtk_popover_get_modal(this).toBoolean

public fun Popover.getRelativeTo(): Widget? = gtk_popover_get_relative_to(this)?.reinterpret()

public fun Popover.popdown(): Unit {
  gtk_popover_popdown(this)
}

public fun Popover.popup(): Unit {
  gtk_popover_popup(this)
}

public fun Popover.setDefaultWidget(widget: Widget): Unit {
  gtk_popover_set_default_widget(this, widget.reinterpret())
}

public fun Popover.setModal(modal: Boolean): Unit {
  gtk_popover_set_modal(this, modal.toInt)
}

public fun Popover.setRelativeTo(relativeTo: Widget): Unit {
  gtk_popover_set_relative_to(this, relativeTo.reinterpret())
}
