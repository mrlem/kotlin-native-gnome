// TODO - implement:
//   copy
//   get_bottom_margin
//   get_left_margin
//   get_orientation
//   get_page_height
//   get_page_width
//   get_paper_height
//   get_paper_size
//   get_paper_width
//   get_right_margin
//   get_top_margin
//   load_file
//   load_key_file
//   set_bottom_margin
//   set_left_margin
//   set_orientation
//   set_paper_size
//   set_paper_size_and_default_margins
//   set_right_margin
//   set_top_margin
//   to_file
//   to_gvariant
//   to_key_file
package org.gnome.gtk

import gtk3.GtkPageSetup
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object

public typealias PageSetup = CPointer<GtkPageSetup>

public val PageSetup.asObject: Object
  get() = reinterpret()
