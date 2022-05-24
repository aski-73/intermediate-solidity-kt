package net.aveyon.intermediate_solidity

abstract class ExpressionString(var value: String): Expression("string") {

    override fun toString(): String {
        return value
    }
}
