package org.gnome.atk

import interop.AtkTextRectangle
import kotlinx.cinterop.CPointer

public typealias TextRectangle = CPointer<AtkTextRectangle>
