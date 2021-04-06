// TODO - implement:
//   get_child_non_homogeneous
//   get_child_secondary
//   get_layout
//   set_child_non_homogeneous
//   set_child_secondary
//   set_layout
package org.gnome.gtk

import gtk3.GtkButtonBox
import gtk3.GtkOrientation
import gtk3.gtk_button_box_new
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias ButtonBox = CPointer<GtkButtonBox>

public val ButtonBox.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val ButtonBox.asWidget: Widget
  get() = reinterpret()

public val ButtonBox.asContainer: Container
  get() = reinterpret()

public val ButtonBox.asBox: Box
  get() = reinterpret()

///////////////////////////////////////////////////////////////////////////
// Public API (not generated)
///////////////////////////////////////////////////////////////////////////

@Suppress("FunctionName")
fun ButtonBox(orientation: GtkOrientation) = gtk_button_box_new(orientation)!!.reinterpret<GtkButtonBox>()

fun ButtonBox.add(widget: Widget) {
  asContainer.add(widget)
}
