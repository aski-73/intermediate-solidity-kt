package net.aveyon.intermediate_solidity

import java.util.LinkedList

abstract class ContractConcepts: GeneralSolidityConcepts() {
    val modifiers: MutableList<Modifier> = LinkedList()
    var constructor: Constructor? = null
}
