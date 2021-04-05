// TODO - implement:
//   get_child
package org.gnome.gtk

import gtk3.GtkBin
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias Bin = CPointer<GtkBin>

public val Bin.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Bin.asWidget: Widget
  get() = reinterpret()

public val Bin.asContainer: Container
  get() = reinterpret()
