// TODO - foreach
// TODO - get_duplex
// TODO - get_length
// TODO - get_number_up_layout
// TODO - get_orientation
// TODO - get_page_ranges
// TODO - get_page_set
// TODO - get_paper_height
// TODO - get_paper_width
// TODO - get_print_pages
// TODO - get_quality
// TODO - load_file
// TODO - load_key_file
// TODO - set_duplex
// TODO - set_length
// TODO - set_number_up_layout
// TODO - set_orientation
// TODO - set_page_ranges
// TODO - set_page_set
// TODO - set_paper_height
// TODO - set_paper_width
// TODO - set_print_pages
// TODO - set_quality
// TODO - to_file
// TODO - to_gvariant
// TODO - to_key_file
//
package org.gnome.gtk

import gtk3.GtkPrintSettings
import gtk3.gtk_print_settings_copy
import gtk3.gtk_print_settings_get
import gtk3.gtk_print_settings_get_bool
import gtk3.gtk_print_settings_get_collate
import gtk3.gtk_print_settings_get_default_source
import gtk3.gtk_print_settings_get_dither
import gtk3.gtk_print_settings_get_double
import gtk3.gtk_print_settings_get_double_with_default
import gtk3.gtk_print_settings_get_finishings
import gtk3.gtk_print_settings_get_int
import gtk3.gtk_print_settings_get_int_with_default
import gtk3.gtk_print_settings_get_media_type
import gtk3.gtk_print_settings_get_n_copies
import gtk3.gtk_print_settings_get_number_up
import gtk3.gtk_print_settings_get_output_bin
import gtk3.gtk_print_settings_get_paper_size
import gtk3.gtk_print_settings_get_printer
import gtk3.gtk_print_settings_get_printer_lpi
import gtk3.gtk_print_settings_get_resolution
import gtk3.gtk_print_settings_get_resolution_x
import gtk3.gtk_print_settings_get_resolution_y
import gtk3.gtk_print_settings_get_reverse
import gtk3.gtk_print_settings_get_scale
import gtk3.gtk_print_settings_get_use_color
import gtk3.gtk_print_settings_has_key
import gtk3.gtk_print_settings_set
import gtk3.gtk_print_settings_set_bool
import gtk3.gtk_print_settings_set_collate
import gtk3.gtk_print_settings_set_default_source
import gtk3.gtk_print_settings_set_dither
import gtk3.gtk_print_settings_set_double
import gtk3.gtk_print_settings_set_finishings
import gtk3.gtk_print_settings_set_int
import gtk3.gtk_print_settings_set_media_type
import gtk3.gtk_print_settings_set_n_copies
import gtk3.gtk_print_settings_set_number_up
import gtk3.gtk_print_settings_set_output_bin
import gtk3.gtk_print_settings_set_paper_size
import gtk3.gtk_print_settings_set_printer
import gtk3.gtk_print_settings_set_printer_lpi
import gtk3.gtk_print_settings_set_resolution
import gtk3.gtk_print_settings_set_resolution_xy
import gtk3.gtk_print_settings_set_reverse
import gtk3.gtk_print_settings_set_scale
import gtk3.gtk_print_settings_set_use_color
import gtk3.gtk_print_settings_unset
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt
import org.gnome.toKString

public typealias PrintSettings = CPointer<GtkPrintSettings>

public val PrintSettings.asObject: Object
  get() = reinterpret()

public fun PrintSettings.copy(): PrintSettings? = gtk_print_settings_copy(this)?.reinterpret()

public fun PrintSettings.`get`(key: String?): String = gtk_print_settings_get(this, key).toKString

public fun PrintSettings.getBool(key: String?): Boolean = gtk_print_settings_get_bool(this,
    key).toBoolean

public fun PrintSettings.getCollate(): Boolean = gtk_print_settings_get_collate(this).toBoolean

public fun PrintSettings.getDefaultSource(): String =
    gtk_print_settings_get_default_source(this).toKString

public fun PrintSettings.getDither(): String = gtk_print_settings_get_dither(this).toKString

public fun PrintSettings.getDouble(key: String?): Double = gtk_print_settings_get_double(this, key)

public fun PrintSettings.getDoubleWithDefault(key: String?, def: Double): Double =
    gtk_print_settings_get_double_with_default(this, key, def)

public fun PrintSettings.getFinishings(): String = gtk_print_settings_get_finishings(this).toKString

public fun PrintSettings.getInt(key: String?): Int = gtk_print_settings_get_int(this, key)

