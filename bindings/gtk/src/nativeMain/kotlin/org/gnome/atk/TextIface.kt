package org.gnome.atk

import interop.AtkTextIface
import kotlinx.cinterop.CPointer

public typealias TextIface = CPointer<AtkTextIface>
