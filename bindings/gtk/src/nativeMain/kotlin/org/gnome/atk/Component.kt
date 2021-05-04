package org.gnome.atk

import interop.AtkComponent
import kotlinx.cinterop.CPointer

public typealias Component = CPointer<AtkComponent>
