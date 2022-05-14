package net.aveyon.intermediate_solidity

import java.util.*

abstract class SmartContract(
    name: String,
    val definitions: GeneralSolidityConcepts) : Node(name) {
    val isAbstract = false
    val extends: MutableList<SmartContract> = LinkedList()
    val implements: MutableList<Interface> = LinkedList()
    val fields: MutableList<Field> = LinkedList()
}
