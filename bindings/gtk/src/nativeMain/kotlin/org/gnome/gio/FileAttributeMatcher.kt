package org.gnome.gio

import interop.GFileAttributeMatcher
import kotlinx.cinterop.CPointer

public typealias FileAttributeMatcher = CPointer<GFileAttributeMatcher>
