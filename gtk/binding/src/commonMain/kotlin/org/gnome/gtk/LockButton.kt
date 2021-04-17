// TODO - implement:
//   set_permission
package org.gnome.gtk

import gtk3.GtkLockButton
import gtk3.gtk_lock_button_get_permission
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned
import org.gnome.glib.gobject.Object

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

public fun LockButton.getPermission(): Unit {
  gtk_lock_button_get_permission(this)
}
