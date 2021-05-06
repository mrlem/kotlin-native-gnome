package org.gnome.glib

import interop.GMemVTable
import kotlinx.cinterop.CPointer

public typealias MemVTable = CPointer<GMemVTable>
