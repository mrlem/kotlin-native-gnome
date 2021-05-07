@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkMountOperation
import interop.gtk_mount_operation_get_parent
import interop.gtk_mount_operation_get_screen
import interop.gtk_mount_operation_is_showing
import interop.gtk_mount_operation_new
import interop.gtk_mount_operation_set_parent
import interop.gtk_mount_operation_set_screen
import kotlin.Boolean
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.gdk.Screen
import org.gnome.gobject.Object
import org.mrlem.gnome.toBoolean

public typealias MountOperation = CPointer<GtkMountOperation>

public val MountOperation.asObject: Object
  get() = reinterpret()

public val MountOperation.asMountOperation: org.gnome.gio.MountOperation
  get() = reinterpret()

public object MountOperationFactory {
  public fun new(parent: Window?): MountOperation =
      gtk_mount_operation_new(parent?.reinterpret())!!.reinterpret()
}

public val MountOperation.parentInstance: org.gnome.gio.MountOperation
  get() = pointed.parent_instance.ptr

public var MountOperation.parent: Window?
  get() = gtk_mount_operation_get_parent(this)?.reinterpret()
  set(`value`) {
    gtk_mount_operation_set_parent(this@parent, `value`)
  }

public var MountOperation.screen: Screen?
  get() = gtk_mount_operation_get_screen(this)?.reinterpret()
  set(`value`) {
    gtk_mount_operation_set_screen(this@screen, `value`)
  }

public fun MountOperation.isShowing(): Boolean =
    gtk_mount_operation_is_showing(this@isShowing).toBoolean()
