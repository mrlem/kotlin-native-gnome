// TODO - implement:
//   add_resource_path
//   append_search_path
//   choose_icon
//   choose_icon_for_scale
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
//   set_screen
//   set_search_path
//   set_custom_theme
package org.gnome.gtk

import gtk3.GtkIconTheme
import gtk3.gtk_icon_theme_get_example_icon_name
import kotlin.String
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object
import org.gnome.glib.toKString

public typealias IconTheme = CPointer<GtkIconTheme>

public val IconTheme.asObject: Object
  get() = reinterpret()

public val IconTheme.exampleIconName: String?
  get() = gtk_icon_theme_get_example_icon_name(this).toKString
