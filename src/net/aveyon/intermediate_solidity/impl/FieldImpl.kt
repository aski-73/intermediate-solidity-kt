package net.aveyon.intermediate_solidity.impl

import net.aveyon.intermediate_solidity.Field
import net.aveyon.intermediate_solidity.Type

class FieldImpl(name: String, type: Type) : Field(name, type) {
    constructor(copySource: Field) : this(copySource.name, TypeImpl(copySource.type)) {
        visibility = copySource.visibility
        value = copySource.value
        payable = copySource.payable
    }
}
