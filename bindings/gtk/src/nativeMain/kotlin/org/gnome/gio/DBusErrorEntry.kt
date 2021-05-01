package org.gnome.gio

import interop.GDBusErrorEntry
import kotlinx.cinterop.CPointer

public typealias DBusErrorEntry = CPointer<GDBusErrorEntry>
