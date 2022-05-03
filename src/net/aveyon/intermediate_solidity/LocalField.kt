package net.aveyon.intermediate_solidity

abstract class LocalField(name: String) : Node(name) {
    lateinit var type: String
    var payable = false
    var array = false
}
