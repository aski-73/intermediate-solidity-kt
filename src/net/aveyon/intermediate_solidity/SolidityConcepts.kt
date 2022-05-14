package net.aveyon.intermediate_solidity

import java.util.*

abstract class SolidityConcepts : GeneralSolidityConcepts() {
    val contracts: MutableList<SmartContract> = LinkedList()
    val interfaces: MutableList<Interface> = LinkedList()
}
