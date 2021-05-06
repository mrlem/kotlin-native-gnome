package org.gnome.glib

import interop.GRWLock
import kotlinx.cinterop.CPointer

public typealias RWLock = CPointer<GRWLock>
