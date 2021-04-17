package org.gnome.gir.model.meta

sealed class FuncReference : CallbackOrType {

    data class Unresolved(val name: String) : FuncReference() {
        override fun toString() = "${javaClass.simpleName}(name=$name)"
    }

    // TODO - allow resolution

}
