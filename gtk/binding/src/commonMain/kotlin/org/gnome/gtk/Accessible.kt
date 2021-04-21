// TODO - method: connect_widget_destroyed
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType","FunctionName")

package org.gnome.gtk

import gtk3.GtkAccessible
import gtk3.gtk_accessible_get_widget
import gtk3.gtk_accessible_set_widget
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias Accessible = CPointer<GtkAccessible>

public val Accessible.asObject: Object
  get() = reinterpret()

public val Accessible.asAtkObject: org.gnome.atk.Object
  get() = reinterpret()

public var Accessible.widget: Widget?
  get() = gtk_accessible_get_widget(this)?.reinterpret()
  set(`value`) {
    gtk_accessible_set_widget(this, value)
  }
