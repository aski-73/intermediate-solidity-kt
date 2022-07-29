package net.aveyon.intermediate_solidity.impl

import net.aveyon.intermediate_solidity.Function
import net.aveyon.intermediate_solidity.FunctionParameter

class FunctionImpl : Function {
    // Copy ctor
    constructor(copySource: Function) : this(copySource.name) {
        isAbstract = copySource.isAbstract
        visibility = copySource.visibility
        payable = copySource.payable
        isPure = copySource.isPure

        copySource.statements.forEach {
            // TODO replace with copy ctor
            statements.add(it)
        }

        copySource.returns.forEach { ret -> returns.add(FunctionParameterImpl(ret)) }
        copySource.parameters.forEach { p: FunctionParameter ->
            parameters.add(FunctionParameterImpl(p))
        }
    }

    constructor(name: String) : super(name) {}
}
