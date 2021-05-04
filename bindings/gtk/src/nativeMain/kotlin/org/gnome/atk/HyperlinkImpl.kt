package org.gnome.atk

import interop.AtkHyperlinkImpl
import kotlinx.cinterop.CPointer

public typealias HyperlinkImpl = CPointer<AtkHyperlinkImpl>
