package org.gnome.gir.model

import org.gnome.gir.model.types.DefinedType
import org.gnome.gir.model.meta.InfoElements

/**
 * GIR union.
 *
 * Element defining a type of data being a union of type, similar to union in C/C++ but extended with fields and methods.
 *
 * @property name name of the union.
 * @property glibTypeName TODO.
 * @property glibGetType TODO.
 * @property cSymbolPrefix TODO.
 * @property cType TODO.
 * @property info union info.
 * @property fields union fields.
 * @property constructors union constructors.
 * @property methods union methods.
 * @property functions union functions.
 * @property records union records.
 */
data class UnionDefinition(
    override val name: String,
    val glibTypeName: String?, // TODO - anything to do?
    val glibGetType: String?,
    val cSymbolPrefix: String?,
    val cType: String?,
    val info: InfoElements,
    val fields: List<FieldDefinition>,
    val constructors: List<CallableDefinition>,
    val methods: List<CallableDefinition>,
    val functions: List<CallableDefinition>,
    val records: List<RecordDefinition>
) : DefinedType // TODO: NamespaceDefinition.Element, ClassDefinition.Element, RecordDefinition.Element
