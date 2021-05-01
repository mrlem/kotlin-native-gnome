package org.gnome.gio

import interop.GIOSchedulerJob
import kotlinx.cinterop.CPointer

public typealias IOSchedulerJob = CPointer<GIOSchedulerJob>
