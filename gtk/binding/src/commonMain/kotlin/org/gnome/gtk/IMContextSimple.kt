// TODO - implement:
//   add_compose_file
//   add_table
package org.gnome.gtk

import gtk3.GtkIMContextSimple
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object

public typealias IMContextSimple = CPointer<GtkIMContextSimple>

public val IMContextSimple.asObject: Object
  get() = reinterpret()

public val IMContextSimple.asIMContext: IMContext
  get() = reinterpret()
