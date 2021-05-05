package org.gnome.gdk

import interop.GdkEvent
import kotlinx.cinterop.CPointer

public typealias Event = CPointer<GdkEvent>
