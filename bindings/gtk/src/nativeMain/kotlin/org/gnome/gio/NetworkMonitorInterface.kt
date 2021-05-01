package org.gnome.gio

import interop.GNetworkMonitorInterface
import kotlinx.cinterop.CPointer

public typealias NetworkMonitorInterface = CPointer<GNetworkMonitorInterface>
