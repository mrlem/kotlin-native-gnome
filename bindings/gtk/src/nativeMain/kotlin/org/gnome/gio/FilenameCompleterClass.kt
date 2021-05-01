package org.gnome.gio

import interop.GFilenameCompleterClass
import kotlinx.cinterop.CPointer

public typealias FilenameCompleterClass = CPointer<GFilenameCompleterClass>
