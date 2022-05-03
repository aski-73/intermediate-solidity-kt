package net.aveyon.intermediate_solidity

import java.util.*

open class Event(name: String) : Node(name) {
    val eventParams: MutableList<LocalField> = LinkedList()
}
