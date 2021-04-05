package org.gnome.gtk

import gtk3.*
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cValuesOf
import kotlinx.cinterop.convert
import kotlinx.cinterop.reinterpret
import org.gnome.glib.gobject.Object

public typealias Builder = CPointer<GtkBuilder>

public val Builder.asObject: Object
  get() = reinterpret()

///////////////////////////////////////////////////////////////////////////
// Public API (not generated)
///////////////////////////////////////////////////////////////////////////

@Suppress("FunctionName")
fun Builder(filename: String) = gtk_builder_new_from_file(filename)!!

@Suppress("FunctionName")
fun Builder() = gtk_builder_new()!!

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

operator fun Builder.get(id: String) = gtk_builder_get_object(this, id)!!

class ParsingException : Exception("glade parsing failed")
