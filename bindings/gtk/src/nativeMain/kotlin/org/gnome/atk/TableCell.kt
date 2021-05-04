package org.gnome.atk

import interop.AtkTableCell
import kotlinx.cinterop.CPointer

public typealias TableCell = CPointer<AtkTableCell>
