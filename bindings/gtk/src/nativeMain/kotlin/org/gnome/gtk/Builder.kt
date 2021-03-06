// TODO - method: add_callback_symbols (param type)
// TODO - method: connect_signals (param type)
// TODO - method: connect_signals_full (param type)
// TODO - method: value_from_string (param type)
// TODO - method: value_from_string_type (param type)
//
@file:Suppress("RemoveRedundantBackticks","RedundantVisibilityModifier","unused","RedundantUnitReturnType")

package org.gnome.gtk

import interop.GError
import interop.GType
import interop.GtkBuilder
import interop.gtk_builder_add_callback_symbol
import interop.gtk_builder_add_from_file
import interop.gtk_builder_add_from_resource
import interop.gtk_builder_add_from_string
import interop.gtk_builder_add_objects_from_file
import interop.gtk_builder_add_objects_from_resource
import interop.gtk_builder_add_objects_from_string
import interop.gtk_builder_expose_object
import interop.gtk_builder_extend_with_template
import interop.gtk_builder_get_application
import interop.gtk_builder_get_object
import interop.gtk_builder_get_objects
import interop.gtk_builder_get_translation_domain
import interop.gtk_builder_get_type_from_name
import interop.gtk_builder_lookup_callback_symbol
import interop.gtk_builder_new
import interop.gtk_builder_new_from_file
import interop.gtk_builder_new_from_resource
import interop.gtk_builder_new_from_string
import interop.gtk_builder_set_application
import interop.gtk_builder_set_translation_domain
import kotlin.Array
import kotlin.Long
import kotlin.String
import kotlin.Throws
import kotlin.UInt
import kotlin.ULong
import kotlin.Unit
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gnome.glib.SList
import org.gnome.gobject.Callback
import org.gnome.gobject.Object
import org.mrlem.gnome.glib.Error
import org.mrlem.gnome.toCArray
import org.mrlem.gnome.toKString

public typealias Builder = CPointer<GtkBuilder>

public val Builder.asObject: Object
  get() = reinterpret()

public object BuilderFactory {
  public fun new(): Builder = gtk_builder_new()!!.reinterpret()

  public fun newFromFile(filename: String?): Builder =
      gtk_builder_new_from_file(filename)!!.reinterpret()

  public fun newFromResource(resourcePath: String?): Builder =
      gtk_builder_new_from_resource(resourcePath)!!.reinterpret()

  public fun newFromString(string: String?, length: Long): Builder =
      gtk_builder_new_from_string(string, length)!!.reinterpret()
}

public val Builder.parentInstance: Object
  get() = pointed.parent_instance.ptr

public var Builder.application: Application?
  get() = gtk_builder_get_application(this)?.reinterpret()
  set(`value`) {
    gtk_builder_set_application(this@application, `value`)
  }

public val Builder.objects: SList?
  get() = gtk_builder_get_objects(this)?.reinterpret()

public var Builder.translationDomain: String?
  get() = gtk_builder_get_translation_domain(this).toKString()
  set(`value`) {
    gtk_builder_set_translation_domain(this@translationDomain, `value`)
  }

public fun Builder.addCallbackSymbol(callbackName: String?, callbackSymbol: Callback?): Unit {
  gtk_builder_add_callback_symbol(this@addCallbackSymbol, callbackName,
      callbackSymbol?.reinterpret())
}

@Throws(Error::class)
public fun Builder.addFromFile(filename: String?): UInt = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: UInt = gtk_builder_add_from_file(this@addFromFile, filename, errors)
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun Builder.addFromResource(resourcePath: String?): UInt = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: UInt = gtk_builder_add_from_resource(this@addFromResource, resourcePath, errors)
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun Builder.addFromString(buffer: String?, length: ULong): UInt = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: UInt = gtk_builder_add_from_string(this@addFromString, buffer, length, errors)
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun Builder.addObjectsFromFile(filename: String?, objectIds: Array<String>?): UInt =
    memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: UInt = memScoped { gtk_builder_add_objects_from_file(this@addObjectsFromFile,
      filename, objectIds?.toCArray(memScope), errors) }
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun Builder.addObjectsFromResource(resourcePath: String?, objectIds: Array<String>?): UInt =
    memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: UInt = memScoped { gtk_builder_add_objects_from_resource(this@addObjectsFromResource,
      resourcePath, objectIds?.toCArray(memScope), errors) }
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

@Throws(Error::class)
public fun Builder.addObjectsFromString(
  buffer: String?,
  length: ULong,
  objectIds: Array<String>?
): UInt = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: UInt = memScoped { gtk_builder_add_objects_from_string(this@addObjectsFromString,
      buffer, length, objectIds?.toCArray(memScope), errors) }
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

public fun Builder.exposeObject(name: String?, `object`: Object?): Unit {
  gtk_builder_expose_object(this@exposeObject, name, `object`?.reinterpret())
}

@Throws(Error::class)
public fun Builder.extendWithTemplate(
  widget: Widget?,
  templateType: GType,
  buffer: String?,
  length: ULong
): UInt = memScoped {
  val errors = allocPointerTo<GError>().ptr
  val result: UInt = gtk_builder_extend_with_template(this@extendWithTemplate,
      widget?.reinterpret(), templateType, buffer, length, errors)
  errors.pointed.pointed?.let { throw Error(it) }
  return result
}

public fun Builder.getObject(name: String?): Object? = gtk_builder_get_object(this@getObject,
    name)?.reinterpret()

public fun Builder.getTypeFromName(typeName: String?): GType =
    gtk_builder_get_type_from_name(this@getTypeFromName, typeName)

public fun Builder.lookupCallbackSymbol(callbackName: String?): Callback? =
    gtk_builder_lookup_callback_symbol(this@lookupCallbackSymbol, callbackName)?.reinterpret()
