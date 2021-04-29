package org.gnome.gir.model

import org.gnome.gir.model.enums.Direction
import org.gnome.gir.model.enums.Ownership
import org.gnome.gir.model.enums.Scope
import org.gnome.gir.model.meta.DocElements
import org.gnome.gir.model.types.AnyTypeOrVarargs

/**
 * GIR parameter.
 *
 * Parameter element of a list of parameters.
 *
 * @property name name of the parameter.
 * @property nullable binary attribute, true if the parameter can have a null value.
 * @property allowNone deprecated, replaced by nullable and optional.
 * @property introspectable binary attribute which is "0" (false) if the element is not introspectable. It doesn't exist in the bindings, due in general to missing information in the annotations in the original C code.
 * @property closure the parameter is a user_data for callbacks. The value points to a different parameter that is the actual callback.
 * @property destroy the parameter is a destroy_data for callbacks. The value points to a different parameter that is the actual callback.
 * @property scope the parameter is a callback, the value indicates the lifetime of the call. For language bindings which want to know when the resources required to do the call can be freed. "notified" valid until a GDestroyNotify argument is called, "async" only valid for the duration of the first callback invocationi (can only be called once), "call" only valid for the duration of the call, can be called multiple times during the call.
 * @property direction direction of the parameter. "in" goes into the callable, "out" for output parameters from the callable (reference in C++, var in Pascal, etc...), "inout" for both (like a pre-allocated structure which will be filled-in by the callable).
 * @property callerAllocates binary attribute, true if the caller should allocate the parameter before calling the callable.
 * @property optional binary attribute, true if the parameter is optional.
 * @property skip binary attribute, true if the parameter can be omitted from the introspected output.
 * @property transferOwnership TODO.
 * @property type parameter type.
 * @property doc parameter doc.
 */
data class ParameterDefinition(
    val name: String,
    val nullable: Boolean,
    @Deprecated("replaced by nullable and optional")
    val allowNone: Boolean,
    val introspectable: Boolean,
    val closure: Int?,
    val destroy: Int?,
    val scope: Scope?,
    val direction: Direction?,
    val callerAllocates: Boolean,
    val optional: Boolean,
    val skip: Boolean,
    val transferOwnership: Ownership,
    var type: AnyTypeOrVarargs,
    val doc: DocElements
)
