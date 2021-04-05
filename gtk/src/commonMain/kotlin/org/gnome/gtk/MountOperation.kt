package org.gnome.gtk

import gtk3.GtkMountOperation
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret

public typealias MountOperation = CPointer<GtkMountOperation>

public val MountOperation.asMountOperation: org.gnome.glib.gio.MountOperation
  get() = reinterpret()
