// TODO - implement:
//   get_permission
//   set_permission
package org.gnome.gtk

import gtk3.GtkLockButton
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.InitiallyUnowned

public typealias LockButton = CPointer<GtkLockButton>

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
