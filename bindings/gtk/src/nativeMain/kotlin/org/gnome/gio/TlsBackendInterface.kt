package org.gnome.gio

import interop.GTlsBackendInterface
import kotlinx.cinterop.CPointer

public typealias TlsBackendInterface = CPointer<GTlsBackendInterface>
