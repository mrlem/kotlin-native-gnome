// TODO - method: load_from_data
// TODO - method: load_from_file
// TODO - method: load_from_path
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType","FunctionName")

package org.gnome.gtk

import gtk3.GtkCssProvider
import gtk3.gtk_css_provider_load_from_resource
import gtk3.gtk_css_provider_new
import gtk3.gtk_css_provider_to_string
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.gobject.connect
import org.gnome.toKString

public typealias CssProvider = CPointer<GtkCssProvider>

public val CssProvider.asObject: Object
  get() = reinterpret()

public object CssProviderFactory {
  public fun new(): CssProvider = gtk_css_provider_new()!!.reinterpret()
}

public fun CssProvider.loadFromResource(resourcePath: String): Unit {
  gtk_css_provider_load_from_resource(this, resourcePath)
}

public fun CssProvider.toString(): String = gtk_css_provider_to_string(this).toKString

public fun CssProvider.onParsingError(callback: (CssProvider) -> Unit): CssProvider {
  // TODO - handle callback data

  asObject.connect("parsing-error") { callback(this) }
  return this
}
