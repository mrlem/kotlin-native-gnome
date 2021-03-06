// TODO - constructor: new_from_file
// TODO - constructor: new_from_key_file
// TODO - method: foreach (param type)
// TODO - method: get_page_ranges (param type)
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
import interop.gtk_print_settings_load_key_file
import interop.gtk_print_settings_new
import interop.gtk_print_settings_new_from_gvariant
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
import interop.gtk_print_settings_set_page_ranges
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
import interop.gtk_print_settings_to_gvariant
import interop.gtk_print_settings_to_key_file
import interop.gtk_print_settings_unset
import kotlin.Array
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Throws
import kotlin.collections.map
import kotlin.collections.toTypedArray
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.glib.KeyFile
import org.gnome.glib.Variant
import org.gnome.gobject.Object
import org.mrlem.gnome.glib.Error
import org.mrlem.gnome.toBoolean
import org.mrlem.gnome.toCArray
import org.mrlem.gnome.toInt
import org.mrlem.gnome.toKString

public typealias PrintSettings = CPointer<GtkPrintSettings>

public val PrintSettings.asObject: Object
  get() = reinterpret()

public object PrintSettingsFactory {
  public fun new(): PrintSettings = gtk_print_settings_new()!!.reinterpret()

  public fun newFromGvariant(variant: Variant?): PrintSettings =
      gtk_print_settings_new_from_gvariant(variant?.reinterpret())!!.reinterpret()
}

public var PrintSettings.collate: Boolean
  get() = gtk_print_settings_get_collate(this).toBoolean()
  set(`value`) {
    gtk_print_settings_set_collate(this@collate, `value`.toInt())
  }

public var PrintSettings.defaultSource: String?
  get() = gtk_print_settings_get_default_source(this).toKString()
  set(`value`) {
    gtk_print_settings_set_default_source(this@defaultSource, `value`)
  }

public var PrintSettings.dither: String?
  get() = gtk_print_settings_get_dither(this).toKString()
  set(`value`) {
    gtk_print_settings_set_dither(this@dither, `value`)
  }

public var PrintSettings.duplex: PrintDuplex
  get() = gtk_print_settings_get_duplex(this)
  set(`value`) {
    gtk_print_settings_set_duplex(this@duplex, `value`)
  }

public var PrintSettings.finishings: String?
  get() = gtk_print_settings_get_finishings(this).toKString()
  set(`value`) {
    gtk_print_settings_set_finishings(this@finishings, `value`)
  }

public var PrintSettings.mediaType: String?
  get() = gtk_print_settings_get_media_type(this).toKString()
  set(`value`) {
    gtk_print_settings_set_media_type(this@mediaType, `value`)
  }

public var PrintSettings.nCopies: Int
  get() = gtk_print_settings_get_n_copies(this)
  set(`value`) {
    gtk_print_settings_set_n_copies(this@nCopies, `value`)
  }

public var PrintSettings.numberUp: Int
  get() = gtk_print_settings_get_number_up(this)
  set(`value`) {
    gtk_print_settings_set_number_up(this@numberUp, `value`)
  }

public var PrintSettings.numberUpLayout: NumberUpLayout
  get() = gtk_print_settings_get_number_up_layout(this)
  set(`value`) {
    gtk_print_settings_set_number_up_layout(this@numberUpLayout, `value`)
  }

public var PrintSettings.orientation: PageOrientation
  get() = gtk_print_settings_get_orientation(this)
  set(`value`) {
    gtk_print_settings_set_orientation(this@orientation, `value`)
  }

public var PrintSettings.outputBin: String?
  get() = gtk_print_settings_get_output_bin(this).toKString()
  set(`value`) {
    gtk_print_settings_set_output_bin(this@outputBin, `value`)
  }

public var PrintSettings.pageSet: PageSet
  get() = gtk_print_settings_get_page_set(this)
  set(`value`) {
    gtk_print_settings_set_page_set(this@pageSet, `value`)
  }

public var PrintSettings.paperSize: PaperSize?
  get() = gtk_print_settings_get_paper_size(this)?.reinterpret()
  set(`value`) {
    gtk_print_settings_set_paper_size(this@paperSize, `value`)
  }

public var PrintSettings.printPages: PrintPages
  get() = gtk_print_settings_get_print_pages(this)
  set(`value`) {
    gtk_print_settings_set_print_pages(this@printPages, `value`)
  }

public var PrintSettings.printer: String?
  get() = gtk_print_settings_get_printer(this).toKString()
  set(`value`) {
    gtk_print_settings_set_printer(this@printer, `value`)
  }

public var PrintSettings.printerLpi: Double
  get() = gtk_print_settings_get_printer_lpi(this)
  set(`value`) {
    gtk_print_settings_set_printer_lpi(this@printerLpi, `value`)
  }

public var PrintSettings.quality: PrintQuality
  get() = gtk_print_settings_get_quality(this)
  set(`value`) {
    gtk_print_settings_set_quality(this@quality, `value`)
  }

public var PrintSettings.resolution: Int
  get() = gtk_print_settings_get_resolution(this)
  set(`value`) {
    gtk_print_settings_set_resolution(this@resolution, `value`)
  }

public val PrintSettings.resolutionX: Int
  get() = gtk_print_settings_get_resolution_x(this)

