package net.aveyon.intermediate_solidity.impl

import net.aveyon.intermediate_solidity.LocalField
import net.aveyon.intermediate_solidity.Structure
import java.util.function.Consumer

class StructureImpl : Structure {
    // Copy ctor
    constructor(copySource: Structure) : this(copySource.name) {
        val _function = Consumer { f: LocalField ->
            val _localFieldImpl = LocalFieldImpl(f)
            fields.add(_localFieldImpl)
        }
        copySource.fields.forEach(_function)
    }

    constructor(name: String) : super(name) {}
}
