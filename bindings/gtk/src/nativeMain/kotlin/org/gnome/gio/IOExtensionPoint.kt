package org.gnome.gio

import interop.GIOExtensionPoint
import kotlinx.cinterop.CPointer

public typealias IOExtensionPoint = CPointer<GIOExtensionPoint>
