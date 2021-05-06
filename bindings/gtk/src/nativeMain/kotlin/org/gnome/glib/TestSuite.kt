package org.gnome.glib

import interop.GTestSuite
import kotlinx.cinterop.CPointer

public typealias TestSuite = CPointer<GTestSuite>
