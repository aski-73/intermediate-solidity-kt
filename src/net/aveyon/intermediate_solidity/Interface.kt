package net.aveyon.intermediate_solidity

import java.util.LinkedList

abstract class Interface(name: String, var definitions: GeneralSolidityConcepts) : Node(name) {
    val extends: LinkedList<Interface> = LinkedList()
}
