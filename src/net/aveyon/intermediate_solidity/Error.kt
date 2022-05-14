package net.aveyon.intermediate_solidity

import java.util.*

abstract class Error(name: String) : Node(name) {
    val errorParams: MutableList<LocalField> = LinkedList()
}
