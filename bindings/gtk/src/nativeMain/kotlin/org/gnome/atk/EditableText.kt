package org.gnome.atk

import interop.AtkEditableText
import kotlinx.cinterop.CPointer

public typealias EditableText = CPointer<AtkEditableText>
