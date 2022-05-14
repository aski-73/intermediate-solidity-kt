package net.aveyon.intermediate_solidity.impl

import net.aveyon.intermediate_solidity.Event

class ErrorImpl(name: String) : net.aveyon.intermediate_solidity.Error(name) {
    constructor(copySource: net.aveyon.intermediate_solidity.Error) : this(copySource.name) {
        copySource.errorParams.forEach {
            errorParams.add(LocalFieldImpl(it))
        }
    }
}
