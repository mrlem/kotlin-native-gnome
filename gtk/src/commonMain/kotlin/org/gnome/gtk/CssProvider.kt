// TODO - implement:
//   load_from_data
//   load_from_file
//   load_from_path
//   load_from_resource
package org.gnome.gtk

import gtk3.GtkCssProvider
import gtk3.gtk_css_provider_to_string
import kotlin.String
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object
import org.gnome.glib.toKString

public typealias CssProvider = CPointer<GtkCssProvider>

public val CssProvider.asObject: Object
  get() = reinterpret()

// FIXME
public fun CssProvider.toString(): String? = gtk_css_provider_to_string(this).toKString
