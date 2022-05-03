package net.aveyon.intermediate_solidity

import java.util.*

abstract class Structure(name: String) : Node(name) {
    val fields: MutableList<LocalField> = LinkedList()
}
