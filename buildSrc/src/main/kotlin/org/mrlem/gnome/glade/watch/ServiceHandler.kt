package org.mrlem.gnome.glade.watch

import java.util.*

/**
 * Handler for the watcher service: ensures we have a single instance and starts is only if not already started.
 */
object ServiceHandler {

    private var started = false
    private var timer: Timer? = null
    private var service: Service = WatcherService()

    fun start() {
        if (!started) {
            started = true
            println("warning: start")
            service.onStart()
        }
    }

    fun stop() {
        if (started) {
            started = false
            service.onStop()
            println("warning: stop")
            timer?.cancel()
            timer?.purge()
        }
    }

    interface Service {
        fun onStart()
        fun onStop()
    }

}