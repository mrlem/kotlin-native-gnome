package org.gnome.atk

import interop.AtkWindowIface
import kotlinx.cinterop.CPointer

public typealias WindowIface = CPointer<AtkWindowIface>
