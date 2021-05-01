package org.gnome.gio

import interop.GSeekableIface
import kotlinx.cinterop.CPointer

public typealias SeekableIface = CPointer<GSeekableIface>
