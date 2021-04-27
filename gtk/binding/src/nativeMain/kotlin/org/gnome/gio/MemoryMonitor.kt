package org.gnome.gio

import interop.GMemoryMonitor
import kotlinx.cinterop.CPointer

public typealias MemoryMonitor = CPointer<GMemoryMonitor>
