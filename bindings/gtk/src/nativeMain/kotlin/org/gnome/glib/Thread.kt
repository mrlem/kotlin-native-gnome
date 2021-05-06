package org.gnome.glib

import interop.GThread
import kotlinx.cinterop.CPointer

public typealias Thread = CPointer<GThread>
