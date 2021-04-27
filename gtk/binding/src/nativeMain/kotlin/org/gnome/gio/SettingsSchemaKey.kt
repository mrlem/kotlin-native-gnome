package org.gnome.gio

import interop.GSettingsSchemaKey
import kotlinx.cinterop.CPointer

public typealias SettingsSchemaKey = CPointer<GSettingsSchemaKey>
