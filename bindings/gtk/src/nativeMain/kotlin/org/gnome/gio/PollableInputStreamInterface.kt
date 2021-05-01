package org.gnome.gio

import interop.GPollableInputStreamInterface
import kotlinx.cinterop.CPointer

public typealias PollableInputStreamInterface = CPointer<GPollableInputStreamInterface>
