package org.gnome.gir.model

import org.gnome.gir.model.meta.CallableElements

/**
 * GIR virtual method.
 *
 * Element defining a virtual method from a class, concept similar to C++
 *
 * @property callable virtual method callable.
 * @property invoker name of the callable called when invoking this virtual method.
 */
data class VirtualMethodDefinition(
    val callable: CallableElements,
    val invoker: String? // TODO - resolve?
)
