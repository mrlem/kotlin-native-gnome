@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GtkLockButton
import interop.gtk_lock_button_get_permission
import interop.gtk_lock_button_new
import interop.gtk_lock_button_set_permission
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.gio.Permission
import org.gnome.gobject.InitiallyUnowned
import org.gnome.gobject.Object

public typealias LockButton = CPointer<GtkLockButton>

public val LockButton.asObject: Object
  get() = reinterpret()

public val LockButton.asInitiallyUnowned: InitiallyUnowned
  get() = reinterpret()

public val LockButton.asWidget: Widget
  get() = reinterpret()

public val LockButton.asContainer: Container
  get() = reinterpret()

public val LockButton.asBin: Bin
  get() = reinterpret()

public val LockButton.asButton: Button
  get() = reinterpret()

public object LockButtonFactory {
  public fun new(permission: Permission?): LockButton =
      gtk_lock_button_new(permission?.reinterpret())!!.reinterpret()
}

public var LockButton.permission: Permission?
  get() = gtk_lock_button_get_permission(this)?.reinterpret()
  set(`value`) {
    gtk_lock_button_set_permission(this, value)
  }
