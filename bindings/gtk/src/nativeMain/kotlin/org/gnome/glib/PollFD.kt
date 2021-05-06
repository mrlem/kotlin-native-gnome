package org.gnome.glib

import interop.GPollFD
import kotlinx.cinterop.CPointer

public typealias PollFD = CPointer<GPollFD>
