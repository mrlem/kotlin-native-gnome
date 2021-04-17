// TODO - implement:
//   move
//   put
package org.gnome.gtk

import gtk3.GtkFixed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned
import org.gnome.glib.gobject.Object

public typealias Fixed = CPointer<GtkFixed>

public val Fixed.asObject: Object
  get() = reinterpret()

public val Fixed.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val Fixed.asWidget: Widget
  get() = reinterpret()

public val Fixed.asContainer: Container
  get() = reinterpret()
