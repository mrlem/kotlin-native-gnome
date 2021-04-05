// TODO - implement:
//   add_widget
//   get_ignore_hidden
//   get_mode
//   get_widgets
//   remove_widget
//   set_ignore_hidden
//   set_mode
package org.gnome.gtk

import gtk3.GtkSizeGroup
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object

public typealias SizeGroup = CPointer<GtkSizeGroup>

public val SizeGroup.asObject: Object
  get() = reinterpret()
