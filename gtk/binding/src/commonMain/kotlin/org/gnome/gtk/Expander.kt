// TODO - method: get_spacing
// TODO - method: set_spacing
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import gtk3.GtkExpander
import gtk3.gtk_expander_get_expanded
import gtk3.gtk_expander_get_label
import gtk3.gtk_expander_get_label_fill
import gtk3.gtk_expander_get_label_widget
import gtk3.gtk_expander_get_resize_toplevel
import gtk3.gtk_expander_get_use_markup
import gtk3.gtk_expander_get_use_underline
import gtk3.gtk_expander_set_expanded
import gtk3.gtk_expander_set_label
import gtk3.gtk_expander_set_label_fill
import gtk3.gtk_expander_set_label_widget
import gtk3.gtk_expander_set_resize_toplevel
import gtk3.gtk_expander_set_use_markup
import gtk3.gtk_expander_set_use_underline
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.gobject.connect
import org.gnome.toBoolean
import org.gnome.toInt
import org.gnome.toKString

public typealias Expander = CPointer<GtkExpander>

public val Expander.asObject: Object
  get() = reinterpret()

public val Expander.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Expander.asWidget: Widget
  get() = reinterpret()

public val Expander.asContainer: Container
  get() = reinterpret()

public val Expander.asBin: Bin
  get() = reinterpret()

public var Expander.expanded: Boolean
  get() = gtk_expander_get_expanded(this).toBoolean
  set(`value`) {
    gtk_expander_set_expanded(this, value.toInt)
  }

public var Expander.label: String
  get() = gtk_expander_get_label(this).toKString
  set(`value`) {
    gtk_expander_set_label(this, value)
  }

public var Expander.labelFill: Boolean
  get() = gtk_expander_get_label_fill(this).toBoolean
  set(`value`) {
    gtk_expander_set_label_fill(this, value.toInt)
  }

public var Expander.labelWidget: Widget?
  get() = gtk_expander_get_label_widget(this)?.reinterpret()
  set(`value`) {
    gtk_expander_set_label_widget(this, value)
  }

public var Expander.resizeToplevel: Boolean
  get() = gtk_expander_get_resize_toplevel(this).toBoolean
  set(`value`) {
    gtk_expander_set_resize_toplevel(this, value.toInt)
  }

public var Expander.useMarkup: Boolean
  get() = gtk_expander_get_use_markup(this).toBoolean
  set(`value`) {
    gtk_expander_set_use_markup(this, value.toInt)
  }

public var Expander.useUnderline: Boolean
  get() = gtk_expander_get_use_underline(this).toBoolean
  set(`value`) {
    gtk_expander_set_use_underline(this, value.toInt)
  }

public fun Expander.onActivate(callback: (Expander) -> Unit): Expander {
  // TODO - handle callback data

  asObject.connect("activate") { callback(this) }
  return this
}
