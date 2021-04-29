package org.gnome.gio

import interop.GFile
import kotlinx.cinterop.CPointer

public typealias File = CPointer<GFile>
