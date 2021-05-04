package org.gnome.atk

import interop.AtkWindow
import kotlinx.cinterop.CPointer

public typealias Window = CPointer<AtkWindow>
