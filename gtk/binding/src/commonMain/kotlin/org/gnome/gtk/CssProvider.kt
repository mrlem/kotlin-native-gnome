// TODO - method: load_from_data
// TODO - method: load_from_file
// TODO - method: load_from_path
// TODO - signal: parsing-error
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import gtk3.GtkCssProvider
import gtk3.gtk_css_provider_load_from_resource
import gtk3.gtk_css_provider_to_string
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toKString

public typealias CssProvider = CPointer<GtkCssProvider>

public val CssProvider.asObject: Object
  get() = reinterpret()

public fun CssProvider.loadFromResource(resourcePath: String): Unit {
  gtk_css_provider_load_from_resource(this, resourcePath)
}

public fun CssProvider.toString(): String = gtk_css_provider_to_string(this).toKString
