// TODO - implement:
//   add_class
//   add_provider
//   add_region
//   cancel_animations
//   get
//   get_background_color
//   get_border
//   get_border_color
//   get_color
//   get_font
//   get_margin
//   get_padding
//   get_property
//   get_section
//   get_style
//   get_style_property
//   get_style_valist
//   get_valist
//   has_class
//   has_region
//   lookup_color
//   lookup_icon_set
//   notify_state_change
//   push_animatable_region
//   remove_class
//   remove_provider
//   remove_region
//   scroll_animations
//   set_background
//   set_direction
//   set_frame_clock
//   set_junction_sides
//   set_parent
//   set_path
//   set_screen
//   set_state
//   state_is_running
//   to_string
package org.gnome.gtk

import gtk3.GtkStyleContext
import gtk3.gtk_style_context_get_frame_clock
import gtk3.gtk_style_context_get_junction_sides
import gtk3.gtk_style_context_get_parent
import gtk3.gtk_style_context_get_path
import gtk3.gtk_style_context_get_scale
import gtk3.gtk_style_context_get_screen
import gtk3.gtk_style_context_get_state
import gtk3.gtk_style_context_list_classes
import gtk3.gtk_style_context_restore
import gtk3.gtk_style_context_save
import gtk3.gtk_style_context_set_scale
import kotlin.Int
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object

public typealias StyleContext = CPointer<GtkStyleContext>

public val StyleContext.asObject: Object
  get() = reinterpret()

public fun StyleContext.getFrameClock(): Unit {
  gtk_style_context_get_frame_clock(this)
}

public fun StyleContext.getJunctionSides(): Unit {
  gtk_style_context_get_junction_sides(this)
}

public fun StyleContext.getParent(): Unit {
  gtk_style_context_get_parent(this)
}

public fun StyleContext.getPath(): Unit {
  gtk_style_context_get_path(this)
}

public fun StyleContext.getScreen(): Unit {
  gtk_style_context_get_screen(this)
}

public fun StyleContext.getState(): Unit {
  gtk_style_context_get_state(this)
}

public fun StyleContext.listClasses(): Unit {
  gtk_style_context_list_classes(this)
}

public fun StyleContext.restore(): Unit {
  gtk_style_context_restore(this)
}

public fun StyleContext.save(): Unit {
  gtk_style_context_save(this)
}

public var StyleContext.scale: Int
  get() = gtk_style_context_get_scale(this)
  set(`value`) {
    gtk_style_context_set_scale(this, value)
  }