public fun PrintSettings.getIntWithDefault(key: String?, def: Int): Int =
    gtk_print_settings_get_int_with_default(this, key, def)

public fun PrintSettings.getMediaType(): String = gtk_print_settings_get_media_type(this).toKString

public fun PrintSettings.getNCopies(): Int = gtk_print_settings_get_n_copies(this)

public fun PrintSettings.getNumberUp(): Int = gtk_print_settings_get_number_up(this)

public fun PrintSettings.getOutputBin(): String = gtk_print_settings_get_output_bin(this).toKString

public fun PrintSettings.getPaperSize(): PaperSize? =
    gtk_print_settings_get_paper_size(this)?.reinterpret()

public fun PrintSettings.getPrinter(): String = gtk_print_settings_get_printer(this).toKString

public fun PrintSettings.getPrinterLpi(): Double = gtk_print_settings_get_printer_lpi(this)

public fun PrintSettings.getResolution(): Int = gtk_print_settings_get_resolution(this)

public fun PrintSettings.getResolutionX(): Int = gtk_print_settings_get_resolution_x(this)

public fun PrintSettings.getResolutionY(): Int = gtk_print_settings_get_resolution_y(this)

public fun PrintSettings.getReverse(): Boolean = gtk_print_settings_get_reverse(this).toBoolean

public fun PrintSettings.getScale(): Double = gtk_print_settings_get_scale(this)

public fun PrintSettings.getUseColor(): Boolean = gtk_print_settings_get_use_color(this).toBoolean

public fun PrintSettings.hasKey(key: String?): Boolean = gtk_print_settings_has_key(this,
    key).toBoolean

public fun PrintSettings.`set`(key: String?, `value`: String?): Unit {
  gtk_print_settings_set(this, key, value)
}

public fun PrintSettings.setBool(key: String?, `value`: Boolean): Unit {
  gtk_print_settings_set_bool(this, key, value.toInt)
}

public fun PrintSettings.setCollate(collate: Boolean): Unit {
  gtk_print_settings_set_collate(this, collate.toInt)
}

public fun PrintSettings.setDefaultSource(defaultSource: String?): Unit {
  gtk_print_settings_set_default_source(this, defaultSource)
}

public fun PrintSettings.setDither(dither: String?): Unit {
  gtk_print_settings_set_dither(this, dither)
}

public fun PrintSettings.setDouble(key: String?, `value`: Double): Unit {
  gtk_print_settings_set_double(this, key, value)
}

public fun PrintSettings.setFinishings(finishings: String?): Unit {
  gtk_print_settings_set_finishings(this, finishings)
}

public fun PrintSettings.setInt(key: String?, `value`: Int): Unit {
  gtk_print_settings_set_int(this, key, value)
}

public fun PrintSettings.setMediaType(mediaType: String?): Unit {
  gtk_print_settings_set_media_type(this, mediaType)
}

public fun PrintSettings.setNCopies(numCopies: Int): Unit {
  gtk_print_settings_set_n_copies(this, numCopies)
}

public fun PrintSettings.setNumberUp(numberUp: Int): Unit {
  gtk_print_settings_set_number_up(this, numberUp)
}

public fun PrintSettings.setOutputBin(outputBin: String?): Unit {
  gtk_print_settings_set_output_bin(this, outputBin)
}

public fun PrintSettings.setPaperSize(paperSize: PaperSize): Unit {
  gtk_print_settings_set_paper_size(this, paperSize.reinterpret())
}

public fun PrintSettings.setPrinter(printer: String?): Unit {
  gtk_print_settings_set_printer(this, printer)
}

public fun PrintSettings.setPrinterLpi(lpi: Double): Unit {
  gtk_print_settings_set_printer_lpi(this, lpi)
}

public fun PrintSettings.setResolution(resolution: Int): Unit {
  gtk_print_settings_set_resolution(this, resolution)
}

public fun PrintSettings.setResolutionXy(resolutionX: Int, resolutionY: Int): Unit {
  gtk_print_settings_set_resolution_xy(this, resolutionX, resolutionY)
}

public fun PrintSettings.setReverse(reverse: Boolean): Unit {
  gtk_print_settings_set_reverse(this, reverse.toInt)
}

public fun PrintSettings.setScale(scale: Double): Unit {
  gtk_print_settings_set_scale(this, scale)
}

public fun PrintSettings.setUseColor(useColor: Boolean): Unit {
  gtk_print_settings_set_use_color(this, useColor.toInt)
}

public fun PrintSettings.unset(key: String?): Unit {
  gtk_print_settings_unset(this, key)
}
