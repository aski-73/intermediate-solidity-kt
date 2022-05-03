package net.aveyon.intermediate_solidity.impl

import net.aveyon.intermediate_solidity.Field

class FieldImpl : Field {
    constructor(copySource: Field) : super(copySource.name) {
        visibility = copySource.visibility
        value = copySource.value
    }

    constructor(name: String) : super(name) {}
}
