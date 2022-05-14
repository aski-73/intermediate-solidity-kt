package net.aveyon.intermediate_solidity.impl

import net.aveyon.intermediate_solidity.Event

class EventImpl(name: String) : Event(name) {
    constructor(copySource: Event) : this(copySource.name) {
        copySource.eventParams.forEach {
            eventParams.add(LocalFieldImpl(it))
        }
    }
}
