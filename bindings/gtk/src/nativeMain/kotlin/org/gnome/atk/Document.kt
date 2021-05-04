package org.gnome.atk

import interop.AtkDocument
import kotlinx.cinterop.CPointer

public typealias Document = CPointer<AtkDocument>
