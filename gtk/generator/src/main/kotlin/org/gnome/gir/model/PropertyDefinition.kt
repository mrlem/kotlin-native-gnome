package org.gnome.gir.model

import org.gnome.gir.model.enums.Ownership
import org.gnome.gir.model.meta.InfoElements
import org.gnome.gir.model.meta.AnyType

/**
 * GIR property.
 *
 * Property, that is a variable or members with getter and setter functions.
 *
 * @property name name of the property.
 * @property writable binary attribute, true if the property is writeable, that is it has a setter function
 * @property readable binary attribute, true if the property is readable, that is it has a getter function
 * @property construct binary attribute, true if the property will be set upon construction.
 * @property constructOnly binary attribute, true if the property can only be set upon construction.
 * @property transferOwnership attributes used by many elements for the transfer of ownership, with for example, a
 *  returned value. "none" if the recipient does not own the value, "container" if the recipient owns the container but
 *  not the value (for arrays or lists for example) , "full" the recipient owns the entire value. For details, see
 *  https://wiki.gnome.org/Projects/GObjectIntrospection/Annotations#Memory_and_lifecycle_management.
 * @property info property info.
 * @property type property type.
 */
data class PropertyDefinition(
    val name: String,
    val writable: Boolean,
    val readable: Boolean,
    val construct: Boolean,
    val constructOnly: Boolean,
    val transferOwnership: Ownership,
    val info: InfoElements,
    val type: AnyType
)
