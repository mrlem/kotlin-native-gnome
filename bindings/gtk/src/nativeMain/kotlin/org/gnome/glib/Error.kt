package org.gnome.glib

import interop.GError
import kotlinx.cinterop.CPointer

public typealias Error = CPointer<GError>
