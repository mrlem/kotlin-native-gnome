package org.gnome.gio

import interop.GIOStreamClass
import kotlinx.cinterop.CPointer

public typealias IOStreamClass = CPointer<GIOStreamClass>
