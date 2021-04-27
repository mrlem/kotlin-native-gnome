package org.gnome.gio

import interop.GUnixMountEntry
import kotlinx.cinterop.CPointer

public typealias UnixMountEntry = CPointer<GUnixMountEntry>
