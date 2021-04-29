package org.gnome.gio

import interop.GTlsBackend
import kotlinx.cinterop.CPointer

public typealias TlsBackend = CPointer<GTlsBackend>
