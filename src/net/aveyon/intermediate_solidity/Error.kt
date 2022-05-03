package net.aveyon.intermediate_solidity

import java.util.*

open class Error(name: String) : Node(name) {
    val errorParams: List<LocalField> = LinkedList()
}
