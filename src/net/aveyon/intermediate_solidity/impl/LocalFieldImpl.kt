package net.aveyon.intermediate_solidity.impl

import net.aveyon.intermediate_solidity.LocalField

class LocalFieldImpl : LocalField {

    // Copy ctor
    constructor(copySource: LocalField) : this(copySource.name) {
        type = copySource.type
        payable = copySource.payable
        array = copySource.array
    }

    constructor(name: String) : super(name) {}
}
