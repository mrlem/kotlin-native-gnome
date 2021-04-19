package org.gnome.gir.model

import org.gnome.gir.model.types.DefinedType
import org.gnome.gir.model.meta.InfoElements

/**
 * GIR record.
 *
 * Record definition, equivalent to a C struct, that is a simple structure, not a class.
 *
 * @property name name of the record.
 * @property disguised binary attribute to tell if the record is disguised, i.e. whether the c:type is a typedef that
 *  doesn't look like a pointer, but is one internally. Its second meaning is "private" and is set when any typedef
 *  struct is parsed which doesn't also include a full struct with fields
 *  (https://gitlab.gnome.org/GNOME/gobject-introspection/issues/101).
 * @property foreign binary attribute to tell if the record is foreign, that is it is not available in a g-i supported
 *  library.
 * @property glibIsGTypeStruct whether this record represents a GObject compatible gtype.
 * @property glibTypeName TODO.
 * @property glibGetType TODO.
 * @property cSymbolPrefix TODO.
 * @property cType TODO.
 * @property info record info.
 * @property constructors record constructors.
 * @property methods record methods.
 * @property functions record functions.
 * @property fields record fields.
 * @property properties record properties.
 * @property unions record unions.
 */
data class RecordDefinition(
    override val name: String,
    val disguised: Boolean,
    val foreign: Boolean,
    val glibIsGTypeStructFor: String?,
    val glibTypeName: String?,
    val glibGetType: String?,
    val cSymbolPrefix: String?,
    val cType: String?,
    val info: InfoElements,
    val constructors: List<CallableDefinition>,
    val methods: List<CallableDefinition>,
    val functions: List<CallableDefinition>,
    val fields: List<FieldDefinition>,
    val properties: List<PropertyDefinition>,
    val unions: List<UnionDefinition>
) : DefinedType {

    val deprecated
        get() = info.deprecated ||
                info.doc.sourcePosition?.filename?.contains("deprecated") == true ||
                info.doc.doc?.filename?.contains("deprecated") == true

}
