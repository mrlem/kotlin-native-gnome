package org.mrlem.gnome.glib

import interop.GError
import kotlinx.cinterop.toKString

class Error(error: GError): Exception(error.message?.toKString()) {

    val domain = error.domain
    val code = error.code

}
