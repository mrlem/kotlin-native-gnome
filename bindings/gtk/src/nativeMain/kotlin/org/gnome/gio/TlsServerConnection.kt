package org.gnome.gio

import interop.GTlsServerConnection
import kotlinx.cinterop.CPointer

public typealias TlsServerConnection = CPointer<GTlsServerConnection>
