package org.gnome.gir.parser

import org.gnome.gir.resolver.SimpleType
import org.gnome.gir.model.*
import org.gnome.gir.model.enums.*
import org.gnome.gir.model.meta.*
import org.gnome.gir.model.types.AnyType
import org.w3c.dom.Node

class RepositoryReader {

    var repository: RepositoryDefinition? = null
        private set
    lateinit var currentNamespace: String

    fun read(path: String) {
        val globalRepository =  this.repository

        // read the repo
        val doc = XmlParser()
            .parseResource(path)
        val fileRepository = doc
            .firstOrNull("repository")
            ?.readRepository()
            ?: return

        // add its definitions
        if (globalRepository == null) {
            repository = fileRepository
        } else {
            if (globalRepository.version != fileRepository.version) {
                println("warning: $path belongs to a different repository version")
            }
            mergeRepository(fileRepository)
        }
    }

    ///////////////////////////////////////////////////////////////////////////
    // Private
    ///////////////////////////////////////////////////////////////////////////

    private fun mergeRepository(repository: RepositoryDefinition) {
        this.repository?.apply {
            // add definitions
            includes += repository.includes
            cIncludes += repository.cIncludes
            packages += repository.packages
            namespaces += repository.namespaces

            resolveIncludes()
        }
    }

    private fun Node.readRepository(): RepositoryDefinition {
        val namespaces = all("namespace")
            .map { it.readNamespace() }
        val packages = all("package")
            .map { it.readPackage() }
        val includes = all("include")
            .map { it.readInclude() }
        val cIncludes = all("c:include")
            .map { it.readCInclude() }

        return RepositoryDefinition(
            version = this["version"],
            cIdentifierPrefixes = this["c:identifier-prefixes"],
            cSymbolPrefixes = this["c:symbol-prefixes"],
            namespaces = namespaces.toMutableList(),
            packages = packages.toMutableList(),
            includes = includes.toMutableList(),
            cIncludes = cIncludes.toMutableList()
        )
            .also { if (nodeName != "repository") error("invalid node name") }
    }

    private fun Node.readNamespace() = NamespaceDefinition(
        name = this["name"]?.also { currentNamespace = it },
        version = this["version"],
        cIdentifierPrefixes = this["c:identifier-prefixes"],
        cSymbolPrefixes = this["c:symbol-prefixes"],
        cPrefix = this["c:prefix"],
        sharedLibrary = this["shared-library"],
        classes = readClasses().toMutableList(),
        interfaces = readInterfaces(),
        enums = readEnums().toMutableList(),
        records = readRecords().toMutableList(),
        bitFields = readBitFields(),
        functions = readCallables("function"),
        callbacks = readCallbacks(),
        unions = readUnions(),
        constants = readConstants(),
        aliases = readAliases(),
        annotations = readAnnotations(),
        boxedTypes = readBoxedTypes()
    )
        .also { if (nodeName != "namespace") error("invalid node name") }

    private fun Node.readAnnotation() = AnnotationDefinition(
        name = this["name"] ?: throw error("missing name"),
        value = this["value"] ?: throw error("missing value"),
    )
        .also { if (nodeName != "annotation") error("invalid node name") }

    private fun Node.readBoxed() = BoxedDefinition(
        name = this["name"] ?: throw error("missing name"),
        glibGetType = this["glib:get-type"] ?: throw error("missing get-type"),
        glibTypeName = this["glib:type-name"] ?: throw error("missing type-name"),
        info = readInfoElements(),
        cSymbolPrefix = this["c:symbol-prefix"],
        functions = readCallables("function")
    )
        .also { if (nodeName != "boxed") error("invalid node name") }

    private fun Node.readAlias() = AliasDefinition(
        name = this["name"] ?: throw error("missing name"),
        cType = this["c:type"] ?: throw error("missing type"),
        info = readInfoElements(),
        type = readTypes().firstOrNull() ?: throw error("missing type")
    )
        .also { if (nodeName != "alias") error("invalid node name") }

