package net.aveyon.intermediate_solidity.impl

import net.aveyon.intermediate_solidity.FunctionParameter
import net.aveyon.intermediate_solidity.Type

class FunctionParameterImpl(name: String, type: Type) : FunctionParameter(name, type) {
    constructor(copySource: FunctionParameter) : this(copySource.name, copySource.type) {
        dataLocation = copySource.dataLocation
        payable = copySource.payable
    }
}
