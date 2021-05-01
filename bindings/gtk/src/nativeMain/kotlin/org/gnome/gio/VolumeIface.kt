package org.gnome.gio

import interop.GVolumeIface
import kotlinx.cinterop.CPointer

public typealias VolumeIface = CPointer<GVolumeIface>
