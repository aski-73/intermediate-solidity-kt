package net.aveyon.intermediate_solidity

import java.util.*

abstract class SmartContract(
    name: String,
    val definitions: GeneralSolidityConcepts) : Node(name) {
    var isInterface = false
    val isAbstract = false
    val extends: MutableList<SmartContract> = LinkedList()
    val fields: MutableList<Field> = LinkedList()
}
