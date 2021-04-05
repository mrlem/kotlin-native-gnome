// TODO - implement:
//   add_with_viewport
//   get_capture_button_press
//   get_hadjustment
//   get_hscrollbar
//   get_kinetic_scrolling
//   get_max_content_height
//   get_max_content_width
//   get_min_content_height
//   get_min_content_width
//   get_overlay_scrolling
//   get_placement
//   get_policy
//   get_propagate_natural_height
//   get_propagate_natural_width
//   get_shadow_type
//   get_vadjustment
//   get_vscrollbar
//   set_capture_button_press
//   set_hadjustment
//   set_kinetic_scrolling
//   set_max_content_height
//   set_max_content_width
//   set_min_content_height
//   set_min_content_width
//   set_overlay_scrolling
//   set_placement
//   set_policy
//   set_propagate_natural_height
//   set_propagate_natural_width
//   set_shadow_type
//   set_vadjustment
//   unset_placement
package org.gnome.gtk

import gtk3.GtkScrolledWindow
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias ScrolledWindow = CPointer<GtkScrolledWindow>

public val ScrolledWindow.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val ScrolledWindow.asWidget: Widget
  get() = reinterpret()

public val ScrolledWindow.asContainer: Container
  get() = reinterpret()

public val ScrolledWindow.asBin: Bin
  get() = reinterpret()
