package org.gnome.atk

import interop.AtkAction
import kotlinx.cinterop.CPointer

public typealias Action = CPointer<AtkAction>
