package net.aveyon.intermediate_solidity.impl

import net.aveyon.intermediate_solidity.FunctionParameter

class FunctionParameterImpl : FunctionParameter {
    constructor(copySource: FunctionParameter) : super(copySource) {}
    constructor(name: String) : super(name) {}
}
