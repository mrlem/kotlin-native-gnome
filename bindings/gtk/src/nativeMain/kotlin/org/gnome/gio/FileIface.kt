package org.gnome.gio

import interop.GFileIface
import kotlinx.cinterop.CPointer

public typealias FileIface = CPointer<GFileIface>
