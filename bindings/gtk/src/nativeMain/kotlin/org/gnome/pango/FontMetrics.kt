package org.gnome.pango

import interop.PangoFontMetrics
import kotlinx.cinterop.CPointer

public typealias FontMetrics = CPointer<PangoFontMetrics>
