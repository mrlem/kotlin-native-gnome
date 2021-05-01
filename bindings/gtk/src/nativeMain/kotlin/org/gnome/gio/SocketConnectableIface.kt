package org.gnome.gio

import interop.GSocketConnectableIface
import kotlinx.cinterop.CPointer

public typealias SocketConnectableIface = CPointer<GSocketConnectableIface>
