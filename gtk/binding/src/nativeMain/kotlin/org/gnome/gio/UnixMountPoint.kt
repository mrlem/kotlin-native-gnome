package org.gnome.gio

import interop.GUnixMountPoint
import kotlinx.cinterop.CPointer

public typealias UnixMountPoint = CPointer<GUnixMountPoint>
