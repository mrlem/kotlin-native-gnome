@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GError
import interop.GtkCssProvider
import interop.gtk_css_provider_load_from_data
import interop.gtk_css_provider_load_from_file
import interop.gtk_css_provider_load_from_path
import interop.gtk_css_provider_load_from_resource
import interop.gtk_css_provider_new
import interop.gtk_css_provider_to_string
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlin.Throws
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gio.File
import org.gnome.glib.Error
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toKString
import org.mrlem.gnome.gobject.connect

public typealias CssProvider = CPointer<GtkCssProvider>

public val CssProvider.asObject: Object
  get() = reinterpret()

public object CssProviderFactory {
  public fun new(): CssProvider = gtk_css_provider_new()!!.reinterpret()
}

public val CssProvider.parentInstance: Object
  get() = pointed.parent_instance.ptr

@Throws(Error::class)
public fun CssProvider.loadFromData(`data`: String?, length: Long): Boolean = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Boolean = gtk_css_provider_load_from_data(this@loadFromData, `data`, length,
      errors).toBoolean()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun CssProvider.loadFromFile(`file`: File?): Boolean = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Boolean = gtk_css_provider_load_from_file(this@loadFromFile, `file`?.reinterpret(),
      errors).toBoolean()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun CssProvider.loadFromPath(path: String?): Boolean = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: Boolean = gtk_css_provider_load_from_path(this@loadFromPath, path, errors).toBoolean()
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

public fun CssProvider.loadFromResource(resourcePath: String?): Unit {
  gtk_css_provider_load_from_resource(this@loadFromResource, resourcePath)
}

public fun CssProvider.toString(): String? = gtk_css_provider_to_string(this@toString).toKString()

public fun CssProvider.onParsingError(callback: (CssProvider) -> Unit): CssProvider {
  // TODO - handle callback data

  asObject.connect("parsing-error") { callback(this) }
  return this
}
