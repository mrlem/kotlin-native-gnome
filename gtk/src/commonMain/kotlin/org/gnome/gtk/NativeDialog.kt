// TODO - implement:
//   destroy
//   get_modal
//   get_title
//   get_transient_for
//   get_visible
//   hide
//   run
//   set_modal
//   set_title
//   set_transient_for
//   show
package org.gnome.gtk

import gtk3.GtkNativeDialog
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object

public typealias NativeDialog = CPointer<GtkNativeDialog>

public val NativeDialog.asObject: Object
  get() = reinterpret()
