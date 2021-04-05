// TODO - implement:
//   get_accept_label
//   get_cancel_label
//   set_accept_label
//   set_cancel_label
package org.gnome.gtk

import gtk3.GtkFileChooserNative
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object

public typealias FileChooserNative = CPointer<GtkFileChooserNative>

public val FileChooserNative.asObject: Object
  get() = reinterpret()

public val FileChooserNative.asNativeDialog: NativeDialog
  get() = reinterpret()
