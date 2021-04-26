// TODO - constructor: new_from_file
// TODO - constructor: new_from_gvariant
// TODO - constructor: new_from_key_file
// TODO - method: foreach
// TODO - method: get_page_ranges
// TODO - method: load_key_file
// TODO - method: set_page_ranges
// TODO - method: to_gvariant
// TODO - method: to_key_file
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GError
import interop.GtkPrintSettings
import interop.gtk_print_settings_copy
import interop.gtk_print_settings_get
import interop.gtk_print_settings_get_bool
import interop.gtk_print_settings_get_collate
import interop.gtk_print_settings_get_default_source
import interop.gtk_print_settings_get_dither
import interop.gtk_print_settings_get_double
import interop.gtk_print_settings_get_double_with_default
import interop.gtk_print_settings_get_duplex
import interop.gtk_print_settings_get_finishings
import interop.gtk_print_settings_get_int
import interop.gtk_print_settings_get_int_with_default
import interop.gtk_print_settings_get_length
import interop.gtk_print_settings_get_media_type
import interop.gtk_print_settings_get_n_copies
import interop.gtk_print_settings_get_number_up
import interop.gtk_print_settings_get_number_up_layout
import interop.gtk_print_settings_get_orientation
import interop.gtk_print_settings_get_output_bin
import interop.gtk_print_settings_get_page_set
import interop.gtk_print_settings_get_paper_height
import interop.gtk_print_settings_get_paper_size
import interop.gtk_print_settings_get_paper_width
import interop.gtk_print_settings_get_print_pages
import interop.gtk_print_settings_get_printer
import interop.gtk_print_settings_get_printer_lpi
import interop.gtk_print_settings_get_quality
import interop.gtk_print_settings_get_resolution
import interop.gtk_print_settings_get_resolution_x
import interop.gtk_print_settings_get_resolution_y
import interop.gtk_print_settings_get_reverse
import interop.gtk_print_settings_get_scale
import interop.gtk_print_settings_get_use_color
import interop.gtk_print_settings_has_key
import interop.gtk_print_settings_load_file
import interop.gtk_print_settings_new
import interop.gtk_print_settings_set
import interop.gtk_print_settings_set_bool
import interop.gtk_print_settings_set_collate
import interop.gtk_print_settings_set_default_source
import interop.gtk_print_settings_set_dither
import interop.gtk_print_settings_set_double
import interop.gtk_print_settings_set_duplex
import interop.gtk_print_settings_set_finishings
import interop.gtk_print_settings_set_int
import interop.gtk_print_settings_set_length
import interop.gtk_print_settings_set_media_type
import interop.gtk_print_settings_set_n_copies
import interop.gtk_print_settings_set_number_up
import interop.gtk_print_settings_set_number_up_layout
import interop.gtk_print_settings_set_orientation
import interop.gtk_print_settings_set_output_bin
import interop.gtk_print_settings_set_page_set
import interop.gtk_print_settings_set_paper_height
import interop.gtk_print_settings_set_paper_size
import interop.gtk_print_settings_set_paper_width
import interop.gtk_print_settings_set_print_pages
import interop.gtk_print_settings_set_printer
import interop.gtk_print_settings_set_printer_lpi
import interop.gtk_print_settings_set_quality
import interop.gtk_print_settings_set_resolution
import interop.gtk_print_settings_set_resolution_xy
import interop.gtk_print_settings_set_reverse
import interop.gtk_print_settings_set_scale
import interop.gtk_print_settings_set_use_color
import interop.gtk_print_settings_to_file
import interop.gtk_print_settings_unset
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
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
import org.gnome.toInt
import org.gnome.toKString

public typealias PrintSettings = CPointer<GtkPrintSettings>

public val PrintSettings.asObject: Object
  get() = reinterpret()

public object PrintSettingsFactory {
  public fun new(): PrintSettings = gtk_print_settings_new()!!.reinterpret()
}

public var PrintSettings.collate: Boolean
  get() = gtk_print_settings_get_collate(this).toBoolean
  set(`value`) {
    gtk_print_settings_set_collate(this, value.toInt)
  }

public var PrintSettings.defaultSource: String
  get() = gtk_print_settings_get_default_source(this).toKString
  set(`value`) {
    gtk_print_settings_set_default_source(this, value)
  }

public var PrintSettings.dither: String
  get() = gtk_print_settings_get_dither(this).toKString
  set(`value`) {
    gtk_print_settings_set_dither(this, value)
  }

public var PrintSettings.duplex: PrintDuplex
  get() = gtk_print_settings_get_duplex(this)
  set(`value`) {
    gtk_print_settings_set_duplex(this, value)
  }

public var PrintSettings.finishings: String
  get() = gtk_print_settings_get_finishings(this).toKString
  set(`value`) {
    gtk_print_settings_set_finishings(this, value)
  }

public var PrintSettings.mediaType: String
  get() = gtk_print_settings_get_media_type(this).toKString
  set(`value`) {
    gtk_print_settings_set_media_type(this, value)
  }

public var PrintSettings.nCopies: Int
  get() = gtk_print_settings_get_n_copies(this)
  set(`value`) {
    gtk_print_settings_set_n_copies(this, value)
  }

public var PrintSettings.numberUp: Int
  get() = gtk_print_settings_get_number_up(this)
  set(`value`) {
    gtk_print_settings_set_number_up(this, value)
  }

public var PrintSettings.numberUpLayout: NumberUpLayout
  get() = gtk_print_settings_get_number_up_layout(this)
  set(`value`) {
    gtk_print_settings_set_number_up_layout(this, value)
  }

