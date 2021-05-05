package org.gnome.pango

import interop.PangoRectangle
import kotlinx.cinterop.CPointer

public typealias Rectangle = CPointer<PangoRectangle>
