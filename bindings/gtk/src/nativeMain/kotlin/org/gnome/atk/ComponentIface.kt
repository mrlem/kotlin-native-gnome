package org.gnome.atk

import interop.AtkComponentIface
import kotlinx.cinterop.CPointer

public typealias ComponentIface = CPointer<AtkComponentIface>
