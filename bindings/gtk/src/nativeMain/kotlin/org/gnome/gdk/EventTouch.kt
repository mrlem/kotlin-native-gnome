package org.gnome.gdk

import interop.GdkEventTouch
import kotlinx.cinterop.CPointer

public typealias EventTouch = CPointer<GdkEventTouch>
