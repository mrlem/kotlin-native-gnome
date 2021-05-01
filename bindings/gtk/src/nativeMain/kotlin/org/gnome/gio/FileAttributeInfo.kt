package org.gnome.gio

import interop.GFileAttributeInfo
import kotlinx.cinterop.CPointer

public typealias FileAttributeInfo = CPointer<GFileAttributeInfo>
