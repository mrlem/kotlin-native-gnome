package org.gnome.gio

import interop.GDBusInterfaceVTable
import kotlinx.cinterop.CPointer

public typealias DBusInterfaceVTable = CPointer<GDBusInterfaceVTable>
