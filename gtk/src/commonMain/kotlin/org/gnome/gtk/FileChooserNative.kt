package org.gnome.gtk

import gtk3.GtkFileChooserNative
import gtk3.gtk_file_chooser_native_get_accept_label
import gtk3.gtk_file_chooser_native_get_cancel_label
import gtk3.gtk_file_chooser_native_set_accept_label
import gtk3.gtk_file_chooser_native_set_cancel_label
import kotlin.String
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object
import org.gnome.glib.toKString

public typealias FileChooserNative = CPointer<GtkFileChooserNative>

public val FileChooserNative.asObject: Object
  get() = reinterpret()

public val FileChooserNative.asNativeDialog: NativeDialog
  get() = reinterpret()

public var FileChooserNative.acceptLabel: String?
  get() = gtk_file_chooser_native_get_accept_label(this).toKString
  set(`value`) {
    gtk_file_chooser_native_set_accept_label(this, value)
  }

public var FileChooserNative.cancelLabel: String?
  get() = gtk_file_chooser_native_get_cancel_label(this).toKString
  set(`value`) {
    gtk_file_chooser_native_set_cancel_label(this, value)
  }
