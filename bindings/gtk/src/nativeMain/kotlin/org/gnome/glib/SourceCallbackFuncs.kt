package org.gnome.glib

import interop.GSourceCallbackFuncs
import kotlinx.cinterop.CPointer

public typealias SourceCallbackFuncs = CPointer<GSourceCallbackFuncs>
