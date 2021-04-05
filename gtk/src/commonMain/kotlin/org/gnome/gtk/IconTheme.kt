// TODO - implement:
//   add_resource_path
//   append_search_path
//   choose_icon
//   choose_icon_for_scale
//   get_example_icon_name
//   get_icon_sizes
//   get_search_path
//   has_icon
//   list_contexts
//   list_icons
//   load_icon
//   load_icon_for_scale
//   load_surface
//   lookup_by_gicon
//   lookup_by_gicon_for_scale
//   lookup_icon
//   lookup_icon_for_scale
//   prepend_search_path
//   rescan_if_needed
//   set_custom_theme
//   set_screen
//   set_search_path
package org.gnome.gtk

import gtk3.GtkIconTheme
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object

public typealias IconTheme = CPointer<GtkIconTheme>

public val IconTheme.asObject: Object
  get() = reinterpret()
