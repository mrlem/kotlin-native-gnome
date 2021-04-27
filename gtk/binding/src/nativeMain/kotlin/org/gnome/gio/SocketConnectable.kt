package org.gnome.gio

import interop.GSocketConnectable
import kotlinx.cinterop.CPointer

public typealias SocketConnectable = CPointer<GSocketConnectable>
