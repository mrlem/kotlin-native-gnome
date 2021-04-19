// TODO - get_objects
// TODO - add_callback_symbol
// TODO - add_callback_symbols
// TODO - add_from_file
// TODO - add_from_resource
// TODO - add_from_string
// TODO - add_objects_from_file
// TODO - add_objects_from_resource
// TODO - add_objects_from_string
// TODO - connect_signals
// TODO - connect_signals_full
// TODO - expose_object
// TODO - extend_with_template
// TODO - get_object
// TODO - get_objects
// TODO - lookup_callback_symbol
// TODO - value_from_string
// TODO - value_from_string_type
//
package org.gnome.gtk

import gtk3.*
import kotlin.String
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cValuesOf
import kotlinx.cinterop.convert
import kotlinx.cinterop.reinterpret
import org.gnome.gobject.Object
import org.gnome.toKString

public typealias Builder = CPointer<GtkBuilder>

public val Builder.asObject: Object
  get() = reinterpret()

public var Builder.application: Application?
  get() = gtk_builder_get_application(this)?.reinterpret()
  set(`value`) {
    gtk_builder_set_application(this, value)
  }

public var Builder.translationDomain: String
  get() = gtk_builder_get_translation_domain(this).toKString
  set(`value`) {
    gtk_builder_set_translation_domain(this, value)
  }

public fun Builder.getTypeFromName(typeName: String?): GType = gtk_builder_get_type_from_name(this,
    typeName)

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
