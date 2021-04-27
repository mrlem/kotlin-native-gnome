package org.gnome.gio

import interop.GSettingsSchema
import kotlinx.cinterop.CPointer

public typealias SettingsSchema = CPointer<GSettingsSchema>
