package net.aveyon.intermediate_solidity

import java.util.*

abstract class Event(name: String) : Node(name) {
    val eventParams: MutableList<LocalField> = LinkedList()
}
