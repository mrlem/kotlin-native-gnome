package org.gnome.gtk

import gtk3.GtkFileChooserNative
import gtk3.gtk_file_chooser_native_get_accept_label
import gtk3.gtk_file_chooser_native_get_cancel_label
import gtk3.gtk_file_chooser_native_set_accept_label
import gtk3.gtk_file_chooser_native_set_cancel_label
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toKString

public typealias FileChooserNative = CPointer<GtkFileChooserNative>

public val FileChooserNative.asObject: Object
  get() = reinterpret()

public val FileChooserNative.asNativeDialog: NativeDialog
  get() = reinterpret()

public fun FileChooserNative.getAcceptLabel(): String =
    gtk_file_chooser_native_get_accept_label(this).toKString

public fun FileChooserNative.getCancelLabel(): String =
    gtk_file_chooser_native_get_cancel_label(this).toKString

public fun FileChooserNative.setAcceptLabel(acceptLabel: String?): Unit {
  gtk_file_chooser_native_set_accept_label(this, acceptLabel)
}

public fun FileChooserNative.setCancelLabel(cancelLabel: String?): Unit {
  gtk_file_chooser_native_set_cancel_label(this, cancelLabel)
}
