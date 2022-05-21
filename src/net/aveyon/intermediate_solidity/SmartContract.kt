package net.aveyon.intermediate_solidity

import java.util.*

abstract class SmartContract(
    name: String,
    var definitions: ContractConcepts) : Node(name) {
    var isAbstract = false
    val extends: MutableList<SmartContract> = LinkedList()
    val implements: MutableList<Interface> = LinkedList()
    val fields: MutableList<Field> = LinkedList()
}
