package org.gnome.gio

import interop.GSeekable
import kotlinx.cinterop.CPointer

public typealias Seekable = CPointer<GSeekable>
