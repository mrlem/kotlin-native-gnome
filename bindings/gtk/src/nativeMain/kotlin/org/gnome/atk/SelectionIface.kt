package org.gnome.atk

import interop.AtkSelectionIface
import kotlinx.cinterop.CPointer

public typealias SelectionIface = CPointer<AtkSelectionIface>
