package org.gnome.pango

import interop.PangoLanguage
import kotlinx.cinterop.CPointer

public typealias Language = CPointer<PangoLanguage>
