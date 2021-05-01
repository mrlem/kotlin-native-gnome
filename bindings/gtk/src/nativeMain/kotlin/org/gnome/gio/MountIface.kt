package org.gnome.gio

import interop.GMountIface
import kotlinx.cinterop.CPointer

public typealias MountIface = CPointer<GMountIface>
