package org.gnome.glib

import interop.GThreadPool
import kotlinx.cinterop.CPointer

public typealias ThreadPool = CPointer<GThreadPool>
