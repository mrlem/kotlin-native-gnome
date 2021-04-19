// TODO - get
// TODO - get_border
// TODO - get_color
// TODO - get_frame_clock
// TODO - get_margin
// TODO - get_padding
// TODO - get_property
// TODO - get_screen
// TODO - get_style
// TODO - get_style_property
// TODO - get_style_valist
// TODO - get_valist
// TODO - list_classes
// TODO - lookup_color
// TODO - set_frame_clock
// TODO - set_screen
//
package org.gnome.gtk

import gtk3.GtkStyleContext
import gtk3.gtk_style_context_add_class
import gtk3.gtk_style_context_add_provider
import gtk3.gtk_style_context_get_junction_sides
import gtk3.gtk_style_context_get_parent
import gtk3.gtk_style_context_get_path
import gtk3.gtk_style_context_get_scale
import gtk3.gtk_style_context_get_section
import gtk3.gtk_style_context_get_state
import gtk3.gtk_style_context_has_class
import gtk3.gtk_style_context_remove_class
import gtk3.gtk_style_context_remove_provider
import gtk3.gtk_style_context_restore
import gtk3.gtk_style_context_save
import gtk3.gtk_style_context_set_junction_sides
import gtk3.gtk_style_context_set_parent
import gtk3.gtk_style_context_set_path
import gtk3.gtk_style_context_set_scale
import gtk3.gtk_style_context_set_state
import gtk3.gtk_style_context_to_string
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.UInt
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toKString

public typealias StyleContext = CPointer<GtkStyleContext>

public val StyleContext.asObject: Object
  get() = reinterpret()

public fun StyleContext.addClass(className: String?): Unit {
  gtk_style_context_add_class(this, className)
}

public fun StyleContext.addProvider(provider: StyleProvider, priority: UInt): Unit {
  gtk_style_context_add_provider(this, provider.reinterpret(), priority)
}

public fun StyleContext.getJunctionSides(): JunctionSides =
    gtk_style_context_get_junction_sides(this)

public fun StyleContext.getParent(): StyleContext? =
    gtk_style_context_get_parent(this)?.reinterpret()

public fun StyleContext.getPath(): WidgetPath? = gtk_style_context_get_path(this)?.reinterpret()

public fun StyleContext.getScale(): Int = gtk_style_context_get_scale(this)

public fun StyleContext.getSection(`property`: String?): CssSection? =
    gtk_style_context_get_section(this, property)?.reinterpret()

public fun StyleContext.getState(): StateFlags = gtk_style_context_get_state(this)

public fun StyleContext.hasClass(className: String?): Boolean = gtk_style_context_has_class(this,
    className).toBoolean

public fun StyleContext.removeClass(className: String?): Unit {
  gtk_style_context_remove_class(this, className)
}

public fun StyleContext.removeProvider(provider: StyleProvider): Unit {
  gtk_style_context_remove_provider(this, provider.reinterpret())
}

public fun StyleContext.restore(): Unit {
  gtk_style_context_restore(this)
}

public fun StyleContext.save(): Unit {
  gtk_style_context_save(this)
}

public fun StyleContext.setJunctionSides(sides: JunctionSides): Unit {
  gtk_style_context_set_junction_sides(this, sides)
}

public fun StyleContext.setParent(parent: StyleContext): Unit {
  gtk_style_context_set_parent(this, parent.reinterpret())
}

public fun StyleContext.setPath(path: WidgetPath): Unit {
  gtk_style_context_set_path(this, path.reinterpret())
}

public fun StyleContext.setScale(scale: Int): Unit {
  gtk_style_context_set_scale(this, scale)
}

public fun StyleContext.setState(flags: StateFlags): Unit {
  gtk_style_context_set_state(this, flags)
}

public fun StyleContext.toString(flags: StyleContextPrintFlags): String =
    gtk_style_context_to_string(this, flags).toKString
