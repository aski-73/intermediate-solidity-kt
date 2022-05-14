package net.aveyon.intermediate_solidity

import java.util.*

abstract class GeneralSolidityConcepts {
    val functions: MutableList<Function> = LinkedList()
    val structures: MutableList<Structure> = LinkedList()
    val events: MutableList<Event> = LinkedList()
    val errors: MutableList<Error> = LinkedList()
    val enums: MutableList<Enumeration> = LinkedList()
}
