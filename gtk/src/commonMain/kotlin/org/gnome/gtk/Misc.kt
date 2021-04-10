// TODO - implement:
//   get_alignment
//   get_padding
//   set_alignment
//   set_padding
package org.gnome.gtk

import gtk3.GtkMisc
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned
import org.gnome.glib.gobject.Object

public typealias Misc = CPointer<GtkMisc>

public val Misc.asObject: Object
  get() = reinterpret()

public val Misc.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Misc.asWidget: Widget
  get() = reinterpret()
