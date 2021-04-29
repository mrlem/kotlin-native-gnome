package org.mrlem.gnome.glade.plugin.tasks

import org.gradle.api.DefaultTask
import org.mrlem.gnome.glade.plugin.GladePlugin
import org.mrlem.gnome.glade.plugin.watch.ServiceHandler

abstract class StopTask : DefaultTask() {

    init {
        group = GladePlugin.GLADE_TASK_GROUP
        doLast {
            ServiceHandler.stop()
        }
    }

}
