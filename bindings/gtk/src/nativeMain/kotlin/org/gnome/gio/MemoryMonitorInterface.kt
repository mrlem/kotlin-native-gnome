package org.gnome.gio

import interop.GMemoryMonitorInterface
import kotlinx.cinterop.CPointer

public typealias MemoryMonitorInterface = CPointer<GMemoryMonitorInterface>
