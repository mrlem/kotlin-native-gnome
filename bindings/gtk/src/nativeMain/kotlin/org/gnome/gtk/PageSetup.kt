// TODO - constructor: new_from_file
// TODO - constructor: new_from_gvariant
// TODO - constructor: new_from_key_file
// TODO - method: load_key_file (param type)
// TODO - method: to_gvariant (return type)
// TODO - method: to_key_file (param type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GError
import interop.GtkPageSetup
import interop.gtk_page_setup_copy
import interop.gtk_page_setup_get_bottom_margin
import interop.gtk_page_setup_get_left_margin
import interop.gtk_page_setup_get_orientation
import interop.gtk_page_setup_get_page_height
import interop.gtk_page_setup_get_page_width
import interop.gtk_page_setup_get_paper_height
import interop.gtk_page_setup_get_paper_size
import interop.gtk_page_setup_get_paper_width
import interop.gtk_page_setup_get_right_margin
import interop.gtk_page_setup_get_top_margin
import interop.gtk_page_setup_load_file
import interop.gtk_page_setup_new
import interop.gtk_page_setup_set_bottom_margin
import interop.gtk_page_setup_set_left_margin
import interop.gtk_page_setup_set_orientation
import interop.gtk_page_setup_set_paper_size
import interop.gtk_page_setup_set_paper_size_and_default_margins
import interop.gtk_page_setup_set_right_margin
import interop.gtk_page_setup_set_top_margin
import interop.gtk_page_setup_to_file
import kotlin.Boolean
import kotlin.Double
import kotlin.String
import kotlin.Throws
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.glib.Error
import org.gnome.gobject.Object
import org.gnome.toBoolean

public typealias PageSetup = CPointer<GtkPageSetup>

public val PageSetup.asObject: Object
  get() = reinterpret()

public object PageSetupFactory {
  public fun new(): PageSetup = gtk_page_setup_new()!!.reinterpret()
}

public var PageSetup.orientation: PageOrientation
  get() = gtk_page_setup_get_orientation(this)
  set(`value`) {
    gtk_page_setup_set_orientation(this@orientation, `value`)
  }

public var PageSetup.paperSize: PaperSize?
  get() = gtk_page_setup_get_paper_size(this)?.reinterpret()
  set(`value`) {
    gtk_page_setup_set_paper_size(this@paperSize, `value`)
  }

public fun PageSetup.copy(): PageSetup? = gtk_page_setup_copy(this@copy)?.reinterpret()

public fun PageSetup.getBottomMargin(unit: Unit): Double =
    gtk_page_setup_get_bottom_margin(this@getBottomMargin, unit)

public fun PageSetup.getLeftMargin(unit: Unit): Double =
    gtk_page_setup_get_left_margin(this@getLeftMargin, unit)

public fun PageSetup.getPageHeight(unit: Unit): Double =
    gtk_page_setup_get_page_height(this@getPageHeight, unit)

public fun PageSetup.getPageWidth(unit: Unit): Double =
    gtk_page_setup_get_page_width(this@getPageWidth, unit)

public fun PageSetup.getPaperHeight(unit: Unit): Double =
    gtk_page_setup_get_paper_height(this@getPaperHeight, unit)

public fun PageSetup.getPaperWidth(unit: Unit): Double =
    gtk_page_setup_get_paper_width(this@getPaperWidth, unit)

public fun PageSetup.getRightMargin(unit: Unit): Double =
    gtk_page_setup_get_right_margin(this@getRightMargin, unit)

public fun PageSetup.getTopMargin(unit: Unit): Double =
    gtk_page_setup_get_top_margin(this@getTopMargin, unit)

@Throws(Error::class)
public fun PageSetup.loadFile(fileName: String?): Boolean = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Boolean = gtk_page_setup_load_file(this@loadFile, fileName, errors).toBoolean()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

public fun PageSetup.setBottomMargin(margin: Double, unit: Unit): kotlin.Unit {
  gtk_page_setup_set_bottom_margin(this@setBottomMargin, margin, unit)
}

public fun PageSetup.setLeftMargin(margin: Double, unit: Unit): kotlin.Unit {
  gtk_page_setup_set_left_margin(this@setLeftMargin, margin, unit)
}

public fun PageSetup.setPaperSizeAndDefaultMargins(size: PaperSize?): kotlin.Unit {
  gtk_page_setup_set_paper_size_and_default_margins(this@setPaperSizeAndDefaultMargins,
      size?.reinterpret())
}

public fun PageSetup.setRightMargin(margin: Double, unit: Unit): kotlin.Unit {
  gtk_page_setup_set_right_margin(this@setRightMargin, margin, unit)
}

public fun PageSetup.setTopMargin(margin: Double, unit: Unit): kotlin.Unit {
  gtk_page_setup_set_top_margin(this@setTopMargin, margin, unit)
}

@Throws(Error::class)
public fun PageSetup.toFile(fileName: String?): Boolean = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Boolean = gtk_page_setup_to_file(this@toFile, fileName, errors).toBoolean()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}
