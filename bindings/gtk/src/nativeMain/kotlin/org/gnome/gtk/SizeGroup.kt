@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkSizeGroup
import interop.gtk_size_group_add_widget
import interop.gtk_size_group_get_mode
import interop.gtk_size_group_get_widgets
import interop.gtk_size_group_new
import interop.gtk_size_group_remove_widget
import interop.gtk_size_group_set_mode
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.glib.SList
import org.gnome.gobject.Object

public typealias SizeGroup = CPointer<GtkSizeGroup>

public val SizeGroup.asObject: Object
  get() = reinterpret()

public object SizeGroupFactory {
  public fun new(mode: SizeGroupMode): SizeGroup = gtk_size_group_new(mode)!!.reinterpret()
}

public val SizeGroup.parentInstance: Object
  get() = pointed.parent_instance.ptr

public var SizeGroup.mode: SizeGroupMode
  get() = gtk_size_group_get_mode(this)
  set(`value`) {
    gtk_size_group_set_mode(this@mode, `value`)
  }

public val SizeGroup.widgets: SList?
  get() = gtk_size_group_get_widgets(this)?.reinterpret()

public fun SizeGroup.addWidget(widget: Widget?): Unit {
  gtk_size_group_add_widget(this@addWidget, widget?.reinterpret())
}

public fun SizeGroup.removeWidget(widget: Widget?): Unit {
  gtk_size_group_remove_widget(this@removeWidget, widget?.reinterpret())
}
