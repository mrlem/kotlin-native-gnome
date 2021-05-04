package org.gnome.atk

import interop.AtkText
import kotlinx.cinterop.CPointer

public typealias Text = CPointer<AtkText>
