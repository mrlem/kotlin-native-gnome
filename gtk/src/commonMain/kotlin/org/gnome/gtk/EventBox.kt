// TODO - implement:
//   get_above_child
//   get_visible_window
//   set_above_child
//   set_visible_window
package org.gnome.gtk

import gtk3.GtkEventBox
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias EventBox = CPointer<GtkEventBox>

public val EventBox.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val EventBox.asWidget: Widget
  get() = reinterpret()

public val EventBox.asContainer: Container
  get() = reinterpret()

public val EventBox.asBin: Bin
  get() = reinterpret()
