// TODO - method: get_spacing
// TODO - method: set_spacing
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkExpander
import interop.gtk_expander_get_expanded
import interop.gtk_expander_get_label
import interop.gtk_expander_get_label_fill
import interop.gtk_expander_get_label_widget
import interop.gtk_expander_get_resize_toplevel
import interop.gtk_expander_get_use_markup
import interop.gtk_expander_get_use_underline
import interop.gtk_expander_new
import interop.gtk_expander_new_with_mnemonic
import interop.gtk_expander_set_expanded
import interop.gtk_expander_set_label
import interop.gtk_expander_set_label_fill
import interop.gtk_expander_set_label_widget
import interop.gtk_expander_set_resize_toplevel
import interop.gtk_expander_set_use_markup
import interop.gtk_expander_set_use_underline
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt
import org.gnome.toKString
import org.mrlem.gnome.gobject.connect

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

public object ExpanderFactory {
  public fun new(label: String): Expander = gtk_expander_new(label)!!.reinterpret()

  public fun newWithMnemonic(label: String): Expander =
      gtk_expander_new_with_mnemonic(label)!!.reinterpret()
}

public val Expander.bin: Bin
  get() = pointed.bin.ptr

public var Expander.expanded: Boolean
  get() = gtk_expander_get_expanded(this).toBoolean
  set(`value`) {
    gtk_expander_set_expanded(this, `value`.toInt)
  }

public var Expander.label: String
  get() = gtk_expander_get_label(this).toKString
  set(`value`) {
    gtk_expander_set_label(this, `value`)
  }

public var Expander.labelFill: Boolean
  get() = gtk_expander_get_label_fill(this).toBoolean
  set(`value`) {
    gtk_expander_set_label_fill(this, `value`.toInt)
  }

public var Expander.labelWidget: Widget?
  get() = gtk_expander_get_label_widget(this)?.reinterpret()
  set(`value`) {
    gtk_expander_set_label_widget(this, `value`)
  }

public var Expander.resizeToplevel: Boolean
  get() = gtk_expander_get_resize_toplevel(this).toBoolean
  set(`value`) {
    gtk_expander_set_resize_toplevel(this, `value`.toInt)
  }

public var Expander.useMarkup: Boolean
  get() = gtk_expander_get_use_markup(this).toBoolean
  set(`value`) {
    gtk_expander_set_use_markup(this, `value`.toInt)
  }

public var Expander.useUnderline: Boolean
  get() = gtk_expander_get_use_underline(this).toBoolean
  set(`value`) {
    gtk_expander_set_use_underline(this, `value`.toInt)
  }

public fun Expander.onActivate(callback: (Expander) -> Unit): Expander {
  // TODO - handle callback data

  asObject.connect("activate") { callback(this) }
  return this
}
