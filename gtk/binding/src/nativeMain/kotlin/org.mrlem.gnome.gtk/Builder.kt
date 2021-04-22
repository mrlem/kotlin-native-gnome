//@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType","FunctionName")
@file:Suppress("unused")

package org.mrlem.gnome.gtk

import interop.*
import kotlin.String
import kotlinx.cinterop.cValuesOf
import kotlinx.cinterop.convert
import org.gnome.gobject.Object
import org.gnome.gtk.Builder

@Throws(ParsingException::class)
fun Builder.addFrom(text: String) {
    val errors = cValuesOf<GError>()
    val result: Int = gtk_builder_add_from_string(
        this,
        text,
        text.length.convert(),
        errors
    ).convert()
    if (result == 0) throw ParsingException()
}

// TODO - why isn't this function mapped or todo?
operator fun Builder.get(id: String): Object = gtk_builder_get_object(this, id)!!

class ParsingException : Exception("glade parsing failed")
