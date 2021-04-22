// TODO - constructor: new_from_file
// TODO - constructor: new_from_gvariant
// TODO - constructor: new_from_key_file
// TODO - method: load_file
// TODO - method: load_key_file
// TODO - method: to_file
// TODO - method: to_gvariant
// TODO - method: to_key_file
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import gtk3.GtkPageSetup
import gtk3.gtk_page_setup_copy
import gtk3.gtk_page_setup_get_bottom_margin
import gtk3.gtk_page_setup_get_left_margin
import gtk3.gtk_page_setup_get_orientation
import gtk3.gtk_page_setup_get_page_height
import gtk3.gtk_page_setup_get_page_width
import gtk3.gtk_page_setup_get_paper_height
import gtk3.gtk_page_setup_get_paper_size
import gtk3.gtk_page_setup_get_paper_width
import gtk3.gtk_page_setup_get_right_margin
import gtk3.gtk_page_setup_get_top_margin
import gtk3.gtk_page_setup_new
import gtk3.gtk_page_setup_set_bottom_margin
import gtk3.gtk_page_setup_set_left_margin
import gtk3.gtk_page_setup_set_orientation
import gtk3.gtk_page_setup_set_paper_size
import gtk3.gtk_page_setup_set_paper_size_and_default_margins
import gtk3.gtk_page_setup_set_right_margin
import gtk3.gtk_page_setup_set_top_margin
import kotlin.Double
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object

public typealias PageSetup = CPointer<GtkPageSetup>

public val PageSetup.asObject: Object
  get() = reinterpret()

public object PageSetupFactory {
  public fun new(): PageSetup = gtk_page_setup_new()!!.reinterpret()
}

public var PageSetup.orientation: PageOrientation
  get() = gtk_page_setup_get_orientation(this)
  set(`value`) {
    gtk_page_setup_set_orientation(this, value)
  }

public var PageSetup.paperSize: PaperSize?
  get() = gtk_page_setup_get_paper_size(this)?.reinterpret()
  set(`value`) {
    gtk_page_setup_set_paper_size(this, value)
  }

public fun PageSetup.copy(): PageSetup? = gtk_page_setup_copy(this)?.reinterpret()

public fun PageSetup.getBottomMargin(unit: Unit): Double = gtk_page_setup_get_bottom_margin(this,
    unit)

public fun PageSetup.getLeftMargin(unit: Unit): Double = gtk_page_setup_get_left_margin(this, unit)

public fun PageSetup.getPageHeight(unit: Unit): Double = gtk_page_setup_get_page_height(this, unit)

public fun PageSetup.getPageWidth(unit: Unit): Double = gtk_page_setup_get_page_width(this, unit)

public fun PageSetup.getPaperHeight(unit: Unit): Double = gtk_page_setup_get_paper_height(this,
    unit)

public fun PageSetup.getPaperWidth(unit: Unit): Double = gtk_page_setup_get_paper_width(this, unit)

public fun PageSetup.getRightMargin(unit: Unit): Double = gtk_page_setup_get_right_margin(this,
    unit)

public fun PageSetup.getTopMargin(unit: Unit): Double = gtk_page_setup_get_top_margin(this, unit)

public fun PageSetup.setBottomMargin(margin: Double, unit: Unit): kotlin.Unit {
  gtk_page_setup_set_bottom_margin(this, margin, unit)
}

public fun PageSetup.setLeftMargin(margin: Double, unit: Unit): kotlin.Unit {
  gtk_page_setup_set_left_margin(this, margin, unit)
}

public fun PageSetup.setPaperSizeAndDefaultMargins(size: PaperSize?): kotlin.Unit {
  gtk_page_setup_set_paper_size_and_default_margins(this, size?.reinterpret())
}

public fun PageSetup.setRightMargin(margin: Double, unit: Unit): kotlin.Unit {
  gtk_page_setup_set_right_margin(this, margin, unit)
}

public fun PageSetup.setTopMargin(margin: Double, unit: Unit): kotlin.Unit {
  gtk_page_setup_set_top_margin(this, margin, unit)
}
