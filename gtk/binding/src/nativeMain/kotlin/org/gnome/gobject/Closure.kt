package org.gnome.gobject

import interop.GClosure
import kotlinx.cinterop.CPointer

public typealias Closure = CPointer<GClosure>
