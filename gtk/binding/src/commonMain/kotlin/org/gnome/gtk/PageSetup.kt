// TODO - implement:
//   get_bottom_margin
//   get_left_margin
//   get_page_height
//   get_page_width
//   get_paper_height
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
//   to_key_file
package org.gnome.gtk

import gtk3.GtkPageSetup
import gtk3.gtk_page_setup_copy
import gtk3.gtk_page_setup_get_orientation
import gtk3.gtk_page_setup_get_paper_size
import gtk3.gtk_page_setup_to_gvariant
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object

public typealias PageSetup = CPointer<GtkPageSetup>

public val PageSetup.asObject: Object
  get() = reinterpret()

public fun PageSetup.copy(): Unit {
  gtk_page_setup_copy(this)
}

public fun PageSetup.getOrientation(): Unit {
  gtk_page_setup_get_orientation(this)
}

public fun PageSetup.getPaperSize(): Unit {
  gtk_page_setup_get_paper_size(this)
}

public fun PageSetup.toGvariant(): Unit {
  gtk_page_setup_to_gvariant(this)
}
