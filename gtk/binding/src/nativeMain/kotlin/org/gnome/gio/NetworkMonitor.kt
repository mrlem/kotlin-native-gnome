package org.gnome.gio

import interop.GNetworkMonitor
import kotlinx.cinterop.CPointer

public typealias NetworkMonitor = CPointer<GNetworkMonitor>
