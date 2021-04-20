// TODO - get_screen
// TODO - set_screen
//
package org.gnome.gtk

import gtk3.GtkMountOperation
import gtk3.gtk_mount_operation_get_parent
import gtk3.gtk_mount_operation_is_showing
import gtk3.gtk_mount_operation_set_parent
import kotlin.Boolean
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toBoolean

public typealias MountOperation = CPointer<GtkMountOperation>

public val MountOperation.asObject: Object
  get() = reinterpret()

public val MountOperation.asMountOperation: org.gnome.gio.MountOperation
  get() = reinterpret()

public var MountOperation.parent: Window?
  get() = gtk_mount_operation_get_parent(this)?.reinterpret()
  set(`value`) {
    gtk_mount_operation_set_parent(this, value)
  }

public fun MountOperation.isShowing(): Boolean = gtk_mount_operation_is_showing(this).toBoolean