    private fun Node.readMember() = MemberDefinition(
        name = this["name"] ?: throw error("missing name"),
        value = this["value"] ?: throw error("missing value"),
        cIdentifier = this["c:identifier"],
        glibNick = this["glib:nick"],
        info = readInfoElements()
    )
        .also { if (nodeName != "member") error("invalid node name") }

    private fun Node.readPackage() = PackageDefinition(
        name = this["name"] ?: throw error("missing name"),
    )
        .also { if (nodeName != "package") error("invalid node name") }

    private fun Node.readInclude() = IncludeDefinition(
        name = this["name"] ?: throw error("missing name"),
        version = this["version"]
    )
        .also { if (nodeName != "include") error("invalid node name") }

    private fun Node.readCInclude() = CIncludeDefinition(
        name = this["name"] ?: throw error("missing name")
    )
        .also { if (nodeName != "c:include") error("invalid node name") }

    private fun Node.readUnion(): UnionDefinition? {
        val name = this["name"]
        if (name == null) {
            println("info: dropping nameless union - only there for internal purpose")
            return null
        }
        return UnionDefinition(
            name = name,
            glibGetType = this["glib:get-type"],
            glibTypeName = this["glib:type-name"],
            cType = this["c:type"],
            cSymbolPrefix = this["c:symbol-prefix"],
            fields = readFields(),
            constructors = readCallables("constructor"),
            methods = readCallables("method"),
            functions = readCallables("function"),
            records = readRecords(),
            info = readInfoElements()
        )
            .also { if (nodeName != "union") error("invalid node name") }
    }

    private fun Node.readEnum() = EnumDefinition(
        name = this["name"] ?: throw error("missing name"),
        cType = this["c:type"],
        glibTypeName = this["glib:type-name"],
        glibGetType = this["glib:get-type"],
        glibErrorDomain = this["glib:error-domain"],
        info = readInfoElements(),
        members = readMembers(),
        functions = readCallables("function")
    )
        .also { if (nodeName != "enumeration") error("invalid node name") }

    private fun Node.readCallback() = CallbackDefinition(
        name = this["name"] ?: throw error("missing name"),
        info = readInfoElements(),
        cType = this["c:type"],
        throws = this["throws"].boolean,
        parameters = readParameters(),
        returnValue = readReturnValue()
    )
        .also { if (nodeName != "callback") error("invalid node name") }

    private fun Node.readVarargs() = VarargsDefinition()
        .also { if (nodeName != "varargs") error("invalid node name") }

    private fun Node.readRecord() = RecordDefinition(
        name = this["name"] ?: throw error("missing name"),
        glibGetType = this["glib:get-type"],
        glibTypeName = this["glib:type-name"],
        cSymbolPrefix = this["c:symbol-prefix"],
        cType = this["c:type"],
        disguised = this["disguised"].boolean,
        foreign = this["foreign"].boolean,
        glibIsGTypeStructFor = this["glib:is-gtype-struct-for"],
        info = readInfoElements(),
        properties = readProperties(),
        unions = readUnions(),
        functions = readCallables("function"),
        methods = readCallables("method"),
        constructors = readCallables("constructor"),
        fields = readFields()
    )
        .also { if (nodeName != "record") error("invalid node name") }

    private fun Node.readBitField() = BitFieldDefinition(
        name = this["name"] ?: throw error("missing name"),
        cType = this["c:type"],
        glibGetType = this["glib:get-type"],
        glibTypeName = this["glib:type-name"],
        info = readInfoElements(),
        functions = readCallables("function"),
        members = readMembers()
    )
        .also { if (nodeName != "bitfield") error("invalid node name") }

    private fun Node.readCallable() = CallableDefinition(
        callable = readCallableElements()
    )

