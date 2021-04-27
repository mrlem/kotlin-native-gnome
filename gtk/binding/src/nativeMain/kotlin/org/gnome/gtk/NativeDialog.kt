@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkNativeDialog
import interop.gtk_native_dialog_destroy
import interop.gtk_native_dialog_get_modal
import interop.gtk_native_dialog_get_title
import interop.gtk_native_dialog_get_transient_for
import interop.gtk_native_dialog_get_visible
import interop.gtk_native_dialog_hide
import interop.gtk_native_dialog_run
import interop.gtk_native_dialog_set_modal
import interop.gtk_native_dialog_set_title
import interop.gtk_native_dialog_set_transient_for
import interop.gtk_native_dialog_show
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toBoolean
import org.gnome.toInt
import org.gnome.toKString
import org.mrlem.gnome.gobject.connect

public typealias NativeDialog = CPointer<GtkNativeDialog>

public val NativeDialog.asObject: Object
  get() = reinterpret()

public var NativeDialog.modal: Boolean
  get() = gtk_native_dialog_get_modal(this).toBoolean
  set(`value`) {
    gtk_native_dialog_set_modal(this, value.toInt)
  }

public var NativeDialog.title: String
  get() = gtk_native_dialog_get_title(this).toKString
  set(`value`) {
    gtk_native_dialog_set_title(this, value)
  }

public var NativeDialog.transientFor: Window?
  get() = gtk_native_dialog_get_transient_for(this)?.reinterpret()
  set(`value`) {
    gtk_native_dialog_set_transient_for(this, value)
  }

public val NativeDialog.visible: Boolean
  get() = gtk_native_dialog_get_visible(this).toBoolean

public fun NativeDialog.destroy(): Unit {
  gtk_native_dialog_destroy(this)
}

public fun NativeDialog.hide(): Unit {
  gtk_native_dialog_hide(this)
}

public fun NativeDialog.run(): Int = gtk_native_dialog_run(this)

public fun NativeDialog.show(): Unit {
  gtk_native_dialog_show(this)
}

public fun NativeDialog.onResponse(callback: (NativeDialog) -> Unit): NativeDialog {
  // TODO - handle callback data

  asObject.connect("response") { callback(this) }
  return this
}
