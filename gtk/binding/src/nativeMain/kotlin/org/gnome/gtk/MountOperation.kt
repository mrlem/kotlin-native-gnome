// TODO - constructor: new
// TODO - method: get_screen
// TODO - method: set_screen
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkMountOperation
import interop.gtk_mount_operation_get_parent
import interop.gtk_mount_operation_is_showing
import interop.gtk_mount_operation_set_parent
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

public object MountOperationFactory

public var MountOperation.parent: Window?
  get() = gtk_mount_operation_get_parent(this)?.reinterpret()
  set(`value`) {
    gtk_mount_operation_set_parent(this, value)
  }

public fun MountOperation.isShowing(): Boolean = gtk_mount_operation_is_showing(this).toBoolean
