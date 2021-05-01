package org.gnome.gio

import interop.GPollableOutputStreamInterface
import kotlinx.cinterop.CPointer

public typealias PollableOutputStreamInterface = CPointer<GPollableOutputStreamInterface>
