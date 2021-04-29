package org.gnome.gio

import interop.GPollableInputStream
import kotlinx.cinterop.CPointer

public typealias PollableInputStream = CPointer<GPollableInputStream>
