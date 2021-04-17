package org.gnome.gir.model

import org.gnome.gir.model.meta.*

/**
 * GIR class.
 *
 * GObject inherited class definition.
 *
 * @property name name of the class.
 * @property parent name of the parent class if any.
 * @property abstract binary attribute to declare the class abstract or not
 * @property glibFundamental binary attribute to declare the class fundamental or not (top-level class which do not
 *   derives from any other type).
 * @property glibRefFunc GObject compatible function to reference or increase the reference count of the class.
 * @property glibUnrefFunc GObject compatible function to unreference or decrease the reference count of the class.
 * @property glibGetValueFunc GObject compatible function to set a value of a property of the class.
 * @property glibSetValueFunc GObject compatible function to get a value of a property of the class.
 * @property glibTypeStruct TODO.
 * @property glibTypeName TODO.
 * @property glibGetType TODO.
 * @property cSymbolPrefix TODO.
 * @property cType TODO.
 * @property info class info.
 * @property implements class implements.
 * @property constructors class constructors.
 * @property methods class methods.
 * @property functions class functions.
 * @property virtualMethods class virtual methods.
 * @property fields class fields.
 * @property properties class properties.
 * @property signals class signals.
 * @property unions class unions.
 * @property constants class constants.
 * @property records class records.
 * @property callbacks class callbacks.
 */
data class ClassDefinition(
    override val name: String,
    var parent: TypeReference?,
    val abstract: Boolean,
    val glibFundamental: Boolean,
    val glibRefFunc: FuncReference?,
    val glibUnrefFunc: FuncReference?,
    val glibGetValueFunc: FuncReference?,
    val glibSetValueFunc: FuncReference?,
    val glibTypeStruct: String?, // TODO - anything to do?
    val glibTypeName: String, // TODO - anything to do?
    val glibGetType: String,
    val cSymbolPrefix: String?,
    val cType: String?,
    val info: InfoElements,
    val implements: List<NameDefinition>,
    val constructors: List<CallableDefinition>,
    val methods: List<CallableDefinition>,
    val functions: List<CallableDefinition>,
    val virtualMethods: List<VirtualMethodDefinition>,
    val fields: List<FieldDefinition>,
    val properties: List<PropertyDefinition>,
    val signals: List<SignalDefinition>,
    val unions: List<UnionDefinition>,
    val constants: List<ConstantDefinition>,
    val records: List<RecordDefinition>,
    val callbacks: List<CallbackDefinition>
) : CustomType
