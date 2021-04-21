// TODO - method: add_callback_symbol
// TODO - method: add_callback_symbols
// TODO - method: add_from_file
// TODO - method: add_from_resource
// TODO - method: add_from_string
// TODO - method: add_objects_from_file
// TODO - method: add_objects_from_resource
// TODO - method: add_objects_from_string
// TODO - method: connect_signals
// TODO - method: connect_signals_full
// TODO - method: expose_object
// TODO - method: extend_with_template
// TODO - method: get_object
// TODO - method: get_objects
// TODO - method: lookup_callback_symbol
// TODO - method: value_from_string
// TODO - method: value_from_string_type
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType","FunctionName")

package org.gnome.gtk

import gtk3.*
import kotlin.Long
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

public object BuilderFactory {
  public fun new(): Builder = gtk_builder_new()!!.reinterpret()

  public fun newFromFile(filename: String): Builder =
      gtk_builder_new_from_file(filename)!!.reinterpret()

  public fun newFromResource(resourcePath: String): Builder =
      gtk_builder_new_from_resource(resourcePath)!!.reinterpret()

  public fun newFromString(string: String, length: Long): Builder =
      gtk_builder_new_from_string(string, length)!!.reinterpret()
}

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

public fun Builder.getTypeFromName(typeName: String): GType = gtk_builder_get_type_from_name(this,
    typeName)

///////////////////////////////////////////////////////////////////////////
// Public API (not generated)
///////////////////////////////////////////////////////////////////////////

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
