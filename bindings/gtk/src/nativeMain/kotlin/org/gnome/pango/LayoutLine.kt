package org.gnome.pango

import interop.PangoLayoutLine
import kotlinx.cinterop.CPointer

public typealias LayoutLine = CPointer<PangoLayoutLine>
