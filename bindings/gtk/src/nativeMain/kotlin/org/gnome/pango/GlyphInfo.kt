package org.gnome.pango

import interop.PangoGlyphInfo
import kotlinx.cinterop.CPointer

public typealias GlyphInfo = CPointer<PangoGlyphInfo>
