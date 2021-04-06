// TODO - implement:
//   add_widget
//   get_mode
//   get_widgets
//   remove_widget
//   set_mode
package org.gnome.gtk

import gtk3.GtkSizeGroup
import gtk3.gtk_size_group_get_ignore_hidden
import gtk3.gtk_size_group_set_ignore_hidden
import kotlin.Boolean
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object
import org.gnome.glib.toBoolean
import org.gnome.glib.toInt

public typealias SizeGroup = CPointer<GtkSizeGroup>

public val SizeGroup.asObject: Object
  get() = reinterpret()

public var SizeGroup.ignoreHidden: Boolean
  get() = gtk_size_group_get_ignore_hidden(this).toBoolean
  set(`value`) {
    gtk_size_group_set_ignore_hidden(this, value.toInt)
  }
