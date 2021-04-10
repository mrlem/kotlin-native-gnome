package org.mrlem.gnome.gir.model

sealed class MemberDefinition {

    /**
     * Name identifying the member.
     */
    abstract val name: String

    // TODO - args
    data class Constructor(
        override val name: String
    ) : MemberDefinition()

    data class PropertyGetter(
        override val name: String,
        val deprecated: Boolean,
        val type: Type,
        val functionName: String
    ) : MemberDefinition()

    data class PropertySetter(
        override val name: String,
        val deprecated: Boolean,
        val type: Type,
        val functionName: String
    ) : MemberDefinition()

    data class Property(
        override val name: String,
        val type: Type,
        val getterFunctionName: String,
        val setterFunctionName: String?
    ) : MemberDefinition()

    // TODO - args
    data class Method(
        override val name: String,
        val deprecated: Boolean,
        val throws: Boolean,
        val returnType: Type?,
        val functionName: String
    ) : MemberDefinition()

    // TODO - args
    data class EventHandler(
        override val name: String
    ) : MemberDefinition()

    /**
     * A member that will generate a comment for functions not covered by the binding yet.
     */
    data class Todo(
        override val name: String
    ) : MemberDefinition()

}