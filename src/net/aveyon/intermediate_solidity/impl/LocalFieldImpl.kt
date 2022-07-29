package net.aveyon.intermediate_solidity.impl

import net.aveyon.intermediate_solidity.LocalField
import net.aveyon.intermediate_solidity.Type

class LocalFieldImpl(name: String, type: Type) : LocalField(name, type) {

    // Copy ctor
    constructor(copySource: LocalField) : this(copySource.name, TypeImpl(copySource.type.name)) {
        payable = copySource.payable
    }
}
