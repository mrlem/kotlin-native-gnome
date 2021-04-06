// TODO - implement:
//   destroy
//   get_transient_for
//   hide
//   run
//   set_transient_for
//   show
package org.gnome.gtk

import gtk3.GtkNativeDialog
import gtk3.gtk_native_dialog_get_modal
import gtk3.gtk_native_dialog_get_title
import gtk3.gtk_native_dialog_get_visible
import gtk3.gtk_native_dialog_set_modal
import gtk3.gtk_native_dialog_set_title
import kotlin.Boolean
import kotlin.String
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object
import org.gnome.glib.toBoolean
import org.gnome.glib.toInt
import org.gnome.glib.toKString

public typealias NativeDialog = CPointer<GtkNativeDialog>

public val NativeDialog.asObject: Object
  get() = reinterpret()

public var NativeDialog.modal: Boolean
  get() = gtk_native_dialog_get_modal(this).toBoolean
  set(`value`) {
    gtk_native_dialog_set_modal(this, value.toInt)
  }

public var NativeDialog.title: String?
  get() = gtk_native_dialog_get_title(this).toKString
  set(`value`) {
    gtk_native_dialog_set_title(this, value)
  }

public val NativeDialog.visible: Boolean
  get() = gtk_native_dialog_get_visible(this).toBoolean