    private fun Node.readClass() = ClassDefinition(
        name = this["name"] ?: throw error("missing name"),
        parent = this["parent"],
        glibGetType = this["glib:get-type"] ?: throw error("missing get-type"),
        glibTypeName = this["glib:type-name"] ?: throw error("missing type-name"),
        cType = this["c:type"],
        cSymbolPrefix = this["c:symbol-prefix"],
        abstract = this["abstract"].boolean,
        glibFundamental = this["glib:fundamental"].boolean,
        glibTypeStruct = this["glib:type-struct"],
        glibGetValueFunc = this["glib:get-value-func"],
        glibRefFunc = this["glib:ref-func"],
        glibSetValueFunc = this["glib:set-value-func"],
        glibUnrefFunc = this["glib:unref-func"],
        info = readInfoElements(),
        methods = readCallables("method").toMutableList(),
        fields = readFields().toMutableList(),
        constructors = readCallables("constructor"),
        functions = readCallables("functions"),
        unions = readUnions(),
        callbacks = readCallbacks(),
        properties = readProperties(),
        records = readRecords(),
        constants = readConstants(),
        implements = readNames("implements"),
        signals = readSignals(),
        virtualMethods = readVirtualMethods()
    )
        .also { if (nodeName != "class") error("invalid node name") }

    private fun Node.readInterface() = InterfaceDefinition(
        name = this["name"] ?: throw error("missing name"),
        glibGetType = this["glib:get-type"] ?: throw error("missing get-type"),
        glibTypeName = this["glib:type-name"] ?: throw error("missing type-name"),
        glibTypeStruct = this["glib:type-struct"],
        cSymbolPrefix = this["c:symbol-prefix"],
        cType = this["c:type"],
        info = readInfoElements(),
        properties = readProperties(),
        functions = readCallables("function"),
        virtualMethods = readVirtualMethods(),
        callbacks = readCallbacks(),
        implements = readNames("implements"),
        constants = readConstants(),
        constructor = firstOrNull("contructor")?.readCallable(),
        signals = readSignals(),
        methods = readCallables("method"),
        fields = readFields(),
        prerequisites = readNames("prerequisite")
    )
        .also { if (nodeName != "interface") error("invalid node name") }

    private fun Node.readVirtualMethod() = VirtualMethodDefinition(
        callable = readCallableElements(),
        invoker = this["invoker"]
    )
        .also { if (nodeName != "virtual-method") error("invalid node name") }

    private fun Node.readName() = NameDefinition(
        name = this["name"] ?: throw error("missing name")
    )

    private fun Node.readSignal() = SignalDefinition(
        name = this["name"] ?: throw error("missing name"),
        action = this["action"].boolean,
        info = readInfoElements(),
        parameters = readParameters(),
        returnValue = readReturnValue(),
        detailed = this["detailed"].boolean,
        noHooks = this["no-hooks"].boolean,
        noRecurse = this["no-recurse"].boolean,
        `when` = When.fromName(this["when"])
    )
        .also { if (nodeName != "signal") error("invalid node name") }

    private fun Node.readField() = FieldDefinition(
        name = this["name"] ?: throw error("missing name"),
        info = readInfoElements(),
        writable = this["writable"].boolean,
        readable = this["readable"].boolean,
        private = this["private"].boolean,
        bits = this["bits"].integer,
        anyTypeOrCallback = readAnyTypeOrCallback() ?: throw error("missing callback or type")
    )
        .also { if (nodeName != "field") error("invalid node name") }

    private fun Node.readParameter() = ParameterDefinition(
        name = this["name"] ?: throw error("missing name"),
        allowNone = this["allow-none"].boolean,
        transferOwnership = Ownership.fromName(this["transfer-ownership"]) ?: Ownership.None,
        skip = this["skip"].boolean,
        nullable = this["nullable"].boolean,
        optional = this["optional"].boolean,
        callerAllocates = this["caller-allocates"].boolean,
        introspectable = this["introspectable"].boolean,
        closure = this["closure"].integer,
        destroy = this["destroy"].integer,
        direction = Direction.fromName(this["direction"]),
        scope = Scope.fromName(this["scope"]),
        type = readAnyTypeOrVarargs() ?: throw error("missing type or varargs"),
        doc = readDocElements()
    )
        .also { if (nodeName != "parameter") error("invalid node name") }

