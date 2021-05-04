package org.gnome.atk

import interop.AtkSelection
import kotlinx.cinterop.CPointer

public typealias Selection = CPointer<AtkSelection>
