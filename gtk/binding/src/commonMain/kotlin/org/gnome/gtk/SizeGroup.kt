// TODO - get_mode
// TODO - get_widgets
// TODO - set_mode
//
package org.gnome.gtk

import gtk3.GtkSizeGroup
import gtk3.gtk_size_group_add_widget
import gtk3.gtk_size_group_remove_widget
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias SizeGroup = CPointer<GtkSizeGroup>

public val SizeGroup.asObject: Object
  get() = reinterpret()

public fun SizeGroup.addWidget(widget: Widget): Unit {
  gtk_size_group_add_widget(this, widget.reinterpret())
}

public fun SizeGroup.removeWidget(widget: Widget): Unit {
  gtk_size_group_remove_widget(this, widget.reinterpret())
}
