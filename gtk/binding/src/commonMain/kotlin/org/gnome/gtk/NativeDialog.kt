package org.gnome.gtk

import gtk3.GtkNativeDialog
import gtk3.gtk_native_dialog_destroy
import gtk3.gtk_native_dialog_get_modal
import gtk3.gtk_native_dialog_get_title
import gtk3.gtk_native_dialog_get_transient_for
import gtk3.gtk_native_dialog_get_visible
import gtk3.gtk_native_dialog_hide
import gtk3.gtk_native_dialog_run
import gtk3.gtk_native_dialog_set_modal
import gtk3.gtk_native_dialog_set_title
import gtk3.gtk_native_dialog_set_transient_for
import gtk3.gtk_native_dialog_show
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

public typealias NativeDialog = CPointer<GtkNativeDialog>

public val NativeDialog.asObject: Object
  get() = reinterpret()

public fun NativeDialog.destroy(): Unit {
  gtk_native_dialog_destroy(this)
}

public fun NativeDialog.getModal(): Boolean = gtk_native_dialog_get_modal(this).toBoolean

public fun NativeDialog.getTitle(): String = gtk_native_dialog_get_title(this).toKString

public fun NativeDialog.getTransientFor(): Window? =
    gtk_native_dialog_get_transient_for(this)?.reinterpret()

public fun NativeDialog.getVisible(): Boolean = gtk_native_dialog_get_visible(this).toBoolean

public fun NativeDialog.hide(): Unit {
  gtk_native_dialog_hide(this)
}

public fun NativeDialog.run(): Int = gtk_native_dialog_run(this)

public fun NativeDialog.setModal(modal: Boolean): Unit {
  gtk_native_dialog_set_modal(this, modal.toInt)
}

public fun NativeDialog.setTitle(title: String?): Unit {
  gtk_native_dialog_set_title(this, title)
}

public fun NativeDialog.setTransientFor(parent: Window): Unit {
  gtk_native_dialog_set_transient_for(this, parent.reinterpret())
}

public fun NativeDialog.show(): Unit {
  gtk_native_dialog_show(this)
}
