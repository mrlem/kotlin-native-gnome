// TODO - implement:
//   get_child_non_homogeneous
//   get_child_secondary
//   set_child_non_homogeneous
//   set_child_secondary
//   set_layout
package org.gnome.gtk

import gtk3.GtkButtonBox
import gtk3.gtk_button_box_get_layout
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned
import org.gnome.glib.gobject.Object

public typealias ButtonBox = CPointer<GtkButtonBox>

public val ButtonBox.asObject: Object
  get() = reinterpret()

public val ButtonBox.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val ButtonBox.asWidget: Widget
  get() = reinterpret()

public val ButtonBox.asContainer: Container
  get() = reinterpret()

public val ButtonBox.asBox: Box
  get() = reinterpret()

public fun ButtonBox.getLayout(): Unit {
  gtk_button_box_get_layout(this)
}
