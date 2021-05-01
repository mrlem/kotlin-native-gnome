package org.gnome.gio

import interop.GDBusObjectIface
import kotlinx.cinterop.CPointer

public typealias DBusObjectIface = CPointer<GDBusObjectIface>
