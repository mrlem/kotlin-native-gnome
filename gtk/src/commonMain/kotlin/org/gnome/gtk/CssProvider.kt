// TODO - implement:
//   load_from_data
//   load_from_file
//   load_from_path
//   load_from_resource
//   to_string
package org.gnome.gtk

import gtk3.GtkCssProvider
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object

public typealias CssProvider = CPointer<GtkCssProvider>

public val CssProvider.asObject: Object
  get() = reinterpret()
