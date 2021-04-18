package org.gnome.gir.model

import org.gnome.gir.model.enums.Direction
import org.gnome.gir.model.enums.Ownership
import org.gnome.gir.model.meta.DocElements

/**
 * GIR instance parameter.
 *
 * Instance-parameter is a parameter of a C function which is an instance of an existing object. So the callable is surely a method of a class, and this parameter points to the instance of the object. In C++, this would be equivalent to the pointer this which is not passed to the method, in Python it's equivalent to self.
 *
 * @property name name of the parameter.
 * @property nullable binary attribute, true if the parameter can have a null value.
 * @property allowNone deprecated, replaced by nullable and optional.
 * @property direction direction of the parameter. "in" goes into the callable, "out" for output parameters from the callable (reference in C++, var in Pascal, etc...), "inout" for both (like a pre-allocated structure which will be filled-in by the callable).
 * @property callerAllocates binary attribute, true if the caller should allocate the parameter before calling the callable.
 * @property transferOwnership TODO.
 * @property type instance parameter type.
 * @property doc return value doc.
 */
data class InstanceParameterDefinition(
    val name: String,
    val nullable: Boolean,
    @Deprecated("replaced by nullable and optional")
    val allowNone: Boolean,
    val direction: Direction? = null,
    val callerAllocates: Boolean,
    val transferOwnership: Ownership,
    var type: TypeDefinition?,
    val doc: DocElements
)
