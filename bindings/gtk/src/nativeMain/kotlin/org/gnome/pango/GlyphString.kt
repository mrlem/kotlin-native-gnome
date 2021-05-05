package org.gnome.pango

import interop.PangoGlyphString
import kotlinx.cinterop.CPointer

public typealias GlyphString = CPointer<PangoGlyphString>
