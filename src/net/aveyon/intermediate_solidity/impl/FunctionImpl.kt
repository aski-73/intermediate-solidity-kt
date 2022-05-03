package net.aveyon.intermediate_solidity.impl

import net.aveyon.intermediate_solidity.Function
import net.aveyon.intermediate_solidity.FunctionParameter
import java.util.function.Consumer

class FunctionImpl : Function {
    // Copy ctor
    constructor(copySource: Function) : this(copySource.name) {
        isAbstract = copySource.isAbstract
        visibility = copySource.visibility
        val _function = Consumer { exp: String -> expressions.add(exp) }
        copySource.expressions.forEach(_function)
        val _function_1 = Consumer { ret: String -> returns.add(ret) }
        copySource.returns.forEach(_function_1)
        val _function_2 = Consumer { p: FunctionParameter ->
            val _operationParameterImpl = FunctionParameterImpl(p)
            parameters.add(_operationParameterImpl)
        }
        copySource.parameters.forEach(_function_2)
    }

    constructor(name: String) : super(name) {}
}
