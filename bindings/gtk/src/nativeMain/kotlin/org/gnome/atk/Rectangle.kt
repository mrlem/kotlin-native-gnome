package org.gnome.atk

import interop.AtkRectangle
import kotlinx.cinterop.CPointer

public typealias Rectangle = CPointer<AtkRectangle>
