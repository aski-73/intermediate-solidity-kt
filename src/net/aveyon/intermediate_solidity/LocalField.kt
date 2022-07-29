package net.aveyon.intermediate_solidity

abstract class LocalField(name: String, var type: Type) : Node(name) {
    var payable = false
}
