package net.aveyon.intermediate_solidity

abstract class FunctionParameter(name: String, var type: Type) : Node(name) {
    var dataLocation = DataLocation.MEMORY
    var payable = false
}
