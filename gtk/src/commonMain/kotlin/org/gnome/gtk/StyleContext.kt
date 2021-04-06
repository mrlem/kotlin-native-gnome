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
//   get_direction
//   get_font
//   get_frame_clock
//   get_junction_sides
//   get_margin
//   get_padding
//   get_parent
//   get_path
//   get_property
//   get_screen
//   get_section
//   get_state
//   get_style
//   get_style_property
//   get_style_valist
//   get_valist
//   has_class
//   has_region
//   invalidate
//   list_classes
//   list_regions
//   lookup_color
//   lookup_icon_set
//   notify_state_change
//   pop_animatable_region
//   push_animatable_region
//   remove_class
//   remove_provider
//   remove_region
//   restore
//   save
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
import gtk3.gtk_style_context_get_scale
import gtk3.gtk_style_context_set_scale
import kotlin.Int
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object

public typealias StyleContext = CPointer<GtkStyleContext>

public val StyleContext.asObject: Object
  get() = reinterpret()

public var StyleContext.scale: Int
  get() = gtk_style_context_get_scale(this)
  set(`value`) {
    gtk_style_context_set_scale(this, value)
  }
