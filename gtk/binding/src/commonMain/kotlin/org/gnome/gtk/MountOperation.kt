// TODO - implement:
//   set_parent
//   set_screen
package org.gnome.gtk

import gtk3.GtkMountOperation
import gtk3.gtk_mount_operation_get_parent
import gtk3.gtk_mount_operation_get_screen
import gtk3.gtk_mount_operation_is_showing
import kotlin.Boolean
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object
import org.gnome.glib.toBoolean

public typealias MountOperation = CPointer<GtkMountOperation>

public val MountOperation.asObject: Object
  get() = reinterpret()

public val MountOperation.asMountOperation: org.gnome.glib.gio.MountOperation
  get() = reinterpret()

public fun MountOperation.getParent(): Unit {
  gtk_mount_operation_get_parent(this)
}

public fun MountOperation.getScreen(): Unit {
  gtk_mount_operation_get_screen(this)
}

public fun MountOperation.isShowing(): Boolean = gtk_mount_operation_is_showing(this).toBoolean
