package net.aveyon.intermediate_solidity.impl

import net.aveyon.intermediate_solidity.Expression
import net.aveyon.intermediate_solidity.ExpressionIf
import net.aveyon.intermediate_solidity.Function
import net.aveyon.intermediate_solidity.FunctionParameter
import java.util.function.Consumer
import kotlin.reflect.full.createInstance

class FunctionImpl : Function {
    // Copy ctor
    constructor(copySource: Function) : this(copySource.name) {
        isAbstract = copySource.isAbstract
        visibility = copySource.visibility

        copySource.expressions.forEach {
            // TODO replace with copy ctor
            expressions.add(it)
        }

        copySource.returns.forEach { ret: String -> returns.add(ret) }
        copySource.parameters.forEach { p: FunctionParameter ->
            parameters.add(FunctionParameterImpl(p))
        }
    }

    constructor(name: String) : super(name) {}
}
