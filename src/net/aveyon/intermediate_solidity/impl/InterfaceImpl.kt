package net.aveyon.intermediate_solidity.impl

import net.aveyon.intermediate_solidity.Interface

class InterfaceImpl(name: String): Interface(name, GeneralSolidityConceptsImpl()) {
    constructor(copySource: Interface) : this(copySource.name) {
        copySource.extends.forEach {
            extends.add(InterfaceImpl(it))
        }
        copySource.definitions = GeneralSolidityConceptsImpl(copySource.definitions)
    }
}
