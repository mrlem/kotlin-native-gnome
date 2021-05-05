package org.gnome.pango

import interop.PangoFontDescription
import kotlinx.cinterop.CPointer

public typealias FontDescription = CPointer<PangoFontDescription>
