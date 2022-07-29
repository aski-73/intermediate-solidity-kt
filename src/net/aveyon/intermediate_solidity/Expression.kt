package net.aveyon.intermediate_solidity

abstract class Expression(var value: String): Node("expr") {

    override fun toString(): String {
        return value
    }
}
