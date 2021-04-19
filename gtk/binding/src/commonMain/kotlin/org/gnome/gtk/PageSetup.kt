// TODO - get_bottom_margin
// TODO - get_left_margin
// TODO - get_orientation
// TODO - get_page_height
// TODO - get_page_width
// TODO - get_paper_height
// TODO - get_paper_width
// TODO - get_right_margin
// TODO - get_top_margin
// TODO - load_file
// TODO - load_key_file
// TODO - set_bottom_margin
// TODO - set_left_margin
// TODO - set_orientation
// TODO - set_right_margin
// TODO - set_top_margin
// TODO - to_file
// TODO - to_gvariant
// TODO - to_key_file
//
package org.gnome.gtk

import gtk3.GtkPageSetup
import gtk3.gtk_page_setup_copy
import gtk3.gtk_page_setup_get_paper_size
import gtk3.gtk_page_setup_set_paper_size
import gtk3.gtk_page_setup_set_paper_size_and_default_margins
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias PageSetup = CPointer<GtkPageSetup>

public val PageSetup.asObject: Object
  get() = reinterpret()

public fun PageSetup.copy(): PageSetup? = gtk_page_setup_copy(this)?.reinterpret()

public fun PageSetup.getPaperSize(): PaperSize? = gtk_page_setup_get_paper_size(this)?.reinterpret()

public fun PageSetup.setPaperSize(size: PaperSize): Unit {
  gtk_page_setup_set_paper_size(this, size.reinterpret())
}

public fun PageSetup.setPaperSizeAndDefaultMargins(size: PaperSize): Unit {
  gtk_page_setup_set_paper_size_and_default_margins(this, size.reinterpret())
}
