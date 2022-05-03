package net.aveyon.intermediate_solidity.impl

import net.aveyon.intermediate_solidity.Event

class EventImpl : Event {
    constructor(copySource: Event) : super(copySource.name) {}
    constructor(name: String) : super(name) {}
}