    private fun Node.readInstanceParameter() = InstanceParameterDefinition(
        name = this["name"] ?: throw error("missing name"),
        nullable = this["nullable"].boolean,
        allowNone = this["allow-none"].boolean,
        callerAllocates = this["caller-allocates"].boolean,
        transferOwnership = Ownership.fromName(this["transfer-ownership"]) ?: Ownership.None,
        type = readTypes().firstOrNull() ?: throw error("missing type"),
        doc = readDocElements()
    )
        .also { if (nodeName != "instance-parameter") error("invalid node name") }

    private fun Node.readProperty() = PropertyDefinition(
        name = this["name"] ?: throw error("missing name"),
        info = readInfoElements(),
        writable = this["writable"].boolean,
        readable = this["readable"].boolean,
        construct = this["construct"].boolean,
        constructOnly = this["construct-only"].boolean,
        transferOwnership = Ownership.fromName(this["transfer-ownership"]) ?: Ownership.None,
        type = readAnyTypes().firstOrNull() ?: throw error("missing type")
    )
        .also { if (nodeName != "property") error("invalid node name") }

    private fun Node.readConstant() = ConstantDefinition(
        name = this["name"] ?: throw error("missing name"),
        value = this["value"] ?: throw error("missing value"),
        cType = this["c:type"],
        cIdentifier= this["c:identifier"],
        type = readAnyTypes().firstOrNull() ?: throw error("missing type"),
        info = readInfoElements()
    )
        .also { if (nodeName != "constant") error("invalid node name") }

    private fun Node.readAnyType() = when (nodeName) {
            "type" -> readType()
            "array" -> readArrayType()
            else -> null
        }

    private fun Node.readType() = takeUnless { this["name"] == "none" }
        ?.run {
            TypeDefinition(
                name = this["name"]
                    ?.let {
                        if (SimpleType.fromName(it) != null || it.contains('.')) {
                            it
                        } else {
                            "$currentNamespace.$it"
                        }
                    }
                    ?: throw error("missing name"),
                introspectable = this["introspectable"].boolean,
                cType = this["c:type"],
                doc = readDocElements(),
                types = readAnyTypes()
            )
        }
        .also { if (nodeName != "type") error("invalid node name") }

    private fun Node.readArrayType() = ArrayTypeDefinition(
        name = this["name"],
        introspectable = this["introspectable"].boolean,
        cType = this["c:type"],
        type = readTypes().firstOrNull() ?: throw error("missing type"),
        fixedSize = this["fixed-size"].integer,
        length = this["length"].integer,
        zeroTerminated = this["zero-terminated"].boolean
    )
        .also { if (nodeName != "array") error("invalid node name") }

    private fun Node.readInfoElements() = InfoElements(
        deprecated = this["deprecated"].boolean,
        deprecatedVersion = this["deprecatedVersion"],
        introspectable = this["introspectable"].boolean,
        version = this["version"],
        doc = readDocElements(),
        stability = Stability.fromName(this["doc-stability"]) ?: Stability.Stable,
        annotations = readAnnotations()
    )

    private fun Node.readDocElements() = DocElements(
        version = firstOrNull("doc-version")?.readText(),
        stability = firstOrNull("doc-stability")?.readText(),
        doc = firstOrNull("doc")?.readDoc(),
        deprecated = firstOrNull("doc-deprecated")?.readText(),
        sourcePosition = firstOrNull("source-position")?.readSourcePosition()
    )

    private fun Node.readCallableElements() = CallableElements(
        info = readInfoElements(),
        name = this["name"] ?: throw error("missing name"),
        cIdentifier = this["c:identifier"],
        shadowedBy = this["shadowedBy"],
        shadows = this["shadows"],
        throws = this["throws"].boolean,
        movedTo = this["movedTo"],
        parameters = readParameters(),
        instanceParameter = firstOrNull("parameters")
            ?.firstOrNull("instance-parameter")
            ?.readInstanceParameter(),
        returnValue = readReturnValue()
    )

