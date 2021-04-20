// TODO - get_ignore_hidden
// TODO - get_widgets
// TODO - set_ignore_hidden
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import gtk3.GtkSizeGroup
import gtk3.gtk_size_group_add_widget
import gtk3.gtk_size_group_get_mode
import gtk3.gtk_size_group_remove_widget
import gtk3.gtk_size_group_set_mode
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias SizeGroup = CPointer<GtkSizeGroup>

public val SizeGroup.asObject: Object
  get() = reinterpret()

public var SizeGroup.mode: SizeGroupMode
  get() = gtk_size_group_get_mode(this)
  set(`value`) {
    gtk_size_group_set_mode(this, value)
  }

public fun SizeGroup.addWidget(widget: Widget?): Unit {
  gtk_size_group_add_widget(this, widget?.reinterpret())
}

public fun SizeGroup.removeWidget(widget: Widget?): Unit {
  gtk_size_group_remove_widget(this, widget?.reinterpret())
}