public var PrintSettings.orientation: PageOrientation
  get() = gtk_print_settings_get_orientation(this)
  set(`value`) {
    gtk_print_settings_set_orientation(this, value)
  }

public var PrintSettings.outputBin: String
  get() = gtk_print_settings_get_output_bin(this).toKString
  set(`value`) {
    gtk_print_settings_set_output_bin(this, value)
  }

public var PrintSettings.pageSet: PageSet
  get() = gtk_print_settings_get_page_set(this)
  set(`value`) {
    gtk_print_settings_set_page_set(this, value)
  }

public var PrintSettings.paperSize: PaperSize?
  get() = gtk_print_settings_get_paper_size(this)?.reinterpret()
  set(`value`) {
    gtk_print_settings_set_paper_size(this, value)
  }

public var PrintSettings.printPages: PrintPages
  get() = gtk_print_settings_get_print_pages(this)
  set(`value`) {
    gtk_print_settings_set_print_pages(this, value)
  }

public var PrintSettings.printer: String
  get() = gtk_print_settings_get_printer(this).toKString
  set(`value`) {
    gtk_print_settings_set_printer(this, value)
  }

public var PrintSettings.printerLpi: Double
  get() = gtk_print_settings_get_printer_lpi(this)
  set(`value`) {
    gtk_print_settings_set_printer_lpi(this, value)
  }

public var PrintSettings.quality: PrintQuality
  get() = gtk_print_settings_get_quality(this)
  set(`value`) {
    gtk_print_settings_set_quality(this, value)
  }

public var PrintSettings.resolution: Int
  get() = gtk_print_settings_get_resolution(this)
  set(`value`) {
    gtk_print_settings_set_resolution(this, value)
  }

public val PrintSettings.resolutionX: Int
  get() = gtk_print_settings_get_resolution_x(this)

public val PrintSettings.resolutionY: Int
  get() = gtk_print_settings_get_resolution_y(this)

public var PrintSettings.reverse: Boolean
  get() = gtk_print_settings_get_reverse(this).toBoolean
  set(`value`) {
    gtk_print_settings_set_reverse(this, value.toInt)
  }

public var PrintSettings.scale: Double
  get() = gtk_print_settings_get_scale(this)
  set(`value`) {
    gtk_print_settings_set_scale(this, value)
  }

public var PrintSettings.useColor: Boolean
  get() = gtk_print_settings_get_use_color(this).toBoolean
  set(`value`) {
    gtk_print_settings_set_use_color(this, value.toInt)
  }

public fun PrintSettings.copy(): PrintSettings? = gtk_print_settings_copy(this)?.reinterpret()

public fun PrintSettings.`get`(key: String): String = gtk_print_settings_get(this, key).toKString

public fun PrintSettings.getBool(key: String): Boolean = gtk_print_settings_get_bool(this,
    key).toBoolean

public fun PrintSettings.getDouble(key: String): Double = gtk_print_settings_get_double(this, key)

public fun PrintSettings.getDoubleWithDefault(key: String, def: Double): Double =
    gtk_print_settings_get_double_with_default(this, key, def)

public fun PrintSettings.getInt(key: String): Int = gtk_print_settings_get_int(this, key)

public fun PrintSettings.getIntWithDefault(key: String, def: Int): Int =
    gtk_print_settings_get_int_with_default(this, key, def)

public fun PrintSettings.getLength(key: String, unit: Unit): Double =
    gtk_print_settings_get_length(this, key, unit)

public fun PrintSettings.getPaperHeight(unit: Unit): Double =
    gtk_print_settings_get_paper_height(this, unit)

public fun PrintSettings.getPaperWidth(unit: Unit): Double =
    gtk_print_settings_get_paper_width(this, unit)

public fun PrintSettings.hasKey(key: String): Boolean = gtk_print_settings_has_key(this,
    key).toBoolean

@Throws(Error::class)
public fun PrintSettings.loadFile(fileName: String): Boolean = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Boolean = gtk_print_settings_load_file(this@loadFile, fileName, errors).toBoolean
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

public fun PrintSettings.`set`(key: String, `value`: String): kotlin.Unit {
  gtk_print_settings_set(this, key, value)
}

public fun PrintSettings.setBool(key: String, `value`: Boolean): kotlin.Unit {
  gtk_print_settings_set_bool(this, key, value.toInt)
}

public fun PrintSettings.setDouble(key: String, `value`: Double): kotlin.Unit {
  gtk_print_settings_set_double(this, key, value)
}

public fun PrintSettings.setInt(key: String, `value`: Int): kotlin.Unit {
  gtk_print_settings_set_int(this, key, value)
}

public fun PrintSettings.setLength(
  key: String,
  `value`: Double,
  unit: Unit
): kotlin.Unit {
  gtk_print_settings_set_length(this, key, value, unit)
}

public fun PrintSettings.setPaperHeight(height: Double, unit: Unit): kotlin.Unit {
  gtk_print_settings_set_paper_height(this, height, unit)
}

public fun PrintSettings.setPaperWidth(width: Double, unit: Unit): kotlin.Unit {
  gtk_print_settings_set_paper_width(this, width, unit)
}

public fun PrintSettings.setResolutionXy(resolutionX: Int, resolutionY: Int): kotlin.Unit {
  gtk_print_settings_set_resolution_xy(this, resolutionX, resolutionY)
}

@Throws(Error::class)
public fun PrintSettings.toFile(fileName: String): Boolean = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Boolean = gtk_print_settings_to_file(this@toFile, fileName, errors).toBoolean
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

public fun PrintSettings.unset(key: String): kotlin.Unit {
  gtk_print_settings_unset(this, key)
}
