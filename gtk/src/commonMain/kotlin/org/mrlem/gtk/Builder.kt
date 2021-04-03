package org.mrlem.gtk

import gtk3.*
import kotlinx.cinterop.*

///////////////////////////////////////////////////////////////////////////
// Type
///////////////////////////////////////////////////////////////////////////

typealias Builder = CPointer<GtkBuilder>
class ParsingException : Exception()

///////////////////////////////////////////////////////////////////////////
// Public API
///////////////////////////////////////////////////////////////////////////

@Suppress("FunctionName")
fun Builder(filename: String) = gtk_builder_new_from_file(filename)!!

@Suppress("FunctionName")
fun Builder() = gtk_builder_new()!!

@ExperimentalUnsignedTypes
@Throws(ParsingException::class)
fun Builder.addFrom(text: String) {
    val errors = cValuesOf<GError>()
    val result = gtk_builder_add_from_string(
        this,
        text,
        text.length.toULong(),
        errors
    )
    if (result == 0u) throw ParsingException()
}

operator fun Builder.get(id: String) = gtk_builder_get_object(this, id)!!
