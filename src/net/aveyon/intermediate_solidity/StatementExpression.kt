package net.aveyon.intermediate_solidity

/**
 * Represents
 * https://docs.soliditylang.org/en/v0.8.15/grammar.html#a4.SolidityParser.expressionStatement
 */
abstract class StatementExpression(var expr: Expression): Statement("statementExpr") {
    override fun toString(): String {
        return expr.value
    }
}
