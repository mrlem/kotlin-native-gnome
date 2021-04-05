// TODO - implement:
//   get_angle
//   get_attributes
//   get_current_uri
//   get_ellipsize
//   get_justify
//   get_label
//   get_layout
//   get_layout_offsets
//   get_line_wrap
//   get_line_wrap_mode
//   get_lines
//   get_max_width_chars
//   get_mnemonic_keyval
//   get_mnemonic_widget
//   get_selectable
//   get_selection_bounds
//   get_single_line_mode
//   get_text
//   get_track_visited_links
//   get_use_markup
//   get_use_underline
//   get_width_chars
//   get_xalign
//   get_yalign
//   select_region
//   set_angle
//   set_attributes
//   set_ellipsize
//   set_justify
//   set_label
//   set_line_wrap
//   set_line_wrap_mode
//   set_lines
//   set_markup
//   set_markup_with_mnemonic
//   set_max_width_chars
//   set_mnemonic_widget
//   set_pattern
//   set_selectable
//   set_single_line_mode
//   set_text
//   set_text_with_mnemonic
//   set_track_visited_links
//   set_use_markup
//   set_use_underline
//   set_width_chars
//   set_xalign
//   set_yalign
package org.gnome.gtk

import gtk3.GtkLabel
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias Label = CPointer<GtkLabel>

public val Label.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Label.asWidget: Widget
  get() = reinterpret()

public val Label.asMisc: Misc
  get() = reinterpret()
