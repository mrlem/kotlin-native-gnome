// TODO - implement:
//   get_parent
//   get_screen
//   is_showing
//   set_parent
//   set_screen
package org.gnome.gtk

import gtk3.GtkMountOperation
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret

public typealias MountOperation = CPointer<GtkMountOperation>

public val MountOperation.asMountOperation: org.gnome.glib.gio.MountOperation
  get() = reinterpret()
