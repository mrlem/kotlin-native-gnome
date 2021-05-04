// TODO - field: parent
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkAccessible
import interop.gtk_accessible_get_widget
import interop.gtk_accessible_set_widget
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
    gtk_accessible_set_widget(this@widget, `value`)
  }
