package org.gnome.gir.model

import org.gnome.gir.model.types.DefinedType
import org.gnome.gir.model.meta.*

/**
 * GIR interface.
 *
 * Abstract interface to other classes.
 *
 * @property name name of the interface.
 * @property glibTypeStruct TODO.
 * @property glibTypeName TODO.
 * @property glibGetType TODO.
 * @property cSymbolPrefix TODO.
 * @property cType TODO.
 * @property info interface info.
 * @property prerequisites interface prerequisites.
 * @property implements interface implements.
 * @property functions interface functions.
 * @property constructor interface constructor.
 * @property methods interface methods.
 * @property virtualMethods interface virtual methods.
 * @property fields interface fields.
 * @property properties interface properties.
 * @property signals interface signals.
 * @property callbacks interface callbacks.
 * @property constants interface constants.
 */
data class InterfaceDefinition(
    override val name: String,
    val glibTypeStruct: String?,
    val glibTypeName: String,
    val glibGetType: String,
    val cSymbolPrefix: String?,
    val cType: String?,
    val info: InfoElements,
    val prerequisites: List<NameDefinition>,
    val implements: List<NameDefinition>,
    val functions: List<CallableDefinition>,
    val constructor: CallableDefinition?,
    val methods: List<CallableDefinition>,
    val virtualMethods: List<VirtualMethodDefinition>,
    val fields: List<FieldDefinition>,
    val properties: List<PropertyDefinition>,
    val signals: List<SignalDefinition>,
    val callbacks: List<CallbackDefinition>,
    val constants: List<ConstantDefinition>
) : DefinedType {

    val deprecated
        get() = info.deprecated ||
                info.doc.sourcePosition?.filename?.contains("deprecated") == true ||
                info.doc.doc?.filename?.contains("deprecated") == true

}
