package org.gnome.glib

import interop.GTimeZone
import kotlinx.cinterop.CPointer

public typealias TimeZone = CPointer<GTimeZone>
