// TODO - implement:
//   add_callback_symbol
//   add_callback_symbols
//   add_from_file
//   add_from_resource
//   add_from_string
//   add_objects_from_file
//   add_objects_from_resource
//   add_objects_from_string
//   connect_signals
//   connect_signals_full
//   expose_object
//   extend_with_template
//   get_application
//   get_object
//   get_objects
//   get_translation_domain
//   get_type_from_name
//   lookup_callback_symbol
//   set_application
//   set_translation_domain
//   value_from_string
//   value_from_string_type
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
