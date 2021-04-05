// TODO - implement:
//   get_alpha
//   get_color
//   get_rgba
//   get_title
//   get_use_alpha
//   set_alpha
//   set_color
//   set_rgba
//   set_title
//   set_use_alpha
package org.gnome.gtk

import gtk3.GtkColorButton
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias ColorButton = CPointer<GtkColorButton>

public val ColorButton.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val ColorButton.asWidget: Widget
  get() = reinterpret()

public val ColorButton.asContainer: Container
  get() = reinterpret()

public val ColorButton.asBin: Bin
  get() = reinterpret()

public val ColorButton.asButton: Button
  get() = reinterpret()
