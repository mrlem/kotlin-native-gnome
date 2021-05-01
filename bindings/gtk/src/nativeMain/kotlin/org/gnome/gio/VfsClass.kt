package org.gnome.gio

import interop.GVfsClass
import kotlinx.cinterop.CPointer

public typealias VfsClass = CPointer<GVfsClass>
