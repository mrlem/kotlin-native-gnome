@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkFileChooserNative
import interop.gtk_file_chooser_native_get_accept_label
import interop.gtk_file_chooser_native_get_cancel_label
import interop.gtk_file_chooser_native_new
import interop.gtk_file_chooser_native_set_accept_label
import interop.gtk_file_chooser_native_set_cancel_label
import kotlin.String
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.mrlem.gnome.toKString

public typealias FileChooserNative = CPointer<GtkFileChooserNative>

public val FileChooserNative.asObject: Object
  get() = reinterpret()

public val FileChooserNative.asNativeDialog: NativeDialog
  get() = reinterpret()

public object FileChooserNativeFactory {
  public fun new(
    title: String?,
    parent: Window?,
    action: FileChooserAction,
    acceptLabel: String?,
    cancelLabel: String?
  ): FileChooserNative = gtk_file_chooser_native_new(title, parent?.reinterpret(), action,
      acceptLabel, cancelLabel)!!.reinterpret()
}

public var FileChooserNative.acceptLabel: String?
  get() = gtk_file_chooser_native_get_accept_label(this).toKString()
  set(`value`) {
    gtk_file_chooser_native_set_accept_label(this@acceptLabel, `value`)
  }

public var FileChooserNative.cancelLabel: String?
  get() = gtk_file_chooser_native_get_cancel_label(this).toKString()
  set(`value`) {
    gtk_file_chooser_native_set_cancel_label(this@cancelLabel, `value`)
  }
