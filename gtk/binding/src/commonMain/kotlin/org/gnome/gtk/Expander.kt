// TODO - implement:
//   set_label_widget
package org.gnome.gtk

import gtk3.GtkExpander
import gtk3.gtk_expander_get_expanded
import gtk3.gtk_expander_get_label
import gtk3.gtk_expander_get_label_fill
import gtk3.gtk_expander_get_label_widget
import gtk3.gtk_expander_get_resize_toplevel
import gtk3.gtk_expander_get_spacing
import gtk3.gtk_expander_get_use_markup
import gtk3.gtk_expander_get_use_underline
import gtk3.gtk_expander_set_expanded
import gtk3.gtk_expander_set_label
import gtk3.gtk_expander_set_label_fill
import gtk3.gtk_expander_set_resize_toplevel
import gtk3.gtk_expander_set_spacing
import gtk3.gtk_expander_set_use_markup
import gtk3.gtk_expander_set_use_underline
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned
import org.gnome.glib.gobject.Object
import org.gnome.glib.toBoolean
import org.gnome.glib.toInt
import org.gnome.glib.toKString

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

public fun Expander.getLabelWidget(): Unit {
  gtk_expander_get_label_widget(this)
}

public var Expander.expanded: Boolean
  get() = gtk_expander_get_expanded(this).toBoolean
  set(`value`) {
    gtk_expander_set_expanded(this, value.toInt)
  }

public var Expander.label: String?
  get() = gtk_expander_get_label(this).toKString
  set(`value`) {
    gtk_expander_set_label(this, value)
  }

public var Expander.labelFill: Boolean
  get() = gtk_expander_get_label_fill(this).toBoolean
  set(`value`) {
    gtk_expander_set_label_fill(this, value.toInt)
  }

public var Expander.resizeToplevel: Boolean
  get() = gtk_expander_get_resize_toplevel(this).toBoolean
  set(`value`) {
    gtk_expander_set_resize_toplevel(this, value.toInt)
  }

public var Expander.spacing: Int
  get() = gtk_expander_get_spacing(this)
  set(`value`) {
    gtk_expander_set_spacing(this, value)
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
