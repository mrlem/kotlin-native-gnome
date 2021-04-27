package org.gnome.gio

import interop.GDBusNodeInfo
import kotlinx.cinterop.CPointer

public typealias DBusNodeInfo = CPointer<GDBusNodeInfo>
