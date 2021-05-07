// TODO - method: get (param type)
// TODO - method: get_border (param type)
// TODO - method: get_color (param type)
// TODO - method: get_margin (param type)
// TODO - method: get_padding (param type)
// TODO - method: get_property (param type)
// TODO - method: get_style (param type)
// TODO - method: get_style_valist (param type)
// TODO - method: get_valist (param type)
// TODO - method: lookup_color (param type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkStyleContext
import interop.gtk_style_context_add_class
import interop.gtk_style_context_add_provider
import interop.gtk_style_context_get_frame_clock
import interop.gtk_style_context_get_junction_sides
import interop.gtk_style_context_get_parent
import interop.gtk_style_context_get_path
import interop.gtk_style_context_get_scale
import interop.gtk_style_context_get_screen
import interop.gtk_style_context_get_section
import interop.gtk_style_context_get_state
import interop.gtk_style_context_get_style_property
import interop.gtk_style_context_has_class
import interop.gtk_style_context_list_classes
import interop.gtk_style_context_new
import interop.gtk_style_context_remove_class
import interop.gtk_style_context_remove_provider
import interop.gtk_style_context_restore
import interop.gtk_style_context_save
import interop.gtk_style_context_set_frame_clock
import interop.gtk_style_context_set_junction_sides
import interop.gtk_style_context_set_parent
import interop.gtk_style_context_set_path
import interop.gtk_style_context_set_scale
import interop.gtk_style_context_set_screen
import interop.gtk_style_context_set_state
import interop.gtk_style_context_to_string
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.UInt
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gdk.FrameClock
import org.gnome.gdk.Screen
import org.gnome.glib.List
import org.gnome.gobject.Object
import org.gnome.gobject.Value
import org.gnome.toBoolean
import org.gnome.toKString
import org.mrlem.gnome.gobject.connect

public typealias StyleContext = CPointer<GtkStyleContext>

public val StyleContext.asObject: Object
  get() = reinterpret()

public object StyleContextFactory {
  public fun new(): StyleContext = gtk_style_context_new()!!.reinterpret()
}

public val StyleContext.parentObject: Object
  get() = pointed.parent_object.ptr

public var StyleContext.frameClock: FrameClock?
  get() = gtk_style_context_get_frame_clock(this)?.reinterpret()
  set(`value`) {
    gtk_style_context_set_frame_clock(this@frameClock, `value`)
  }

public var StyleContext.junctionSides: JunctionSides
  get() = gtk_style_context_get_junction_sides(this)
  set(`value`) {
    gtk_style_context_set_junction_sides(this@junctionSides, `value`)
  }

public var StyleContext.parent: StyleContext?
  get() = gtk_style_context_get_parent(this)?.reinterpret()
  set(`value`) {
    gtk_style_context_set_parent(this@parent, `value`)
  }

public var StyleContext.path: WidgetPath?
  get() = gtk_style_context_get_path(this)?.reinterpret()
  set(`value`) {
    gtk_style_context_set_path(this@path, `value`)
  }

public var StyleContext.scale: Int
  get() = gtk_style_context_get_scale(this)
  set(`value`) {
    gtk_style_context_set_scale(this@scale, `value`)
  }

public var StyleContext.screen: Screen?
  get() = gtk_style_context_get_screen(this)?.reinterpret()
  set(`value`) {
    gtk_style_context_set_screen(this@screen, `value`)
  }

public var StyleContext.state: StateFlags
  get() = gtk_style_context_get_state(this)
  set(`value`) {
    gtk_style_context_set_state(this@state, `value`)
  }

public fun StyleContext.addClass(className: String?): Unit {
  gtk_style_context_add_class(this@addClass, className)
}

public fun StyleContext.addProvider(provider: StyleProvider?, priority: UInt): Unit {
  gtk_style_context_add_provider(this@addProvider, provider?.reinterpret(), priority)
}

public fun StyleContext.getSection(`property`: String?): CssSection? =
    gtk_style_context_get_section(this@getSection, `property`)?.reinterpret()

public fun StyleContext.getStyleProperty(propertyName: String?, `value`: Value?): Unit {
  gtk_style_context_get_style_property(this@getStyleProperty, propertyName, `value`?.reinterpret())
}

public fun StyleContext.hasClass(className: String?): Boolean =
    gtk_style_context_has_class(this@hasClass, className).toBoolean()

public fun StyleContext.listClasses(): List? =
    gtk_style_context_list_classes(this@listClasses)?.reinterpret()

public fun StyleContext.removeClass(className: String?): Unit {
  gtk_style_context_remove_class(this@removeClass, className)
}

public fun StyleContext.removeProvider(provider: StyleProvider?): Unit {
  gtk_style_context_remove_provider(this@removeProvider, provider?.reinterpret())
}

public fun StyleContext.restore(): Unit {
  gtk_style_context_restore(this@restore)
}

public fun StyleContext.save(): Unit {
  gtk_style_context_save(this@save)
}

public fun StyleContext.toString(flags: StyleContextPrintFlags): String? =
    gtk_style_context_to_string(this@toString, flags).toKString()

public fun StyleContext.onChanged(callback: (StyleContext) -> Unit): StyleContext {
  // TODO - handle callback data

  asObject.connect("changed") { callback(this) }
  return this
}
