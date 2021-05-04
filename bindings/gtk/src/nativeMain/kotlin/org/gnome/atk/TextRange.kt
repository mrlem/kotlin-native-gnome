package org.gnome.atk

import interop.AtkTextRange
import kotlinx.cinterop.CPointer

public typealias TextRange = CPointer<AtkTextRange>