public val PrintSettings.resolutionY: Int
  get() = gtk_print_settings_get_resolution_y(this)

public var PrintSettings.reverse: Boolean
  get() = gtk_print_settings_get_reverse(this).toBoolean()
  set(`value`) {
    gtk_print_settings_set_reverse(this@reverse, `value`.toInt())
  }

public var PrintSettings.scale: Double
  get() = gtk_print_settings_get_scale(this)
  set(`value`) {
    gtk_print_settings_set_scale(this@scale, `value`)
  }

public var PrintSettings.useColor: Boolean
  get() = gtk_print_settings_get_use_color(this).toBoolean()
  set(`value`) {
    gtk_print_settings_set_use_color(this@useColor, `value`.toInt())
  }

public fun PrintSettings.copy(): PrintSettings? = gtk_print_settings_copy(this@copy)?.reinterpret()

public fun PrintSettings.`get`(key: String?): String? = gtk_print_settings_get(this@`get`,
    key).toKString()

public fun PrintSettings.getBool(key: String?): Boolean = gtk_print_settings_get_bool(this@getBool,
    key).toBoolean()

public fun PrintSettings.getDouble(key: String?): Double =
    gtk_print_settings_get_double(this@getDouble, key)

public fun PrintSettings.getDoubleWithDefault(key: String?, def: Double): Double =
    gtk_print_settings_get_double_with_default(this@getDoubleWithDefault, key, def)

public fun PrintSettings.getInt(key: String?): Int = gtk_print_settings_get_int(this@getInt, key)

public fun PrintSettings.getIntWithDefault(key: String?, def: Int): Int =
    gtk_print_settings_get_int_with_default(this@getIntWithDefault, key, def)

public fun PrintSettings.getLength(key: String?, unit: Unit): Double =
    gtk_print_settings_get_length(this@getLength, key, unit)

public fun PrintSettings.getPaperHeight(unit: Unit): Double =
    gtk_print_settings_get_paper_height(this@getPaperHeight, unit)

public fun PrintSettings.getPaperWidth(unit: Unit): Double =
    gtk_print_settings_get_paper_width(this@getPaperWidth, unit)

public fun PrintSettings.hasKey(key: String?): Boolean = gtk_print_settings_has_key(this@hasKey,
    key).toBoolean()

@Throws(Error::class)
public fun PrintSettings.loadFile(fileName: String?): Boolean = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Boolean = gtk_print_settings_load_file(this@loadFile, fileName, errors).toBoolean()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun PrintSettings.loadKeyFile(keyFile: KeyFile?, groupName: String?): Boolean = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Boolean = gtk_print_settings_load_key_file(this@loadKeyFile, keyFile?.reinterpret(),
      groupName, errors).toBoolean()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

public fun PrintSettings.`set`(key: String?, `value`: String?): kotlin.Unit {
  gtk_print_settings_set(this@`set`, key, `value`)
}

public fun PrintSettings.setBool(key: String?, `value`: Boolean): kotlin.Unit {
  gtk_print_settings_set_bool(this@setBool, key, `value`.toInt())
}

public fun PrintSettings.setDouble(key: String?, `value`: Double): kotlin.Unit {
  gtk_print_settings_set_double(this@setDouble, key, `value`)
}

public fun PrintSettings.setInt(key: String?, `value`: Int): kotlin.Unit {
  gtk_print_settings_set_int(this@setInt, key, `value`)
}

public fun PrintSettings.setLength(
  key: String?,
  `value`: Double,
  unit: Unit
): kotlin.Unit {
  gtk_print_settings_set_length(this@setLength, key, `value`, unit)
}

public fun PrintSettings.setPageRanges(pageRanges: Array<PageRange>?, numRanges: Int): kotlin.Unit {
  memScoped { gtk_print_settings_set_page_ranges(this@setPageRanges, pageRanges?.map { it.pointed
      }?.toTypedArray()?.toCArray(memScope), numRanges) }
}

public fun PrintSettings.setPaperHeight(height: Double, unit: Unit): kotlin.Unit {
  gtk_print_settings_set_paper_height(this@setPaperHeight, height, unit)
}

public fun PrintSettings.setPaperWidth(width: Double, unit: Unit): kotlin.Unit {
  gtk_print_settings_set_paper_width(this@setPaperWidth, width, unit)
}

public fun PrintSettings.setResolutionXy(resolutionX: Int, resolutionY: Int): kotlin.Unit {
  gtk_print_settings_set_resolution_xy(this@setResolutionXy, resolutionX, resolutionY)
}

@Throws(Error::class)
public fun PrintSettings.toFile(fileName: String?): Boolean = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Boolean = gtk_print_settings_to_file(this@toFile, fileName, errors).toBoolean()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

public fun PrintSettings.toGvariant(): Variant? =
    gtk_print_settings_to_gvariant(this@toGvariant)?.reinterpret()

public fun PrintSettings.toKeyFile(keyFile: KeyFile?, groupName: String?): kotlin.Unit {
  gtk_print_settings_to_key_file(this@toKeyFile, keyFile?.reinterpret(), groupName)
}

public fun PrintSettings.unset(key: String?): kotlin.Unit {
  gtk_print_settings_unset(this@unset, key)
}
