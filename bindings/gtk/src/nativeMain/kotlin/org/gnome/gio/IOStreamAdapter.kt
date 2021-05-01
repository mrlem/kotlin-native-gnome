package org.gnome.gio

import interop.GIOStreamAdapter
import kotlinx.cinterop.CPointer

public typealias IOStreamAdapter = CPointer<GIOStreamAdapter>
