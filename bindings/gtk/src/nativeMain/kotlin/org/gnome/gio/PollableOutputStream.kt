package org.gnome.gio

import interop.GPollableOutputStream
import kotlinx.cinterop.CPointer

public typealias PollableOutputStream = CPointer<GPollableOutputStream>
