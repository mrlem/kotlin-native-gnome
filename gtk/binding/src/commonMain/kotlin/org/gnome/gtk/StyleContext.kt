// TODO - method: add_region
// TODO - method: cancel_animations
// TODO - method: get
// TODO - method: get_background_color
// TODO - method: get_border
// TODO - method: get_border_color
// TODO - method: get_color
// TODO - method: get_direction
// TODO - method: get_font
// TODO - method: get_frame_clock
// TODO - method: get_margin
// TODO - method: get_padding
// TODO - method: get_property
// TODO - method: get_screen
// TODO - method: get_style
// TODO - method: get_style_property
// TODO - method: get_style_valist
// TODO - method: get_valist
// TODO - method: has_region
// TODO - method: invalidate
// TODO - method: list_classes
// TODO - method: list_regions
// TODO - method: lookup_color
// TODO - method: lookup_icon_set
// TODO - method: notify_state_change
// TODO - method: pop_animatable_region
// TODO - method: push_animatable_region
// TODO - method: remove_region
// TODO - method: scroll_animations
// TODO - method: set_background
// TODO - method: set_direction
// TODO - method: set_frame_clock
// TODO - method: set_screen
// TODO - method: state_is_running
// TODO - signal: changed
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

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

public var StyleContext.junctionSides: JunctionSides
  get() = gtk_style_context_get_junction_sides(this)
  set(`value`) {
    gtk_style_context_set_junction_sides(this, value)
  }

public var StyleContext.parent: StyleContext?
  get() = gtk_style_context_get_parent(this)?.reinterpret()
  set(`value`) {
    gtk_style_context_set_parent(this, value)
  }

public var StyleContext.path: WidgetPath?
  get() = gtk_style_context_get_path(this)?.reinterpret()
  set(`value`) {
    gtk_style_context_set_path(this, value)
  }

public var StyleContext.scale: Int
  get() = gtk_style_context_get_scale(this)
  set(`value`) {
    gtk_style_context_set_scale(this, value)
  }

public var StyleContext.state: StateFlags
  get() = gtk_style_context_get_state(this)
  set(`value`) {
    gtk_style_context_set_state(this, value)
  }

public fun StyleContext.addClass(className: String): Unit {
  gtk_style_context_add_class(this, className)
}

public fun StyleContext.addProvider(provider: StyleProvider?, priority: UInt): Unit {
  gtk_style_context_add_provider(this, provider?.reinterpret(), priority)
}

public fun StyleContext.getSection(`property`: String): CssSection? =
    gtk_style_context_get_section(this, property)?.reinterpret()

public fun StyleContext.hasClass(className: String): Boolean = gtk_style_context_has_class(this,
    className).toBoolean

public fun StyleContext.removeClass(className: String): Unit {
  gtk_style_context_remove_class(this, className)
}

public fun StyleContext.removeProvider(provider: StyleProvider?): Unit {
  gtk_style_context_remove_provider(this, provider?.reinterpret())
}

public fun StyleContext.restore(): Unit {
  gtk_style_context_restore(this)
}

public fun StyleContext.save(): Unit {
  gtk_style_context_save(this)
}

public fun StyleContext.toString(flags: StyleContextPrintFlags): String =
    gtk_style_context_to_string(this, flags).toKString
