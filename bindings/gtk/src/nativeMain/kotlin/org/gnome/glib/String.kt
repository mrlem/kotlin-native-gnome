package org.gnome.glib

import interop.GString
import kotlinx.cinterop.CPointer

public typealias String = CPointer<GString>
