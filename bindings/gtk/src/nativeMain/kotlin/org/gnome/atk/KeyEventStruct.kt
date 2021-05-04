package org.gnome.atk

import interop.AtkKeyEventStruct
import kotlinx.cinterop.CPointer

public typealias KeyEventStruct = CPointer<AtkKeyEventStruct>