    private fun Node.readReturnValue() = firstOrNull("return-value")
        ?.run {
            ReturnValueDefinition(
                transferOwnership = Ownership.fromName(this["transfer-ownership"]) ?: Ownership.None,
                type = readAnyTypes().firstOrNull(),
                allowNone = this["allow-none"].boolean,
                doc = readDocElements(),
                introspectable = this["introspectable"].boolean,
                closure = this["closure"].integer,
                destroy = this["destroy"].integer,
                nullable = this["nullable"].boolean,
                scope = Scope.fromName(this["scope"]),
                skip = this["skip"].boolean
            )
        }

    private fun Node.readText() = DocTextDefinition(
        space = Space.fromName(this["xml:space"]),
        whitespace = Space.fromName(this["xml:whitespace"]),
        text = text
    )

    private fun Node.readDoc() = DocDefinition(
        space = Space.fromName(this["xml:space"]),
        whitespace = Space.fromName(this["xml:whitespace"]),
        filename = this["filename"] ?: throw error("missing filename"),
        line = this["line"] ?: throw error("missing line"),
        column = this["column"],
        text = text
    )
        .also { if (nodeName != "doc") error("invalid node name") }

    private fun Node.readSourcePosition() = SourcePositionDefinition(
        filename = this["filename"] ?: throw error("missing filename"),
        line = this["line"] ?: throw error("missing line"),
        column = this["column"]
    )
        .also { if (nodeName != "source-position") error("invalid node name") }

    private fun Node.readAnyTypeOrCallback() = firstOrNull("type", "array", "callback")
        ?.run { readAnyType() ?: readCallback() }

    private fun Node.readAnyTypeOrVarargs() = firstOrNull("type", "array", "varargs")
        ?.run { readAnyType() ?: readVarargs() }

    private val String?.boolean
        get() = this?.let { it == "1" } ?: false

    private val String?.integer
        get() = this?.toInt() ?: 0

    private fun Node.readParameters() = firstOrNull("parameters")
        ?.all("parameter")
        ?.map { it.readParameter() }
        .orEmpty()

    private fun Node.readProperties() = all("property")
        .map { it.readProperty() }

    private fun Node.readUnions(): List<UnionDefinition> = all("union")
        .mapNotNull { it.readUnion() }

    private fun Node.readEnums() = all("enumeration")
        .map { it.readEnum() }

    private fun Node.readFields() = all("field")
        .map { it.readField() }

    private fun Node.readCallables(name: String) = all(name)
        .map { it.readCallable() }

    private fun Node.readCallbacks() = all("callback")
        .map { it.readCallback() }

    private fun Node.readRecords() = all("record")
        .map { it.readRecord() }

    private fun Node.readConstants() = all("constant")
        .map { it.readConstant() }

    private fun Node.readNames(name: String) = all(name)
        .map { it.readName() }

    private fun Node.readSignals() = all("glib:signal")
        .map { it.readSignal() }

    private fun Node.readVirtualMethods() = all("virtual-method")
        .map { it.readVirtualMethod() }

    private fun Node.readAnnotations() = all("annotation")
        .map { it.readAnnotation() }

    private fun Node.readClasses() = all("class")
        .map { it.readClass() }

    private fun Node.readInterfaces() = all("interface")
        .map { it.readInterface() }

    private fun Node.readBitFields() = all("bitfield")
        .map { it.readBitField() }

    private fun Node.readBoxedTypes() = all("boxed")
        .map { it.readBoxed() }

    private fun Node.readAliases() = all("alias")
        .map { it.readAlias() }

    private fun Node.readMembers() = all("member")
        .map { it.readMember() }

    private fun Node.readAnyTypes(): List<AnyType> = all("type", "array")
        .mapNotNull { it.readAnyType() }

    private fun Node.readTypes(): List<TypeDefinition> = all("type")
        .mapNotNull { it.readType() }

}
